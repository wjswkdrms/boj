import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		char[] ch = br.readLine().toCharArray();
		char now = '0';
		if(ch.length>0) {
			now = ch[0];
		}
		int count = 0;
		for (char c : ch) {
			if(c!=now) {
				count++;
				now = c;
			}
		}
		bw.write(String.valueOf((count+1)/2));
		bw.close();
		br.close();
    }
}