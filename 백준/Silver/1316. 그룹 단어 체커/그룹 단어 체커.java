import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		for (int j = 0; j < N; j++) {
			char[] ch = br.readLine().toCharArray();
			boolean[] check = new boolean[26];
			for (int i = 0; i < ch.length; i++) {
				if (!check[ch[i] - 'a']) {
					check[ch[i] - 'a'] = true;
				}else if (ch[i-1] != ch[i]) {
					count++;
					break;
				}
			}
		}
		bw.write(String.valueOf(N - count));
		
		br.close();
		bw.close();
	}
}