// To convert string uppercase to lowercase and vice versa


import java.util.*;
public class string_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        StringBuilder stb = new StringBuilder(str);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                stb.setCharAt(i,Character.toUpperCase(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                stb.setCharAt(i,Character.toLowerCase(ch));
            } else {
                // For non-alphabet characters, you can choose to append as-is or ignore
                stb.append(ch);
            }
        }
        System.out.println(stb.toString());
    }
}

