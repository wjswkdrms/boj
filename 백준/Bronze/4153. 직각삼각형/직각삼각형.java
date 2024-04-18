import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] p = new int[3];
		while(true){
			StringTokenizer st = new StringTokenizer(br.readLine());
			p[0] = Integer.parseInt(st.nextToken());
			p[1] = Integer.parseInt(st.nextToken());
			p[2] = Integer.parseInt(st.nextToken());
			Arrays.sort(p);
			if(p[0] == 0 && p[1] == 0 && p[2] == 0) break;
			if(p[0] * p[0] + p[1] * p[1] == p[2] * p[2]) {
				bw.write("right");
			}else {
				bw.write("wrong");
			}
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}
}
