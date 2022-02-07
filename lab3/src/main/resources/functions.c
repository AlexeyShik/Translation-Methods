#include <stdio.h>

int a;
int b;

int f(int x) {
	int y;
	scanf("%d", &y);
	x += 1;
	return x + y -2;
}

int g(int x, int y, int z) {
	return f(x) + f(y) - f(z);
}

int main() {
	scanf("%d", &a);
	b = f(a);
	printf("%d\n", f(f(f(b))));
	if (a > b) {
		printf("%d\n", f( -1));
	}
	while (a != b) {
		printf("%d\n", f(a));
	}
	printf("%d\n", g(1, a, 3));
	return 0;
}