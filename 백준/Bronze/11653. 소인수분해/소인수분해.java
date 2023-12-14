import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int n = 2;
		while(n <= N) {
			if(N % n == 0) {
				bw.write(n + "\n");
				N /= n;
			}else {
				n++;
			}
		}
		
		br.close();
		bw.close();
	}
}