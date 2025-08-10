import java.util.*;
public class string{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s=input.nextLine();
        int len=s.length();
        char []arr=new char[len];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[i]=(char) (ch-'a'+'A');
            }
            else if(ch>='A' && ch<='Z'){
                arr[i]=(char)(ch-'A'+'a');
            }
        }
        for(int i=0;i<s.length();i++)
            System.out.print(arr[i]);

    }

}