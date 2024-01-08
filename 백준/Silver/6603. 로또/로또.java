import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int[] arr;
	static int N;
	static int M;

	static void pw(String p, int n, int len) throws IOException {
		if(len == 0) {
			bw.write(p);
			bw.newLine();
			return;
		}
		for (int i = n; i < M - len + 1; i++) {
			pw(p+arr[i]+" ",i+1,len-1);
		}
	}
    public static void main(String[] args) throws IOException {
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = 6;
			M = Integer.parseInt(st.nextToken());
			if(M == 0) {
				break;
			}
			arr = new int[M];
			for (int i = 0; i < M; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			pw("", 0, N);
			bw.newLine();
		}
		
		bw.close();
		br.close();
    }
}