import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int index = 0;

        if (input.length <= 1) {
            System.out.println(true);
            return;
        }

        while (index < input.length - 1 && ++input[index] == input[index + 1]) {
            index++;
        }
        System.out.println(index >= input.length - 1);
    }
}