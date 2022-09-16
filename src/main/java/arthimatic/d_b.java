package arthimatic;
import java.lang.*;
import java.util.*;

public class d_b {



        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();

            for(int i=0;i<t;i++){
                int dec=sc.nextInt();
                int pow=1;
                String bin="";
                while(dec!=0){
                    int rem=dec%2;
                    if(rem==1){
                        bin+='1';
                    }
                    else{
                        bin+='0';
                    }

                    pow=pow*10;
                    dec=dec/2;

                }
                String tem="";
                int n=bin.length();
                for( int j=n-1;j>=0;j--){
                    char c=bin.charAt(j);
                    tem+=c;
                }
                System.out.println(tem);
            }
        }
    }

