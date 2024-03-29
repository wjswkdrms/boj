import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		char[] A = br.readLine().toCharArray();
		char[] B = br.readLine().toCharArray();
		int[][] dp = new int[A.length+1][B.length+1];
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i] == B[j]) {
					dp[i+1][j+1] = dp[i][j] + 1;
					if(dp[i+1][j+1] > max) {
						max = dp[i+1][j+1];
					}
				}
			}
		}
		System.out.println(max);
		bw.close();
		br.close();
	}
}