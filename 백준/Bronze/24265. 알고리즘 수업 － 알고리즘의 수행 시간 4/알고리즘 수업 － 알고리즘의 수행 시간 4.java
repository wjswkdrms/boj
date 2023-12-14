import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		long N = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(N*(N-1)/2));
		bw.newLine();
		bw.write("2");
		br.close();
		bw.close();
	}
}