import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.*;
import java.net.Socket;
import java.net.*;
import java.net.ServerSocket;
import java.util.Observable;
import java.util.Observer;
public class Client
{
Socket mySocket;
DataInputStream dis ;
PrintStream ps;
public static void main(String[] args)
{
new Client();
}
public Client()
{
try
{
mySocket = new Socket(InetAddress.getLocalHost(), 5005);
dis = new DataInputStream(mySocket.getInputStream ());
ps = new PrintStream(mySocket.getOutputStream ());
ps.println("Test Test");
String replyMsg = dis.readLine();
System.out.println(replyMsg);
}
catch(IOException ex)
{
ex.printStackTrace();
}
try
{
ps.close();
dis.close();
mySocket.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
