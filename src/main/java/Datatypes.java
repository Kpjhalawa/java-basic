import com.sun.nio.sctp.SctpSocketOption;

import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.security.spec.RSAOtherPrimeInfo;

public class Datatypes {
    public static void main(String[] args) {
        byte b = 10;

        b=127;
        b++;
       // System.out.println(b);
        byte by=10;
        short sh = 30;
        int ln = 40;
        by= (byte) sh;  // type cast besause byte is chota and we not store sh in by

        sh=by;
        sh = (short) ln;
        by= (byte) 257;  // we get 1 because of circulity
        System.out.println(by);

        long lnn = 10000000000l;

        int a1 = (int) lnn;
        System.out.println(a1);

        double  d = 2.2;
        float f = 2.5F;
        d = f;
        System.out.println(d);
        System.out.println(f);











    }
}
