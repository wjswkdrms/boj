import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		long[] dp = new long[n+1];
		dp[0] = 1;
		for(int i = 1; i < m; i++) {
			long[] p = new long[n+1];
			for(int j = 0; j <= n; j++) {
				for(int k = j; k <= n; k++) {
					p[k] += dp[j]; 
				}
			}
			for(int j = 0; j <= n; j++) {
				//System.out.println("p["+j+"]:" +p[j]);
				dp[j] = p[j] % 1000000000;
			}
		}
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			//System.out.println("dp["+i+"]:" +dp[i]);
			sum += dp[i];
			sum %= 1000000000;
		}
		System.out.println(sum);
		bw.close();
		br.close();
	}
}
