import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
		int[] three = new int[3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < three.length; i++) {
			three[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(three);
		for (int i = 0; i < three.length; i++) {
			bw.write(three[i] + " ");
		}
		bw.close();
		br.close();
    }
}