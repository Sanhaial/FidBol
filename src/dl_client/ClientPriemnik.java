package dl_client;

import i_server_i_client.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientPriemnik implements Runnable{
	static private Socket conection;
	static private ObjectInputStream input;
	public ObrabotatOtvetServer objObrabotatOtvetServer = new ObrabotatOtvetServer();
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
		permonentPriem();
		}//while(true){
	}//public void run() {
	
public void permonentPriem(){
		try {
			input = new ObjectInputStream(conection.getInputStream());
			User user = (User)input.readObject();
			System.out.println("Клиент принят объект " + user);
			
			objObrabotatOtvetServer.obrabotatOtvet(user);
		}//try { 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch (IOException e) { 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch (ClassNotFoundException e) {
	}//public void permonentPriem(){
public void ustanovitSoket(Socket conection){
	this.conection = conection;
}//public void ustanovitSoket(Socket conection){
}//public class ClientPriemnik implements Runnable{
