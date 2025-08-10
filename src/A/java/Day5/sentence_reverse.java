
import java.util.*;
public class sentence_reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String str=in.nextLine();
        StringTokenizer st=new StringTokenizer(str," ");
        int count=st.countTokens();
        String word[]=new String[count];
        for(int i=0;i<count;i++){
            word[i]=st.nextToken();

        }
        for(int i=count-1;i>=0;i--){
            System.out.print(word[i]);
            if(i!=0){
                System.out.print(" ");
            }

        }

    }
}