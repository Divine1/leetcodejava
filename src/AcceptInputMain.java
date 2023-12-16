import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class AcceptInputMain {

    public static void main(String[] args) {

/*
        String inp = "";


        Scanner sin  = new Scanner(System.in);

        System.out.println("enter input");
        inp = sin.next();

        System.out.printf("input is %s ",inp);

        try {
            System.out.println("\nenter input char");
            char c = (char) System.in.read();
            System.out.printf("input char %s ",c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/
        BigInteger bc1 = BigInteger.TWO;
        BigInteger bc2 = BigInteger.TWO;

        BigInteger result = BigInteger.ONE;
        System.out.printf("result %d \n",result);

        BigInteger res=BigInteger.ZERO;
        for(BigInteger i= BigInteger.ZERO;i.compareTo(BigInteger.valueOf(4)) !=0 ; i = i.add(BigInteger.ONE)){
            result = result.multiply(bc2);
        }
        System.out.println("result  "+result);
    }
}
