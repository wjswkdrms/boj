import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[][] p = new int[N][2];
		int[] dp = new int[N+1];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[i][0] = Integer.parseInt(st.nextToken());
			p[i][1] = Integer.parseInt(st.nextToken());
		}
		for (int i = N-1; i >= 0; i--) {
			dp[i] = dp[i+1];
			if(p[i][0] + i <= N) {
				dp[i] = Math.max(dp[i], dp[i+p[i][0]] + p[i][1]);
			}
		}
		System.out.println(dp[0]);

		bw.close();
		br.close();
	}
}