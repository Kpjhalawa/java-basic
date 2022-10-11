package arthimatic;
import java.lang.*;
import java.util.*;
public class PerferctSqure {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k>0){
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
