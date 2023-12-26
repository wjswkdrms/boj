import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int[] p = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			p[i] = n;
		}
		Arrays.sort(p);
		bw.write(String.valueOf(sum/5));
		bw.newLine();
		bw.write(String.valueOf(p[2]));
		br.close();
		bw.close();
	}
}