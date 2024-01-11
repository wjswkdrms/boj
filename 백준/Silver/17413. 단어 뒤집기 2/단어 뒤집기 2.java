import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		char[] ch = br.readLine().toCharArray();
		Stack<Character> s = new Stack<>();
		boolean tag = false;
		for (char c : ch) {
			if (tag) {
				bw.write(c);
				if(c == '>') {
					tag = false;
				}
			} else {
				if(c == '<') {
					while(!s.empty()) {
						bw.write(s.pop());
					}
					bw.write('<');
					tag = true;
				}else if(c == ' ') {
					while(!s.empty()) {
						bw.write(s.pop());
					}
					bw.write(" ");
				} else {
					s.push(c);
				}
			}
		}
		while(!s.empty()) {
			bw.write(s.pop());
		}
		bw.close();
		br.close();
	}

}