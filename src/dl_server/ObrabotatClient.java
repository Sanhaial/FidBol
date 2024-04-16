package dl_server;

import i_server_i_client.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ObrabotatClient implements Runnable{
	static private Socket conection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		prinatDate();
		}//while(true){
	}//public void run() {

public void ustanovitSoket(Socket ust_conection){
	this.conection = ust_conection;
}//public void ustanovitSoket(Socket ust_conection){
public void prinatDate(){
	try {
		input = new ObjectInputStream(conection.getInputStream());
		Object obj = input.readObject();
		System.out.println("В классе ObrabotatClient в Методе prinatDate");
		System.out.println("На сервере объект " + obj);
		User user = (User)obj;
		RabotaSklient objRabotaSklient = new RabotaSklient();
		objRabotaSklient.rabota_s_klient(user);
		output = new ObjectOutputStream(conection.getOutputStream());
		output.writeObject(user);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}//


}//public class ObrabotatClient implements Runnable{
