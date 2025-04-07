import java.io.*;
import java.net.*;
public class Main {
 public static void main(String[] args) {
 String hostname = "localhost";
 int port = 12345;
 try (Socket socket = new Socket(hostname, port);
 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
 BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
 out.println("Hello Server!");
 String response = in.readLine();
 System.out.println("Server response: " + response);
 } catch (IOException e) {
 e.printStackTrace();
 }
 }}
