import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int[] p = new int[N+1];
		p[1] = 0;
		if(N >= 2)p[2] = 1;
		if(N >= 3)p[3] = 1;
		for(int i = 4; i <= N; i++) {
			p[i] = p[i-1] + 1;
			if(i % 2 == 0) {
				p[i] = Math.min(p[i], p[i/2] + 1) ;
			}
			if(i % 3 == 0) {
				p[i] = Math.min(p[i], p[i/3] + 1);
			}
		}
		bw.write(String.valueOf(p[N]));
		bw.close();
		br.close();
	}
}
