import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[][] star;

	static void printStar(int x, int y, int size) {
		if(size == 3) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if(!(i == 1 && j == 1)) {
						star[x+i][y+j] = true;
					}
				}
			}
			return;
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!(i == 1 && j == 1)) {
					printStar(x + (i*size/3), y + (j*size/3), size/3);
				}
			}
		}
	}
    public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		star = new boolean[N][N];
		printStar(0, 0, N);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(star[i][j]) {
					bw.write("*");
				} else {
					bw.write(" ");
				}
			}
			bw.newLine();
		}
		bw.close();
		br.close();
    }
}