package A.java.Day2;
import java.util.*;
public class prime_number {
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        if(isPrime(n)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
}
