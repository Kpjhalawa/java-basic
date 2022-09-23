package arthimatic;

import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a to get sum of even number.");
        int k=sc.nextInt();
        System.out.println(solve(k));
    }
    public static int solve(int A) {
        int sum=0;
        for(int i=1;i<=A;i++){
            if(i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}

