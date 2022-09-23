package arthimatic;
import java.util.*;
public class IsPerfectSqr {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Test case");
        int k=sc.nextInt();
        while(k>0){
            System.out.println("Enter a number to check Perfect Squre");
            int n=sc.nextInt();
            System.out.println( getsqure(n));

            k--;
        }
    }

    static int getsqure(int n){
        for(int i=1;i<=10000;i++){
            if(i*i==n){
                return 1;
            }

        }
        return 0;

    }
}
