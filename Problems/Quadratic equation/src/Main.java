import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        b /= a;
        c /= a;
        double root1 = -b / 2 - Math.sqrt(b * b / 4 - c);
        double root2 = -b / 2 + Math.sqrt(b * b / 4 - c);

        System.out.println(root1 + " " + root2);
    }
}