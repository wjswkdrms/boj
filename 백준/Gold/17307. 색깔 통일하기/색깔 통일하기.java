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
		int N = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int[] p = new int[N];
		long[] front = new long[N];
		long[] back = new long[N];
		st= new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 1; i < N; i++) {
			front[i] = front[i-1] + (p[i-1] - p[i] < 0 ? p[i-1] - p[i] + C : p[i-1] - p[i]);
		}
		for (int i = N-2; i >= 0; i--) {
			back[i] = back[i+1] + (p[i+1] - p[i] < 0 ? p[i+1] - p[i] + C : p[i+1] - p[i]);
		}
		int idx = 0;
		long min = Long.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			if(min > Math.max(front[i], back[i])) {
				idx = i;
				min = Math.max(front[i], back[i]);
			}
		}
		bw.write(String.valueOf(idx + 1));
		bw.newLine();
		bw.write(String.valueOf(min));
		bw.close();
		br.close();
    }
}