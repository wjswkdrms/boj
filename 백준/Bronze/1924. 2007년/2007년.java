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
		int month = Integer.parseInt(st.nextToken());
		int date = Integer.parseInt(st.nextToken());
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		for (int i = 0; i < month - 1; i++) {
			date += months[i];
		}
		date %= 7;
		bw.write(week[date]);
		bw.close();
		br.close();
	}
}