
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int year = 1905;
        int n = (int) (Math.ceil(year/100));
        int ni =(int)Math.ceil(((double)year)/100);
        double d =Math.ceil(((double)year)/100);

        System.out.printf("int %d ",n);
        System.out.println();
        System.out.printf("int ni %d ",ni);
        System.out.println();

        System.out.printf("double %f ",d);
        String str="lion";

        
    }
}