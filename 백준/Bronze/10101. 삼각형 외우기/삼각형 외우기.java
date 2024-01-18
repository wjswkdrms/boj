import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
		int[] three = new int[3];
		for (int i = 0; i < three.length; i++) {
			three[i] = Integer.parseInt(br.readLine());
		}
		if(three[0] + three[1] + three[2] != 180) {
			bw.write("Error");
		} else if(three[0] == three[1] && three[1] == three[2]) {
			bw.write("Equilateral");
		} else if(three[0] == three[1] || three[1] == three[2] || three[0] == three[2]){
			bw.write("Isosceles");
		} else {
			bw.write("Scalene");
		}
		bw.close();
		br.close();
    }
}