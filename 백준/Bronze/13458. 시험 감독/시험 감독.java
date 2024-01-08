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
		int N = Integer.parseInt(br.readLine());
		int[] p = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		long count = 0;
		for (int i : p) {
			count++;
			count+= (i - B) / C < 0 ? 0 : (i - B) / C;
			if(B < i && (i - B) % C != 0) {
				count++;
			} 
		}
		bw.write(String.valueOf(count));
		bw.close();
		br.close();
    }
}