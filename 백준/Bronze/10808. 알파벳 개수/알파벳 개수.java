import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		int[] apb = new int[26];
		String input = br.readLine();
		for (char c : input.toCharArray()) {
			apb[c-'a']++;
		}
		for (int i = 0; i < apb.length; i++) {
			bw.write(apb[i] + " ");
		}
		bw.close();
		br.close();
    }
}