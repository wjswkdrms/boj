import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		int A = 1;
		int B = 0;
		for (int i = 0; i < N; i++) {
			int nb = A + B;
			A = B;
			B = nb;
		}
		bw.write(A + " " + B);

		bw.close();
		br.close();
	}
}