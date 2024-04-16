package dl_client;

import i_server_i_client.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientOtprovitel implements Runnable{
	static private Socket conection;
	static private ObjectOutputStream output;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}//public void run() {
	
public void ustanovitSoket(Socket conection){
	this.conection = conection;
}//public void ustanovitSoket(Socket conection){
public void sendData(User user){
	//opredelitUser();
	try {
		//String str = "test na server";
		output = new ObjectOutputStream(conection.getOutputStream());
		output.writeObject(user);
		System.out.println("Клиент Отправлен объект " + user);
	}// try {
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//catch (IOException e) {
}//public void sendData(){

}//public class ClientOtprovitel implements Runnable{
