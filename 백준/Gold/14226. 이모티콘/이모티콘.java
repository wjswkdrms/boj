import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

class Notepad {
	int clipboard; //클립보드에 저장된 이모티콘 갯수
	int emoji; // 지금 이모티콘 갯수
	int time; // 지금까지 시간
	public Notepad(int clipboard, int emoji, int time) {
		this.clipboard = clipboard;
		this.emoji = emoji;
		this.time = time;
	}
}


public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		//bfs적 방법론 
		int S = Integer.parseInt(br.readLine());
		boolean[] visited = new boolean[2000];
		Queue<Notepad> q = new LinkedList<>();

		q.add(new Notepad(0,1,0));

		while(!q.isEmpty()) {
			Notepad n = q.poll();
			if(n.emoji == S) {
				System.out.println(n.time);
				break;
			}
			if(n.clipboard != n.emoji && !visited[n.emoji]) {
				visited[n.emoji] = true; //클립보드 복사만 방문처리 하는 이유) 다른건 방문처리하면 클립보드 상태는 다른데 이모지가 같은 수일때 문제가 생김
				q.add(new Notepad(n.emoji, n.emoji, n.time+1));
			}
			if(n.clipboard != 0 && n.emoji+n.clipboard < 2000) {
				q.add(new Notepad(n.clipboard, n.emoji+n.clipboard, n.time+1));
			}
			if(n.emoji > 4) {
				q.add(new Notepad(n.clipboard, n.emoji-1, n.time+1));
			}
		}

		bw.close();
		br.close();
	}
}