import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
	    for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] p = new String[5];
            for(int j = 0; j < 2; j++) {
                p[j] = st.nextToken();
            }
            System.out.println(main.solution(p));
	    }
        br.close();
    }

    public long solution(String[] s) {
        int range = Integer.parseInt(s[1]) - Integer.parseInt(s[0]);
        long i =(long)Math.ceil(Math.sqrt(range));
        return range > i * i - i ? 2 * i - 1 :2 * i - 2;
    }
}
