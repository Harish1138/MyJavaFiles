package A.java.Day1;

import java.util.Scanner;

public class d_sum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        int b;
        System.out.print("Enter the value of a: ");
        a=input.nextInt();
        System.out.print("Enter the value of b: ");
        b=input.nextInt();
        int sum=a+b;
        System.out.println("Total sum of a and b is: "+sum);
    }
}
