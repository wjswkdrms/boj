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

		long[][] dp = new long[N][21];
		StringTokenizer st = new StringTokenizer(br.readLine());
		dp[0][Integer.parseInt(st.nextToken())] = 1;
		for (int i = 1; i < N - 1; i++) {
			int n = Integer.parseInt(st.nextToken());
			for (int j = 0; j <= 20; j++) {
				if (j - n >= 0) {
					dp[i][j-n] += dp[i-1][j];
				}
				if (j + n <= 20) {
					dp[i][j+n] += dp[i-1][j];
				}
			}
		}
		bw.write(String.valueOf(dp[N-2][Integer.parseInt(st.nextToken())]));

		bw.close();
		br.close();
	}
}