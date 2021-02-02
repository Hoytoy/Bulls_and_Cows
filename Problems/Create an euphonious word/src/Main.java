import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int addLetters = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : input) {
            if (isVowel(c)) {
                vowelCount++;
                if (consonantCount > 0) {
                    consonantCount = 0;
                }
                if (vowelCount > 2 && vowelCount % 2 == 1) {
                    addLetters++;
                }
            } else {
                consonantCount++;
                if (vowelCount > 0) {
                    vowelCount = 0;
                }
                if (consonantCount > 2 && consonantCount % 2 == 1) {
                    addLetters++;
                }
            }
        }

        System.out.println(addLetters);
    }

    public static boolean isVowel(char c) {
        return "aeiouyAEIOUY".contains(Character.toString(c));
    }
}