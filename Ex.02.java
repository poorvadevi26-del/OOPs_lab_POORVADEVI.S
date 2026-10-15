package speed;
public class SpeedConverter {
    public static double mpsToKmph(double mps) {
        return mps * 3.6;
    }
    public static double kmphToMps(double kmph) {
        return kmph / 3.6;
    }
    public static double kmphToMph(double kmph) {
        return kmph * 0.621371;
    }
    public static double mphToKmph(double mph) {
        return mph / 0.621371;
    }
    public static double mpsToMph(double mps) {
        return mps * 2.23694;
    }
    public static double mphToMps(double mph) {
        return mph / 2.23694;
    }
}
import java.util.Scanner;
import speed.SpeedConverter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Speed Converter");
        System.out.println("1. m/s to km/h");
        System.out.println("2. km/h to m/s");
        System.out.println("3. km/h to mph");
        System.out.println("4. mph to km/h");
        System.out.println("5. m/s to mph");
        System.out.println("6. mph to m/s");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.print("Enter speed: ");
        double value = sc.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Result = " +
                    SpeedConverter.mpsToKmph(value) + " km/h");
                break;
            case 2:
                System.out.println("Result = " +
                    SpeedConverter.kmphToMps(value) + " m/s");
                break;
            case 3:
                System.out.println("Result = " +
                    SpeedConverter.kmphToMph(value) + " mph");
                break;
            case 4:
                System.out.println("Result = " +
                    SpeedConverter.mphToKmph(value) + " km/h");
                break;
            case 5:
                System.out.println("Result = " +
                    SpeedConverter.mpsToMph(value) + " mph");
                break;
            case 6:
                System.out.println("Result = " +
                    SpeedConverter.mphToMps(value) + " m/s");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}
output:
Speed Converter
1. m/s to km/h
2. km/h to m/s
3. km/h to mph
4. mph to km/h
5. m/s to mph
6. mph to m/s
Enter your choice: 1
Enter speed: 10
Result = 36.0 km/h
