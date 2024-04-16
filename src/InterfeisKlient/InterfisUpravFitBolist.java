package InterfeisKlient;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JTextField;

import i_server_i_client.Futbolist;
import i_server_i_client.HroniliheZnachenii;
import i_server_i_client.User;

public class InterfisUpravFitBolist implements MouseListener, MouseMotionListener, ActionListener{
InterfeisIgra PanelOtrazit;
User user;
ArrayList<JLabel> elementInterfeis = new ArrayList();

public void ustanovitPanelOtrazit(InterfeisIgra PanelOtrazit) {
	this.PanelOtrazit = PanelOtrazit;
}//
public void ustanovitUser(User user) {
	this.user = user;
}//
public void testPanel() {
	JLabel lab_fonTablo = PanelOtrazit.sozdatJLabel("fonTablo", "PanelOtrazitUpravFitBolist", new Dimension(300, 50));
	PanelOtrazit.dobavKartinkaJLabel(lab_fonTablo, "kartinki/white_kvadrat.png", new Dimension(130, 70));
	lab_fonTablo.setLocation(10, 10);
	//lab_fonTablo.PanelOtrazit.add(lab_fonTablo);
	
	String str_userNikName = user.userNikName.getZnachStr();
	String userDeistvie = user.userDeistvie;
	System.out.println("В классе InterfisUpravFitBolist в методе  testPanel");
	System.out.println("Юзер в управлении юзера " + str_userNikName);
}//
public void narisovatSozdatNewFutbolist() {
	test222();
	Futbolist objFutbolist = new Futbolist();
	HashMap<String, HroniliheZnachenii> fizika = objFutbolist.vernutFizika();
	HashMap<String, HroniliheZnachenii> tehnika = objFutbolist.vernutTehnika(); 
	Dimension r_name_famelija = new Dimension(200, 20);
	
	JTextField NameFutbolist = new JTextField(20);
	NameFutbolist.setText("Имя футболиста");
	NameFutbolist.setName("NameFutbolist");
	NameFutbolist.setSize(r_name_famelija);
	NameFutbolist.setLocation(30, 50);
	PanelOtrazit.add(NameFutbolist);
	JTextField fameloFutbolist = new JTextField(20);
	fameloFutbolist.setText("Фамелия футболиста");
	fameloFutbolist.setName("fameloFutbolist");
	fameloFutbolist.setSize(r_name_famelija);
	fameloFutbolist.setLocation(250, 50);
	PanelOtrazit.add(fameloFutbolist);
	
	Dimension r_vnehVidFutbolist = new Dimension(100, 150); 
	JLabel lab_vnehVidFutbolist = PanelOtrazit.sozdatJLabel("lab_vnehVidFutbolist", "", r_vnehVidFutbolist);
	PanelOtrazit.dobavKartinkaJLabel(lab_vnehVidFutbolist, "kartinki/futbolist_ustoichivost.png", r_vnehVidFutbolist);
	lab_vnehVidFutbolist.setLocation(30, 100);
	PanelOtrazit.add(lab_vnehVidFutbolist);
	
		
	Dimension r_fizKach = new Dimension(90, 20);
	Dimension r_znach = new Dimension(20, 20);
	Dimension r_knop = new Dimension(20, 20);
	Point p_nacKor = new Point(160, 90);
	Point p_pokazatel = new Point(160, 110); //Point p_pokazatel = new Point(160, 90);
	Point p_znach = new Point(270, 110);
	Point p_plus = new Point(290, 110);
	Point p_minus = new Point(320, 110);
	int step_niz = 20;
	Point p_fizikaPoint = new Point(160, 90);
	
	Dimension d_fizikaPoint = new Dimension(150, 20);
	Dimension d_fizikaPoint_znach = new Dimension(50, 20);
	Point p_fizikaPoint_znach = new Point(); p_fizikaPoint_znach.x = p_fizikaPoint.x; p_fizikaPoint_znach.y = p_fizikaPoint.y;
	p_fizikaPoint_znach.x = p_fizikaPoint_znach.x + d_fizikaPoint.width;
	JLabel lab_fizikaPoint = PanelOtrazit.sozdatJLabel("lab_fizikaPoint", "Физическое развитие", d_fizikaPoint);
	lab_fizikaPoint.setLocation(p_fizikaPoint);
	PanelOtrazit.add(lab_fizikaPoint);
	HroniliheZnachenii hron_fizikaPoint_znach = new HroniliheZnachenii();
	hron_fizikaPoint_znach.set_xmlName("hron_fizikaPoint_znach");
	hron_fizikaPoint_znach.setZnach(10);
	String str_fizikaPoint_znach = hron_fizikaPoint_znach.getZnachStr();
	JLabel lab_fizikaPoint_znach = PanelOtrazit.sozdatJLabel("lab_fizikaPoint_znach", str_fizikaPoint_znach, d_fizikaPoint_znach);
	lab_fizikaPoint_znach.setLocation(p_fizikaPoint_znach);
	lab_fizikaPoint_znach.putClientProperty("hron", hron_fizikaPoint_znach);
	PanelOtrazit.add(lab_fizikaPoint_znach);
	
	Dimension r_pokazatel = new Dimension(90, 20);
	Set<String> keyMass = fizika.keySet();
	for(String nameKey: keyMass) {
		HroniliheZnachenii pokazatel = fizika.get(nameKey);
		JLabel lab_pokazatel = PanelOtrazit.sozdatJLabel("lab_" + nameKey, nameKey, r_pokazatel);
		lab_pokazatel.setLocation(p_pokazatel);
		p_pokazatel.y = p_pokazatel.y + step_niz;
		PanelOtrazit.add(lab_pokazatel);
		JLabel lab_znach = PanelOtrazit.sozdatJLabel("lab_znach_" + nameKey , pokazatel.getZnachStr(), r_znach);
		lab_znach.setLocation(p_znach);
		p_znach.y = p_znach.y + step_niz;
		PanelOtrazit.add(lab_znach);
		
		JLabel lab_plus_pokazatel = PanelOtrazit.sozdatJLabel("lab_plus_" + nameKey, "", r_knop);
		PanelOtrazit.dobavKartinkaJLabel(lab_plus_pokazatel, "kartinki/knopka_plus.png", r_knop);
		lab_plus_pokazatel.setLocation(p_plus);
		p_plus.y = p_plus.y + step_niz;
		lab_plus_pokazatel.putClientProperty("class_key", "plus");
		lab_plus_pokazatel.putClientProperty("pokazatel", fizika);
		lab_plus_pokazatel.putClientProperty("znach", lab_znach);
		lab_plus_pokazatel.putClientProperty("nameKey", nameKey);
		lab_plus_pokazatel.putClientProperty("korzinaPoint", lab_fizikaPoint_znach);
		PanelOtrazit.add(lab_plus_pokazatel);
		ustanovitMouseListener(lab_plus_pokazatel);
		
		JLabel lab_minus_pokazatel = PanelOtrazit.sozdatJLabel("lab_minus_" + nameKey, "", r_knop);
		PanelOtrazit.dobavKartinkaJLabel(lab_minus_pokazatel, "kartinki/knopka_minus.png", r_knop);
		lab_minus_pokazatel.setLocation(p_minus);
		p_minus.y = p_minus.y + step_niz;
		lab_minus_pokazatel.putClientProperty("class_key", "minus");
		lab_minus_pokazatel.putClientProperty("pokazatel", fizika);
		lab_minus_pokazatel.putClientProperty("znach", lab_znach);
		lab_minus_pokazatel.putClientProperty("nameKey", nameKey);
		lab_minus_pokazatel.putClientProperty("korzinaPoint", lab_fizikaPoint_znach);
		PanelOtrazit.add(lab_minus_pokazatel);
		ustanovitMouseListener(lab_minus_pokazatel);
	}//
	
	Dimension d_lab_korzina_tehnika = new Dimension(150, 20);
	Point p_lab_korzina_tehnika = new Point(400, 90);
	JLabel lab_korzina_tehnika = PanelOtrazit.sozdatJLabel("lab_korzina_tehnika", "Тнхническое развитие", d_lab_korzina_tehnika);
	lab_korzina_tehnika.setLocation(p_lab_korzina_tehnika);
	PanelOtrazit.add(lab_korzina_tehnika);
	HroniliheZnachenii hron_tehnikaPoint_znach = new HroniliheZnachenii();
	hron_tehnikaPoint_znach.set_xmlName("Тнхническое развитие");
	hron_tehnikaPoint_znach.setZnach(10);
	String str_lab_korzina_tehnika_znac = hron_tehnikaPoint_znach.getZnachStr(); 
	Dimension d_lab_korzina_tehnika_znac = new Dimension(20, 20);
	Point p_lab_korzina_tehnika_znac = new Point(400, 90);
	p_lab_korzina_tehnika_znac.x = p_lab_korzina_tehnika.x + d_lab_korzina_tehnika.width;  
	JLabel lab_korzina_tehnika_znac = PanelOtrazit.sozdatJLabel("lab_korzina_tehnika", str_lab_korzina_tehnika_znac, d_lab_korzina_tehnika_znac);
	lab_korzina_tehnika_znac.setLocation(p_lab_korzina_tehnika_znac);
	lab_korzina_tehnika_znac.putClientProperty("hron", hron_tehnikaPoint_znach);
	PanelOtrazit.add(lab_korzina_tehnika_znac);
	
	Point p_tehnika = new Point(400, 110);
	Point p_znach_tehnika = new Point(400, 110); p_znach_tehnika.x = (int)(p_znach_tehnika.getX() + r_fizKach.getWidth());
	Point p_tehnika_plus = new Point(400, 110); p_tehnika_plus.x = p_znach_tehnika.x + r_znach.width;
	Point p_tehnika_minus = new Point(400, 110); p_tehnika_minus.x = p_tehnika_plus.x + r_knop.width + 10;
	int tehnika_step_niz = 20;
	
	Set<String> keyMass_tehnika = tehnika.keySet();
	System.out.println("В классе InterfisUpravFitBolist в методе  narisovatSozdatNewFutbolist");
	System.out.println("Массив ключей техника  " + keyMass_tehnika);
	for(String nameKey: keyMass_tehnika) {
		HroniliheZnachenii pokazatel = tehnika.get(nameKey);
		JLabel lab_pokazatel = PanelOtrazit.sozdatJLabel("lab_" + nameKey, nameKey, r_fizKach);
		//lab_pokazatel.setLocation(p_pokazatel);
		lab_pokazatel.setLocation(p_tehnika);
		p_tehnika.y = p_tehnika.y + tehnika_step_niz;
		PanelOtrazit.add(lab_pokazatel);
		JLabel lab_znach = PanelOtrazit.sozdatJLabel("lab_znach_" + nameKey , pokazatel.getZnachStr(), r_znach);
		lab_znach.setLocation(p_znach_tehnika);
		p_znach_tehnika.y = p_znach_tehnika.y + tehnika_step_niz;
		PanelOtrazit.add(lab_znach);
		
		JLabel lab_plus_pokazatel = PanelOtrazit.sozdatJLabel("lab_plus_" + nameKey, "", r_knop);
		PanelOtrazit.dobavKartinkaJLabel(lab_plus_pokazatel, "kartinki/knopka_plus.png", r_knop);
		lab_plus_pokazatel.setLocation(p_tehnika_plus);
		p_tehnika_plus.y = p_tehnika_plus.y + tehnika_step_niz;
		lab_plus_pokazatel.putClientProperty("class_key", "plus");
		lab_plus_pokazatel.putClientProperty("pokazatel", tehnika);
		lab_plus_pokazatel.putClientProperty("znach", lab_znach);
		lab_plus_pokazatel.putClientProperty("nameKey", nameKey);
		lab_plus_pokazatel.putClientProperty("korzinaPoint", lab_korzina_tehnika_znac);
		PanelOtrazit.add(lab_plus_pokazatel, 0);
		ustanovitMouseListener(lab_plus_pokazatel);
		
		JLabel lab_minus_pokazatel = PanelOtrazit.sozdatJLabel("lab_minus_" + nameKey, "", r_knop);
		PanelOtrazit.dobavKartinkaJLabel(lab_minus_pokazatel, "kartinki/knopka_minus.png", r_knop);
		lab_minus_pokazatel.setLocation(p_tehnika_minus);
		p_tehnika_minus.y = p_tehnika_minus.y + tehnika_step_niz;
		lab_minus_pokazatel.putClientProperty("class_key", "minus");
		lab_minus_pokazatel.putClientProperty("pokazatel", tehnika);
		lab_minus_pokazatel.putClientProperty("znach", lab_znach);
		lab_minus_pokazatel.putClientProperty("nameKey", nameKey);
		lab_minus_pokazatel.putClientProperty("korzinaPoint", lab_korzina_tehnika_znac);
		PanelOtrazit.add(lab_minus_pokazatel);
		ustanovitMouseListener(lab_minus_pokazatel);
	}//
	
	JLabel lab_Osobinost1 = PanelOtrazit.sozdatJLabel("lab_Osobinost1", "Особинность 1", r_fizKach);
	lab_Osobinost1.setLocation(600, 90);
	PanelOtrazit.add(lab_Osobinost1);
	JLabel lab_Osobinost2 = PanelOtrazit.sozdatJLabel("lab_Osobinost2", "Скорость", r_fizKach);
	lab_Osobinost2.setLocation(600, 110);
	PanelOtrazit.add(lab_Osobinost2);
	JLabel lab_Osobinost3 = PanelOtrazit.sozdatJLabel("lab_Osobinost3", "Ловкость", r_fizKach);
	lab_Osobinost3.setLocation(600, 130);
	PanelOtrazit.add(lab_Osobinost3);
	JLabel lab_Osobinost4 = PanelOtrazit.sozdatJLabel("lab_Osobinost4", "Быстрота", r_fizKach);
	lab_Osobinost4.setLocation(600, 150);
	PanelOtrazit.add(lab_Osobinost4);
	JLabel lab_Osobinost5 = PanelOtrazit.sozdatJLabel("lab_Osobinost5", "Выносливость", r_fizKach);
	lab_Osobinost5.setLocation(600, 170);
	PanelOtrazit.add(lab_Osobinost5);
	JLabel lab_Osobinost6 = PanelOtrazit.sozdatJLabel("lab_Osobinost6", "Особинность 6", r_fizKach);
	lab_Osobinost6.setLocation(600, 190);
	PanelOtrazit.add(lab_Osobinost6);
	
	Graf_JLable korzina_taktika = new Graf_JLable();
	Dimension r_korzina_taktika = new Dimension(170, 20);
	Dimension r_korzina_taktika_znach = new Dimension(20, 20);
	korzina_taktika.ustanovitName("Тактическое мастерство", r_korzina_taktika, 12);
	korzina_taktika.ustanovitZnach("5", r_korzina_taktika_znach, 12);
	korzina_taktika.razmestit_linija(160, 290);
	
	korzina_taktika.otrazitElement(PanelOtrazit);
	
	Dimension r_Poz_name = new Dimension(25, 20);
	Dimension r_Poz_znach = new Dimension(20, 20);
	Dimension r_Poz_fon = new Dimension(100, 100);
	Dimension r_knopkaPoz = new Dimension(20, 20);
	Graf_JLable LD = new Graf_JLable();
	//Dimension r_LD_name = new Dimension(25, 20);
	LD.ustanovitName("ЛЗ", r_Poz_name, 15);
	//Dimension r_LD_znach = new Dimension(20, 20);
	LD.ustanovitZnach("0", r_Poz_znach, 15);
	//Dimension r_LD_fon = new Dimension(100, 100);
	LD.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	//Dimension r_knopka1 = new Dimension(20, 20);
	LD.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	LD.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	LD.razmestitKvadrat(100, 320);
	LD.otrazitElement(PanelOtrazit);
	LD.setKorzina(korzina_taktika);
	LD.sobitie_knopka1_2();
	LD.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable CD = new Graf_JLable();
	CD.ustanovitName("ЦЗ", r_Poz_name, 15);
	CD.ustanovitZnach("0", r_Poz_znach, 15);
	CD.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	CD.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	CD.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	CD.razmestitKvadrat(100, 430);
	CD.otrazitElement(PanelOtrazit);
	CD.setKorzina(korzina_taktika);
	CD.sobitie_knopka1_2();
	CD.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable RD = new Graf_JLable();
	RD.ustanovitName("ПЗ", r_Poz_name, 15);
	RD.ustanovitZnach("0", r_Poz_znach, 15);
	RD.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	RD.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	RD.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	RD.razmestitKvadrat(100, 540);
	RD.otrazitElement(PanelOtrazit);
	RD.setKorzina(korzina_taktika);
	RD.sobitie_knopka1_2();
	RD.ustanovitPanelOtrazit(PanelOtrazit);
	
	Graf_JLable LM = new Graf_JLable();
	LM.ustanovitName("ЛП", r_Poz_name, 15);
	LM.ustanovitZnach("0", r_Poz_znach, 15);
	LM.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	LM.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	LM.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	LM.razmestitKvadrat(350, 320);
	LM.otrazitElement(PanelOtrazit);
	LM.setKorzina(korzina_taktika);
	LM.sobitie_knopka1_2();
	LM.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable CM = new Graf_JLable();
	CM.ustanovitName("ЦП", r_Poz_name, 15);
	CM.ustanovitZnach("0", r_Poz_znach, 15);
	CM.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	CM.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	CM.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	CM.razmestitKvadrat(350, 430);
	CM.otrazitElement(PanelOtrazit);
	CM.setKorzina(korzina_taktika);
	CM.sobitie_knopka1_2();
	CM.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable RM = new Graf_JLable();
	RM.ustanovitName("ПП", r_Poz_name, 15);
	RM.ustanovitZnach("0", r_Poz_znach, 15);
	RM.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	RM.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	RM.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	RM.razmestitKvadrat(350, 540);
	RM.otrazitElement(PanelOtrazit);
	RM.setKorzina(korzina_taktika);
	RM.sobitie_knopka1_2();
	RM.ustanovitPanelOtrazit(PanelOtrazit);
	
	Graf_JLable LF = new Graf_JLable();
	LF.ustanovitName("ЛН", r_Poz_name, 15);
	LF.ustanovitZnach("0", r_Poz_znach, 15);
	LF.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	LF.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	LF.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	LF.razmestitKvadrat(600, 320);
	LF.otrazitElement(PanelOtrazit);
	LF.setKorzina(korzina_taktika);
	LF.sobitie_knopka1_2();
	LF.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable CF = new Graf_JLable();
	CF.ustanovitName("ЦН", r_Poz_name, 15);
	CF.ustanovitZnach("0", r_Poz_znach, 15);
	CF.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	CF.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	CF.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	CF.razmestitKvadrat(600, 430);
	CF.otrazitElement(PanelOtrazit);
	CF.setKorzina(korzina_taktika);
	CF.sobitie_knopka1_2();
	CF.ustanovitPanelOtrazit(PanelOtrazit);
	Graf_JLable RF = new Graf_JLable();
	RF.ustanovitName("ПН", r_Poz_name, 15);
	RF.ustanovitZnach("0", r_Poz_znach, 15);
	RF.ustanovitFon("kartinki/fon_kvadrat.png", r_Poz_fon);
	RF.ustanovitKnopka1("kartinki/knopka_plus.png", r_knopkaPoz);
	RF.ustanovitKnopka2("kartinki/knopka_minus.png", r_knopkaPoz);
	RF.razmestitKvadrat(600, 540);
	RF.otrazitElement(PanelOtrazit);
	RF.setKorzina(korzina_taktika);
	RF.sobitie_knopka1_2();
	RF.ustanovitPanelOtrazit(PanelOtrazit);
	
	Graf_JLable knop_sozdat = new Graf_JLable();
	Dimension razm_name_knop_sozdat = new Dimension(85, 40);
	knop_sozdat.ustanovitName("Создать", razm_name_knop_sozdat, 20);
	Dimension razm_knop_sozdat = new Dimension(91, 50);
	knop_sozdat.ustanovitFon("kartinki/fon_kvadrat.png", razm_knop_sozdat);
	//knop_sozdat.razmestit_linija(1200, 640);
	knop_sozdat.razmestit_odna_knopka(1200, 600);
	knop_sozdat.ustanovitPanelOtrazit(PanelOtrazit);
	knop_sozdat.otrazitElement(PanelOtrazit);
	
	
	Dimension r_pole = new Dimension(700, 350);
	JLabel lab_pole = PanelOtrazit.sozdatJLabel("pole", "", new Dimension(r_pole));
	lab_pole.setLocation(50, 300);
	PanelOtrazit.dobavKartinkaJLabel(lab_pole, "kartinki/pole.png", new Dimension(r_pole));
	PanelOtrazit.add(lab_pole);
	
	
	
}//
public void test222() {
	for(int i=2; i<= 50; i++) {
	Boolean isPrime = true;
	for(int j=2; j<i;j++) {
		if(i % j ==0 ) {
			isPrime = false;
			break;
		}//
	}//
	if(isPrime) {
		//System.out.println(i);
	}//
	}
	int a=0;
	int b=1;
	int c=1;
	for(int i=1;i <= 5; i++) {
		//System.out.println(a + ", ");
		a=b;
		b=c;
		c=a+b;
				
	}//
	for(int i= 10;i<20; i+=3) {
		if(i>15) {
			//System.out.println(i);
		}//
	}//
	int  f=4;
	int result = 1;
	for(int i =1; i<=f; i++) {
		result = result * i;
	}//
	//System.out.println(result);
}

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
	obrabotat_mouseClicked(arg0);
	
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

public void obrabotat_mouseClicked(MouseEvent arg0) {
	JLabel labButt = (JLabel)arg0.getSource();
	obrabotat_pokazatel_plus(labButt);
	obrabotat_pokazatel_minus(labButt);
	PanelOtrazit.repaint();
}//
public void obrabotat_pokazatel_plus(JLabel labButt) {
	String class_key = (String)labButt.getClientProperty("class_key");
	if(class_key.equals("plus") != true) {
		return;
	}//
	JLabel lab_fizikaPoint_znach = (JLabel)labButt.getClientProperty("korzinaPoint");
	if(lab_fizikaPoint_znach != null) {
	HroniliheZnachenii hron = (HroniliheZnachenii) lab_fizikaPoint_znach.getClientProperty("hron");
	int num_hron = hron.getZnachInt(); 
	if(num_hron == 0) return;
	num_hron--;
	hron.setZnach(num_hron);
	lab_fizikaPoint_znach.setText(hron.getZnachStr());
	}//
	HashMap<String, HroniliheZnachenii> pokazatel = (HashMap<String, HroniliheZnachenii>)labButt.getClientProperty("pokazatel");
	JLabel znach = (JLabel)labButt.getClientProperty("znach");
	String nameKey = (String)labButt.getClientProperty("nameKey");
	int znach_i = pokazatel.get(nameKey).getZnachInt();
	znach_i = znach_i +1;
	pokazatel.get(nameKey).setZnach(znach_i);
	znach.setText(pokazatel.get(nameKey).getZnachStr());
	System.out.println("В классе InterfisUpravFitBolist в методе obrabotat_pokazatel_plus");
	System.out.println("Событие сработала " + lab_fizikaPoint_znach);
}//
public void obrabotat_pokazatel_minus(JLabel labButt) {
	String class_key = (String)labButt.getClientProperty("class_key");
	if(class_key.equals("minus") != true) {
		return;
	}//
	HashMap<String, HroniliheZnachenii> pokazatel = (HashMap<String, HroniliheZnachenii>)labButt.getClientProperty("pokazatel");
	JLabel znach = (JLabel)labButt.getClientProperty("znach");
	String nameKey = (String)labButt.getClientProperty("nameKey");
	int znach_i = pokazatel.get(nameKey).getZnachInt();
	if(znach_i == 1) return;
	znach_i = znach_i - 1;
	pokazatel.get(nameKey).setZnach(znach_i);
	znach.setText(pokazatel.get(nameKey).getZnachStr());
	JLabel lab_fizikaPoint_znach = (JLabel)labButt.getClientProperty("korzinaPoint");
	if(lab_fizikaPoint_znach != null) {
	HroniliheZnachenii hron = (HroniliheZnachenii) lab_fizikaPoint_znach.getClientProperty("hron");
	int num_hron = hron.getZnachInt(); 
	num_hron++;
	hron.setZnach(num_hron);
	lab_fizikaPoint_znach.setText(hron.getZnachStr());
	}//
	System.out.println("В классе InterfisUpravFitBolist в методе obrabotat_pokazatel_minus");
	System.out.println("Событие сработала " + znach);
}//

}//public class InterfisUpravFitBolist {
