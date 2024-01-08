
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;


public class Main
{

    public static void main(String[] args) throws IOException
    {



        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        ArrayList<BigDecimal> lst = new ArrayList<>();
        while(N > 0) {

            String[] split = sc.nextLine().replaceAll("\\D+", " ").trim()
                    .replaceAll("\\s+", " ").split(" ");

            for (String s : split) {
				if(s.length() > 0) {
					lst.add(new BigDecimal(s));
				}
            }
            N--;
        }

        lst.sort(Comparator.naturalOrder());
        for (BigDecimal a : lst) {
            System.out.println(a);
        }

    }
}