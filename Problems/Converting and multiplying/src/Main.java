import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        String line = sc.nextLine();
        while (!"0".equals(line)) {
            input.add(line);
            line = sc.nextLine();
        }
        for (String inp : input) {
            try {
                System.out.println(Integer.parseInt(inp) * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + inp);
            }
        }
    }
}