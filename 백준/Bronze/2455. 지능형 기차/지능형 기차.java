import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int max = 0;
		int now = 0;
		while(1==1) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int out = Integer.parseInt(st.nextToken());
			int in = Integer.parseInt(st.nextToken());
			now = now - out + in;
			if(now > max) {
				max = now;
			}
			if(in == 0) {
				break;
			}
		}

		bw.write(String.valueOf(max));
		bw.close();
		br.close();
	}
}
