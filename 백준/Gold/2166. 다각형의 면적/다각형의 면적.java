import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int mx = x;
		int my = y;
		long result = 0;
		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int ix = Integer.parseInt(st.nextToken());
			int iy = Integer.parseInt(st.nextToken());
			result += (long)x * iy;
			result -= (long)y * ix;
			x = ix;
			y = iy;
		}
		result += (long)x * my;
		result -= (long)y * mx;
		bw.write(String.valueOf(Math.abs(result) / 2));
		if(Math.abs(result)%2 == 1) {
			bw.write(".5");
		}else {
			bw.write(".0");
		}
		br.close();
		bw.close();
	}
}