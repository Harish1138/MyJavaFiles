import java.util.*;

class string2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder stb = new StringBuilder();
        int lineCount = 0;

        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("END")) {
                break;
            }
            lineCount++;
            stb.append(line);
            stb.append("\n");

        }

        String text = stb.toString();
        int charCount = text.length();
        int wordsCount = new StringTokenizer(text).countTokens();

        System.out.println("Number of characters: " + charCount);
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordsCount);
    }
}
