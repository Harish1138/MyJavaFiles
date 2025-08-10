
import java.util.*;

public class reverse_word_in_sentence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str=input.nextLine();
        String ans="";
        StringBuilder std=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!= ' '){
                std.append(ch);
            }
            else{
                std.reverse();
                ans+=std;
                ans+=" ";
                std=new StringBuilder("");
            }
        }
        std.reverse();
        ans+=std;
        System.out.print(ans);
    }
}
