#include <stdio.h>

int main() {
	char word[5][16];

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 15; j++) {
			word[i][j] = '!';
		}
	}

	for (int i = 0; i < 5; i++) {
		scanf("%s", word[i]);
	}

	int i = 0;

	for (int j = 0; j < 15; j++) {
		for (int i = 0; i < 5; i++) {
			if (word[i][j] != '!' && word[i][j] != 0) {
				printf("%c", word[i][j]);
			}
		}
	}

	return 0;
}