import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		int[][] dp = new int[100001][3];
		dp[1][0] = 1;
		dp[2][1] = 1;
		dp[3][2] = 1;
		dp[3][0] = 1;
		dp[3][1] = 1;

		for (int i = 4; i < 100001; i++) {
			dp[i][0] = (dp[i-1][1] + dp[i-1][2])%1000000009;
			dp[i][1] = (dp[i-2][0] + dp[i-2][2])%1000000009;
			dp[i][2] = (dp[i-3][0] + dp[i-3][1])%1000000009;
		}

		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(((dp[n][0]+dp[n][2])%1000000009+dp[n][1])%1000000009));
			bw.newLine();
		}
		bw.close();
		br.close();
    }
}