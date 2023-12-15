import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		int N = Integer.parseInt(br.readLine());
		HashSet<String> emp = new HashSet<>();
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String v = st.nextToken();
			if (v.equals("enter")) {
				emp.add(name);
			}else if (v.equals("leave")) {
				emp.remove(name);
			}
		}
		List<String> empList = new ArrayList<>(emp);
		Collections.sort(empList, Collections.reverseOrder());
		for (String name : empList) {
			bw.write(name);
			bw.newLine();
		}
		br.close();
		bw.close();
	}
}