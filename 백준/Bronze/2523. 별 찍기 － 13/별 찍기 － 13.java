import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < i + 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		for (int i = N-2; i >= 0; i--) {
			for (int j = 0; j < i + 1; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.close();
		br.close();
    }
}