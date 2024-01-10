import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
		Map<Character,Integer> alp = new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			char[] s = br.readLine().toCharArray();
			for (int j = 0; j < s.length; j++) {
				if(alp.get(s[j]) == null) {
					alp.put(s[j], 0);
				}
				alp.put(s[j], alp.get(s[j]) + (int)(Math.pow(10, s.length - j - 1)));
			}
		}
		int result = 0;
		int M = 9;
		while(!alp.isEmpty()){
			int max = 0;
			char m = 0;
			for (char c : alp.keySet()) {
				if (alp.get(c) > max) {
					max = alp.get(c);
					m = c;
				}
			}
			result += max * M--;
			alp.remove(m);
		}
		bw.write(String.valueOf(result));
		bw.close();
		br.close();
    }
}