package arthimatic;
import java.util.*;
public class practice {
    public static void main(String[] args) {
       System.out.print(factorial(5));

    }
public static  int factorial(int n){
        int nfact=1;
        for(int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        //System.out.print(nfact);
        return nfact;
    }
}
