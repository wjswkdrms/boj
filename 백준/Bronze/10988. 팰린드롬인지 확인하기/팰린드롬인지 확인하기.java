import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		char[] ch = br.readLine().toCharArray();
		boolean pel = true;
		for (int i = 0; i < ch.length / 2; i++) {
			if (ch[i] != ch[ch.length-1-i]) {
				pel = false;
				break;
			}
		}
		bw.write(pel ? "1" : "0");
		br.close();
		bw.close();
	}
}