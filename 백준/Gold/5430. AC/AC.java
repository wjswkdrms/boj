import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static void f(String func, int[] p) throws IOException {
		int s = 0;
		int e = p.length;
		boolean flag = true;
		
		for(char c : func.toCharArray()) {
			if(c == 'R') {
				flag = !flag;
			}
			if(c == 'D') {
				if(s == e) {
					bw.write("error");
					return;
				}
				if(flag) {
					s++;
				}else {
					e--;
				}
			}
		}
		bw.write("[");
		if(s < e) {
			if(flag){
				bw.write(String.valueOf(p[s]));
				for(int i = s + 1; i < e; i++) {
					bw.write(",");
					bw.write(String.valueOf(p[i]));
				}
			}else{
				bw.write(String.valueOf(p[e-1]));
				for(int i = e - 2; i >= s; i--) {
					bw.write(",");
					bw.write(String.valueOf(p[i]));
				}
			}
		}
		
		bw.write("]");
	}
	public static void main(String[] args) throws Exception {
		int T = Integer.parseInt(br.readLine());
		for(int t = 0; t < T; t++) {
			String func = br.readLine();
			int N = Integer.parseInt(br.readLine());
			String input = br.readLine();
			int[] p = new int[N];
			int i = 0;
			int num = 0;
			if(N > 0) {
				for(char c : input.toCharArray()){
					if(!(c == '[')) {
						if(c == ',' || c == ']'){
							p[i] = num;
							num = 0;
							i++;
						}else {
							num *= 10;
							num += c - '0';
						}
					}
				}
			}
			f(func, p);
			bw.newLine();
		}
		
		br.close();
		bw.close();
	}

}
