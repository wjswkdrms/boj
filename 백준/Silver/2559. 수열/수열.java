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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken());
		int[] p = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		int n = 0;
		int max = -100000000;
		for (int i = 0; i < K; i++) {
			n += p[i];
		}
		max = Math.max(max, n);
		for (int i = 0; i < N - K; i++) {
			n -= p[i];
			n += p[i + K];
			max = Math.max(max, n);
		}
		bw.write(String.valueOf(max));
		bw.close();
		br.close();
	}

}