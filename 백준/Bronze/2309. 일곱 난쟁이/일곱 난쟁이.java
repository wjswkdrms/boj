import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		List<Integer> Dwarfs = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			sum += n;
			Dwarfs.add(n);
		}
		sum -= 100;
		for (int i = 0; i < 9; i++) {
			int rem = Dwarfs.indexOf(sum - Dwarfs.get(i));
			if(rem != -1 && rem != i) {
				Dwarfs.remove(rem);
				Dwarfs.remove(i);
				break;
			}
		}
		Dwarfs.sort((o1, o2) -> o1 - o2);
		for (Integer i : Dwarfs) {
			bw.write(String.valueOf(i));
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}