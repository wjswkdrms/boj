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
		StringTokenizer st = new StringTokenizer(br.readLine());
		long N = Long.parseLong(st.nextToken());
		long R = Long.parseLong(st.nextToken());
		long C = N - R;
		long result = 0;
		for (long i = 1; i <= Math.sqrt(C); i++) {
			if(C % i == 0) {
				if (i > R) {
					result += i;
				}
				if(C / i != i) {
					if (C / i > R) {
						result += C / i;
					}
				}
			}
		}
		bw.write(String.valueOf(result));
		bw.close();
		br.close();
	}
}
