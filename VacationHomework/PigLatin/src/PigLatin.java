import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        String temp = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word : ");
        String word = scan.nextLine();

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (word.substring(i, i + 1).equalsIgnoreCase("a") || word.substring(i, i + 1).equalsIgnoreCase("e")
                    || word.substring(i, i + 1).equalsIgnoreCase("i") || word.substring(i, i + 1).equalsIgnoreCase("o")
                    || word.substring(i, i + 1).equalsIgnoreCase("u")) {
                for (int j = i; j < word.length(); j++) {
                    System.out.print(word.charAt(j));
                }
                System.out.print(temp);
                System.out.print("ay");
                break;
            } else temp += word.charAt(i);
        }
    }
}

