import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputLine = sc.nextLine().split(" ");

        int n = Integer.parseInt(inputLine[1]);
        if (n == 0 || n >= inputLine[0].length()) {
            System.out.println(inputLine[0]);
            return;
        }

        String newString = inputLine[0].substring(n) + inputLine[0].substring(0, n);

        System.out.println(newString);
    }
}