package A.java.Day2;
import java.util.*;
public class d_palindrome_number_with_function {
    public static void palindrome(int n) {
        int m=n;
        int rev=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println(rev);

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        palindrome(n);
    }
}
