import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static char[][] cam;
	static boolean[][] visited;
	static int load[][] = {{1,0},{0,1},{-1,0},{0,-1}};

	static int N;
	static int M;
	static int move(int x, int y) {
		//System.out.println("x:" + x +" y:" + y);
		visited[x][y] = true;
		int result = 0;
		if(cam[x][y] == 'P') {
			result++;
		}
		for (int[] dir : load) {
			//System.out.println(dir[0] + ":" + dir[1]);
			if(dir[0] + x >= 0 && dir[0] + x < N && dir[1] + y >= 0 && dir[1] + y < M &&
			 cam[dir[0] + x][dir[1] + y] != 'X' && !visited[dir[0] + x][dir[1] + y]) {
				visited[dir[0] + x][dir[1] + y] = true;
				result += move(x + dir[0], y + dir[1]);
				//System.out.println("!");
			}
		}
		return result;
	}
	public static void main(String[] args) throws IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); 
		M = Integer.parseInt(st.nextToken());
		cam = new char[N][M];
		visited = new boolean[N][M];
		int x = 0;
		int y = 0;
		for (int i = 0; i < N; i++) {
			cam[i] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				if(cam[i][j] == 'I') {
					x = i;
					y = j;
				}
			}
		}
		int n = move(x, y);
		bw.write(n == 0 ? "TT" : String.valueOf(n));
		bw.close();
		br.close();
	}

}