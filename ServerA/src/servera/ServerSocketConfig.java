/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Massa
 */
public class ServerSocketConfig {

    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private ServerSocketConfig ssc;

    //create socket
    public boolean isCreateSocket(int x) {
        try {
            serverSocket = new ServerSocket(x);
            System.err.println("Server is listing on port : " + x);
            return true;
        } catch (IOException ex) {
           // System.err.println("Server couden't listing on port : " + x);
            return false;
        }
    }

    // Wait for a connection, and process
    public boolean isAcceptSocket() {
        try {
            clientSocket = serverSocket.accept();
           // System.err.println("Now client is connected ");
            return true;
        } catch (IOException ex) {
           // System.err.println("Client is not connected");
            return false;
        }
    }

    //Creating output stream 
    public boolean createOutputStream() {
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            // System.out.println("Create outpot stream");
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    //Creating input stream 
    public boolean createinputStream() {
        try {
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            // System.out.println("Create outpot stream");
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    // read stream
    public String ReadClient() {
        try {
            String s = in.readLine();
            return s;
        } catch (IOException ex) {
            return "Error In reding";
        }
    }

    // write stream
    public void WriteClient(String msg) {
        out.println(msg);
    }

    //close input stream
    public boolean closeInputStream() {
        try {
            in.close();
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    //close output stream
    public boolean closeOutputStream() {
        try {
            out.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    //close Socket
    public boolean closeSocket() {
        try {
            clientSocket.close();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }



    public void runserver5(int x) {
        String msg;
        ServerSocketConfig ssc = this;
        MethoedCall mc = new MethoedCall();
        boolean b1 = ssc.isCreateSocket(x);
        if (b1) {
            b1 = ssc.isAcceptSocket();
            if (b1) {
                ssc.createinputStream();
                ssc.createOutputStream();

   //code start from hear
                msg = ssc.ReadClient();
                System.out.println("MW sends massage : " + msg);
                String res=mc.methodCaller(msg);
                System.out.println("Server A send : " + res);
                ssc.WriteClient(res);
    //codes ends from hear

                System.err.println("Terminating the Sever connection.");
                ssc.closeInputStream();
                ssc.closeOutputStream();
                ssc.closeSocket();

            } else {
                System.out.println("Error in Accept socket");
            }
        } else {
            //System.out.println("Error in create socket");
        }
    }
}
