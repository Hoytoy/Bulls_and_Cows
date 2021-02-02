import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        double cg = 0;
        for (char c : input) {
            if ("cgCG".contains(Character.toString(c))) {
                cg++;
            }
        }
        System.out.print(cg / input.length * 100);
    }
}