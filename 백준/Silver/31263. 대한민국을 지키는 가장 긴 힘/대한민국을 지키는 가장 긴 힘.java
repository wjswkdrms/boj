import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		char[] arr = br.readLine().toCharArray();
		int count = 0;
		int mem = 0;
		for (int i = 0; i < N; i++) {
			mem = mem * 10 + (arr[i]-'0');
			if(mem > 641) {
				count++;
				mem = (arr[i] - '0');
				if(mem == 0) {
					mem = (arr[i - 1] - '0') * 10;
					if(mem == 0) {
						mem = (arr[i - 2] - '0') * 100;
					}
				}
			}
		}
		bw.write(String.valueOf(count + 1));
		bw.close();
		br.close();
	}
}