/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package communication;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jelena
 */
public class Receiver {
    private Socket socket;
    ObjectInputStream in;

    public Receiver(Socket socket) {
        this.socket = socket;
    }
    public Object receive() throws Exception{
        try {
            in=new ObjectInputStream(socket.getInputStream());
            return in.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new Exception("Greska prilikom primanja objekta!\n"+ex.getMessage());
        }
    }
    
}
