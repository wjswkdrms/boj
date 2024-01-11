import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] p;

	static int parent(int n) {
		if (p[n] == n) {
			return n;
		}
		return parent(p[n]);
	}
	static void union(int a, int b) {
		p[parent(b)] = parent(a);
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		p = new int[N+1];
		for (int i = 0; i <= N; i++) {
			p[i] = i;
		}
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(c == 0) {
				union(a, b);
			} else {
				if(parent(a) == parent(b)){
					bw.write("YES");
				} else {
					bw.write("NO");
				}
				bw.newLine();
			}
		}
		bw.close();
		br.close();
	}

}