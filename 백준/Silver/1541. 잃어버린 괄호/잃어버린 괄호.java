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

	public static void main(String[] args) throws Exception {
		String s = br.readLine();

		int n = 0;
		int num = 0;
		int subNum = 0;
		boolean sub = false;
		for(char c : s.toCharArray()) {
			if(c == '+') {
				subNum += n;
				n = 0;
			}else if(c == '-') {
				subNum += n;
				if(sub) {
					num -= subNum;
				}else {
					num += subNum;
				}
				sub = true;
				n = 0;
				subNum = 0;
			}else {
				n *= 10;
				n += c - '0';
			}
		}
		subNum += n;
		if(sub) {
			num -= subNum;
		}else {
			num += subNum;
		}
		bw.write(String.valueOf(num));
		br.close();
		bw.close();
	}

}
