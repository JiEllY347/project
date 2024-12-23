package Network_Sockets;

import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server on port 1234
            Socket socket = new Socket("localhost", 1234);

            // Create input and output streams for communication
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            String messageToSend = "Hello from Client!";
            output.println(messageToSend);

            // Receive response from the server
            String responseFromServer = input.readLine();
            System.out.println("Received from server: " + responseFromServer);

            // Close resources
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
