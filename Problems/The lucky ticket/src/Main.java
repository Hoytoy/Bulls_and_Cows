import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.next();
        int[] ticketNumberInt = new int[6];
        for (int i = 0; i < 6; i++) {
            ticketNumberInt[i] = Character.getNumericValue(ticketNumber.charAt(i));
        }
        int firstThree = ticketNumberInt[0];
        firstThree += ticketNumberInt[1];
        firstThree += ticketNumberInt[2];
        int secondThree = ticketNumberInt[3];
        secondThree += ticketNumberInt[4];
        secondThree += ticketNumberInt[5];

        System.out.println(firstThree == secondThree ? "Lucky" : "Regular");
    }
}