import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		//중앙값보다 작은 수를 저장하는 우선순위큐(최대힙)
		PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
		//중앙값보다 큰 수를 저장하는 우선순위큐(최소힙)
		PriorityQueue<Integer> high = new PriorityQueue<>();
		
		int N = Integer.parseInt(br.readLine());
		//일단 처음 입력한 수를 중앙값으로 지정한다.
		int mid = Integer.parseInt(br.readLine());
		bw.write(String.valueOf(mid));
		bw.newLine();
		for (int i = 1; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			//입력한 값이 중앙값보다 크면 high, 작으면 low 큐에 값을 추가한다.
			if(num > mid) {
				high.add(num);
			} else {
				low.add(num);
			}
			//두 큐의 크기를 비교하여 중앙값을 재조정한다.
			if(low.size() > high.size()) {
				high.add(mid);
				mid = low.poll();
			}else if(low.size() + 1 < high.size()) {
				low.add(mid);
				mid = high.poll();
			}
			bw.write(String.valueOf(mid));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}