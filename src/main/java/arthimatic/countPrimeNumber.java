package arthimatic;
import java.util.*;
public class countPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(solve(a));
    }

        public static int solve(int A) {
            int count=0;
            for(int i=2;i<=A;i++){
                boolean che=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        che=false;
                    }


                }
                if(che==true){
                    count++;
                }
            }
            return count;
        }
    }


