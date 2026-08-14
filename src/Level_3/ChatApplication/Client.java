package Level_3.ChatApplication;

import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) {

        String serverAddress = "localhost";
        int port = 5050;


        try {

            // Connect to server
            Socket socket = new Socket(serverAddress, port);

            System.out.println("Connected to server!");


            // Receive messages from server
            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );


            // Send messages to server
            PrintWriter output =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );


            // Read messages from keyboard
            BufferedReader console =
                    new BufferedReader(
                            new InputStreamReader(System.in)
                    );


            String messageToServer;
            String messageFromServer;


            while (true) {


                // Send message to server
                System.out.print("You: ");
                messageToServer = console.readLine();

                output.println(messageToServer);


                if (messageToServer.equalsIgnoreCase("exit")) {
                    break;
                }


                // Receive server reply
                messageFromServer = input.readLine();

                System.out.println("Server: " + messageFromServer);


                if (messageFromServer.equalsIgnoreCase("exit")) {
                    break;
                }
            }


            socket.close();


        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
