/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;

/**
 *
 * @author hernf07
 */
public class DateServer {
    public static void main(String[] args) {
        try {
            ServerSocket listener = new ServerSocket(9091);
            while (true) {
                Socket socket = listener.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println(new Date().toString());
                socket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(DateServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
