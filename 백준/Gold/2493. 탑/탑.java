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
		Stack<Integer> input = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int[] p = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			input.push(Integer.parseInt(st.nextToken()));
		}
		for (int i = N-1; i >= 0; i--) {
			int n = input.pop();
			while(!s.empty() && s.peek() < n) {
				p[idx.pop()] = i + 1;
				s.pop();
			}
			s.push(n);
			idx.push(i);
		}
		for (int i = 0; i < p.length; i++) {
			bw.write(p[i] + " ");
		}
		bw.close();
		br.close();
	}

}