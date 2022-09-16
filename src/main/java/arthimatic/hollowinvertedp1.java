package arthimatic;
import java.util.*;
public class hollowinvertedp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            if(i==n    ||  i== 1) {
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
            }
            else
            {
                System.out.print("*");
                for(int j=1;j<i-1;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
