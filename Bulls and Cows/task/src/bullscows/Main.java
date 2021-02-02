package bullscows;

import java.util.Scanner;

public class Main {

    public static char[] secretCode;
    public static int length;
    public static int symbols;
    public static int turn = 1;
    public static boolean secretFound = false;
    public static boolean error = false;

    public static void main(String[] args) {
        secretCode = createSecretCode();
        if (error) {
            System.out.println("Error!");
            return;
        }

        while (!secretFound) {
            char[] input = nextInput();
            if (error) {
                System.out.println("Error!");
                return;
            }
            printResult(input, secretCode);
            turn++;
        }
    }

    public static char[] createSecretCode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the secret code's length:");
        try {
            length = sc.nextInt();
        } catch (Exception e) {
            error = true;
            return null;
        }
//        while (length > 36 || length < 1) {
//            System.out.printf("Error: can't generate a secret number with a length of %d.\n" +
//                    "Please, enter a number in the range of 1 to 36: ", length);
//            length = sc.nextInt();
//        }
        if (length > 36 || length < 1) {
            error = true;
            return null;
        }
        System.out.println("Please, enter the number of possible symbols in the code:");
        try {
            symbols = sc.nextInt();
        } catch (Exception e) {
            error = true;
            return null;
        }
//        while (symbols > 36 || symbols < length) {
//            System.out.printf("Error: the number of possible symbols must be\n" +
//                    "in the range of %d to 36: ", length);
//            symbols = sc.nextInt();
//        }
        if (symbols > 36 || symbols < length) {
            error = true;
            return null;
        }
        char[] secretCode = new char[length];
        for (int i = 0; i < length; i++) {
            boolean contains = true;
            while(contains) {
                int rnd = (int) (Math.random() * symbols);
                secretCode[i] = (char) (rnd > 9 ? rnd + 87 : rnd + 48);
                for (int j = 0; j <= i; j++) {
                    if (j == i) {
                        contains = false;
                    } else if (secretCode[j] == secretCode[i]) {
                        break;
                    }
                }
            }
        }
        preparingMessage(length, symbols);
        System.out.println("Okay, let's start a game!");
        return secretCode;
    }

    public static void preparingMessage(int length, int symbols) {
        StringBuilder output = new StringBuilder("The secret is prepared: ");
        for (int i = 0; i < length; i++) {
            output.append("*");
        }
        if (symbols < 10) {
            output.append(" (0-");
            output.append(symbols - 1);
            output.append(").");
        } else if (symbols == 10) {
            output.append(" (0-9).");
        } else {
            output.append(" (0-9, a-");
            output.append((char) (symbols + 86));
            output.append(").");
        }
        System.out.println(output);
    }

    public static char[] nextInput() {
        System.out.printf("Turn %d:\n", turn);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.length() != length) {
            error = true;
            return null;
        }
        char[] nextInput = new char[length];
        for (int i = 0; i < length; i++) {
            nextInput[i] = input.charAt(i);
        }
        return nextInput;
    }

    public static void printResult(char[] input, char[] secretCode) {
        int bulls = calcBulls(input, secretCode);
        int cows = calcCows(input, secretCode);
        StringBuilder result = new StringBuilder("Grade: ");
        if (bulls == 0 && cows == 0) {
            result.replace(0, result.length(), "None!");
        } else {
            if (bulls > 0) {
                result.append(bulls);
                result.append(bulls == 1 ? " bull" : " bulls");
                if (bulls == length) {
                    result.append("\nCongratulations! You guessed the secret code.");
                    secretFound = true;
                }
                if (cows > 0) {
                    result.append(" and ");
                }
            }
            if (cows > 0) {
                result.append(cows);
                result.append(cows == 1 ? " cow" : " cows");
            }
        }
        System.out.println(result);
    }

    public static int calcBulls(char[] input, char[] secretCode) {
        int bulls = 0;
        for (int i = 0; i < length; i++) {
            if (input[i] == secretCode[i]) {
                bulls++;
            }
        }
        return bulls;
    }
    public static int calcCows(char[] input, char[] secretCode) {
        int cows = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                } else if (secretCode[i] == input[j]) {
                    cows++;
                }
            }
        }
        return cows;
    }
}
