import java.util.Scanner;

public class Main {

    public static double computeWeeklyPay(double hourlyPay, double hoursWorked) {

    //    double weeklyPay = hourlyPay * hoursWorked;
        return hourlyPay * hoursWorked;

    }

    public static void main(String[] args) {
        System.out.println("Let's calculate the weekly pay");

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the hourly pay.");
        double hourlyPay = input.nextDouble();

        while (hourlyPay <= 0) {
            System.out.println("That's invalid. Please input the hourly pay.");
            hourlyPay = input.nextDouble();
        }

        System.out.println("Please input the hours worked.");
        double hoursWorked = input.nextDouble();

        while (hoursWorked <= 0) {
            System.out.println("That's invalid. Please input the hours worked.");
            hoursWorked= input.nextDouble();
        }
        double payForWeek = computeWeeklyPay(hourlyPay, hoursWorked);
        System.out.println("Week's pay is " + payForWeek);
    }

}
