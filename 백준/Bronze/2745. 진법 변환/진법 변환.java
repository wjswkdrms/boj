import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String[] input = br.readLine().split(" ");
		String num = input[0];// 숫자
		int formation = Integer.parseInt(input[1]);// 진법
		int result = 0;
		int realNum = 0;
		int idx = 0;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (Character.isDigit(c)) {
				realNum = Character.getNumericValue(c);
			} else {

				realNum = c - 'A' + 10;
			}

			idx = num.length() - i - 1;

			result += (realNum) * Math.pow(formation, idx);
		}
		System.out.println(result);
	}

}
