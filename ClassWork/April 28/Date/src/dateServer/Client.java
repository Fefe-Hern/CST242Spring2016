/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author hernf07
 */
public class Client {
    public static void main(String[] args) throws IOException {
        int n = 0;
        while(n < 3) {
            String serverAddress = "localhost";
            Socket s = new Socket(serverAddress, 9091);
            BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String answer = input.readLine();
            System.out.println(answer);
            n++;
        }
    }
}
