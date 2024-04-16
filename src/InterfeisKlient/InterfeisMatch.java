package InterfeisKlient;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import i_server_i_client.Futbolist;

public class InterfeisMatch {

InterfeisIgra PanelOtrazit;
ArrayList<JLabel> list_deistvie_obeKomandi_hozaeva = new ArrayList<>();
ArrayList<JLabel> list_deistvie_obeKomandi_gosti = new ArrayList<>();
ArrayList<Futbolist> list_Futbolist_hozaeva = new ArrayList<>();
ArrayList<Futbolist> list_Futbolist_gosti = new ArrayList<>();

public void ustanovitPanelOtrazit(InterfeisIgra PanelOtrazit) {
	this.PanelOtrazit = PanelOtrazit;
}//

public void otrazitMatch() {
	//System.out.println("В классе InterfeisMatch в методе narisovat_portrets_obe_komandy");
	//System.out.println("Длинна массива футболистов " + objFutbolist);
	JLabel lab_pole = PanelOtrazit.sozdatJLabel("pole", "", new Dimension(900, 450));
	lab_pole.setLocation(225, 110);
	PanelOtrazit.dobavKartinkaJLabel(lab_pole, "kartinki/pole.png", new Dimension(900, 450));
	PanelOtrazit.add(lab_pole);
	
	narisovat_tablo();
	otrazit_futbolist();
	narisovat_deistvie_obe_komandy();
	narisovat_portrets_obe_komandy();
	
	narisovatFutbolistUser();
	narisovatInercija();
	narisovatOtobrazitSobitija();
	
}//
public void narisovat_tablo() {
	JLabel lab_fonTablo = PanelOtrazit.sozdatJLabel("fonTablo", "", new Dimension(130, 70));
	lab_fonTablo.setLocation(610, 40);
	PanelOtrazit.dobavKartinkaJLabel(lab_fonTablo, "kartinki/white_kvadrat.png", new Dimension(130, 70));
	PanelOtrazit.add(lab_fonTablo);
	
	JLabel lab_vremja = PanelOtrazit.sozdatJLabel("vremja", "00:00", new Dimension(48, 23));
	lab_vremja.setLocation(655, 40);// размер лабле счета больше чем текст, текст не в центре лабле
	PanelOtrazit.add(lab_vremja, 0);
	
	Dimension d_schot = new Dimension(20, 40);
	JLabel lab_schotL1 = PanelOtrazit.sozdatJLabel("schotL1", "", new Dimension(d_schot));
	lab_schotL1.setLocation(615, 60);
	PanelOtrazit.dobavKartinkaJLabel(lab_schotL1, "kartinki/num_0.png", new Dimension(d_schot));
	PanelOtrazit.add(lab_schotL1, 0);
	JLabel lab_schotR1 = PanelOtrazit.sozdatJLabel("schotR1", "", new Dimension(d_schot));
	lab_schotR1.setLocation(635, 60);
	PanelOtrazit.dobavKartinkaJLabel(lab_schotR1, "kartinki/num_0.png", new Dimension(d_schot));
	PanelOtrazit.add(lab_schotR1, 0);
	
	JLabel lab_schotL2 = PanelOtrazit.sozdatJLabel("schotL2", "", new Dimension(d_schot));
	lab_schotL2.setLocation(695, 60);
	PanelOtrazit.dobavKartinkaJLabel(lab_schotL2, "kartinki/num_0.png", new Dimension(d_schot));
	PanelOtrazit.add(lab_schotL2, 0);
	JLabel lab_schotR2 = PanelOtrazit.sozdatJLabel("schotR2", "", new Dimension(d_schot));
	lab_schotR2.setLocation(715, 60);
	PanelOtrazit.dobavKartinkaJLabel(lab_schotR2, "kartinki/num_0.png", new Dimension(d_schot));
	PanelOtrazit.add(lab_schotR2, 0);
	
}//
public void otrazit_futbolist() {
	for(int i=0;i<11;i++) {
	Futbolist objFutbolist = new Futbolist();
	objFutbolist.ustanovitPanelOtrazit(PanelOtrazit);
	objFutbolist.narisovatFutbolist();
	list_Futbolist_hozaeva.add(objFutbolist);
	}//
	for(int i=0;i<11;i++) {
	Futbolist objFutbolist = new Futbolist();
	objFutbolist.ustanovitPanelOtrazit(PanelOtrazit);
	objFutbolist.narisovatFutbolist();
	list_Futbolist_gosti.add(objFutbolist);
	}//
}//
public void narisovat_deistvie_obe_komandy() {
	Point p_lab_kvadratIgrokiSobitie = new Point(20, 50);
	Dimension razmerLab = new Dimension(150, 46);
	for(int i=0;i<11;i++) {
		JLabel lab_kvadratIgrokiSobitie = PanelOtrazit.sozdatJLabel("kvadratIgrokiSobitie", "", razmerLab);
		lab_kvadratIgrokiSobitie.setLocation(p_lab_kvadratIgrokiSobitie);
		PanelOtrazit.dobavKartinkaJLabel(lab_kvadratIgrokiSobitie, "kartinki/white_kvadrat.png", razmerLab);
		PanelOtrazit.add(lab_kvadratIgrokiSobitie);
		list_deistvie_obeKomandi_hozaeva.add(lab_kvadratIgrokiSobitie);
		p_lab_kvadratIgrokiSobitie.y = lab_kvadratIgrokiSobitie.getY() + lab_kvadratIgrokiSobitie.getHeight() + 1;
	}//
	p_lab_kvadratIgrokiSobitie = new Point(1180, 50);
	for(int i=0;i<11;i++) {
		JLabel lab_kvadratIgrokiSobitie = PanelOtrazit.sozdatJLabel("kvadratIgrokiSobitie", "", razmerLab);
		lab_kvadratIgrokiSobitie.setLocation(p_lab_kvadratIgrokiSobitie);
		PanelOtrazit.dobavKartinkaJLabel(lab_kvadratIgrokiSobitie, "kartinki/white_kvadrat.png", razmerLab);
		PanelOtrazit.add(lab_kvadratIgrokiSobitie);
		list_deistvie_obeKomandi_gosti.add(lab_kvadratIgrokiSobitie);
		p_lab_kvadratIgrokiSobitie.y = lab_kvadratIgrokiSobitie.getY() + lab_kvadratIgrokiSobitie.getHeight() + 1;
	}//
}//
public void narisovat_portrets_obe_komandy() {
	int num = 0;
	for(JLabel lab_portret:list_deistvie_obeKomandi_hozaeva) {
		Futbolist objFutbolist = list_Futbolist_hozaeva.get(num);
		objFutbolist.narisovat_portret_futbolist(lab_portret);
		num++;
	}//
	num = 0;
	for(JLabel lab_portret:list_deistvie_obeKomandi_gosti) {
		Futbolist objFutbolist = list_Futbolist_gosti.get(num);
		objFutbolist.narisovat_portret_futbolist(lab_portret);
		num++;
	}//
}//
public void narisovatFutbolistUser() {
	Futbolist objFutbolist = new Futbolist();
	objFutbolist.ustanovitPanelOtrazit(PanelOtrazit);
	//objFutbolist.narisovat_futbolist_po_chastjam();Футболист по частям буду заниматься когда начну делать анимации 
	objFutbolist.futbolist_ustoichivost();
	objFutbolist.futbolist_borba();
	objFutbolist.futbolist_peremehenie();
	objFutbolist.futbolist_tehnika();
}//
public void narisovatInercija() {
	Dimension razmerLab = new Dimension(100, 16);
	JLabel lab_hkalaInercija = PanelOtrazit.sozdatJLabel("lab_hkalaInercija", "", razmerLab);
	lab_hkalaInercija.setLocation(590, 600);
	PanelOtrazit.dobavKartinkaJLabel(lab_hkalaInercija, "kartinki/hkala_inercija.png", razmerLab);
	PanelOtrazit.add(lab_hkalaInercija);
	
	Dimension razmerLab2 = new Dimension(6, 16);
	JLabel lab_polzunokInercija = PanelOtrazit.sozdatJLabel("lab_polzunokInercija", "", razmerLab2);
	lab_polzunokInercija.setLocation(640, 600);
	PanelOtrazit.dobavKartinkaJLabel(lab_polzunokInercija, "kartinki/vertikal_inercija.png", razmerLab);
	PanelOtrazit.add(lab_polzunokInercija, 0);
}//
public void narisovatOtobrazitSobitija() {
	Dimension razmerLab = new Dimension(450, 100);
	JLabel lab_fonSobitija = PanelOtrazit.sozdatJLabel("lab_fonSobitija", "", razmerLab);
	lab_fonSobitija.setLocation(700, 590);
	PanelOtrazit.dobavKartinkaJLabel(lab_fonSobitija, "kartinki/fon_sobitija.png", razmerLab);
	PanelOtrazit.add(lab_fonSobitija);
}//
}//
