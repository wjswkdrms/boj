import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		long[][] dp = new long[100][10];
		long[][] ldp = new long[100][10];
		long[][] rdp = new long[100][10];
		long[][] adp = new long[100][10];
		for (int i = 1; i < 9; i++) {
			dp[0][i] = 1;
		}
		rdp[0][9] = 1;
		for (int i = 1; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if(j != 0) {
					dp[i][j] += dp[i-1][j-1];
					ldp[i][j] += ldp[i-1][j-1];
					rdp[i][j] += rdp[i-1][j-1];
					adp[i][j] += adp[i-1][j-1];
				}
				if(j != 9) {
					dp[i][j] += dp[i-1][j+1];
					ldp[i][j] += ldp[i-1][j+1];
					rdp[i][j] += rdp[i-1][j+1];
					adp[i][j] += adp[i-1][j+1];
				}
				dp[i][j] %= 1000000000;
				ldp[i][j] %= 1000000000;
				rdp[i][j] %= 1000000000;
				adp[i][j] %= 1000000000;
			}
			ldp[i][0] += dp[i][0];
			rdp[i][9] += dp[i][9];
			adp[i][0] += rdp[i][0];
			adp[i][9] += ldp[i][9];
			dp[i][0] = 0;
			dp[i][9] = 0;
			rdp[i][0] = 0;
			ldp[i][9] = 0;
		}
		long result = 0;
		for (int i = 0; i < 10; i++) {
			result += adp[N-1][i];
			result %= 1000000000;
		}
		System.out.println(result);
		bw.close();
		br.close();
	}
}