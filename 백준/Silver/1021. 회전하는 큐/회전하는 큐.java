import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int find(Queue<Integer> q, int find) {
		int c = 0;
		int n;
		while((n = q.poll()) != find) {
			c++;
			q.add(n);
		}
		return c;
	}
	public static void main(String[] args) throws IOException {
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> Rq = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		for (int i = N; i >= 1; i--) {
			Rq.add(i);
		}
		st = new StringTokenizer(br.readLine());
		int count = 0;
		for (int i = 0; i < M; i++) {
			int n = Integer.parseInt(st.nextToken());
			count += Math.min(find(q, n), find(Rq, n) + 1);
		}
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}

}