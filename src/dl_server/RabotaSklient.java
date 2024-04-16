package dl_server;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import Server_rabotaXML.OpenFile;
import Server_rabotaXML.saveInXMLFile;
import i_server_i_client.User;

public class RabotaSklient {

	
public void rabota_s_klient(User user) {
	zaregestrirovatNewUser(user);
	voiti_v_igra(user);
	
}//
public void zaregestrirovatNewUser(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("zaregestrirovat_new_user") != true) {
		return;
	}//
	Boolean result = proverUser(user);
	if(result == true) {
		user.userDeistvie = "user_otkaz_v_regestracija";
		//user.objDljaPeredat = "Такой логин уже используется";
		return;
	}//
	
	String login_user = user.login_user.getZnachStr();
	String user_pasword = user.user_pasword.getZnachStr();
	String userNikName = user.userNikName.getZnachStr();
	String file = "/Users/" + login_user +"_"+ user_pasword +"_"+ userNikName + "_u";
	Document dok_user = user.get_Document_v3();
	saveInXMLFile objsaveInXMLFile = new saveInXMLFile();
	//////objsaveInXMLFile.ispolnitZapis(dok_user, file);
	user.userDeistvie = "user_zaregestrirovan";
	//System.out.println("В классеRabotaSklient в методе zaregestrirovatNewUser");
	//System.out.println("Юзер действие " + userDeistvie);
}//
public void voiti_v_igra(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("zapros_na_vhod") != true) {
		return;
	}//
	Boolean result = false;
	OpenFile objOpenFile = new OpenFile();
	String put = "/Users";
	File dirUsers = objOpenFile.openFile(put);
	ArrayList<File> listfileUser =  objOpenFile.file_is_dir_v_ArrayList(dirUsers);
	User provUser = new User();
	for(File fileUser: listfileUser) {
		Node nodeUser =  objOpenFile.parserXMLDok(fileUser);
		//User provUser = new User();
		Node item = nodeUser.getFirstChild();
		provUser.set_node_iz_xml(item);
		
		Boolean loginUser =  user.prover_loginUser(provUser);
		Boolean user_pasword = user.prover_user_pasword(provUser);
		if(loginUser == true && user_pasword == true) {
			user.userDeistvie = "vhod_razrehon";
			user.userNikName.setZnach(provUser.userNikName.getZnachStr());
			return;
		}//
	}//
	user.userDeistvie = "vhod_zaprehen";
	//System.out.println("В классеRabotaSklient в методе voiti_v_igra");
	//System.out.println("Юзер действие " + userDeistvie);
}//
public Boolean proverUser(User user) {
	Boolean result = false;
	OpenFile objOpenFile = new OpenFile();
	String put = "/Users";
	File dirUsers = objOpenFile.openFile(put);
	ArrayList<File> listfileUser =  objOpenFile.file_is_dir_v_ArrayList(dirUsers);
	User provUser = new User();
	for(File fileUser: listfileUser) {
		Node nodeUser =  objOpenFile.parserXMLDok(fileUser);
		//User provUser = new User();
		Node item = nodeUser.getFirstChild();
		provUser.set_node_iz_xml(item);
		Boolean result_loginUser = user.prover_loginUser(provUser);
		if(result_loginUser == true) {
			user.objDljaPeredat = "Этот логин уже занят";
			return true;
		}//
		Boolean result_userNikName = user.prover_userNikName(provUser);
		if(result_userNikName == true) {
			user.objDljaPeredat = "Это имя уже занято";
			return true;
		}//
	}//
	System.out.println("В классе RabotaSklient в методе proverUser");
	System.out.println("Проверить " + result);
	return result;
}//
}//public class RabotaSklient {
