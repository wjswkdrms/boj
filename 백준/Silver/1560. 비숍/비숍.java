import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		BigInteger N = new BigInteger(br.readLine());
		if(N.equals(new BigInteger("1"))){
			bw.write("1");
		}else {
			bw.write((N.multiply(new BigInteger("2")).subtract(new BigInteger("2")).toString()));
		}
		
		bw.close();
		br.close();
	}
}