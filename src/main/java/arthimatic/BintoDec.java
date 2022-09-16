package arthimatic;
import java.lang.*;
import java.util.*;


public class BintoDec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        int n = bin.length();
        long dec = 0;
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {

            dec = dec + (bin.charAt(i) - '0') * (long) Math.pow(2, j);
            j++;

        }
        System.out.print(dec);

    }
}
