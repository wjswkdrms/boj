import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int C = Integer.parseInt(br.readLine());
			int[] coin = new int[C];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < coin.length; i++) {
				coin[i] = Integer.parseInt(st.nextToken());
			}
			int M = Integer.parseInt(br.readLine());
			int[] money = new int[M+1];
			money[0] = 1;
			for (int i : coin) {
				for (int j = i; j < money.length; j++) {
					money[j] += money[j-i];
				}
			}
			bw.write(String.valueOf(money[M]));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}
