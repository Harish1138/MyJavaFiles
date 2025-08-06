package A.java.Day2;

import java.util.Scanner;

public class a_odd_and_even_number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=in.nextInt();
        if(n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }


}
