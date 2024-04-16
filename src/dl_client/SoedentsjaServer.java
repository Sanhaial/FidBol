package dl_client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class SoedentsjaServer implements Runnable{
	static private Socket conection;
	public ClientOtprovitel objClientOtprovitel = new ClientOtprovitel();
	public ClientPriemnik objClientPriemnik = new ClientPriemnik();
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}//public void run() {
public void soedenitsja(){
	try {
		conection = new Socket(InetAddress.getByName("127.0.0.1"), 5678);
		//ClientOtprovitel objClientOtprovitel = new ClientOtprovitel();
		objClientOtprovitel.ustanovitSoket(conection);
		//objClientOtprovitel.sendData();
		//ClientPriemnik objClientPriemnik = new ClientPriemnik();
		objClientPriemnik.ustanovitSoket(conection);
		Thread nit_objClientOtprovitel = new Thread(objClientPriemnik, "priem_ot_server");
		nit_objClientOtprovitel.start();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}//public void soedenitsja(){
}//public class SoedentsjaServer implements Runnable{
