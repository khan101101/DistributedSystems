import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss = new ServerSocket();
		Socket s = ss.accept();
		
		InputStream is = s.getInputStream(); // byteStream reading
		InputStreamReader isr = new InputStreamReader(is);// byteStream changed to charStream 
		BufferedReader br = new BufferedReader(isr); // line by line reading
		
		OutputStream os=s.getOutputStream();
		PrintWriter pw=new PrintWriter(os);
		pw.println("Server is running");
		System.exit(0);
	    
	}

}
