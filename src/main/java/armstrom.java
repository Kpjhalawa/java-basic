import java.lang.*;
import java.util.*;

   public   class armstrom {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            //int sum=0;
            for(int i=1; i<=n; i++){
                int a=i;
                int sum=0;
                for(a=i; a>0;a=a/10){
                    int rem=a%10;// 153
                    sum=(int)(sum+Math.pow(rem,3));
                    // n=n%10;
                }
                if(sum==i){
                    System.out.println(i);
                }
            }
        }
    }

