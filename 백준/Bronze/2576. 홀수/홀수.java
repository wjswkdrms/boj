import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int sum = 0;
		int min = 100;
		for (int i = 0; i < 7; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num%2 == 1) {
				sum += num;
				if(min > num) {
					min = num;
				}
			}
		}
		if(sum == 0) {
			bw.write("-1");
		} else {
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min));
		}
		bw.close();
		br.close();
	}
}
