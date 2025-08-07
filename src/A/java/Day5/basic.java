package A.java.Day5;
import java.util.*;

public class basic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the input in String form: ");
        String n=sc.nextLine();
        System.out.print("Enter the Character: ");
        char ch=sc.next().charAt(0);
        System.out.println("Integer Value: "+Integer.parseInt(n));
        System.out.println("Character Value: "+ch);
    }
}
