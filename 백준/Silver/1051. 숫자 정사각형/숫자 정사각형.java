import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] p;
	static int isSquare(int N, int M) {
		int C = Math.min(N, M);
		while(C > 1) {
			for (int i = 0; i <= N-C; i++) {
				for (int j = 0; j <= M-C; j++) {
					if(p[i][j] == p[i+C-1][j] && p[i][j] == p[i+C-1][j+C-1] && p[i][j] == p[i][j+C-1]) {
						return C*C;
					}
				}
			}
			C--;
		}
		return 1;
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		p = new int[N][M];

		for(int i = 0; i < N; i++) {
			char[] ch = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				p[i][j] = ch[j] - '0';
			}
		}
		
		bw.write(String.valueOf(isSquare(N, M)));

		br.close();
		bw.close();
	}
}
