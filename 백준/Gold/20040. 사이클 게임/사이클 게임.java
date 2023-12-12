import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;

	static void union(int n, int m) {
		int pn = find(n);
		int pm = find(m);
		if(pn < pm) parent[pm] = pn;
		else parent[pn] = pm; 
	}
	static int find(int n) {
		if(parent[n] == n) return n;
		else return parent[n] = find(parent[n]);
	}
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		parent = new int[N];
		for (int i = 0; i < N; i++) {
			parent[i] = i;
		}
		int fin = 0;
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			if(find(n) == find(m) && fin == 0) {
				fin = i + 1;
			}
			else {
				union(n, m);
			}
		}
		bw.write(String.valueOf(fin));
		br.close();
		bw.close();
	}
}