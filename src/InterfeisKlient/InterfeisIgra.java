package InterfeisKlient;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import i_server_i_client.HroniliheZnachenii;

public class InterfeisIgra extends JPanel{
OknoKlient objOknoKlient;
ArrayList<InterfeisTipaOkno> listInterfeisTipaOkno = new ArrayList<>();
InterfeisUpravUser objInterfeisUpravUser = new InterfeisUpravUser();
	
	InterfeisIgra(){
		setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
		setLayout(null);
		setSize(1350, 700);
		setLocation(5,5);
		//System.out.println("В классе InterfeisIgra в методе InterfeisIgra");
		//System.out.println("Конструктор запушен ");
	}//InterfeisIgra(){


public void naborTestCompanents() {
	/*
	JLabel labunitTest = sozdatJLabel("labunitTest", "testUnit", new Dimension(50,50));
	labunitTest.setLocation(10,10);
	add(labunitTest);
	
	JLabel lab_kartinka = sozdatJLabel("lab_kartinka", "", new Dimension(100,50));
	lab_kartinka.setLocation(10, 50);
	String putIMG_lab = "kartinki/pehota.jpg";
	Dimension razmer = lab_kartinka.getSize();//new Dimension(250, 165);
	Image img =  vrnutIMG(putIMG_lab, razmer);
	ImageIcon icon = new ImageIcon(img);
	lab_kartinka.setIcon(icon);
	add(lab_kartinka);
	*/
	//otrazitMatch();Отражать матч надо будет после события вход в матч 
	otrazitUpravUser();
	NarisovatmenuAccount();
	//System.out.println("В классе InterfeisIgra в методе naborTestCompanents");
	//System.out.println("InterfeisIgra ");
}//
public void NarisovatmenuAccount() {
	String str_userNikName = objOknoKlient.user.userNikName.getZnachStr();
	JLabel lab_userNikName = sozdatJLabel("lab_userNikName", str_userNikName, new Dimension(100, 15));
	lab_userNikName.setLocation(10, 5);
	add(lab_userNikName);
	
	Dimension razm_fon_menuAccaunt = new Dimension(1500, 30);
	JLabel fon_menuAccaunt = sozdatJLabel("fon_menuAccaunt", "", razm_fon_menuAccaunt);
	fon_menuAccaunt.setLocation(5,5);
	dobavKartinkaJLabel(fon_menuAccaunt, "kartinki/white_kvadrat.png", razm_fon_menuAccaunt);
	add(fon_menuAccaunt);
	
}//
public void otrazitMatch() {
	InterfeisMatch objInterfeisMatch = new InterfeisMatch();
	objInterfeisMatch.ustanovitPanelOtrazit(this);
	objInterfeisMatch.otrazitMatch();
	
}//
public void otrazitUpravUser() {
	//InterfeisUpravUser objInterfeisUpravUser = new InterfeisUpravUser();
	objInterfeisUpravUser.ustanovitPanelOtrazit(this);
	objInterfeisUpravUser.ustanovitUser(objOknoKlient.user); 
	
	//objInterfeisUpravUser.testPanel();
	objInterfeisUpravUser.narisovatInterfeisUpravUser();
}//
public void otobrazitInterfisUpravFitBolist() {
	InterfisUpravFitBolist objInterfisUpravFitBolist = new InterfisUpravFitBolist();
	objInterfisUpravFitBolist.ustanovitPanelOtrazit(this);
	objInterfisUpravFitBolist.ustanovitUser(objOknoKlient.user);
	objInterfisUpravFitBolist.narisovatSozdatNewFutbolist();
}//

public void ustanovitOknoKlient(OknoKlient objOknoKlient) {
	this.objOknoKlient = objOknoKlient;
}//
public JLabel sozdatJLabel(String nameLab, String textLab, Dimension razmerLab) {
	JLabel lab = new JLabel("Логин");
	lab.setName(nameLab);
	lab.setText(textLab);
	lab.setSize(razmerLab);
	
	return lab;
}//
public void dobavKartinkaJLabel(JLabel lab, String put_kartinka, Dimension razmer_kartinka) {
	//String putIMG_lab = "kartinki/pole.png";
	//Dimension razmer = lab_kartinka.getSize();//new Dimension(250, 165);
	Image img =  vrnutIMG(put_kartinka, razmer_kartinka);
	ImageIcon icon = new ImageIcon(img);
	lab.setIcon(icon);
}//
public Image vrnutIMG(String putIMG, Dimension razmer){
	//putIMG = "kartinki/krug.png";
	BufferedImage imgFile = null;
	rab_client.openFileTest Obj_openFileTest = new rab_client.openFileTest();
	File fileIcon = Obj_openFileTest.vernutPatchFile(putIMG);
	try {
		imgFile = ImageIO.read(fileIcon);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//получение картинки из фаила
	Image dimge = imgFile.getScaledInstance(razmer.width, razmer.height, Image.SCALE_SMOOTH);
	return dimge;
}//
public void obrabotatmouseClicked(MouseEvent arg0) {
	System.out.println("В классе InterfeisIgra в методе obrabotatmouseClicked");
	System.out.println("Обрабатываем моузеКликер " + arg0);
	
	JLabel labBut = (JLabel)arg0.getSource();
	System.out.println("В классе InterfeisIgra в методе obrabotatmouseClicked");
	System.out.println("Кнопка лабле имя  " + labBut.getName());
	
	otrazitSozdatNewFitbolist(labBut);
	voiti_v_match(labBut);
	
	repaint();
}//
public void otrazitSozdatNewFitbolist(JLabel labBut) {
	if(labBut.getName().equals("lab_sozdat_igrok") != true) {
		return;
	}
	for(Component comp: objInterfeisUpravUser.listComponentInterfeis) {
		remove(comp);
	}//
	otobrazitInterfisUpravFitBolist();
}//
public void voiti_v_match(JLabel labBut) {
	if(labBut.getName().equals("lab_voiti_v_match") != true) {
		return;
	}
	for(Component comp: objInterfeisUpravUser.listComponentInterfeis) {
		remove(comp);
	}//
	otrazitMatch();
}//
}//public class InterfeisIgra extends JPanel{
