import java.net.*;
import java.io.*;
public class Admin {

	public static void main(String[] args)  {
		try {
			ServerSocket ss = new ServerSocket(6666);
			Socket s = ss.accept();
			System.out.println("Connected");
		    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		    dos.writeUTF("Wellcome!");
		    
		   
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//server - clients 
	}

}
