import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] dp = new int[k+1];
		int[] coin = new int[n];
		for(int i = 0; i < n; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(coin);

		for(int i = 0; i <= k; i++) {
			if(i%coin[0] == 0) {
				dp[i] = 1;
			}
		}
		for(int i = 1; i < n; i++) {
			for(int j = coin[i]; j <= k; j++) {
				dp[j] += dp[j-coin[i]];
			}
		}
		bw.write(String.valueOf(dp[k]));
		bw.close();
		br.close();
	}
}
