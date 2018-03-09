import java.io.*;
import java.net.*;

class ChatClient
{
  public static void main(String argv[]) throws Exception
  {
    String exitingChat;
    String incomingChat;
    
    //NETWORKS
    BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
    
    Socket clientSocket = new Socket("cisone.sbuniv.edu",51234);
    
    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
    
    BufferedReader inFromServer = new BufferedReader(new 
      InputStreamReader(clientSocket.getInputStream()));
    
    //DOING THE LOGIC
    while(incomingChat != "EXITEXIT")  
    {
      exitingChat = inFromUser.readLine();
      outToServer.writeBytes(exitingChat + '\n');
      
      incomingChat = inFromServer.readLine();
      
      System.out.println("FROM SERVER: " + incomingChat);
      
    }
    clientSocket.close();
  }
}