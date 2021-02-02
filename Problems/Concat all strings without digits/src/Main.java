import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder sb = new StringBuilder();
        for (String st : strings) {
            sb.append(st);
        }
        for (int i = 0; i < sb.length(); i++) {
            while ("0123456789".contains(Character.toString(sb.charAt(i)))) {
                sb.deleteCharAt(i);
                if (i == sb.length()) {
                    break;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}