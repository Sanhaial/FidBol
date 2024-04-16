package InterfeisKlient;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import EvintSobitie.SobitieAcaunt;
import i_server_i_client.HroniliheZnachenii;
import i_server_i_client.User;

public class Graf_JLable implements MouseListener, MouseMotionListener, ActionListener{

HashMap<String, JLabel> HM_lab = new HashMap();

JLabel name = new JLabel();
JLabel znach = new JLabel();
JLabel knopka1 = new JLabel();
JLabel knopka2 = new JLabel();
JLabel fon = new JLabel();
Graf_JLable korzina;
InterfeisIgra PanelOtrazit;
	public Graf_JLable() {
	
	//User user = PanelOtrazit.objOknoKlient.user;
	//PanelOtrazit.objOknoKlient.objSoedentsjaServer.objClientOtprovitel.sendData(user);Отправить на сервер
	}//
public void ustanovitName(String textLab, Dimension razmerLab, int razmFont) {
	name.setLocation(300,300);
	
	Font font = new Font("Verdana", Font.PLAIN, razmFont);
	name.setFont(font);
	name.setText(textLab);
	name.setSize(razmerLab);
}//
public void ustanovitZnach(String textLab, Dimension razmerLab, int razmFont) {
	znach.setLocation(330, 300);
	
	Font font = new Font("Verdana", Font.PLAIN, razmFont);
	znach.setFont(font);
	HroniliheZnachenii h_znach = new HroniliheZnachenii(textLab);
	znach.putClientProperty("h_znach", h_znach);
	znach.setText(h_znach.getZnachStr());
	znach.setSize(razmerLab);
}//
public void ustanovitKnopka1(String put_kartinka, Dimension razmer_kartinka) {
	knopka1.setLocation(310, 350);
	
	knopka1.putClientProperty("zadacha", "net");
	knopka1.setName("knopka1");
	knopka1.setSize(razmer_kartinka);
	dobavKartinkaJLabel(knopka1, put_kartinka, razmer_kartinka);
}//
public void ustanovitKnopka2(String put_kartinka, Dimension razmer_kartinka) {
	knopka2.setLocation(340, 350);
	
	knopka2.putClientProperty("zadacha", "net");
	knopka2.setName("knopka2");
	knopka2.setSize(razmer_kartinka);
	dobavKartinkaJLabel(knopka2, put_kartinka, razmer_kartinka);
}//
public void ustanovitFon(String put_kartinka, Dimension razmer_kartinka) {
	fon.setLocation(300, 300);
	
	fon.setName("fon");
	fon.setSize(razmer_kartinka);
	dobavKartinkaJLabel(fon, put_kartinka, razmer_kartinka);
}//
public void ustanovitPanelOtrazit(InterfeisIgra PanelOtrazit) {
	this.PanelOtrazit = PanelOtrazit;
}//
public void razmestitKvadrat(int x, int y) {
	Point p_start = new Point(x, y); 
	fon.setLocation(p_start);
	Dimension r_fon = fon.getSize();
	Dimension r_name = name.getSize();
	Dimension r_znach = znach.getSize();
	int raznicaW = r_fon.width - (r_name.width + r_znach.width); raznicaW = raznicaW /2;
	int raznicaH = r_fon.height - r_name.height; raznicaH = raznicaH/2;
	Point p_name = name.getLocation();
	p_name.x = fon.getLocation().x + raznicaW;
	p_name.y = fon.getLocation().y + raznicaH;
	name.setLocation(p_name);
	Point p_znach = znach.getLocation();
	p_znach.x = p_name.x + r_name.width;
	p_znach.y = p_name.y;
	znach.setLocation(p_znach);
	Dimension r_knopka1 = knopka1.getSize();
	Point p_knopka1 = knopka1.getLocation();
	p_knopka1.x = p_start.x;
	p_knopka1.y = p_start.y + (r_fon.height - r_knopka1.height);
	knopka1.setLocation(p_knopka1);
	Dimension r_knopka2 = knopka2.getSize();
	Point p_knopka2 = knopka2.getLocation();
	p_knopka2.x = p_start.x + (r_fon.width - r_knopka2.width);
	p_knopka2.y = p_knopka1.y; 
	knopka2.setLocation(p_knopka2);
	
	System.out.println("В классе Graf_JLable в методе razmestitKvadrat");
	System.out.println("Разница размеров  " + p_name);
}//
public void razmestit_linija(int x, int y) {
	Point p_start = new Point(x, y); 
	fon.setLocation(p_start);
	Dimension r_fon = fon.getSize();
	Dimension r_name = name.getSize();
	Dimension r_znach = znach.getSize();
	int raznicaW = r_fon.width - (r_name.width + r_znach.width); raznicaW = raznicaW /2;
	int raznicaH = r_fon.height - r_name.height; raznicaH = raznicaH/2;
	Point p_name = name.getLocation();
	p_name.x = fon.getLocation().x + raznicaW;
	p_name.y = fon.getLocation().y + raznicaH;
	name.setLocation(p_name);
	Point p_znach = znach.getLocation();
	p_znach.x = p_name.x + r_name.width;
	p_znach.y = p_name.y;
	znach.setLocation(p_znach);
}//
public void razmestit_odna_knopka(int x, int y) {
	Point p_start = new Point(x, y); 
	fon.setLocation(p_start);
	Dimension r_fon = fon.getSize();
	Dimension r_name = name.getSize();
	int raznicaW = (r_fon.width - r_name.width) / 2;
	int raznicaH = (r_fon.height - r_name.height) / 2;
	Point p_name = new Point();
	p_name.x = p_start.x + raznicaW;
	p_name.y = p_start.y + raznicaH;
	name.setLocation(p_name);
	//System.out.println("В классе Graf_JLable в методе razmestit_odna_knopka");
	//System.out.println("Разница размеров  " + raznicaW);
}//
public void otrazitElement(InterfeisIgra PanelOtrazit) {
	PanelOtrazit.add(name);
	PanelOtrazit.add(znach);
	PanelOtrazit.add(knopka1);
	PanelOtrazit.add(knopka2);
	
	PanelOtrazit.add(fon);
	
}//

public JLabel vernut_znach() {
	return znach;
}//

public JLabel sozdatJLabel(String nameLab, String textLab, Dimension razmerLab) {
	JLabel lab = new JLabel("Логин");
	lab.setName(nameLab);
	lab.setText(textLab);
	lab.setSize(razmerLab);
	HM_lab.put(nameLab, lab);
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
public JLabel setRazmerSchrifta(JLabel lab, int razmFont) {
	//JLabel lab = new JLabel();
	Font font = new Font("Verdana", Font.PLAIN, razmFont);
	lab.setFont(font);
	return lab;
}//
public void setKorzina(Graf_JLable objGraf_JLable) {
	korzina = objGraf_JLable;
}//
public void sobitie_knopka1_2() {
	ustanovitMouseListener(knopka1);
	knopka1.putClientProperty("zadacha", "plus");
	ustanovitMouseListener(knopka2);
	knopka2.putClientProperty("zadacha", "minus");
}//
public void ustanovitMouseListener(JLabel lab) {
	MouseListener massMouseListener[] = lab.getMouseListeners();
	for(MouseListener objMouseListener: massMouseListener) {
		if(objMouseListener == this) {
			//System.out.println("В классе InterfisUpravFitBolist в методе ustanovitMouseListener");
			//System.out.println("Массив объектов событий в лабле " +  massMouseListener);
			return;
		}//
	}//
	lab.addMouseListener(this);
	//System.out.println("В классе InterfisUpravFitBolist в методе ustanovitMouseListener");
}//
public void vipolnit_plus(MouseEvent arg0) {
	JLabel labButt = (JLabel)arg0.getSource();
	String zadacha = (String)labButt.getClientProperty("zadacha");
	//System.out.println("В классе Graf_JLable в методе vipolnit_plus");
	//System.out.println("Задача " +  zadacha);
	if(zadacha.equals("plus") == false)return;
	JLabel korzina_znach = korzina.vernut_znach(); 
	HroniliheZnachenii korzina_h_znach = (HroniliheZnachenii)korzina_znach.getClientProperty("h_znach");
	int int_korzina_znach = korzina_h_znach.getZnachInt();
	if(int_korzina_znach <= 0)return;
	int_korzina_znach--;
	korzina_h_znach.setZnach(int_korzina_znach);
	korzina_znach.setText(korzina_h_znach.getZnachStr());
	HroniliheZnachenii h_znach = (HroniliheZnachenii)znach.getClientProperty("h_znach"); 
	int int_znach = h_znach.getZnachInt();
	int_znach++;
	h_znach.setZnach(int_znach);
	znach.setText(h_znach.getZnachStr());
}//
public void vipolnit_minus(MouseEvent arg0) {
	JLabel labButt = (JLabel)arg0.getSource();
	String zadacha = (String)labButt.getClientProperty("zadacha");
	//System.out.println("В классе Graf_JLable в методе vipolnit_minus");
	//System.out.println("Задача " +  zadacha);
	if(zadacha.equals("minus") == false)return;
	HroniliheZnachenii h_znach = (HroniliheZnachenii)znach.getClientProperty("h_znach"); 
	int int_znach = h_znach.getZnachInt();
	if(int_znach <= 0)return;
	int_znach--;
	h_znach.setZnach(int_znach);
	znach.setText(h_znach.getZnachStr());
	JLabel korzina_znach = korzina.vernut_znach(); 
	HroniliheZnachenii korzina_h_znach = (HroniliheZnachenii)korzina_znach.getClientProperty("h_znach");
	int int_korzina_znach = korzina_h_znach.getZnachInt();
	int_korzina_znach++;
	korzina_h_znach.setZnach(int_korzina_znach);
	korzina_znach.setText(korzina_h_znach.getZnachStr());
}//
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseDragged(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseClicked(MouseEvent arg0) {
	// TODO Auto-generated method stub
	//System.out.println("В классе Graf_JLable в методе ustanovitMouseListener");
	//System.out.println("Сработало событие  " +  arg0);
	vipolnit_plus(arg0);
	vipolnit_minus(arg0);
	
	PanelOtrazit.repaint();
}
@Override
public void mouseEntered(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent arg0) {
	// TODO Auto-generated method stub
	
}
}//public class Graf_JLable
