import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int[][] p = new int[9][9];
		int max = 0;
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
				if(p[i][j] > max) {
					max = p[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		bw.write(max + "\n" + (maxi+1) + " " + (maxj+1));
		br.close();
		bw.close();
	}
}