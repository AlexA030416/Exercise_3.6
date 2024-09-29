import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in feet and inches
        System.out.print("Enter feet: ");
        int feet = input.nextInt();
        System.out.print("Enter inches: ");
        int inches = input.nextInt();

        // Convert height to inches
        int totalInches = feet * 12 + inches;

        // Convert height to meters
        double heightInMeters = totalInches * 0.0254;

        // Convert weight to kilograms
        double weightInKilograms = weight * 0.45359237;

        // Compute BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
