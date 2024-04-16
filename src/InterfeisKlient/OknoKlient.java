package InterfeisKlient;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import EvintSobitie.SobitieAcaunt;
import EvintSobitie.SobitieMenu;
import dl_client.SoedentsjaServer;
import i_server_i_client.User;

public class OknoKlient extends JFrame{
	
public JPanel osnovPanel = new JPanel();
SobitieMenu objSobitieMenu = new SobitieMenu();
SobitieAcaunt objSobitieAcaunt = new SobitieAcaunt();
ArrayList<Component> listComponentNachMenu = new ArrayList<>();
ArrayList<Component> listComponentRegestracijaUser = new ArrayList<>();
SoedentsjaServer objSoedentsjaServer = new SoedentsjaServer();
public User user = new User();
public InterfeisIgra objInterfeisIgra = new InterfeisIgra();

	public OknoKlient() {
	super("Фит Болл");
	setLayout(null);
	setSize(900, 500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	setLocationRelativeTo(null);
	//System.out.println("В классе OknoKlient в конструкторе OknoKlient");
	
	osnovPanel.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5));
	Point location = new Point(5, 5);
	Dimension razmer = new Dimension(1350, 700);
	osnovPanel.setLayout(null);
	osnovPanel.setLocation(location);
	osnovPanel.setSize(razmer);
	add(osnovPanel);
	
	objSobitieMenu.ustanovitOknoKlient(this);
	objSobitieAcaunt.ustanovitOknoKlient(this);
	objSobitieAcaunt.ustanovitInterfeisIgra(objInterfeisIgra);
	objSoedentsjaServer.soedenitsja();
	objSoedentsjaServer.objClientPriemnik.objObrabotatOtvetServer.ustanovitOknoKlient(this);
	objInterfeisIgra.ustanovitOknoKlient(this);
	
	
	otrazitRegestracija();
	otrazitButtonZaregestrirovatsja();
	otrazitButtonVhod();
	}//
public JPanel vernut_osnovPanel() {
	return osnovPanel;
}//
public JLabel sozdatJLabel(String nameLab, String textLab, Dimension razmerLab) {
	JLabel lab = new JLabel("Логин");
	lab.setName(nameLab);
	lab.setText(textLab);
	lab.setSize(razmerLab);
	
	return lab;
}//
public void otrazitRegestracija() {
	JLabel lab_login = sozdatJLabel("login", "Логин", new Dimension(50, 20));
	lab_login.setLocation(30, 10);
	osnovPanel.add(lab_login);
	listComponentNachMenu.add(lab_login);
	JTextField loginUser = new JTextField(20);
	loginUser.setName("loginUser");
	loginUser.setSize(200, 20);
	Point p_loginUser = lab_login.getLocation(); 
	p_loginUser.x = lab_login.getX() + lab_login.getWidth(); 
	loginUser.setLocation(p_loginUser);
	osnovPanel.add(loginUser);
	listComponentNachMenu.add(loginUser);
	
	JLabel lab_pasword = sozdatJLabel("pasword", "Пароль", new Dimension(50, 20));
	lab_pasword.setLocation(30, 30);
	osnovPanel.add(lab_pasword);
	listComponentNachMenu.add(lab_pasword);
	JTextField paswordnUser = new JTextField(20);
	paswordnUser.setName("paswordnUser");
	paswordnUser.setSize(200, 20);
	Point p_paswordnUser = lab_pasword.getLocation(); 
	p_paswordnUser.x = lab_pasword.getX() + lab_pasword.getWidth(); 
	paswordnUser.setLocation(p_paswordnUser);
	osnovPanel.add(paswordnUser);
	listComponentNachMenu.add(paswordnUser);
	
	
	//System.out.println("В классе OknoKlient в в методе otrazitRegestracija " + lab_login.getLocation());
}//
public void otrazitButtonZaregestrirovatsja() {
	JButton butt_zareg = new JButton();
	butt_zareg.setName("butt_zareg");
	butt_zareg.setText("Заренестрироваться");
	butt_zareg.setSize(200, 30);
	butt_zareg.setLocation(30, 50);
	osnovPanel.add(butt_zareg);
	listComponentNachMenu.add(butt_zareg);
	
	objSobitieMenu.ustanovitJButton(butt_zareg);
}//
public void otrazitButtonVhod() {
	JButton butt_vhod = new JButton();
	butt_vhod.setName("butt_vhod");
	butt_vhod.setText("Войти");
	butt_vhod.setSize(200, 30);
	butt_vhod.setLocation(230, 50);
	osnovPanel.add(butt_vhod);
	listComponentNachMenu.add(butt_vhod);
	
	objSobitieMenu.ustanovitJButton(butt_vhod);
}//
public void otrazitUserRegestracija() {
	JLabel lab_login = sozdatJLabel("wrait_login", "Укажите логин", new Dimension(100, 20));
	lab_login.setLocation(30, 10);
	osnovPanel.add(lab_login);
	listComponentRegestracijaUser.add(lab_login);
	JTextField loginUser = new JTextField(20);
	loginUser.setName("loginUser");
	loginUser.setSize(200, 20);
	Point p_loginUser = lab_login.getLocation(); 
	p_loginUser.x = lab_login.getX() + lab_login.getWidth(); 
	loginUser.setLocation(p_loginUser);
	osnovPanel.add(loginUser);
	listComponentRegestracijaUser.add(loginUser);
	
	JLabel lab_pasword = sozdatJLabel("wrait_pasword", "Укажите пароль", new Dimension(100, 20));
	lab_pasword.setLocation(30, 30);
	osnovPanel.add(lab_pasword);
	listComponentRegestracijaUser.add(lab_pasword);
	JTextField paswordnUser = new JTextField(20);
	paswordnUser.setName("paswordnUser");
	paswordnUser.setSize(200, 20);
	Point p_paswordnUser = lab_pasword.getLocation(); 
	p_paswordnUser.x = lab_pasword.getX() + lab_pasword.getWidth(); 
	paswordnUser.setLocation(p_paswordnUser);
	osnovPanel.add(paswordnUser);
	listComponentRegestracijaUser.add(paswordnUser);
	
	JLabel lab_nikName = sozdatJLabel("wrait_pasword", "Укажите имя", new Dimension(100, 20));
	lab_nikName.setLocation(30, 50);
	osnovPanel.add(lab_nikName);
	listComponentRegestracijaUser.add(lab_nikName);
	JTextField nikNameUser = new JTextField(20);
	nikNameUser.setName("nikNameUser");
	nikNameUser.setSize(200, 20);
	Point p_nikNameUser = lab_nikName.getLocation(); 
	p_nikNameUser.x = lab_nikName.getX() + lab_nikName.getWidth(); 
	nikNameUser.setLocation(p_nikNameUser);
	osnovPanel.add(nikNameUser);
	listComponentRegestracijaUser.add(nikNameUser);
	
	JButton butZaregestrirovatUser = new JButton();
	butZaregestrirovatUser.setName("butZaregestrirovatUser");
	butZaregestrirovatUser.setText("Зарегестрироваться ");
	butZaregestrirovatUser.setSize(180, 20);
	butZaregestrirovatUser.setLocation(30, 70);
	osnovPanel.add(butZaregestrirovatUser);
	listComponentRegestracijaUser.add(butZaregestrirovatUser);
	objSobitieMenu.ustanovitJButton(butZaregestrirovatUser);
	
	JButton butNazadIzRegestracijaUser = new JButton();
	butNazadIzRegestracijaUser.setName("butNazadIzRegestracijaUser");
	butNazadIzRegestracijaUser.setText("Назад");
	butNazadIzRegestracijaUser.setSize(100, 20);
	butNazadIzRegestracijaUser.setLocation(210, 70);
	osnovPanel.add(butNazadIzRegestracijaUser);
	listComponentRegestracijaUser.add(butNazadIzRegestracijaUser);
	objSobitieMenu.ustanovitJButton(butNazadIzRegestracijaUser);
}//
public void otrazit_otkaz_v_regestracija() {
	ArrayList<Component> listRemoveComponet = new ArrayList<Component>();
	for(Component comp: listComponentRegestracijaUser) {
		String name_comp = comp.getName();
		if(name_comp.equals("lab_otkaz_v_regestracija") == true) {
			listRemoveComponet.add(comp);
		}//
	}//
	for(Component comp: listRemoveComponet) {
		osnovPanel.remove(comp);
		listComponentRegestracijaUser.remove(comp);
	}//
	listRemoveComponet.clear();
	String text_resultat_regestracija = (String)user.objDljaPeredat;
	JLabel lab_otkaz_v_regestracija = 
			sozdatJLabel("lab_otkaz_v_regestracija", text_resultat_regestracija, new Dimension(250, 20));
	lab_otkaz_v_regestracija.setName("lab_otkaz_v_regestracija");
	lab_otkaz_v_regestracija.setLocation(30, 90);
	osnovPanel.add(lab_otkaz_v_regestracija);
	listComponentRegestracijaUser.add(lab_otkaz_v_regestracija);
}//
public void otrazit_nepuskat_v_igra() {
	JLabel lab_text_nePuskat = 
			sozdatJLabel("lab_text_nePuskat", "Указан неверный логин или пароль", new Dimension(300, 20));
	lab_text_nePuskat.setLocation(30, 80);
	osnovPanel.add(lab_text_nePuskat);
	listComponentNachMenu.add(lab_text_nePuskat);
	System.out.println("В классе OknoKlient в методе  otrazit_nepuskat_v_igra");
	System.out.println("Имя кнопки " + lab_text_nePuskat);
}//
public void otrazit_nachIgar() {
	ArrayList<Component> removeListComponent = new ArrayList<Component>();
	for(Component comp: listComponentNachMenu) {
		removeListComponent.add(comp);
	}//
	listComponentNachMenu.clear();
	for(Component comp: listComponentRegestracijaUser) {
		removeListComponent.add(comp);
	}//
	listComponentRegestracijaUser.clear();
	for(Component comp: removeListComponent) {
		osnovPanel.remove(comp);
	}//
	removeListComponent.clear();
	remove(osnovPanel);
	objInterfeisIgra.naborTestCompanents();
	add(objInterfeisIgra);
	repaint();
}//
public void obrabotat_actionPerformed(ActionEvent arg0) {
	JButton but = (JButton)arg0.getSource();
	obrabotat_zaregestrirovatsja(but);
	nazadIzregestracija(but);
	vipolnitRegestracija(but);
	vipolnitVhod_v_igra(but);
}//
public void obrabotat_zaregestrirovatsja(JButton but){
	String name_but = but.getName();
	if(name_but.equals("butt_zareg") != true) {
		return;
	}//
	for(Component comp: listComponentNachMenu) {
		osnovPanel.remove(comp);
	}//
	otrazitUserRegestracija();
	osnovPanel.repaint();
	//System.out.println("В классе OknoKlient в методе  obrabotat_zaregestrirovatsja");
	//System.out.println("Имя кнопки " + name_but);
}//
public void nazadIzregestracija(JButton but) {
	String name_but = but.getName();
	if(name_but.equals("butNazadIzRegestracijaUser") != true) {
		return;
	}//
	for(Component comp: listComponentRegestracijaUser) {
		osnovPanel.remove(comp);
	}//
	otrazitRegestracija();
	otrazitButtonZaregestrirovatsja();
	otrazitButtonVhod();
	osnovPanel.repaint();
}//
public void vipolnitRegestracija(JButton but) {
	String name_but = but.getName();
	if(name_but.equals("butZaregestrirovatUser") != true) {
		return;
	}//
	user.userDeistvie = "zaregestrirovat_new_user";
	for(Component comp: listComponentRegestracijaUser) {
		JTextField objJTextField = new JTextField();
		if(comp.getClass() == objJTextField.getClass()) {
			//System.out.println("В классе OknoKlient в методе vipolnitRegestracija");
			String compName = comp.getName();
			if(compName.equals("loginUser") == true) {
				JTextField compTot = (JTextField)comp;
				String znach = compTot.getText();
				user.login_user.setZnach(znach);
				//System.out.println("В классе OknoKlient в методе vipolnitRegestracija");
				//System.out.println("Логин юзера " + user.login_user.getZnachStr());
			}//
			if(compName.equals("paswordnUser") == true) {
				JTextField compTot = (JTextField)comp;
				String znach = compTot.getText();
				user.user_pasword.setZnach(znach);
				//System.out.println("В классе OknoKlient в методе vipolnitRegestracija");
				//System.out.println("Пароль юзера " + user.user_pasword.getZnachStr());
			}//
			if(compName.equals("nikNameUser") == true) {
				JTextField compTot = (JTextField)comp;
				String znach = compTot.getText();
				user.userNikName.setZnach(znach);
				//System.out.println("В классе OknoKlient в методе vipolnitRegestracija");
				//System.out.println("Имя юзера " + user.userNikName.getZnachStr());
			}//
		}//
	}//
	objSoedentsjaServer.objClientOtprovitel.sendData(user);
}//
public void vipolnitVhod_v_igra(JButton but) {
	String name_but = but.getName();
	if(name_but.equals("butt_vhod") != true) {
		return;
	}//
	for(Component comp: listComponentNachMenu) {
		JTextField objText = new JTextField();
		if(comp.getClass() != objText.getClass()) {
			continue;
		}//
		JTextField poleText = (JTextField)comp;
		String namePoleText = poleText.getName();
		
		if(namePoleText.equals("loginUser") == true) {
			user.login_user.setZnach(poleText.getText());
		}//
		if(namePoleText.equals("paswordnUser") == true) {
			user.user_pasword.setZnach(poleText.getText());
		}//
	}//
	user.userDeistvie = "zapros_na_vhod";
	objSoedentsjaServer.objClientOtprovitel.sendData(user);
	//System.out.println("В классе OknoKlient в методе vipolnitVhod_v_igra");
	//System.out.println("Проверка " + user.login_user.getZnachStr());
}//
}//public class OknoKlient extends JFrame{
