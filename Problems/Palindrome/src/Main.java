import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        for (int i = 0; i < input.length; i++) {
            if (input[i] != input[input.length - 1 - i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}