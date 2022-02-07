#include <stdio.h>

int a;
int step;

int main() {
	scanf("%d", &a);
	while (a < 5) {
		a -= 1;
		a += 2;
	}
	printf("%d\n", a);
	scanf("%d", &step);
	for (int i = 0; i < 10 + step; i += step) {
		a += 21;
		printf("%d\n", a);
	}
	return 0;
}