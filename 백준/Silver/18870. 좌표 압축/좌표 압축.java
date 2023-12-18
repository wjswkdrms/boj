import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[T];
		
		HashSet<Integer> h = new HashSet<>();
		for(int i = 0; i < T; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			h.add(p[i]);
		}
		List<Integer> list = new ArrayList<>(h);
		Collections.sort(list);

		for(int i : p) {
			bw.write(String.valueOf(main.binser(list, i)));
			bw.write(" ");
		}
		bw.close();
		br.close();
	}
	public int binser(List<Integer> list, int n) {
		int l = 0;
		int h = list.size();
		while(true) {
			int m = (l + h) / 2;
			if(list.get(m) == n) {
				return m;
			}
			if(list.get(m) > n) {
				h = m - 1;
			}else {
				l = m + 1;
			}
			
		}
	}
}
