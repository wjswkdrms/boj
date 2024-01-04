import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		boolean[] che = new boolean[10000];
		for(int i = 2; i < Math.sqrt(10000); i++) {
			if(!che[i]) {
				int n = 2;
				while(i * n < 10000) {
					che[i * n] = true;
					n++;
				}
			}
		}
		int T= Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int a = N / 2;
			int b = N - a;
			while (true) {
				if (!che[a] && !che[b]) {
					break;
				}
				a--;
				b++;
			}
			bw.write(a + " " + b);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}