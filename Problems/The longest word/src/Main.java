import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String longestWord = input[0];

        for (int i = 1; i < input.length; i++) {
            if (longestWord.length() < input[i].length()) {
                longestWord = input[i];
            }
        }
        System.out.println(longestWord);
    }
}