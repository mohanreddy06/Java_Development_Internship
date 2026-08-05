package Level_1;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.print("Enter temperature value: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter unit (C for Celsius, F for Fahrenheit): ");
        char unit = Character.toUpperCase(sc.next().charAt(0));

        if (unit == 'C') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", temperature, fahrenheit);

        } else if (unit == 'F') {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.printf("%.2f°F = %.2f°C%n", temperature, celsius);

        } else {
            System.out.println("Invalid unit! Please enter C or F.");
        }

        sc.close();
    }
}