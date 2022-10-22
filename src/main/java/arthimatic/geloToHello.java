package arthimatic;
import java.util.*;
public class geloToHello
     {
        public static void main(String args[]) {
            String A="gelo world hellogelo";
            String B="";
            int i=0;
            while(i<A.length()){
                if((i==0 && i+3<A.length() && A.charAt(i)=='g' && A.charAt(i+1)=='e' && A.charAt(i+2)=='l'&& A.charAt(i+3)=='o'))
                {
                    B+="hello";
                    i+=4;
                }else if((i+4<A.length() && A.charAt(i)== ' ' && A.charAt(i+1)=='g' && A.charAt(i+2)=='e' && A.charAt(i+3)=='l'&& A.charAt(i+4)=='o')){
                    B+="hello";
                    i+=5;
                }
                else{
                    B+=A.charAt(i);
                    i++;
                }
            }
            System.out.print(B);
        }
    }

