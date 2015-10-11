package torpedo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceException;

public class TorpedoClient {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Hiányzó szerver elérhetőség!");
			return;
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ITorpedo_Service proxy = new ITorpedo_Service();
		ITorpedo port = proxy.getITorpedoSoap11HttpPort();
		
		BindingProvider provider = (BindingProvider)port;
		provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, args[0]);
		
		int x = -1;
		int y = -1;
		try {	
			while (true) {
				try {
					x = Integer.parseInt(in.readLine());
					if (x == 0) {
						break;
					}
					y = Integer.parseInt(in.readLine());
					boolean result = port.shot(x, y);
					System.out.println((result) ? "talált" : "nem talált");
				} catch (NumberFormatException e) {
					System.out.println("Nem jó szám!");
				} catch (IOException e) {
				} catch (WebServiceException e) {
					System.out.println("A kapcsolat megszakadt a szerverrel!");
					break;
				}
			}
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
