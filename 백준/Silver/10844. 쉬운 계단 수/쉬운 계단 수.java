import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		long[] p = new long[10];
		Arrays.fill(p, 1);
		p[0] = 0;
		for(int i = 1; i < N; i++) {
			long[] pp = new long[10];
			for(int j = 0; j < 10; j++) {
				if(j!=0) {
					pp[j] += p[j-1];
				}
				if(j!=9) {
					pp[j] += p[j+1];
				}
			}
			for(int j = 0; j < 10; j++) {
				p[j] = pp[j]%1000000000;
			}
		}
		long result = 0;
		for(long i : p) {
			result += i;
			result %= 1000000000;
		}
		bw.write(String.valueOf(result%1000000000));
		bw.close();
		br.close();
	}
}
