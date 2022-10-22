package arthimatic;
import java.lang.*;
import java.util.*;
public class ProductofElement {
    public static long solve(ArrayList<Integer> arr) {
        // Complete the function template here
        //  Scanner sc=new Scanner(System.in);
        //     int n=sc.nextInt();
        // int arr[]=new int[n];
        int n=arr.size();
        long product=1;
        for(int i=0;i<n;i++){
            // arr[i]=sc.nextInt();
            product*=arr.get(i);
        }

        return product;

    }
}
