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
		char[] str = br.readLine().toCharArray();
		char[] boom = br.readLine().toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = str.length-1; i >= 0 ; i--) {
			stack.push(str[i]);
			if(str[i] == boom[0] && stack.size() >= boom.length) {
				Stack<Character> sub = new Stack<>();
				for (int j = 0; j < boom.length; j++) {
					char c = stack.pop();
					sub.push(c);
					if(c != boom[j]) {
						while(!sub.empty())	{
							stack.push(sub.pop());
						}
						break;
					}
				}
			}
		}
		if(stack.empty()) {
			bw.write("FRULA");
		}
		while(!stack.empty()) {
			bw.write(stack.pop());
		}
		bw.close();
		br.close();
    }
}