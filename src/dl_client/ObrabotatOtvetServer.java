package dl_client;

import InterfeisKlient.OknoKlient;
import i_server_i_client.User;

public class ObrabotatOtvetServer {
OknoKlient objOknoKlient;
	
public void obrabotatOtvet(User user) {
	objOknoKlient.user = user;
	String userDeistvie = user.userDeistvie;
	zaregestrirovat(user);
	otkaz_v_regestracii(user);
	otkazat_vhod_v_igra(user);
	vhod_v_igra(user);
	//System.out.println("В классе ObrabotatOtvetServer в методе obrabotatOtvet");
	//System.out.println("Юзер действия у клиента " + userDeistvie);
}//
public void zaregestrirovat(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("user_zaregestrirovan") != true) {
		return;
	}//
	objOknoKlient.otrazit_nachIgar();
	objOknoKlient.repaint();
	//System.out.println("В классе ObrabotatOtvetServer в zaregestrirovat");
	//System.out.println("Юзер действия у клиента " + userDeistvie);
}//
public void otkaz_v_regestracii(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("user_otkaz_v_regestracija") != true) {
		return;
	}//
	objOknoKlient.otrazit_otkaz_v_regestracija();
	objOknoKlient.repaint();
}//
public void otkazat_vhod_v_igra(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("vhod_zaprehen") != true) {
		return;
	}//
	objOknoKlient.otrazit_nepuskat_v_igra();
	objOknoKlient.repaint();
	//System.out.println("В классе ObrabotatOtvetServer в otkazat_vhod_v_igra");
	//System.out.println("Юзер действия у клиента " + userDeistvie);
}//
public void vhod_v_igra(User user) {
	String userDeistvie = user.userDeistvie;
	if(userDeistvie.equals("vhod_razrehon") != true) {
		return;
	}//
	objOknoKlient.otrazit_nachIgar();
	objOknoKlient.repaint();
}//
public void ustanovitOknoKlient(OknoKlient objOknoKlient) {
	this.objOknoKlient = objOknoKlient;
}//
}//
