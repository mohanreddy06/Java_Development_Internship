package Level_2;

import java.io.*;
import java.util.Scanner;

public class FileEncryptionDecryption {

    static final int SHIFT = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== File Encryption / Decryption =====");

        System.out.println("1. Encrypt File");
        System.out.println("2. Decrypt File");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();


        System.out.print("Enter output file path: ");
        String outputPath = sc.nextLine();


        if (choice == 1) {

            processFile(filePath, outputPath, SHIFT);

            System.out.println("File encrypted successfully!");

        } else if (choice == 2) {

            processFile(filePath, outputPath, -SHIFT);

            System.out.println("File decrypted successfully!");

        } else {

            System.out.println("Invalid choice!");
        }


        sc.close();
    }


    public static void processFile(String inputFile, String outputFile, int shift) {


        try {

            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);


            int character;


            while ((character = reader.read()) != -1) {

                char encryptedChar = (char) (character + shift);

                writer.write(encryptedChar);
            }


            reader.close();
            writer.close();


        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
