package A.java.Day2;
import java.util.*;
// Palindrome Number Without function
public class palindrome_number_without_function {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();

        int m=n;
        int rem=0;
        int rev=0;
        while(n>0){
            rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);


    }
}
