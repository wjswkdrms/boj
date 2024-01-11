import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Stack<Integer> s = new Stack<>();
		Stack<Integer> idx = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int[] p = new int[N];
		Arrays.fill(p, -1);
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(st.nextToken());
			while(!s.empty() && s.peek() < n) {
				p[idx.pop()] = n;
				s.pop();
			}
			s.push(n);
			idx.push(i);
		}
		// while(!s.empty()){
		// 	s.pop();
		// 	p[idx.pop()] = -1;
		// }
		for (int i = 0; i < p.length; i++) {
			bw.write(p[i] + " ");
		}
		bw.close();
		br.close();
	}

}