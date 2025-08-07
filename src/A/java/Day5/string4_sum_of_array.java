package A.java.Day5;
import java.util.*;
public class string4_sum_of_array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the elements of Array: ");
        String str=input.nextLine();
        StringTokenizer std=new StringTokenizer(str);

        int sum=0;
        while(std.hasMoreTokens())
            sum+=Integer.parseInt(std.nextToken());

        System.out.println("Sum of Array: "+sum);
    }
}
