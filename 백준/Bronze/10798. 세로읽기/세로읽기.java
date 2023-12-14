import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		char[][] ch = new char[5][15];
		for (int i = 0; i < 5; i++) {
			Arrays.fill(ch[i], '.');
			String inp = br.readLine();
			for (int j = 0; j < inp.length() ; j++) {
				ch[i][j] = inp.charAt(j);
			}
		}
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (ch[j][i] != '.') {
					bw.write(ch[j][i]);
				}
			}
		}
		br.close();
		bw.close();
	}
}