import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		Stack<Character> left = new Stack<>();
		Stack<Character> right = new Stack<>();

		for (char c : br.readLine().toCharArray()) {
			left.push(c);
		}
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "L":
					if (!left.isEmpty()) {
						right.push(left.pop());
					}
					break;
				case "D":
					if (!right.isEmpty()) {
						left.push(right.pop());
					}
					break;
				case "B":
					if (!left.isEmpty()) {
						left.pop();
					}
					break;
				case "P":
					left.push(st.nextToken().charAt(0));
					break;
				default:
					break;
			}
		}
		while (!left.isEmpty()) {
			right.push(left.pop());
		}
		while(!right.isEmpty()) {
			bw.write(right.pop());
		}

		bw.close();
		br.close();
	}

}