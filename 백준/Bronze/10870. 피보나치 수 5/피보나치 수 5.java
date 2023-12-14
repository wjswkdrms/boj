import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		long[] p = new long[N + 1];

		if(N > 0) p[1] = 1;
		for (int i = 2; i <= N; i++) {
			p[i] = p[i-1] + p[i-2];
		}
		System.out.println(p[N]);
		br.close();
	}
}