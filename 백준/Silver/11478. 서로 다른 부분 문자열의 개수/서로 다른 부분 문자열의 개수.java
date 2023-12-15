import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		String input = br.readLine();
		HashSet<String> m = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			for (int j = i+1; j <= input.length(); j++) {
				m.add(input.substring(i, j));
			}
		}
		bw.write(String.valueOf(m.size()));
		br.close();
		bw.close();
	}
}