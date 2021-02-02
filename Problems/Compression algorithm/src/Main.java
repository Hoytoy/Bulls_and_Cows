import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int count = 1;
        String output = String.valueOf(input[0]);
        if (input.length == 1) {
            System.out.println(output + "1");
            return;
        }

        for (int i = 1; i < input.length; i++) {
            if (input[i] == output.charAt(output.length() - 1)) {
                count++;
            } else {
                output = output.concat(String.valueOf(count)).concat(String.valueOf(input[i]));
                count = 1;
            }
            if (i == input.length - 1) {
                output = output.concat(String.valueOf(count));
            }
        }

        System.out.println(output);
    }
}