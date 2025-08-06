package A.java.Day1;


import java.util.Scanner;

public class printing_counting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
