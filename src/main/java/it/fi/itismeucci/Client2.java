package it.fi.itismeucci;

import java.io.*;
import java.net.*;


public class Client2{
    String nomeServer= "nomeServer";
    int portaserver=6789;
    DataInputStream in;
    DataOutputStream out;


    protected Socket connetti() throws IOException
    {
        Socket socket=new Socket(nomeServer,portaserver);

        out=new DataOutputStream(socket.getOutputStream());
        in=new DataInputStream(socket.getInputStream());

        return socket;
    }
}