package TestServer;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String [] args) {
        String serverName = "localhost";
        int port = 6066;
        try {
            System.out.println("Connecting to " + serverName + " on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            Scanner sc = new Scanner(System.in);
            while(true) {
                out.writeUTF(sc.next());
                System.out.print(in.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}