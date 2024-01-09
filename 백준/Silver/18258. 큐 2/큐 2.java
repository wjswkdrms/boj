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
		int[] queue = new int[N];
		int end = 0;
		int front = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			switch (st.nextToken()) {
				case "push":
					queue[end++] = Integer.parseInt(st.nextToken());
					break;
				case "pop":
					if (front == end) {
						bw.write("-1");
					} else {
						bw.write(String.valueOf(queue[front++]));
					}
					bw.newLine();
					break;
				case "size":
					bw.write(String.valueOf(end-front));
					bw.newLine();
					break;
				case "empty":
					if (end == front) {
						bw.write("1");
					} else {
						bw.write("0");
					}
					bw.newLine();
					break;
				case "front":
					if (end == front) {
						bw.write("-1");
					} else {
						bw.write(String.valueOf(queue[front]));
					}
					bw.newLine();
					break;
				case "back":
					if (end == front) {
						bw.write("-1");
					} else {
						bw.write(String.valueOf(queue[end-1]));
					}
					bw.newLine();
					break;
				default:
					break;
			}
		}
		bw.close();
		br.close();
    }
}