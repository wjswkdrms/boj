import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		HashSet<Integer> vip = new HashSet<>();
		for (int i = 0; i < M; i++) {
			vip.add(Integer.parseInt(br.readLine()));
		}
		int[] dp = new int[N + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= N; i++) {
			if(!(vip.contains(i) || vip.contains(i-1))){
				dp[i] += dp[i-2];
			}
			dp[i] += dp[i-1];
		}
		bw.write(String.valueOf(dp[N]));
		br.close();
		bw.close();
	}
}
