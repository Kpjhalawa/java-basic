package arthimatic;
import java.util.*;
public class photoframe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int j = 0; j < N; j++) System.out.print('*');
        System.out.print('\n');
        for (int i = 1; i < N - 1; i++) {
            System.out.print('*');
            for (int j = 1; j < N - 1; j++) {
                System.out.print(' ');
            }
            System.out.print("*\n");
        }
        for (int j = 0; j < N; j++) System.out.print('*');
        System.out.print('\n');
    }
}
