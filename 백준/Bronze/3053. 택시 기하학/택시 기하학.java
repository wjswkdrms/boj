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
		bw.write(String.valueOf(Math.pow(N, 2)*Math.PI));
		bw.newLine();
		bw.write(String.valueOf(Math.pow(N, 2)*2));
		bw.close();
		br.close();
    }
}