import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static boolean[][] p;
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		visited = new boolean[N + 1];
		p = new boolean[N+1][N+1];
		
		for(int i = 0; i < M; i ++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			p[x][y] = true;
			p[y][x] = true;
		}
		main.dfs(V, N);
		visited = new boolean[N + 1];
		System.out.println();
		main.bfs(V, N);
		
		bw.close();
		br.close();
	}
	public void dfs(int d, int N) {
		visited[d] = true;
		System.out.print(d + " ");
		for(int i = 1; i <= N; i++) {
			if(!visited[i] && p[d][i]) {
				dfs(i, N);
			}
		}
	}
	public void bfs(int b, int N) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(b);
		visited[b] = true;
		System.out.print(b + " ");
		while(!q.isEmpty()) {
			int n = q.poll();
			for(int i = 1; i <= N; i++) {
				if(!visited[i] && p[n][i]) {
					System.out.print(i + " ");
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
}
