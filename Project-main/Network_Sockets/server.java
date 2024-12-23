package Network_Sockets;

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) {
        try {
            // Create a ServerSocket to listen on port 1234
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started, waiting for client...");

            // Accept client connections
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            // Create input and output streams to communicate with the client
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read data from the client
            String messageFromClient = input.readLine();
            System.out.println("Received from client: " + messageFromClient);

            // Send a response to the client
            String response = "Hello from Server!";
            output.println(response);

            // Close resources
            input.close();
            output.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
