package arthimatic;
import java.util.*;
public class invertspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1)
                    System.out.print("* ");
                else
                    System.out.print(" ");

            }
            System.out.println();
        }
    }
}
