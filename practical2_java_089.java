import java.util.Scanner;

public class practical2_java_089{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine().trim();
        String keyword = sc.nextLine();

        String[] words = sentence.split(" +");

        StringBuilder formatted = new StringBuilder();
        StringBuilder acronym = new StringBuilder();

        String longest = "";
        int keywordCount = 0;

        for (String word : words) {

            String fWord = word.substring(0, 1).toUpperCase()
                    + word.substring(1).toLowerCase();


            if (formatted.length() > 0) {
                formatted.append(" ");
            }
            formatted.append(fWord);

            if (fWord.length() > longest.length()) {
                longest = fWord;
            }

            if (word.equalsIgnoreCase(keyword)) {
                keywordCount++;
            }

            acronym.append(fWord.charAt(0));
        }

        System.out.println("Formatted: " + formatted);
        System.out.println("Words: " + words.length);
        System.out.println("Longest word: " + longest);
        System.out.println("Keyword count: " + keywordCount);
        System.out.println("Acronym: " + acronym);

        sc.close();
    }
}
