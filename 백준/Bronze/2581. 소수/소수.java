import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		boolean[] s = new boolean[M+1];
		s[1] = true;
		for (int i = 2; i < s.length; i++) {
			if (!s[i]) {
				for (int j = 2; j*i < s.length; j++) {
					s[j*i] = true;
				}
			}
		}
		int first = 0;
		int sum = 0;
		for (int i = N; i <= M; i++) {
			if(!s[i]) {
				if(first == 0) {
					first = i;
				}
				sum += i;
			}
		}
		if(first == 0) {
			bw.write("-1");
		}else {
			bw.write(sum + "\n" + first);
		}
		
		br.close();
		bw.close();
	}
}