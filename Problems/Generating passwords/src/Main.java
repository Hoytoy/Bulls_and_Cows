import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();

        String upperCase = createUpperCase(a);
        String lowerCase = createLowerCase(b);
        String digits = createDigits(c);

        String password = upperCase.concat(lowerCase).concat(digits);
        if (password.length() < n) {
            if (b == 0) {
                password = password.concat(createLowerCase(n - password.length()));
            } else if (c == 0) {
                password = password.concat(createDigits(n - password.length()));
            } else {
                password = password.concat(createUpperCase(n - password.length()));
            }
        }

        System.out.println(password);
    }

    public static String createUpperCase(int a) {
        String upperCase = "";
        char ch = 'A';
        for (int i = 0; i < a; i++) {
            upperCase = upperCase.concat(Character.toString(ch));
            if (ch == 'Z') {
                ch--;
            } else {
                ch++;
            }
        }
        return upperCase;
    }
    public static String createLowerCase(int b) {
        String lowerCase = "";
        char ch = 'a';
        for (int i = 0; i < b; i++) {
            lowerCase = lowerCase.concat(Character.toString(ch));
            if (ch == 'z') {
                ch--;
            } else {
                ch++;
            }
        }
        return lowerCase;
    }
    public static String createDigits(int c) {
        String digits = "";
        char ch = '1';
        for (int i = 0; i < c; i++) {
            digits = digits.concat(Character.toString(ch));
            if (ch == '9') {
                ch--;
            } else {
                ch++;
            }
        }
        return digits;
    }
}