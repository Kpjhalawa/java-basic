package arthimatic;
import java.lang.*;
import java.util.*;
public class sum {

    public class Main {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int odd = 0;
            int even = 0;
            while (n > 0) {
                odd = odd + n % 10;
                n = n / 10;
                even = even + n % 10;
                n = n / 10;

            }
            System.out.println("Sum of Odd Index Digit : " + odd);
            System.out.print("Sum of Even Index Digit : " + even);
        }
    }
}