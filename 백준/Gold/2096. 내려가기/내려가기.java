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
		int[][] min = new int[2][3];
		int[][] max = new int[2][3];
		StringTokenizer st = null;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

			min[1][0] = Math.min(min[0][0], min[0][1]) + a;
			min[1][1] = Math.min(Math.min(min[0][0], min[0][1]),min[0][2]) + b;
			min[1][2] = Math.min(min[0][1], min[0][2]) + c;
			max[1][0] = Math.max(max[0][0], max[0][1]) + a;
			max[1][1] = Math.max(Math.max(max[0][0], max[0][1]),max[0][2]) + b;
			max[1][2] = Math.max(max[0][1], max[0][2]) + c;
			min[0][0] = min[1][0];
			min[0][1] = min[1][1];
			min[0][2] = min[1][2];
			max[0][0] = max[1][0];
			max[0][1] = max[1][1];
			max[0][2] = max[1][2];
		}
		bw.write(String.valueOf(Math.max(max[0][0], Math.max(max[0][1], max[0][2]))));
		bw.write(" ");
		bw.write(String.valueOf(Math.min(min[0][0], Math.min(min[0][1], min[0][2]))));
		bw.close();
		br.close();
	}
}
