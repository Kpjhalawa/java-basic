package arthimatic;
import java.util.*;
import java.lang.*;
public class MaxMiniArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        int mini=A[0];
        for(int i=1;i<n;i++){
            mini=Math.min(mini,A[i]);
        }
        int max=A[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,A[i]);
        }
        System.out.print(max+" "+mini);
    }
}
