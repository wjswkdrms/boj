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
		int[] p = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		int s = 0; 
		int e = N - 1;
		int min = 2000000000;
		int mins = 0;
		int mine = 0;
		while (s < e) {
			if (Math.abs(p[s] + p[e])< min) {
				min = Math.abs(p[s] + p[e]);
				mins = s;
				mine = e;
			}
			if (Math.abs(p[s]) < Math.abs(p[e])) {
				e--;
			}else {
				s++;
			}
		}
		bw.write(String.valueOf(p[mins]) + " " + String.valueOf(p[mine]));
		br.close();
		bw.close();
	}

}
