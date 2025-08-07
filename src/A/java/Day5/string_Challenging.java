package A.java.Day5;
import java.util.*;

public class string_Challenging {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input as required:");
        String str=sc.nextLine();
        int s=sc.nextInt();
        int e=sc.nextInt();
        int len=str.length();
        System.out.println(str.charAt(0)+" "+str.charAt(len-1));
        System.out.println(str.substring(s,e+1));
        byte [] arr=str.getBytes();
        for(byte b:arr){
            System.out.print(b+" ");
        }
        System.out.println();
        char [] arr1=str.toCharArray();
        for(char ch:arr1){
            System.out.println(ch);
        }

    }
}
