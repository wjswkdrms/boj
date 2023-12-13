import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static long[] p;
	static long[] minSegment;

	static long createTree(int start, int end, int index) {
		//minSegment의 각 노드를 자가 하위의 노드중 가장 작은 값으로 갱신하자
		//리프에 입력된 배열을 입력하면 루트는 자동적으로 모든 입력값의 합이된다.
		if(start == end) {
			return minSegment[index] = p[start];
		}
		int mid = (start + end) / 2;
		return minSegment[index] = Math.min(createTree(start, mid, index*2) , createTree(mid+1, end, index*2+1));
	}

	static long rangeMin(long start,long end, long left, long right, int index) {
		if(start > right || end < left) {
			return 1000000000; // 범위를 벗어나면 유기된다.
		}
		if(start >= left && end <= right) {
			return minSegment[index]; // 범위 안에 완벽히 포함되면 자신을 리턴한다
		}
		long mid = (start + end) / 2;
		//둘다 아닐시 분할한다
		return Math.min(rangeMin(start, mid, left, right, index * 2) , rangeMin(mid + 1, end, left, right, index * 2 + 1));
	}
	public static void main(String[] args) throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		long M = Long.parseLong(st.nextToken());
		p = new long[N+1];
		// 세그먼트 트리의 크기는 N에서 가장 가까운 다음 2의 제곱수에 2를 곱해서 할당하면 충분한데
		// 구하기 귀찮으니까 그냥 최악을 가정해서 N에 4를곱한다
		minSegment = new long[4*N]; 
		for (int i = 1; i <= N; i++) {
			p[i] = Long.parseLong(br.readLine());
		}
		createTree(1, N, 1);
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
		
			bw.write(String.valueOf(rangeMin(1, N, a, b, 1)));
			bw.newLine();
		}

		br.close();
		bw.close();
	}
}