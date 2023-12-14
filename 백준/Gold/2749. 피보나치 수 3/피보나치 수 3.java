import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		long N = Long.parseLong(br.readLine()) % 1500000;

		long a = 1;
		long b = 0;
		long c = 0;
		for (int i = 0; i < N; i++) {
			c = (a + b) % 1000000;
			a = b;
			b = c;
		}
		bw.write(String.valueOf(c));
		
		br.close();
		bw.close();
	}
}