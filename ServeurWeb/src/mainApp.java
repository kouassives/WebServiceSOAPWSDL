import javax.swing.JOptionPane;
import javax.xml.ws.Endpoint;

import messervices.MonService;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint endpoint = Endpoint.publish("http://localhost:8085/services",
			     new MonService() );
JOptionPane.showMessageDialog(null, "Eteindre le serveur");
endpoint.stop();
	}

}
