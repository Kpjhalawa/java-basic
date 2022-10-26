package arthimatic;
import java.lang.reflect.Array;
import java.util.*;
public class Maxmod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int A[]=new int[n];
        for(int i=0;i<n;i++){
             A[i]=sc.nextInt();
        }
        System.out.print(solve(A));
    }
    public static int solve(int[] A) {
        Arrays.sort(A);
        int n=A.length;
        int i=A[n-1];
        int j=0;
        for(int k=n-2;k>=0;k--){
            if(A[k]!=i){
                j=A[k];
                break;
            }
        }
        return j%i;
    }
}
