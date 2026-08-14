package Level_3.ChatApplication;

import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        int port = 5050;

        try {

            // Create server socket
            ServerSocket serverSocket = new ServerSocket(port);

            System.out.println("Server started...");
            System.out.println("Waiting for client connection...");


            // Accept client connection
            Socket socket = serverSocket.accept();

            System.out.println("Client connected!");


            // Receive messages from client
            BufferedReader input =
                    new BufferedReader(
                            new InputStreamReader(socket.getInputStream())
                    );


            // Send messages to client
            PrintWriter output =
                    new PrintWriter(
                            socket.getOutputStream(),
                            true
                    );


            BufferedReader console =
                    new BufferedReader(
                            new InputStreamReader(System.in)
                    );


            String messageFromClient;
            String messageToClient;


            while (true) {


                // Read client message
                messageFromClient = input.readLine();

                if (messageFromClient.equalsIgnoreCase("exit")) {
                    System.out.println("Client disconnected.");
                    break;
                }


                System.out.println("Client: " + messageFromClient);


                // Send server message
                System.out.print("You: ");
                messageToClient = console.readLine();

                output.println(messageToClient);


                if (messageToClient.equalsIgnoreCase("exit")) {
                    break;
                }
            }


            socket.close();
            serverSocket.close();


        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}