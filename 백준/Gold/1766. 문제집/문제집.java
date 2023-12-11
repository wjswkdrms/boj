import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		List<List<Integer>> graph = new ArrayList<>();
		int[] p = new int[N+1];
		for (int i = 0; i < N+1; i++) {
			graph.add(new ArrayList<>());
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			graph.get(a).add(b);
			p[b]++;
		}
		Queue<Integer> q = new LinkedList<>();
		int c = N;
		while(c > 0) {
			for(int i = 1; i <= N; i++) {
				if(p[i] == 0) {
					q.add(i);
					p[i]--;
					break;
				}
			}
			while(!q.isEmpty()) {
				int n = q.poll();
				for(int i : graph.get(n)) {
					p[i]--;
				}
				bw.write(String.valueOf(n));
				bw.write(" ");
				c--;
			}
		}

		br.close();
		bw.close();
	}

}
