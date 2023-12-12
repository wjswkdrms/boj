import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		String s = br.readLine();
		int[] p = new int[s.length() + 2];
		p[0] = 1;
		p[1] = 1;
		if(s.charAt(0) == '0'){
			p[1] = 0;
			p[0] = 0;
		}else {
			for(int i = 2; i <= s.length(); i++) {
				int num = Integer.parseInt(s.substring(i-2, i));
				if(num == 0) {
					break;
				}else if(num < 10) {
					p[i] = p[i-3];
				}else if(num % 10 == 0) {
					if(num <= 26) {
						p[i] = p[i-2];
					}else{
						p[i] = 0;
						break;
					}
				}else if(num <= 26){
					p[i] = p[i-2] + p[i-1];
				}else{
					p[i] = p[i-1];
				}
				p[i] %= 1000000;
			}
		}

		bw.write(String.valueOf(p[s.length()]));

		
		br.close();
		bw.close();
	}

}
