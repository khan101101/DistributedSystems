import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
   
		Socket s = new Socket("10.51.183.176", 9090);
		s.getOutputStream();
        BufferedReader input =new BufferedReader(new InputStreamReader(s.getInputStream()));
        String text = input.readLine();
        System.exit(0);
		
		
	}

}
