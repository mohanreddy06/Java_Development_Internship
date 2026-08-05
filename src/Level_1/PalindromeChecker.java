package Level_1;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Palindrome Checker =====");
        System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        // Remove spaces and special characters, convert to lowercase
        String original = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Check palindrome
        if (original.equals(reversed)) {
            System.out.println("\"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }

        sc.close();
    }
}