import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


	static int v(int[][] bag, int K) {
		int[][] val = new int[2][K+1];
		for(int[] p : bag){
			for(int i = p[0]; i <= K; i++) {
				val[1][i] = Math.max(val[0][i],val[0][i-p[0]] + p[1]);
			}
			for(int i = 0; i <= K; i++) {
				val[0][i] = val[1][i];
			}
		}
		return val[0][K];
	}
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int[][] bag = new int[N][2];

		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			bag[i][0] = Integer.parseInt(st.nextToken());
			bag[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(bag, (o1,o2) -> o1[0]-o2[0]);
		System.out.println(v(bag, K));
		bw.close();
		br.close();
	}
}
