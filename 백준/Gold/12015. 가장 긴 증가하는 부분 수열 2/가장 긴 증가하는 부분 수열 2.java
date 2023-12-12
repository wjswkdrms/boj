import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int[] p;
	static int bin(int s, int e, int n) {
		if(s == e) {
			return p[e] >= n ? e: s;
		}
		int m = (s + e) / 2;
		if(p[m] < n) {
			return bin(m + 1, e, n);
		}else {
			return bin(s, m, n);
		}
	}
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		p = new int[n];
		int len = 0;
		for(int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(len == 0 || p[len - 1] < a) {
				p[len++] = a;
			}else {
				p[bin(0, len, a)] = a;
			}
		}
		bw.write(String.valueOf(len));
		// for (int i = 0; i < len; i++) {
		// 	System.out.println(i + " : " + p[i]);
		// }
		br.close();
		bw.close();
	}

}
