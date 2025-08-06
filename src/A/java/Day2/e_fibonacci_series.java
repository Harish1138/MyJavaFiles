package A.java.Day2;
import java.util.*;
public class e_fibonacci_series {
    public static void isFib(int n) {
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
//        return c;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        isFib(n);

    }
}
