package torpedo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.ws.BindingProvider;

public class TorpedoClient {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ITorpedo_Service proxy = new ITorpedo_Service();
		ITorpedo port = proxy.getITorpedoSoap11HttpPort();
		
		BindingProvider provider = (BindingProvider)port;
		provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:8080/torpedo");
		
		int x = -1;
		int y = -1;
		while (x != 0) {
			boolean isValid = false;
			try {
				x = Integer.parseInt(in.readLine());
				if (x == 0) {
					break;
				}
				y = Integer.parseInt(in.readLine());
				isValid = true;
			} catch (NumberFormatException | IOException e) {
				System.out.println("Nem jó szám!");
			}
			
			if (isValid) {
				boolean result = port.shot(x, y);
				System.out.println((result) ? "talált" : "nem talált");
			}
		}
		
		try {
			in.close();
		} catch (IOException e) {
		}
	}
}
