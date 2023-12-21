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
        int N = Integer.parseInt(br.readLine());
        int[] p = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
			max = Math.max(max, p[i]);
		}
        boolean[] che = new boolean[max + 1];
        for (int i = 2; i <= Math.sqrt(max); i++) {
        	if(che[i] == false) {
        		for (int j = 2; i * j <= max; j++) {
        			che[i*j] = true;
        		}
        	}
		}
        long result = 1;
        for (int i = 0; i < p.length; i++) {
			if (!che[p[i]]) {
				result *= p[i];
                che[p[i]] = true;
			}
		}
        if (result == 1) result = -1;
        bw.write(String.valueOf(result));
        bw.close();
        br.close();
    }
}
