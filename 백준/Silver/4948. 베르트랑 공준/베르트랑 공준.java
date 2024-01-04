import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		boolean[] che = new boolean[300000];
		for(int i = 2; i < Math.sqrt(300000); i++) {
			if(!che[i]) {
				int n = 2;
				while(i * n < 300000) {
					che[i * n] = true;
					n++;
				}
			}
		}
		int N;
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N == 0) {
				break;
			}
			int result = 0;
			for (int i = N+1; i <= 2 * N; i++) {
				if(!che[i]) {
					result++;
				}
			}
			bw.write(String.valueOf(result));
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}