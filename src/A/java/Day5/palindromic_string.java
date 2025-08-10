import java.util.*;
public class palindromic_string {
    public static boolean isPalindrome(String str) {
        int len=str.length();
        int i=0;
        int j=len-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;

            i++;
            j--;

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
//        Boolean flag=true;
        int count=0;
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length()+1;j++){
               if(isPalindrome(str.substring(i,j))==true){
                   count++;
                   System.out.print(str.substring(i,j));
                   if(j!=str.length()){
                       System.out.print(",");
                   }
               }
            }
        }
        System.out.println();
        System.out.println(count);

    }
}
