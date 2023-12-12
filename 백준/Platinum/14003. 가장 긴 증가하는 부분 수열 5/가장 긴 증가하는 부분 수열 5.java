import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static int[] p;
	static int bin(int s, int e, int n) {
		if(s == e) {
			return p[e] >= n ? e: s;
		}
		int m = (s + e) / 2;
		if(p[m] < n) {
			return bin(m + 1, e, n);
		}else {
			return bin(s, m, n);
		}
	}
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		p = new int[n];
		int[] arr = new int[n];
		int[] idx = new int[n];
		int len = 0;
		for(int i = 0; i < n; i++) {
			int a = arr[i] = Integer.parseInt(st.nextToken());
			int j = 0;
			if(len == 0 || p[len - 1] < a) {
				j = len++;
			}else {
				j = bin(0, len, a);
			}
			p[j] = a;
			idx[i] = j;
		}
		int ch = len - 1;
		Stack<Integer> s = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			if(idx[i] == ch) {
				ch--;
				s.push(arr[i]);
			}
		}
		bw.write(len + "\n");
		while (!s.isEmpty()) {
			bw.write(s.pop() + " ");
		}
		br.close();
		bw.close();
	}

}
