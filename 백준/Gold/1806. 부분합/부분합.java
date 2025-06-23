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
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int[] p = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		int a = 0;
		int sum = 0;
		int len = 1000000;
		for(int i = 0; i < N; i++) {
			sum += p[i];
			if(sum >= S) {
				while(sum - p[a] >= S) {
					sum -= p[a++];
				}
				len = Math.min(len, i-a);
			}
		}
		System.out.println(len == 1000000 ? 0 : len + 1);
		br.close();
		bw.close();
	}

}
