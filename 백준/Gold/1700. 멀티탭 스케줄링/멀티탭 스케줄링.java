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
		int[] multi = new int[N];
		int offcnt = 0;
		int[] input = new int[M];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < input.length; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < input.length; i++) {
			boolean connect = false; //연결됐는지 검증용
			for (int j = 0; j < multi.length; j++) {
				if(multi[j] == 0) { //멀티탭에 자리가 남았다
					multi[j] = input[i];
					connect = true;
					break; //연결했다
				}
				if (multi[j] == input[i]) {//이미 연결이 되어있었다.
					connect = true;
					break;
				}
			}
			if (!connect) {//연결에 실패했다.
				//뽑을 멀티탭을 찾자
				int idx = 0;
				int max = 0;
				for (int j = 0; j < multi.length; j++) {
					boolean find = false;
					for (int j2 = i; j2 < input.length; j2++) {
						if(multi[j] == input[j2]) {
							if(j2 > max) {
								max = j2;
								idx = j;
							}
							find = true;
							break;
						}
					}
					if(!find) { //이후로 사용될 일이 없는 코드는 뽑자
						idx = j;
						break;
					}
				}
				//System.out.println(multi[idx] + ":" +input[i]);
				multi[idx] = input[i];//가장 나중에 사용될 코드를 뽑고 지금 코드를 꼽는다
				offcnt++;//코드를 뽑은 횟수
			}
		}
		bw.write(String.valueOf(offcnt));
		bw.close();
		br.close();
    }
}