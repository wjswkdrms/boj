import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N];
		Arrays.fill(dp, 10000);
		dp[0] = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int p = Integer.parseInt(st.nextToken());
			for (int j = i+1; j < dp.length && j <= i + p; j++) {
				dp[j] = Math.min(dp[j], dp[i] + 1);
			}
		}
		if(dp[N-1] == 10000) {
			dp[N-1] = -1;
		}
		bw.write(String.valueOf(dp[N-1]));
		bw.close();
		br.close();
    }
}