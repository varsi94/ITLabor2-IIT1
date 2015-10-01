package torpedo;

import javax.xml.ws.Endpoint;

public class TorpedoHost {
	public static void main(String[] args) {
		Endpoint endPoint = Endpoint.publish("http://localhost:8080/torpedo", new Torpedo());
	}
}
