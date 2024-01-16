import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		int N = Integer.parseInt(br.readLine()); 
		int M = Integer.parseInt(br.readLine());
		char[] s = br.readLine().toCharArray();
		boolean bi = false;
		int len = 0;
		int count = 0;
		for (int i = 0; i < M; i++) {
			if(s[i] == 'I') {
				if(bi) {
					count += Math.max(len/2+1-N,0);
					len = 0;
				}
				bi = true;
				len++;
			} else {
				if(bi) {
					len++;
				} else {
					count += Math.max(--len/2+1-N,0);
					len = 0;
				}
				bi = false;
			}
		}
		count += Math.max(--len/2+1-N,0);
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
	}

}