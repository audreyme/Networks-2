import java.io.*;
import java.net.*;

class ChatServer
{
  public static void main(String argv[]) throws Exception
  {
    String outbound;
    String inbound;
    //NETWORK
    ServerSocket welcomeSocket = new ServerSocket(51234);

    Socket connection = welcomeSocket.accept();

    BufferedReader inFromClient = new BufferedReader(new
      InputStreamReader(connectionSocket.getInputStream()));

    DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
    //DOING THE LOGIC
    while(inbound != "EXITEXIT"
    {
      outbound = inFromUser.readLine();
      outbound.writeBytes(outbound + '\n');
      inbound = inFromClient.readLine();
      System.out.println("FROM CLIENT: " + inbound);
    }
    welcomeSocket.close
  }
}