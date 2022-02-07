#include <stdio.h>

int a;

int f(int x, int y) {
	int s;
	s = 0;
	while (s < 5) {
		printf("%d\n", s);
		s += x;
	}
	if (x < y) {
		printf("%d\n", x);
	} else if (x == y) {
		printf("%d\n", x);
		printf("%d\n", y);
	} else {
		printf("%d\n", y);
	}
	return s;
}

int main() {
	scanf("%d", &a);
	for (int i = 0; i < 10; i += 2) {
		int s;
		s = 0;
		for (int j = 0; j < 10; j += 2) {
			s += i;
			i += j;
		}
		if (s > 15) {
			int d;
			scanf("%d", &d);
			printf("%d\n", s + d + a);
		}
	}
	for (int j = 0; j < 10; j += 2) {
		int s;
		s = 0;
		for (int i = 0; i < 10; i += 2) {
			s += j;
			j += i;
		}
		if (s > 15) {
			int d;
			scanf("%d", &d);
			printf("%d\n", s + d + a);
		}
	}
	return 0;
}