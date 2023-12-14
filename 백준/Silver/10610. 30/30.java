import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	/**
	 * 다음 숫자의 나열로 30의 배수 구하는법
	 * 1. 30은 10의 배수이기도 하니 0이 최소 1번 존재해야함
	 * 2. 3의 배수는 각 자리수를 합했을때 3의 배수가 됨.(역도 성립함) 
	 * 즉 자리수끼리 치환해도 여전히 3의 배수에 해당함
	 * ex 120도 30의 배수 210도 30의 배수
	 * 즉 0이 1개이상 존재하는지 확인하고 해당 수가 3의 배수인지 확인하고
	 * 숫자를 가장 큰 숫자부터 배열하면 가장 큰 30의 배수 완성
	 */
	public static void main(String[] args) throws Exception {
		String s = br.readLine();
		char[] charr = s.toCharArray();
		Arrays.sort(charr); //입력값을 char 배열로 치환한 후 오름차순 정렬함
		if (charr[0] != '0') {//입력값에 0이 존재하는지 확인
			bw.write("-1");
		} else {
			int sum = 0;
			for (int i = 0; i < charr.length; i++) {
				sum += charr[i] - '0';
			}
			if (sum % 3 != 0) {
				bw.write("-1");
			} else {
				for (int i = charr.length - 1; i >=0 ; i--) {
					//오름차순 정렬된 char배열을 역순출력
					bw.write(charr[i]);
				}
			}
			
		}
		
		br.close();
		bw.close();
	}
}