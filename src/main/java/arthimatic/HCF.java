package arthimatic;
import java.util.*;
public class HCF {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=1;
        while(b>0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.print(temp);

    }
}
