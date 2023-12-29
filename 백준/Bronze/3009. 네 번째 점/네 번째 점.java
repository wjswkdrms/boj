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
		int[][] square = new int[4][2];
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			square[i][0] = Integer.parseInt(st.nextToken());
			square[i][1] = Integer.parseInt(st.nextToken());
		}
		if (square[0][0] == square[1][0]) {
			square[3][0] = square[2][0];
		} else {
			square[3][0] = square[0][0] + square[1][0] - square[2][0];
		}
		if (square[0][1] == square[1][1]) {
			square[3][1] = square[2][1];
		} else {
			square[3][1] = square[0][1] + square[1][1] - square[2][1];
		}
		bw.write(square[3][0] + " " + square[3][1]);
		bw.close();
		br.close();
	}
}