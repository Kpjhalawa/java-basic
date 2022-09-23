package arthimatic;

import java.util.Scanner;

public class SqrRoot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num for Square Root.");
        int k=sc.nextInt();
        System.out.println(solve(k));
    }
    public  static int solve(int A) {
        for(int i=1;i<=10000;i++){

            if(i*i==A){
                return i;

            }

        }
        return -1;
    }
}
