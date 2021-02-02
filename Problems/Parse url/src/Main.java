import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().split("\\?")[1];
        String[] keyValues = input.split("&");
        boolean passwordFound = false;
        String password = "not found";

        for (String keyValue : keyValues) {
            String[] keySplit = keyValue.split("=");
            System.out.printf("%s : %s\n", keySplit[0], keySplit.length < 2 ? "not found" : keySplit[1]);
            if (keySplit[0].contains("pass")) {
                passwordFound = true;
                password = keySplit[1];
            }
        }
        if (passwordFound) {
            System.out.printf("password : %s\n", password);
        }
    }
}