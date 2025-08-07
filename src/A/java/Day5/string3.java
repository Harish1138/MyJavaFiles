package A.java.Day5;

import java.util.*;

public class string3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the Character: ");
        Character ch=input.next().charAt(0);
        System.out.print("Enter the number in Byte format: ");
        byte b=input.nextByte();
        System.out.println("Displaying values of Wrapper class objects:");
        System.out.println("Character object: "+ch);
        System.out.println("Byte object: "+b);
        char c=ch;
        Byte B=b;
        System.out.println("Displaying unwrapped values:");
        System.out.println("Char value: "+c);
        System.out.println("Byte value: "+B);


    }
}
