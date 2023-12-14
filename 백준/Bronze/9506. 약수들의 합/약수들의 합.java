import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if(N == -1) {
				break;
			}
			int count = 0;
			int sum = 0;
			int[] factor = new int[N];
			for (int i = 1; i < N; i++) {
				if (N % i == 0) {
					factor[count] = i;
					sum += i;
					count++;
				}
			}
			if (sum == N) {
				bw.write(N + " =");
				for (int i = 0; i < count; i++) {
					bw.write(" " + factor[i]);
					if (i != count - 1) {
						bw.write(" +");
					}
				}
			}else {
				bw.write(N + " is NOT perfect.");
			}
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}
}