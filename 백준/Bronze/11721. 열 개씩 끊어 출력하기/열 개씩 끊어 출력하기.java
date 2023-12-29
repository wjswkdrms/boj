import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		char[] c = br.readLine().toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(i!=0 && i%10 == 0) {
				bw.newLine();
			}
			bw.write(c[i]);
		}
		bw.close();
		br.close();
	}
}