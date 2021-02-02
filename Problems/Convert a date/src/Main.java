import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(makeUSDate(input));
    }

    public static String makeUSDate(String input) {
        String[] ymd = input.split("-");
        return ymd[1] + "/" + ymd[2] + "/" + ymd[0];
    }
}