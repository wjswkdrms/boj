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
		int[] p = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		Arrays.fill(p, 100000000);
		p[0] = 0;
		for (int i = 1; i <= N; i++) {
			int n = Integer.parseInt(st.nextToken());
			for (int j = i; j <= N; j++) {
				p[j] = Math.min(p[j], p[j - i] + n);
			}
		}
		bw.write(String.valueOf(p[N]));

		bw.close();
		br.close();
	}
}