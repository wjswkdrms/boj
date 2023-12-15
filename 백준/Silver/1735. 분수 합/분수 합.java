import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static long uc(long a, long b) {
		if(a % b == 0) {
			return b;
		}
		return uc(b, a % b);
	}
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a = Integer.parseInt(st.nextToken());
		long b = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long c = Integer.parseInt(st.nextToken());
		long d = Integer.parseInt(st.nextToken());
		long A = a * d + c * b;
		long B = b * d;
		long gcd = uc(A, B);
		A /= gcd;
		B /= gcd;
		bw.write(String.valueOf(A + " " + B));
		bw.newLine();
	
		br.close();
		bw.close();
	}
}