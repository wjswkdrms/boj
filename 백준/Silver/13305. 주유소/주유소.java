import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		int[] city = new int[N];
		int[] load = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer nst = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			if(i != N-1)load[i] = Integer.parseInt(st.nextToken());
			city[i] = Integer.parseInt(nst.nextToken());
		}
		long min = 1000000000;
		long sum = 0;
		//지금 도시의 주유소가 비싸다면 그 전에 들렀던 도시의 주유소중 가장 싼곳에서 넣으면 된다.
		//기름통의 크기가 있는것도 아니고 기름을 많이 넣는다고 연비가 증가하는것도 아니니 싼곳에서 많이 넣었다 치자
		for (int i = 0; i < N-1; i++) {
			min = Math.min(city[i], min);
			sum += min * load[i];
		}
		System.out.println(sum);
		br.close();
		bw.close();
	}
}