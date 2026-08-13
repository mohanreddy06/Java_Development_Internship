package Level_1;

import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("===== Random Password Generator =====");

        System.out.print("Enter password length: ");
        int length = sc.nextInt();

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = sc.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecial = sc.next().equalsIgnoreCase("yes");


        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*";


        String characters = "";

        if (includeLowercase) {
            characters += lowercase;
        }

        if (includeUppercase) {
            characters += uppercase;
        }

        if (includeNumbers) {
            characters += numbers;
        }

        if (includeSpecial) {
            characters += special;
        }


        if (characters.isEmpty()) {
            System.out.println("Please select at least one character type.");
        } else {

            String password = "";

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(characters.length());
                password += characters.charAt(index);
            }

            System.out.println("\nGenerated Password: " + password);
        }

        sc.close();
    }
}