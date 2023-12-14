import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(br.readLine());
		long[] p = new long[1500000];
		p[1] = 1;
		p[2] = 1;
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			long N = Integer.parseInt(st.nextToken());
			for (int i = 3; i < p.length; i++) {
				p[i] = (p[i-1] + p[i-2]) % N;
				if(p[i] == 1 && p[i - 1] == 1) {
					bw.write(a + " " + (i-2)+"\n");
					break;
				}
			}
		}

		br.close();
		bw.close();
	}
}