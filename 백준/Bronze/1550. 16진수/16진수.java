import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		char[] snum = br.readLine().toCharArray();
		int ji = 1;
		int result = 0;
		for (int i = snum.length - 1; i >= 0; i--) {
			int num = 0;
			if(snum[i] >= '0' && snum[i] <= '9') {
				num = snum[i] - '0';
			} else {
				num = snum[i] - 'A' + 10;
			}
			result += num * ji;
			ji *= 16;
		}
		bw.write(String.valueOf(result));
		bw.close();
		br.close();
	}
}
