package dl_server;

public class UpravlenieServer {

	public UpravlenieServer() {
		GlavServer objGlavServer = new GlavServer();
		Thread nit_objGlavServer = new Thread(objGlavServer, "soedenit2");
		nit_objGlavServer.start();
	}//
}//public class UpravlenieServer {
