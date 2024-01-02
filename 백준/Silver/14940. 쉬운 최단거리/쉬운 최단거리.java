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
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] p = new int[N][M];
		int[][] dp = new int[N][M];
		Queue<int[]> q = new LinkedList<>();

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
				if(p[i][j] == 2) {
					int[] input = {i,j};
					q.add(input);
				}
			}
		}
		int t = 0;
		while(!q.isEmpty()) {
			int[] tmt = q.poll();
			t = Math.max(dp[tmt[0]][tmt[1]], t);
			if(tmt[0] > 0 && p[tmt[0]-1][tmt[1]] == 1) {
				p[tmt[0]-1][tmt[1]] = 2;
				dp[tmt[0]-1][tmt[1]] = dp[tmt[0]][tmt[1]] + 1;
				int[] input = {tmt[0]-1,tmt[1]};
				q.add(input);
			}
			if(tmt[1] > 0 && p[tmt[0]][tmt[1]-1] == 1) {
				p[tmt[0]][tmt[1]-1] = 2;
				dp[tmt[0]][tmt[1]-1] = dp[tmt[0]][tmt[1]] + 1;
				int[] input = {tmt[0],tmt[1]-1};
				q.add(input);
			}
			if(tmt[0] < N-1 && p[tmt[0]+1][tmt[1]] == 1) {
				p[tmt[0]+1][tmt[1]] = 2;
				dp[tmt[0]+1][tmt[1]] = dp[tmt[0]][tmt[1]] + 1;
				int[] input = {tmt[0]+1,tmt[1]};
				q.add(input);
			}
			if(tmt[1] < M-1 && p[tmt[0]][tmt[1]+1] == 1) {
				p[tmt[0]][tmt[1]+1] = 2;
				dp[tmt[0]][tmt[1]+1] = dp[tmt[0]][tmt[1]] + 1;
				int[] input = {tmt[0],tmt[1]+1};
				q.add(input);
			}
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(p[i][j] == 1) {
					bw.write("-1");
				}else {
					bw.write(String.valueOf(dp[i][j]));
				}
				bw.write(" ");
			}
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
