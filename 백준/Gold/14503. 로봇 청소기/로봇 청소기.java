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
		int M = Integer.parseInt(st.nextToken());
		int[][] p = new int[N][M];
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int dir = Integer.parseInt(st.nextToken());
		int[][] load = {{-1,0},{0,1},{1,0},{0,-1}};
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				p[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int clean = 0;
		while(true) {
			if(p[x][y] == 0) {
				clean++;
				p[x][y] = -1;
			}
			if(p[x+1][y] != 0 && p[x-1][y] != 0 && p[x][y+1] != 0 && p[x][y-1] != 0) {
				x -= load[dir][0];
				y -= load[dir][1];
				if(p[x][y] == 1) {
					break;
				}
			} else {
				dir--;
				if(dir < 0) {
					dir += 4;
				}
				if(p[x+load[dir][0]][y+load[dir][1]] == 0) {
					x = x+load[dir][0];
					y = y+load[dir][1];
				}
			}
		}
		bw.write(String.valueOf(clean));
		bw.close();
		br.close();
	}

}