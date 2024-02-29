import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[][] p;
	static int[][] dp;
	static boolean[][] visited;
	static int N;
	static int M;

	static int find(int i, int j) {
		int c = 0;
		if(i == N-1 && j == M-1) {

			dp[i][j] = 1;
			return 1;
		}
		if(visited[i][j]) {
			return dp[i][j];
		}
		visited[i][j] = true;
		if(i > 0 && p[i-1][j] < p[i][j]) {
			c += find(i-1, j);
		}
		if(j > 0 && p[i][j-1] < p[i][j]) {
			c += find(i, j-1);
		}
		if(i < N-1 && p[i+1][j] < p[i][j]) {
			c += find(i+1, j);
		}
		if(j < M-1 && p[i][j+1] < p[i][j]) {
			c += find(i, j+1);
		}
		dp[i][j] = c;
		return c;
	} 

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		p = new int[N][M];
		dp = new int[N][M];
		visited = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		System.out.println(find(0, 0));
		
		bw.close();
		br.close();
	}
}
