import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        int indexFound = -1;
        for (int i = 0; i < input.length - 2; i++) {
            if (input[i] == 't' && input[i + 1] == 'h' && input[i + 2] == 'e') {
                indexFound = i;
                break;
            }
        }
        System.out.println(indexFound);
    }
}