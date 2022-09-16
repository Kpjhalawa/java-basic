package arthimatic;
import java.util.*;
public class numberprymid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0 + " ");

            }
            for (int j = 0; j < i; j++) {
                System.out.print(i + j + " ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print(2 * i - 1 - j + " ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(0 + " ");

            }

            System.out.println();
        }

    }
}
