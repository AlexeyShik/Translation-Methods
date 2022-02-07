grammar Expr;

prog returns [String value] @init {$value = "";} :
    main {$value = "#include <stdio.h>\n"
        + ExprUtils.setToString($main.variables, true)
        + $main.defFunctions
        + "\nint main() {\n"
        + ExprUtils.appendTabs($main.body
        + "return 0;")
        + "\n}";
        };

main returns [java.util.Set<String> variables, String defFunctions, String body, java.util.Set<String> locals] @init {
    $variables = new java.util.LinkedHashSet<>();
    $defFunctions = "";
    $body = "";
    $locals =  new java.util.LinkedHashSet<>();
} : (
      // операторы присваивания
      IDENTIFIER assignment_operator assignment_operand NEWLINE+ {
          $variables.add($IDENTIFIER.text);
          if ("READ".equals($assignment_operand.type)) {
              $body += "scanf(\"%d\", " + "&" + $IDENTIFIER.text + ");\n";
          } else {
              $body += $IDENTIFIER.text + $assignment_operator.value + $assignment_operand.value + ";\n";
          }
      } |

      // вывод на экран
      WRITE_BEGIN expression WRPAREN NEWLINE+ {
          $body += "printf(\"%" + $expression.type + "\\n\", " + $expression.value + ");\n";
      } |

      // if-elif-else construction
      WIF e=expression WCOLON NEWLINE+ s1=tab_scope_wrapper[$variables] NEWLINE* {
          $body += "if (" + $e.value + ") {\n" + $s1.body + "\n}";
      }
      ((WELIF ei=expression WCOLON NEWLINE+ si=tab_scope_wrapper[$variables] NEWLINE* {
          $body += " else if (" + $ei.value + ") {\n" + $si.body + "\n}";
      })*
      WELSE WCOLON NEWLINE+ s2=tab_scope_wrapper[$variables] NEWLINE* {
          $body += " else {\n" + $s2.body + "\n}";
      })? {$body += "\n";} |

      // while loop
      WWHILE e=expression WCOLON NEWLINE+ s=tab_scope_wrapper[$variables] NEWLINE* {
        $body += "while (" + $e.value + ") {\n" + $s.body + "\n}\n";
      } |

      // for loop
      WFOR i=IDENTIFIER {$variables.add($i.text);} WIN WRANGE WLPAREN l=expression WCOMMA r=expression WCOMMA step=expression WRPAREN
                                                    WCOLON NEWLINE+ s=tab_scope_wrapper[$variables] NEWLINE* {
          $variables.remove($i.text);
          $body += "for (int " + $i.text + " = " + $l.text + "; " + $i.text + " < " + $r.text + "; "
                    + $i.text + " += " + $step.text + ") {\n" + $tab_scope_wrapper.body + "\n}\n";
      } |

      // function definitions
      WDEF name=IDENTIFIER WLPAREN arguments {
                $variables.addAll(ExprUtils.stringToLocals($arguments.value));
                $locals.addAll(ExprUtils.stringToLocals($arguments.value));
            }
            WRPAREN WCOLON NEWLINE+ s=tab_scope_wrapper[$variables] NEWLINE* {
        $defFunctions += "\nint " + $name.text + "(int " + $arguments.value + ") {\n" + $s.body + "\n}\n";
        $variables.removeAll($locals);
      }
    )*;

arguments returns [String value] @init {$value = "";} :
    i0=IDENTIFIER {$value += $i0.text;}
    (WCOMMA i=IDENTIFIER {$value += ", int " + $i.text;})*
;

tab_scope_wrapper[java.util.Set<String> globalVariables] returns [String body] @init {$body = "";} :
     tab_scope[globalVariables] {
          $tab_scope.variables.removeAll($globalVariables);
          $body += ExprUtils.appendTabs(
                             ExprUtils.setToString($tab_scope.variables, false)
                             + $tab_scope.body);}
;

tab_scope[java.util.Set<String> globalVariables] returns [java.util.Set<String> variables, String body] @init {
        $variables = new java.util.HashSet<>(globalVariables);
        $body = "";
    } :
    // operations in current identation
    (TAB simple_operations {
        $variables.addAll($simple_operations.variables);
        $body += $simple_operations.body;
    } |

    // operations in greater identation
    TAB WIF e=expression WCOLON NEWLINE+ s1=tab_tab_scope_wrapper[$variables] NEWLINE* {
        $body += "if (" + $e.value + ") {\n" + $s1.body + "\n}";
    }
    ((TAB WELIF ei=expression WCOLON NEWLINE+ si=tab_tab_scope_wrapper[$variables] NEWLINE* {
        $body += " else if (" + $ei.value + ") {\n" + $si.body + "\n}";
    })*
    TAB WELSE WCOLON NEWLINE+ s2=tab_tab_scope_wrapper[$variables] NEWLINE* {
        $body += " else {\n" + $s2.body + "\n}";
    })? {$body += "\n";} |

    TAB WWHILE e=expression WCOLON NEWLINE+ s=tab_tab_scope_wrapper[$variables] NEWLINE* {
      $body += "while (" + $e.value + ") {\n" + $s.body + "\n}\n";
    } |
    TAB WFOR i=IDENTIFIER {$variables.add($i.text);}
                      WIN WRANGE WLPAREN l=expression WCOMMA r=expression WCOMMA step=expression WRPAREN
                      WCOLON NEWLINE+ tab_tab_scope_wrapper[$variables] NEWLINE* {
        $body += "for (int " + $i.text + " = " + $l.text + "; " + $i.text + " < " + $r.text + "; "
               + $i.text + " += " + $step.text + ") {\n" + $tab_tab_scope_wrapper.body + "\n}\n";
        $variables.remove($i.text);
    })*
;

tab_tab_scope_wrapper[java.util.Set<String> globalVariables] returns [String body] @init {$body = "";} :
     tab_tab_scope[globalVariables] {
          $tab_tab_scope.variables.removeAll($globalVariables);
          $body += ExprUtils.appendTabs(
                             ExprUtils.setToString($tab_tab_scope.variables, false)
                             + $tab_tab_scope.body);}
;

tab_tab_scope[java.util.Set<String> globalVariables] returns [java.util.Set<String> variables, String body] @init {
        $variables = new java.util.HashSet<>(globalVariables);
        $body = "";
    } :
    // operations in current identation
    (TAB TAB simple_operations {
        $variables.addAll($simple_operations.variables);
        $body += $simple_operations.body;
    })*
;

simple_operations returns [java.util.Set<String> variables, String body] @init {
        $variables = new java.util.LinkedHashSet<>();
        $body = "";
    } :
    IDENTIFIER assignment_operator assignment_operand NEWLINE+ {
       $variables.add($IDENTIFIER.text);
       if ("READ".equals($assignment_operand.type)) {
           $body += "scanf(\"%d\", " + "&" + $IDENTIFIER.text + ");\n";
       } else {
           $body += $IDENTIFIER.text + $assignment_operator.value + $assignment_operand.value + ";\n";
       }
    } |
    WRITE_BEGIN expression WRPAREN NEWLINE+ {
       $body += "printf(\"%" + $expression.type + "\\n\", " + $expression.value + ");\n";
    } |
    WRETURN expression NEWLINE+ {$body += "return " + $expression.value + ";\n";}
;

assignment_operator returns [String value] @init {$value = "";} :
    WASSIGN {$value = " = ";} |
    WPLUSASSIGN {$value = " += ";} |
    WMINUSASSIGN {$value = " -= ";} |
    WPRODUCTASSIGN {$value = " *= ";} |
    WDIVASSIGN {$value = " /= ";} |
    WDDIVASSIGN {$value = " //= ";}
;

assignment_operand returns [String value, String type] @init {$value = ""; $type = "";} :
    READ {
       $value = "";
       $type = "READ";
    } |
    expression {
       $value = $expression.value;
       $type = "expression";
    }
;

expression returns [String value, String type] @init {$value = ""; $type = "d";} :
    WLPAREN a=expression WRPAREN {$value = "(" + $a.value + ")"; $type = $a.type; $type = "d";} |
    STR_CONST {$value = $STR_CONST.text; $type = "s";} |
    INTEGER {$value = $INTEGER.text; $type = "d";} |
    WTRUE {$value = "1"; $type = "d";} |
    WFALSE {$value = "0"; $type = "d";} |
    a=expression op=binary_operator b=expression {$value = $a.value + $op.value + $b.value; $type = "d";} |
    up=unary_operator b=expression {$value = $up.value + $b.value; $type = "d";} |
    IDENTIFIER a=expression {$value = $IDENTIFIER.text + $a.value; $type = "d";} |
    IDENTIFIER {$value = $IDENTIFIER.text; $type = "d";}
;

binary_operator returns [String value] @init {$value = "";} :
    WPLUS {$value = " + ";} |
    WMINUS  {$value = " - ";} |
    WPRODUCT  {$value = " * ";} |
    WDIV  {$value = " / ";} |
    WMOD  {$value = " % ";} |
    WDDIV  {$value = " / ";} |
    WPLUSASSIGN  {$value = " += ";} |
    WMINUSASSIGN  {$value = " -= ";} |
    WPRODUCTASSIGN  {$value = " *= ";} |
    WDIVASSIGN  {$value = " /= ";} |
    WDDIVASSIGN  {$value = " /= ";} |
    WEQUALS  {$value = " == ";} |
    WNEQUALS  {$value = " != ";} |
    WXOR  {$value = " ^ ";} |
    WOR  {$value = " | ";} |
    WAND  {$value = " & ";} |
    WSHL  {$value = " << ";} |
    WLESSEQ  {$value = " <= ";} |
    WLESS  {$value = " < ";} |
    WSHR  {$value = " >> ";} |
    WGREATEREQ  {$value = " >= ";} |
    WGREATER  {$value = " > ";} |
    WLOR  {$value = " || ";} |
    WLAND  {$value = " && ";} |
    WCOMMA  {$value = ", ";}
;

unary_operator returns [String value] @init {$value = "";} :
    WNEGATE {$value = " ~";} |
    WMINUS {$value = " -";} |
    WNOT {$value = " !";}
;

WS : [ ];
TAB : WS WS WS WS;
NEWLINE : WS* [\r\n]+;

fragment LPAREN : '(';
fragment RPAREN : ')';
fragment INT : 'int';
fragment INPUT : 'input';
fragment PRINT : 'print';
fragment TRUE : 'True';
fragment FALSE : 'False';
fragment IF : 'if';
fragment ELIF : 'elif';
fragment ELSE : 'else';
fragment WHILE : 'while';
fragment FOR : 'for';
fragment IN : 'in';
fragment RANGE : 'range';
fragment DEF : 'def';
fragment RETURN : 'return';
fragment QUOTATION : '"';
fragment COLON : ':';
fragment COMMA : ',';
fragment IDENTIFIER_START : [a-zA-Z_];
fragment IDENTIFIER_PART : [a-zA-Z0-9_];
fragment DIGIT : [0-9];
fragment PLUS : '+';
fragment MINUS : '-';
fragment PRODUCT : '*';
fragment DIV : '/';
fragment MOD : '%';
fragment DDIV : '//';
fragment EQUALS : '==';
fragment NEQUALS : '!=';
fragment ASSIGN : '=';
fragment PLUSASSIGN : '+=';
fragment MINUSASSIGN : '-=';
fragment PRODUCTASSIGN : '*=';
fragment DIVASSIGN : '/=';
fragment DDIVASSIGN : '//=';
fragment XOR : '^';
fragment OR : '|';
fragment AND : '&';
fragment SHL : '<<';
fragment LESSEQ : '<=';
fragment SHR : '>>';
fragment GREATEREQ : '>=';
fragment LESS : '<';
fragment GREATER : '>';
fragment LOR : ' or ';
fragment LAND : ' and ';
fragment NEGATE : '~';
fragment NOT : 'not ';

WTRUE : WS* TRUE WS*;
WFALSE : WS* FALSE WS*;
WCOLON : WS* COLON WS*;
WIF : IF WS*;
WELIF : ELIF WS*;
WELSE : ELSE WS*;
WWHILE : WHILE WS*;
WDEF : WS* DEF WS*;
WRETURN : RETURN WS+;
WFOR : FOR WS*;
WIN : WS* IN WS*;
WRANGE : WS* RANGE WS*;
WCOMMA : WS* COMMA WS*;
WLPAREN : WS* LPAREN WS*;
WRPAREN : WS* RPAREN WS*;
WEQUALS : WS* EQUALS WS*;
WNEQUALS : WS* NEQUALS WS*;
WASSIGN : WS* ASSIGN WS*;
WPLUS : WS* PLUS WS*;
WMINUS : WS* MINUS WS*;
WPRODUCT : WS* PRODUCT WS*;
WDIV : WS* DIV WS*;
WMOD : WS* MOD WS*;
WDDIV : WS* DDIV WS*;
WPLUSASSIGN : WS* PLUSASSIGN WS*;
WMINUSASSIGN : WS* MINUSASSIGN WS*;
WPRODUCTASSIGN : WS* PRODUCTASSIGN WS*;
WDIVASSIGN : WS* DIVASSIGN WS*;
WDDIVASSIGN : WS* DDIVASSIGN WS*;
WXOR : WS* XOR WS*;
WOR : WS* OR WS*;
WAND : WS* AND WS*;
WSHL : WS* SHL WS*;
WSHR : WS* SHR WS*;
WLESSEQ : WS* LESSEQ WS*;
WLESS : WS* LESS WS*;
WGREATEREQ : WS* GREATEREQ WS*;
WGREATER : WS* GREATER WS*;
WLOR : WS* LOR WS*;
WLAND : WS* LAND WS*;
WNEGATE : WS* NEGATE WS*;
WNOT : WS* NOT WS*;


READ : WS* INT WS* LPAREN WS* INPUT WS* LPAREN WS* RPAREN WS* RPAREN;

WRITE_BEGIN : PRINT WS* LPAREN WS*;

IDENTIFIER : IDENTIFIER_START IDENTIFIER_PART*;

STR_CONST : QUOTATION ALL* QUOTATION;

INTEGER : DIGIT+;

ALL : [a-zA-Z0-9_ \t\n\r,;.!@#$%^&*()+=-];