import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        double m = sc.nextDouble();
        boolean found = false;
        while (!found) {
            Random random = new Random(k);
            for (int i = 0; i < n; i++) {
                if (m < random.nextGaussian()) {
                    k++;
                    break;
                } else if (i == n - 1) {
                    found = true;
                }
            }
        }
        System.out.println(k);
    }
}