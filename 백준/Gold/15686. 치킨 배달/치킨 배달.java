import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class XY {
	public XY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	int x;
	int y;
}
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	static List<List<XY>> chicList = new ArrayList<>();

	static int chicRange(List<XY> chic, List<XY> house) {
		int result = 0;
		for (XY xy : house) {
			int range = 1000;
			for (XY xy2 : chic) {
				range = Math.min(range, Math.abs(xy.x-xy2.x) + Math.abs(xy.y-xy2.y));
			}
			result += range;
		}
		return result;
	}

	static void alive(List<XY> chic, List<XY> check, int start, int n) {
		if(n == 0) {
			chicList.add(check);
			return;
		}
		for (int i = start; i <= chic.size() - n; i++) {
			List<XY> pre = new ArrayList<>();
			pre.addAll(check);
			pre.add(chic.get(i));
			alive(chic, pre, i, n-1);
		}
	}
	public static void main(String[] args) throws IOException {
		List<XY> chic = new ArrayList<>();
		List<XY> house = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				switch (st.nextToken()) {
					case "1":
						house.add(new XY(i, j));
						break;
					case "2":
						chic.add(new XY(i, j));
						break;
					default:
						break;
				}
			}
		}
		alive(chic, new ArrayList<>(), 0, M);

		int minRange = 100000;
		for (List<XY> list : chicList) {
			minRange = Math.min(minRange, chicRange(list, house));
		}
		bw.write(String.valueOf(minRange));
		bw.close();
		br.close();
	}

}