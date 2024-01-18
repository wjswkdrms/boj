import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int price  = Integer.parseInt(st.nextToken());
		int amount = Integer.parseInt(st.nextToken()); 
		int money  = Integer.parseInt(st.nextToken());

		bw.write(String.valueOf(price * amount - money < 0 ? 0 : price * amount - money));
		bw.close();
		br.close();
    }
}