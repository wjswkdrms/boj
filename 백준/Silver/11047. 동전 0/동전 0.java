import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] p = new int[N];
		for(int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		int count = 0;
		while(K > 0) {
			int coin = 0;
			while(coin < N && p[coin] <= K) {
				coin++;
			}
			count += K / p[--coin];
			K %= p[coin];
		}
		bw.write(String.valueOf(count));

		bw.close();
		br.close();
	}
}
