import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
	public static void main(String[] args) throws Exception {
		int[] p = new int[10001];
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			int n = Integer.parseInt(br.readLine());
			p[n]++;
		}
		for(int i = 0; i < 10001; i++) {
			for(int j = 0; j < p[i]; j++) {
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		br.close();
		bw.close();
	}

}
