import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		if(N % 10 != 0) {
			System.out.println(-1);
		}else{
			int[] button = {300, 60, 10};
			for (int i : button) {
				System.out.print(N / i + " ");
				N %= i;
			}
		}
		br.close();
		bw.close();
	}
}