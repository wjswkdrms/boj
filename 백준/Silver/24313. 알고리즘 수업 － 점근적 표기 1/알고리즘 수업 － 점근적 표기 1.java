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
		int a0 = Integer.parseInt(st.nextToken());
		int a1 = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		if(a0 * n + a1 <= c * n && a0 <= c) {
			bw.write("1");
		}else {
			bw.write("0");
		}
		br.close();
		bw.close();
	}
}