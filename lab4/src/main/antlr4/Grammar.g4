grammar Grammar;

prog returns [java.util.List<model.ParserRule> parserRules,
              java.util.List<model.LexerRule> lexerRules,
              java.util.Map<String, String> fieldDeclarations,
              java.util.Set<String> inherited] @init {
        $parserRules = new java.util.ArrayList<>();
        $lexerRules = new java.util.ArrayList<>();
        $fieldDeclarations = new java.util.HashMap<>();
        $inherited = new java.util.HashSet<>();
    } :
    field_declarations {
        $fieldDeclarations = new java.util.HashMap<>();
        for (java.util.Map.Entry<String, java.util.Set<String>> entry : $field_declarations.value.entrySet()) {
            String accum = "";
            for (String s : entry.getValue()) {
                accum += s;
            }
            $fieldDeclarations.put(entry.getKey(), accum);
        }
        $inherited = $field_declarations.inherited;
    }
    ENDL*
    parser_rules[$inherited] {
        $parserRules = $parser_rules.rules;
    }
    ENDL*
    lexer_rules {
        $lexerRules = $lexer_rules.rules;
    }
    ENDL*
;

parser_rules[java.util.Set<String> inherited] returns [java.util.List<model.ParserRule> rules, String pre, String in, String post, Integer pos] @init {
        $rules = new java.util.ArrayList<>();
        $pre = null;
        $in = null;
        $post = null;
        $pos = -1;
    } :
    (NON_TERMINAL WS+ ARROW WS+ right_part_parser[$inherited] WS*
      ((BEFORE before=attributes {$pre = $before.value;})? WS*
      (INSIDE WS* NUMBER inside=attributes {
          $in = $inside.value;
          $pos = Integer.parseInt($NUMBER.text);
      })? WS*
      (AFTER after=attributes {$post = $after.value;})?) {
        $rules.add(new model.ParserRule(new model.NonTerm($NON_TERMINAL.text, $inherited.contains($NON_TERMINAL.text)), $right_part_parser.value, $pre, $in, $post, $pos));
        $pre = null;
        $in = null;
        $post = null;
        $pos = -1;
    })*
;

attributes returns [String value, String accum] @init {$value = ""; $accum = "";} :
    WS* COLON ENDL* WS*
        (TERMINAL {$accum += $TERMINAL.text;} |
        NON_TERMINAL {$accum += $NON_TERMINAL.text;} |
        NUMBER {$accum += $NUMBER.text;} |
        LBRACKET {$accum += $LBRACKET.text;} |
        RBRACKET {$accum += $RBRACKET.text;} |
        TERMINAL_OPS {$accum += $TERMINAL_OPS.text;} |
        TYPE {$accum += $TYPE.text;} |
        OTHER {$accum += $OTHER.text;} |
        WS {$accum += $WS.text;} |
        ENDL {$accum += $ENDL.text;})+ SHARP ENDL* WS* {
        $value = $accum;
    }
;

lexer_rules returns [java.util.List<model.LexerRule> rules] @init {$rules = new java.util.ArrayList<>();} :
    (TERMINAL WS+ COLON WS+ right_part_lexer {
        $rules.add(new model.LexerRule(new model.Term($TERMINAL.text), $right_part_lexer.value));
    })*
;

right_part_parser[java.util.Set<String> inherited] returns [java.util.List<model.RuleElement> value] @init {$value = new java.util.ArrayList<>();} :
    (((WS* NON_TERMINAL) {
        $value.add(new model.NonTerm($NON_TERMINAL.text, $inherited.contains($NON_TERMINAL.text)));
    } |
    (WS* TERMINAL) {
        $value.add(new model.Term($TERMINAL.text));
    })+ |
    (WS* EPS) {
        $value.add(model.Term.EPS);
    }) ENDL*
;

right_part_lexer returns [java.lang.String value] @init {$value = "";} :
    (REGEXP REG_CONTENT {
        $value = $REGEXP.text + $REG_CONTENT.text;
    } |
    TERMINAL {
        $value = $TERMINAL.text;
    } |
    TERMINAL_OPS {
        $value = $TERMINAL_OPS.text;
    })
    ENDL+
;

field_declarations returns[java.util.Map<String, java.util.Set<String>> value,
                           java.util.Set<String> inherited] @init {
        $value = new java.util.HashMap<>();
        $inherited = new java.util.HashSet<>();
    } :
    (NON_TERMINAL {$value.putIfAbsent($NON_TERMINAL.text, new java.util.HashSet<>());}
        (SHARP {$inherited.add($NON_TERMINAL.text);})? WS* COLON WS* LBRACKET ENDL*
        (WS* TYPE WS* TERMINAL ENDL* {
            $value.get($NON_TERMINAL.text).add("public " + $TYPE.text + " " + $TERMINAL.text + ";\n");
        })*
        ENDL*
    RBRACKET ENDL*)*
;

WS : ' ';
ENDL : WS* [\r\n]+;

COLON : ':';
ARROW : '->';

TYPE : ('int' | 'String');
BEFORE : '@before';
INSIDE : '@inside';
AFTER : '@after';

TERMINAL_OPS : [-+*/|^&!()];

NON_TERMINAL : [A-Z][A-Z0-9]*;
TERMINAL : [a-z][a-z_0-9]*;
NUMBER : [0-9]+;

REGEXP : '\\\\reg';
EPS : '\\\\eps';

LBRACKET : '{';
RBRACKET : '}';
SHARP : '#';

OTHER : [_,.;=];

fragment LBRACE : '[';
fragment RBRACE : ']';
fragment MINUS : '-';
fragment STAR : '*';

ALPHANUM : (TERMINAL | NON_TERMINAL | NUMBER | '$' | '.');

ALL : (TERMINAL | NON_TERMINAL | NUMBER | LBRACKET | RBRACKET | ENDL | TERMINAL_OPS | OTHER);

REG_CONTENT : (LBRACE (ALPHANUM MINUS ALPHANUM)* RBRACE)+ STAR?;
