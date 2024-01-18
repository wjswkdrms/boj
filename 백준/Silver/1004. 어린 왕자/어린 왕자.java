import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static boolean inCircle(int x, int y, int cx, int cy, int r) {
		return Math.pow(Math.abs(cx - x),2) + Math.pow(Math.abs(cy - y), 2) < Math.pow(r,2); 
	}
	public static void main(String[] args) throws IOException {
		int T = Integer.parseInt(br.readLine());
		for (int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int ci = Integer.parseInt(br.readLine());
			int count = 0;
			for (int i = 0; i < ci; i++) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.parseInt(st.nextToken());
				int cy = Integer.parseInt(st.nextToken());
				int r  = Integer.parseInt(st.nextToken());
				if((inCircle(x1, y1, cx, cy, r) && !inCircle(x2, y2, cx, cy, r)) || 
				(!inCircle(x1, y1, cx, cy, r) && inCircle(x2, y2, cx, cy, r))) {
					count++;
				}
			}
			bw.write(String.valueOf(count));
			bw.newLine();
		}
		bw.close();
		br.close();
	}

}