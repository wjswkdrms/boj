import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<>();
		
		for (int i = 0; i < N; i++) {
			q.offer(Integer.parseInt(br.readLine()));
		}
		long result = 0;
		while(q.size() >= 2) {
			int a = q.poll();
			int b = q.poll();
			q.offer(a+b);
			result += a+b;
		}
		System.out.println(result);
		br.close();
		bw.close();
	}
}