import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		HashSet<String> str = new HashSet<>();
		for (int i = 0; i < N; i++) {
			str.add(br.readLine());
		}
		int count = 0;
		for (int i = 0; i < M; i++) {
			if (str.contains(br.readLine())) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		br.close();
		bw.close();
	}
}