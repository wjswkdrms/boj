import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] ju = new int[N][2];//보석의 정보 index 0 : 무게 1 : 가격
		int[] p = new int[K]; //가방의 무게
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			ju[i][0] = Integer.parseInt(st.nextToken());
			ju[i][1] = Integer.parseInt(st.nextToken());
		} 
		for (int i = 0; i < K; i++) {
			p[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(p); //가방의 무게는 오름차순으로 정렬
		Arrays.sort(ju,(o1, o2) -> o1[0] - o2[0] == 0 ? o2[1] - o1[1] : o1[0] - o2[0]); 
		//보석의 무게를 기준으로 오름차순으로 정렬하되 무게가 같으면 가격을 기준으로 내림차순 정렬함
		long price = 0;
		//우선순위 큐를 활용해 가격이 높은 보석이 위로 올라오도록 설정
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
		int j = 0;
		for (int i = 0; i < K; i++) {
			int m = p[i]; // 가장 작은 가방부터 순차적으로 탐색
			while(j < N && ju[j][0] <= m) {
				queue.offer(ju[j++][1]);
			}//우선순위큐에 가방의 무게보다 작은 보석은 일단 다 넣는다

			if(!queue.isEmpty()) {
				price += queue.poll();
			}// 가방에 넣을수 있는 보석중 가장 비싼 보석을 가방에 넣는다(최종 가격 증가)
		}
		System.out.println(price);
		
		br.close();
		bw.close();
	}

}
