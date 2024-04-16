package InterfeisKlient;

import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JLabel;

import EvintSobitie.SobitieAcaunt;
import i_server_i_client.User;

public class InterfeisUpravUser {
InterfeisIgra PanelOtrazit;
User user;
ArrayList<Component> listComponentInterfeis = new ArrayList<>();

public void ustanovitPanelOtrazit(InterfeisIgra PanelOtrazit) {
	this.PanelOtrazit = PanelOtrazit;
}//
public void ustanovitUser(User user) {
	this.user = user;
}//
public void testPanel() {
	JLabel lab_fonTablo = PanelOtrazit.sozdatJLabel("fonTablo", "PanelOtrazitUpravUser", new Dimension(300, 50));
	PanelOtrazit.dobavKartinkaJLabel(lab_fonTablo, "kartinki/white_kvadrat.png", new Dimension(130, 70));
	lab_fonTablo.setLocation(10, 10);
	PanelOtrazit.add(lab_fonTablo);
	
	String str_userNikName = user.userNikName.getZnachStr();
	String userDeistvie = user.userDeistvie;
	//System.out.println("В классе ustanovitPanelOtrazit в методе  testPanel");
	//System.out.println("Юзер в управлении юзера " + str_userNikName);
}//
public void narisovatInterfeisUpravUser() {
	/*
	String str_userNikName = user.userNikName.getZnachStr();
	JLabel lab_userNikName = PanelOtrazit.sozdatJLabel("lab_userNikName", str_userNikName, new Dimension(100, 50));
	lab_userNikName.setLocation(10,5);
	PanelOtrazit.add(lab_userNikName);
	*/
	JLabel lab_sozdat_igrok = PanelOtrazit.sozdatJLabel("lab_sozdat_igrok", "", new Dimension(241, 50));
	PanelOtrazit.dobavKartinkaJLabel(lab_sozdat_igrok, "kartinki/sozdat_igrok.png", new Dimension(241, 50));
	lab_sozdat_igrok.setLocation(10, 60);
	PanelOtrazit.add(lab_sozdat_igrok);
	PanelOtrazit.objOknoKlient.objSobitieAcaunt.ustanovitMouseListener(lab_sozdat_igrok);
	listComponentInterfeis.add(lab_sozdat_igrok);
	
	JLabel lab_voiti_v_match = PanelOtrazit.sozdatJLabel("lab_voiti_v_match", "", new Dimension(241, 50));
	PanelOtrazit.dobavKartinkaJLabel(lab_voiti_v_match, "kartinki/voiti_v_match.png", new Dimension(241, 50));
	lab_voiti_v_match.setLocation(10, 120);
	PanelOtrazit.add(lab_voiti_v_match);
	//System.out.println("В классе InterfeisUpravUser в методе narisovatInterfeisUpravUser");
	//System.out.println("Объект событие акаунта " + objSobitieAcaunt);
	PanelOtrazit.objOknoKlient.objSobitieAcaunt.ustanovitMouseListener(lab_voiti_v_match);
	listComponentInterfeis.add(lab_voiti_v_match);
}//
}//public class InterfeisUpravUser {
