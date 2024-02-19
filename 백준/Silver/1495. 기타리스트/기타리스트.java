import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static boolean[] vol(boolean[] v, int M, int c) {
		boolean[] result = new boolean[M + 1];
		for (int i = 0; i <= M; i++) {
			if(v[i]) {
				if(i - c >= 0) {
					result[i - c] = true;
				}
				if(i + c <= M) {
					result[i + c] = true;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean[] v = new boolean[M + 1];
		v[S] = true;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			v = vol(v, M, Integer.parseInt(st.nextToken()));
		}
		for (int i = 0; i < v.length; i++) {
			if(v[M-i]) {
				System.out.println(M-i);
				break;
			}
			if(i == M) {
				System.out.println("-1");
			}
		}
		br.close();
		bw.close();
	}
}
