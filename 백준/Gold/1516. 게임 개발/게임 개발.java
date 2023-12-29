import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static List<List<Integer>> b;
	static int[] time;
	static int[] sp;
	static boolean[] visited;

	static int build(int index){
		if(visited[index]) {
			return sp[index];
		}
		visited[index] = true;
		int ready = 0;
		for (int i : b.get(index)) {
			ready = Math.max(ready, build(i-1));
		}
		return sp[index] = ready + time[index];
	}
	public static void main(String[] args) throws IOException {
		b = new ArrayList<>();
		int N = Integer.parseInt(br.readLine());
		time = new int[N];
		visited = new boolean[N];
		sp = new int[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i] = Integer.parseInt(st.nextToken());
			List<Integer> list = new ArrayList<>();
			int p;
			while((p = Integer.parseInt(st.nextToken())) != -1) {
				list.add(p);
			}
			b.add(list);
		}
		for (int i = 0; i < N; i++) {
			build(i);
			System.out.println(sp[i]);
		}

		bw.close();
		br.close();
	}
}