import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		long N = Long.parseLong(br.readLine());
		long count = 0;
		int num = 1;
		while(count <= N) {
			count += num++;
		}
		System.out.println(num - 2);
		br.close();
		bw.close();
	}
}