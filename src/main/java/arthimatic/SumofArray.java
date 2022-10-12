package arthimatic;
import java.lang.*;
import java.util.*;

public class SumofArray {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }
        System.out.print(sum);
    }
}
