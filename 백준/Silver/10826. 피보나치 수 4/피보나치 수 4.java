import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());

		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("0");
		BigInteger c = new BigInteger("0");
		for (int i = 0; i < N; i++) {
			c = a.add(c);
			a = b;
			b = c;
		}
		bw.write(c.toString());

		br.close();
		bw.close();
	}
}