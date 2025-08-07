package A.java.Day5;
import java.util.*;
// You have to use StringTokenizer to convert string as token
public class string1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the input: ");
        String str=in.nextLine();    // Taking Input
        StringTokenizer std=new StringTokenizer(str," ");   // by using StringTokenizer converting string as word or token
        int count=std.countTokens();      // counting the words in string
        String words[]=new String[count];    // creating an array to store the word
        for(int i=0;i<count;i++){        // Storing word in words array
            words[i]=std.nextToken();
        }
        for(int i=count-1;i>=0;i--){      // printing the words in reverse order
            System.out.println(words[i]);
        }

    }
}
