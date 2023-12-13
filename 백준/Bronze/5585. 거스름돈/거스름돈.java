import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = 1000 - Integer.parseInt(br.readLine());
		int[] coin = {500, 100, 50, 10, 5, 1};
		int count = 0;
		for (int i = 0; i < coin.length; i++) {
			count += N / coin[i];
			N %= coin[i];
		}
		System.out.println(count);
		br.close();
		bw.close();
	}
}