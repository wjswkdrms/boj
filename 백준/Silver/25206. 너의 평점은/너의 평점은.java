import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		Map<String,Double> scoreboard = new HashMap<String,Double>();
		scoreboard.put("A+", 4.5);
		scoreboard.put("A0", 4.0);
		scoreboard.put("B+", 3.5);
		scoreboard.put("B0", 3.0);
		scoreboard.put("C+", 2.5);
		scoreboard.put("C0", 2.0);
		scoreboard.put("D+", 1.5);
		scoreboard.put("D0", 1.0);
		scoreboard.put("F", 0.0);

		double subSum = 0;
		double scoreSum = 0;
		for (int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String trash = st.nextToken();
			double sub = Double.parseDouble(st.nextToken());
			String score = st.nextToken();
			if (!score.equals("P")) {
				subSum += sub;
				scoreSum += scoreboard.get(score) * sub;
			}
		}
		bw.write(String.valueOf(scoreSum/subSum));
		br.close();
		bw.close();
	}
}