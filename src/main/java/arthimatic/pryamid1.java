package arthimatic;
import java.util.*;
public class pryamid1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(0+" ");
            }
            for(int k=1;k<=i*2-1;k++){
                System.out.print((n-i+1)*k+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(0+" ");
            }
            System.out.println();
        }
    }
    }

