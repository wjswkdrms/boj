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
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(p);
		int max = 0;
		for (int i = 0; i < N; i++) {
			max = Math.max(max, p[i] * (N - i));
		}
		System.out.println(max);
		br.close();
		bw.close();
	}
}