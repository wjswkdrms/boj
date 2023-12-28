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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] app = new int[N][2];
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			app[i][0] = Integer.parseInt(st1.nextToken());
			app[i][1] = Integer.parseInt(st2.nextToken());
		}
		Arrays.sort(app , (o1, o2) -> o1[1] - o2[1]);

		int[] dp = new int[M+1];
		Arrays.fill(dp, 10001);
		for (int i = 0; i < N; i++) {
			for (int j = M; j >= 0; j--) {
				if(j - app[i][0] <= 0) {
					dp[j] = Math.min(dp[j], app[i][1]);
				} else {
					dp[j] = Math.min(dp[j], dp[j - app[i][0]] + app[i][1]);
				}
			}
		}
		bw.write(String.valueOf(dp[M]));
		bw.close();
		br.close();
	}
}