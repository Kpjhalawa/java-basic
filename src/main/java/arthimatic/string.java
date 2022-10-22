package arthimatic;

public class string {

    public static void main(String args[]) {
        String A="1110011";
        System.out.print(solve(A));

    }
    public static int  solve(String A) {
        int ch=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1'){
                ch++;
            }
        }
        int ans=ch+(ch*(ch-1)/2);
        return ans;


    }
}
