import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int seed = a;
        int max = k + 1;

        for (int i = a; i <= b; i++) {
            Random random = new Random(i);
            int seedMax = -1;
            for (int j = 0; j < n; j++) {
                int r = random.nextInt(k);
                if (seedMax < r) {
                    seedMax = r;
                }
            }
            if (max > seedMax) {
                max = seedMax;
                seed = i;
            }
        }

        System.out.println(seed);
        System.out.println(max);
    }
}