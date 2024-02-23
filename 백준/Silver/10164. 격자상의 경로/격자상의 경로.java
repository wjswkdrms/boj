import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int way(int[] load, int num, int N, int M) {
		int result = 0;
		if(num % M != 0) {
			result += load[num-1];
		}
		if(num >= M) {
			result += load[num-M];
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] first = new int[N * M];
		int[] second = new int[N * M];
		if(K == 0){
			K = N*M;
		}
		first[0] = 1;
		for (int i = 1; i < K; i++) {
			first[i] = way(first, i, N, M);
		}
		second[K-1] = first[K-1];
		for (int i = K; i < N * M; i++) {
			second[i] = way(second, i, N, M);
		}
		System.out.println(second[N*M-1]);
		bw.close();
		br.close();
	}
}