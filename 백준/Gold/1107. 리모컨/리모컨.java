import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static boolean[] button;
	static int l = 0;

	static boolean canp(int n) {
		l = 0;
		if(n == 0) {
			l = 1;
			return !button[0];
		}
		if(n < 0) {
			return false;
		}
		while(n > 0) {
			if(button[n % 10]) {
				return false;
			}
			n /= 10;
			l++;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		if(M!=0){
			st = new StringTokenizer(br.readLine());
		}
		button = new boolean[10];
		for(int i = 0; i < M; i++) {
			int b = Integer.parseInt(st.nextToken());
			button[b] = true;
		}
		int i = 0;
		int no = Math.abs(N - 100);
		while (i < no) {
			if(canp(N-i) || canp(N+i)) {
				break;
			}
			i++;
		}
		System.out.println(Math.min(i + l, no));
		br.close();
		bw.close();
	}

}
