import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for(int i = 0; i<n;i++) {
			array[i] = input.nextInt();
		}
		int num = input.nextInt();
		int count = 0;
		for(int i : array) {
			if(i == num) {
				count++;
			}
		}
		System.out.println(count);
	}
	
}
