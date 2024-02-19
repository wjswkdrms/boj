import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static HashSet<Integer> input(HashSet<Integer> s, int w) {
		HashSet<Integer> result = new HashSet<>();
		for (Integer i : s) {
			result.add(i);
			result.add(i + w);
			result.add(i - w);
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		HashSet<Integer> s = new HashSet<>();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());
			s = input(s, num);
			s.add(num);
			s.add(-num);
		}
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			bw.write(s.contains(num) ? "Y " : "N ");
		}
		br.close();
		bw.close();
	}
}
