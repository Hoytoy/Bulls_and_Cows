import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        char[] compare = sc.nextLine().toCharArray();
        int count = 0;
        for (int i = 0; i <= input.length - compare.length; i++) {
            for (int j = 0; j < compare.length; j++) {
                if (compare[j] == input[i]) {
                    if (j == compare.length - 1) {
                        count++;
                        break;
                    }
                    i++;
                } else {
                    i -= j;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}