#include <stdio.h>

int d;

int main() {
	scanf("%d", &d);
	if (1) {
		printf("%d\n", d);
	}
	if (1 > 2) {
		int a;
		scanf("%d", &a);
		a += d;
		printf("%s\n", "Yes");
		printf("%d\n", a);
	} else {
		int b;
		scanf("%d", &b);
		b *= 2;
		printf("%s\n", "No");
		printf("%d\n", b);
	}
	if (d > 2) {
		printf("%s\n", "Okay");
	} else if (d > 0) {
		printf("%s\n", "Normal");
	} else if (d >=  -2) {
		printf("%s\n", "Not bad");
	} else {
		printf("%s\n", "Bad");
	}
	return 0;
}