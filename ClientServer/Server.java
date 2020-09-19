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
import java.net.ServerSocket;
import java.util.Observable;
import java.util.Observer;
public class Server
{
ServerSocket myServerSocket;
Socket s;
DataInputStream dis ;
PrintStream ps;
public static void main(String[] args)
{
new Server();
}
public Server()
{
try
{
myServerSocket = new ServerSocket(5005);
s = myServerSocket.accept ();
dis = new DataInputStream(s.getInputStream ());
ps = new PrintStream(s.getOutputStream ());
String msg = dis.readLine();
System.out.println(msg);
ps.println("Data Received");
}
catch(IOException ex)
{
ex.printStackTrace();
}
try
{
ps.close();
dis.close();
s.close();
myServerSocket.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}
