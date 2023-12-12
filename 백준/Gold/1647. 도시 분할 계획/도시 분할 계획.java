import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int[] parent;
	static int find(int n) {
		if(parent[n] == n)return n;
		return parent[n] = find(parent[n]);
	}
	static void union(int n, int m) {
		int x = find(n);
		int y = find(m);
		if(x < y) parent[y] = x;
		else parent[x] = y;
	}
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] L  = new int[M][3];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			L[i][0] = Integer.parseInt(st.nextToken());
			L[i][1] = Integer.parseInt(st.nextToken());
			L[i][2] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(L,(o1, o2) -> o1[2] - o2[2]);
		parent = new int[N+1];
		for(int i = 0; i <= N; i++) {
			parent[i] = i;
		}
		int sum = 0;
		int n = 0;
		int max = 0;
		for(int i = 0; i < M; i++) {
			if(n == N-1) break;
			if(find(L[i][0]) != find(L[i][1])) {
				union(L[i][0], L[i][1]);
				max = Math.max(max, L[i][2]);
				sum += L[i][2];
				n++;
			}
		}
		// 임의의 두 집이 항상 연결되어있으면서 총 유지비용이 가장 작은 구조 > 최소 스패닝 트리
		// 최소 스패닝 트리를 구해 가중치의 합을 구한후
		// 스패닝 트리에 포함된 간선의 가중치중 가장 큰 가중치를 빼서
		// 도시를 둘로 분할한다
		bw.write(String.valueOf(sum - max));

		br.close();
		bw.close();
	}

}
