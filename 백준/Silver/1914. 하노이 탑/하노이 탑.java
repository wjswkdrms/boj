import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static void hanoi(int now, int where, int size) throws IOException {
		if(size > 1) {
			hanoi(now, 6-now-where, size-1);
		}
		bw.write(now + " " + where + "\n");
		if(size > 1) {
			hanoi(6-now-where, where, size-1);
		}
	}
    public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());

		bw.write(new BigInteger("2").pow(N).subtract(new BigInteger("1")).toString());
		bw.newLine();
		if(N <= 20) {
			hanoi(1, 3, N);
		}
		bw.close();
		br.close();
    }
}