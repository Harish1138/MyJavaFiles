
import java.util.*;
public class string5_i {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=in.nextLine();
        int len=str.length();
        char [] arr=new char[len];
        for(int i=0;i<len;i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[i]=(char)(ch-'a'+'A');
            } else if (ch >= 'A' && ch <= 'Z') {
                arr[i]=(char)(ch-'A'+'a');
            }
            else{
                arr[i]=(char)(ch);
            }
        }
        for(char ch:arr)
            System.out.print(ch);

    }
}
