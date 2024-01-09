import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		char[] p = br.readLine().toCharArray();
		int s = 0;
		int count = 0;
		for (int i = 0; i < p.length; i++) {
			if(p[i] == '(') {
				s++;
				count++;
			}
			if(p[i] == ')') {
				s--;
				if(p[i-1] == '(') {
					count--;
					count += s;
				}
			}
		}
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
    }
}