package Level_2;

import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Password Strength Checker =====");

        System.out.print("Enter your password: ");
        String password = sc.nextLine();


        int score = 0;

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;


        // Check each character
        for (char ch : password.toCharArray()) {

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }

            else if (Character.isDigit(ch)) {
                hasNumber = true;
            }

            else {
                hasSpecial = true;
            }
        }


        // Calculate password score

        if (password.length() >= 8) {
            score++;
        }

        if (hasUppercase) {
            score++;
        }

        if (hasLowercase) {
            score++;
        }

        if (hasNumber) {
            score++;
        }

        if (hasSpecial) {
            score++;
        }


        // Display result

        System.out.println("\nPassword Analysis:");

        System.out.println("Length >= 8 : " + hasLength(password));
        System.out.println("Contains Uppercase : " + hasUppercase);
        System.out.println("Contains Lowercase : " + hasLowercase);
        System.out.println("Contains Number : " + hasNumber);
        System.out.println("Contains Special Character : " + hasSpecial);


        if (score == 5) {
            System.out.println("\nPassword Strength: Strong");

        } else if (score >= 3) {
            System.out.println("\nPassword Strength: Medium");

        } else {
            System.out.println("\nPassword Strength: Weak");
        }


        sc.close();
    }


    // Check password length
    public static boolean hasLength(String password) {

        return password.length() >= 8;
    }
}