import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int count = 0;
		int result = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				count++;
			}
			if(K == count) {
				result = i;
				break;
			}
		}
		bw.write(String.valueOf(result));
		br.close();
		bw.close();
	}
}