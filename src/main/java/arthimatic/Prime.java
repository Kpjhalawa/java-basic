package arthimatic;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
            boolean che=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    che=false;
                }


            }
            if(che==true){
                System.out.println(i);
            }

        }
    }
}
