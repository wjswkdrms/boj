import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		char[] ch = br.readLine().toCharArray();
		int len = ch.length;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '-' || ch[i] == '=') {
				len--;
				if(i >= 2 && ch[i] == '=' && ch[i-2] == 'd' && ch[i-1] =='z') {
					len--;
				}
			}
			if (ch[i] == 'j') {
				if (i > 0 && (ch[i-1] == 'l' || ch[i-1] =='n')) {
					len--;
				}
			}
		}
		bw.write(String.valueOf(len));
		br.close();
		bw.close();
	}
}