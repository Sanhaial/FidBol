package dl_server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class GlavServer implements Runnable{
	static private ServerSocket server;
	static private Socket conection;
	static private ObjectOutputStream output;
	static private ObjectInputStream input;
	ArrayList<Thread> listnit_objObrabotatClient = new ArrayList<>();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("В классе GlavServer в Методе run 1");
			try {
				
				server = new ServerSocket(5678, 10);
				while(true){
				conection = server.accept();
				System.out.println("В классе GlavServer в Методе run 2");
				System.out.println("Соеденение " + conection);
				
				if(conection != null){
					System.out.println("В классе GlavServer в Методе run");
					ObrabotatClient objObrabotatClient = new ObrabotatClient();
					objObrabotatClient.ustanovitSoket(conection);
					Thread nit_objObrabotatClient = new Thread(objObrabotatClient, "odin_client");
					nit_objObrabotatClient.start();
					//listnit_objObrabotatClient.add(nit_objObrabotatClient);
					
				}//if(conection != null){
				}//
			}//
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//
	}//public void run() {
}//public class GlavServer implements Runnable{
