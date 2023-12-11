import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] p = new int[N+1];
			boolean[] visited = new boolean[N + 1];
			Queue<Integer> q = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int result = 0;
			for (int i = 1; i <= N; i++) {
				p[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 1; i <= N; i++) {
				int n = i;
				while(!visited[n]) {
					visited[n] = true;
					q.add(n);
					n = p[n];
				}
				while(!q.isEmpty() && q.poll() != n) {
					result++;
				}
				q.clear();
			}
			bw.write(String.valueOf(result));
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
