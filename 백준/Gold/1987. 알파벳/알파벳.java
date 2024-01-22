import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static boolean[] visited = new boolean[26];
	static int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	
	static int dfs(int x, int y, char[][] p) {
		visited[p[x][y] - 'A'] = true;
		int depth = 0;
		for(int[] d : dir) {
			if (d[0] + x >= 0 && d[0] + x < p.length && d[1] + y >= 0 && d[1] + y < p[x].length &&
			!visited[p[d[0]+x][d[1]+y] - 'A']) {
				depth = Math.max(dfs(d[0] + x, d[1] + y, p),depth);
			}
		}
		visited[p[x][y] - 'A'] = false;
		return depth + 1;
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char[][] p = new char[N][M];
		for (int i = 0; i < N; i++) {
			p[i] = br.readLine().toCharArray();
		}
		bw.write(String.valueOf(dfs(0, 0, p)));
		bw.close();
		br.close();
	}
}
