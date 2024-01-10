import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[][] p = new int[N][2];
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				p[i][0] = Integer.parseInt(st.nextToken());
				p[i][1] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(p,(o1,o2) -> o1[0] - o2[0]);
			int count = 0;
			int max = 1000000;
			for (int i = 0; i < p.length; i++) {
				if(max > p[i][1]) {
					count++;
					max = p[i][1];
				}
			}
			bw.write(String.valueOf(count));
			bw.newLine();
		}
		bw.close();
		br.close();
    }
}