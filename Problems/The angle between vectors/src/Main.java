import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vector1 = new double[2];
        double[] vector2 = new double[2];
        vector1[0] = sc.nextDouble();
        vector1[1] = sc.nextDouble();
        vector2[0] = sc.nextDouble();
        vector2[1] = sc.nextDouble();
        double angle = Math.acos(dotProduct(vector1, vector2) / (magnitude(vector1) * magnitude(vector2)));
        System.out.println(Math.toDegrees(angle));
    }

    public static double dotProduct(double[] vector1, double[] vector2) {
        return vector1[0] * vector2[0] + vector1[1] * vector2[1];
    }

    public static double magnitude(double[] vector) {
        return Math.sqrt(vector[0] * vector[0] + vector[1] * vector[1]);
    }
}