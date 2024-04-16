package i_server_i_client;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JLabel;

import InterfeisKlient.InterfeisIgra;

public class Futbolist {

InterfeisIgra PanelOtrazit;
HashMap<String, HroniliheZnachenii> fizika = new HashMap();
HashMap<String, HroniliheZnachenii> tehnika = new HashMap();
	public Futbolist(){
		parametriFutbolist();
		tehnikaFutbolist();
	}//

public void parametriFutbolist() {
	//HashMap<String, HroniliheZnachenii> fizika = new HashMap();
	HroniliheZnachenii sila = new HroniliheZnachenii();
	sila.set_xmlName("sila");
	sila.setZnach(2);
	fizika.put("Сила", sila);
	HroniliheZnachenii skorost = new HroniliheZnachenii();
	skorost.set_xmlName("skorost");
	skorost.setZnach(2);
	fizika.put("Скорость", skorost);
	HroniliheZnachenii lovkost = new HroniliheZnachenii();
	lovkost.set_xmlName("lovkost");
	lovkost.setZnach(2);
	fizika.put("Ловкость", lovkost);
	HroniliheZnachenii bistrota = new HroniliheZnachenii();
	bistrota.set_xmlName("bistrota");
	bistrota.setZnach(2);
	fizika.put("Быстрота", bistrota);
	HroniliheZnachenii vinoslivost = new HroniliheZnachenii();
	vinoslivost.set_xmlName("vinoslivost");
	vinoslivost.setZnach(2);
	fizika.put("Выносливость", vinoslivost);
	HroniliheZnachenii intelekt = new HroniliheZnachenii();
	intelekt.set_xmlName("intelekt");
	intelekt.setZnach(2);
	fizika.put("Интеллект", intelekt);
}//
public HashMap<String, HroniliheZnachenii> vernutFizika(){
	return fizika;
}//
public void tehnikaFutbolist() {
	//HashMap<String, HroniliheZnachenii> tehnika = new HashMap();
	HroniliheZnachenii Korotki_pas = new HroniliheZnachenii();
	Korotki_pas.set_xmlName("Korotki_pas");
	Korotki_pas.setZnach(2);
	tehnika.put("Короткий пас", Korotki_pas);
	HroniliheZnachenii dlinPass = new HroniliheZnachenii();
	dlinPass.set_xmlName("dlinPass");
	dlinPass.setZnach(2);
	tehnika.put("Длинный пас", dlinPass);
	HroniliheZnachenii dribling = new HroniliheZnachenii();
	dribling.set_xmlName("dribling");
	dribling.setZnach(2);
	tehnika.put("Дриблинг", dribling);
	HroniliheZnachenii udar = new HroniliheZnachenii();
	udar.set_xmlName("udar");
	udar.setZnach(2);
	tehnika.put("Удар", udar);
	HroniliheZnachenii borba = new HroniliheZnachenii();
	borba.set_xmlName("borba");
	borba.setZnach(2);
	tehnika.put("Борьба", borba);
	HroniliheZnachenii igarGolovoi = new HroniliheZnachenii();
	igarGolovoi.set_xmlName("igarGolovoi");
	igarGolovoi.setZnach(2);
	tehnika.put("Игра головой", igarGolovoi);
	HroniliheZnachenii otbor = new HroniliheZnachenii();
	otbor.set_xmlName("otbor");
	otbor.setZnach(2);
	tehnika.put("Отбор", otbor);
	HroniliheZnachenii blok = new HroniliheZnachenii();
	blok.set_xmlName("blok");
	blok.setZnach(2);
	tehnika.put("Блок", blok);

}//
public HashMap<String, HroniliheZnachenii> vernutTehnika(){
	return tehnika;
}//
public void ustanovitPanelOtrazit(InterfeisIgra PanelOtrazit) {
	this.PanelOtrazit = PanelOtrazit;
}//
public void narisovatFutbolist() {
	JLabel lab_futbolis = PanelOtrazit.sozdatJLabel("futbolis", "", new Dimension(20, 20));
	lab_futbolis.setLocation(500, 300);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolis, "kartinki/futbolist.png", new Dimension(20, 20));
	PanelOtrazit.add(lab_futbolis, 0);
	
	JLabel lab_nomer =  PanelOtrazit.sozdatJLabel("nomer", "11", new Dimension(15, 15));
	Point p_lab_nomer = lab_futbolis.getLocation();
	p_lab_nomer.x = p_lab_nomer.x + 3;
	p_lab_nomer.y = p_lab_nomer.y + 3;
	lab_nomer.setLocation(p_lab_nomer);
	PanelOtrazit.add(lab_nomer, 0);
}//
public void narisovat_portret_futbolist(JLabel lab_gde_raspologit) {
	JLabel lab_portret_futbolist = PanelOtrazit.sozdatJLabel("portret_futbolist", "", new Dimension(20, 45));
	Point p_portret = lab_gde_raspologit.getLocation();
	lab_portret_futbolist.setLocation(p_portret);
	PanelOtrazit.dobavKartinkaJLabel(lab_portret_futbolist, "kartinki/portret_futbolist.png", new Dimension(20, 45));
	PanelOtrazit.add(lab_portret_futbolist, 0);
}//
public void narisovat_futbolist_po_chastjam() {
	JLabel lab_golova = PanelOtrazit.sozdatJLabel("golova", "", new Dimension(25, 25));
	lab_golova.setLocation(100, 540);
	PanelOtrazit.dobavKartinkaJLabel(lab_golova, "kartinki/futbolist_po_komponent/golova.png", new Dimension(25, 25));
	PanelOtrazit.add(lab_golova, 0);
	
	JLabel lab_futbolka = PanelOtrazit.sozdatJLabel("futbolka", "", new Dimension(35, 25));
	lab_futbolka.setLocation(100, 565);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolka, "kartinki/futbolist_po_komponent/futbolka.png", new Dimension(35, 35));
	PanelOtrazit.add(lab_futbolka, 0);
	
	JLabel lab_horti = PanelOtrazit.sozdatJLabel("horti", "", new Dimension(35, 25));
	lab_horti.setLocation(100, 610);
	PanelOtrazit.dobavKartinkaJLabel(lab_horti, "kartinki/futbolist_po_komponent/horti.png", new Dimension(25, 25));
	PanelOtrazit.add(lab_horti, 0);
	
	JLabel lab_left_bedro = PanelOtrazit.sozdatJLabel("left_bedro", "", new Dimension(15, 25));
	lab_left_bedro.setLocation(120, 635);
	PanelOtrazit.dobavKartinkaJLabel(lab_left_bedro, "kartinki/futbolist_po_komponent/left_bedro.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_left_bedro, 0);
	JLabel lab_right_bedro = PanelOtrazit.sozdatJLabel("right_bedro", "", new Dimension(15, 25));
	lab_right_bedro.setLocation(100, 635);
	PanelOtrazit.dobavKartinkaJLabel(lab_right_bedro, "kartinki/futbolist_po_komponent/left_bedro.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_right_bedro, 0);
	
	JLabel lab_left_golen = PanelOtrazit.sozdatJLabel("left_golen", "", new Dimension(15, 25));
	lab_left_golen.setLocation(120, 665);
	PanelOtrazit.dobavKartinkaJLabel(lab_left_golen, "kartinki/futbolist_po_komponent/left_golen.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_left_golen, 0);
	JLabel lab_right_golen = PanelOtrazit.sozdatJLabel("right_golen", "", new Dimension(15, 25));
	lab_right_golen.setLocation(100, 665);
	PanelOtrazit.dobavKartinkaJLabel(lab_right_golen, "kartinki/futbolist_po_komponent/left_golen.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_right_golen, 0);
	
	JLabel lab_left_plech = PanelOtrazit.sozdatJLabel("left_plech", "", new Dimension(15, 25));
	lab_left_plech.setLocation(135, 565);
	PanelOtrazit.dobavKartinkaJLabel(lab_left_plech, "kartinki/futbolist_po_komponent/left_plech.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_left_plech, 0);
	JLabel lab_right_plech = PanelOtrazit.sozdatJLabel("right_plech", "", new Dimension(15, 25));
	lab_right_plech.setLocation(85, 565);
	PanelOtrazit.dobavKartinkaJLabel(lab_right_plech, "kartinki/futbolist_po_komponent/left_plech.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_right_plech, 0);
	
	JLabel lab_left_pred_pleche = PanelOtrazit.sozdatJLabel("left_pred_pleche", "", new Dimension(15, 25));
	lab_left_pred_pleche.setLocation(135, 590);
	PanelOtrazit.dobavKartinkaJLabel(lab_left_pred_pleche, "kartinki/futbolist_po_komponent/left_pred_pleche.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_left_pred_pleche, 0);
	JLabel lab_right_pred_pleche = PanelOtrazit.sozdatJLabel("right_pred_pleche", "", new Dimension(15, 25));
	lab_right_pred_pleche.setLocation(85, 590);
	PanelOtrazit.dobavKartinkaJLabel(lab_right_pred_pleche, "kartinki/futbolist_po_komponent/left_pred_pleche.png", new Dimension(15, 25));
	PanelOtrazit.add(lab_right_pred_pleche, 0);
}//
public void futbolist_ustoichivost() {
	Dimension razmerLab = new Dimension(25, 65);
	JLabel lab_futbolistUstoichevost = PanelOtrazit.sozdatJLabel("lab_futbolistUstoichevost", "", razmerLab);
	lab_futbolistUstoichevost.setLocation(320, 570);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolistUstoichevost, "kartinki/futbolist_ustoichivost.png", razmerLab);
	PanelOtrazit.add(lab_futbolistUstoichevost);
	
	Point p_pokazatel = new Point(310, 590);
	narisovat_kartochka_lovkost(p_pokazatel);
	Point p_kartochka10 = new Point(310, 605);
	narisovat_kartochka_lovkost(p_kartochka10);
	Point p_kartochka9 = new Point(310, 620);
	narisovat_kartochka_lovkost(p_kartochka9);
	
	Point p_kartochka8 = new Point(310, 635);
	narisovat_kartochka_lovkost(p_kartochka8);
	Point p_kartochka7 = new Point(325, 635);
	narisovat_kartochka_lovkost(p_kartochka7);
	Point p_kartochka6 = new Point(340, 635);
	narisovat_kartochka_lovkost(p_kartochka6);
	Point p_kartochka5 = new Point(355, 635);
	narisovat_kartochka_lovkost(p_kartochka5);
	
	Point p_kartochka4 = new Point(310, 650);
	narisovat_kartochka_lovkost(p_kartochka4);
	Point p_kartochka3 = new Point(325, 650);
	narisovat_kartochka_lovkost(p_kartochka3);
	Point p_kartochka2 = new Point(340, 650);
	narisovat_kartochka_lovkost(p_kartochka2);
	Point p_kartochka1 = new Point(355, 650);
	narisovat_kartochka_lovkost(p_kartochka1);
}//
public void futbolist_borba() {
	Dimension razmerLab = new Dimension(25, 65);
	JLabel lab_futbolistBorba = PanelOtrazit.sozdatJLabel("lab_futbolistBorba", "", razmerLab);
	lab_futbolistBorba.setLocation(380, 570);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolistBorba, "kartinki/futbolist_borba.png", razmerLab);
	PanelOtrazit.add(lab_futbolistBorba);
}//
public void futbolist_peremehenie() {
	Dimension razmerLab = new Dimension(25, 65);
	JLabel lab_futbolistPeremehenie = PanelOtrazit.sozdatJLabel("lab_futbolistPeremehenie", "", razmerLab);
	lab_futbolistPeremehenie.setLocation(440, 570);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolistPeremehenie, "kartinki/futbolist_peremehenie.png", razmerLab);
	PanelOtrazit.add(lab_futbolistPeremehenie);
}//
public void futbolist_tehnika() {
	Dimension razmerLab = new Dimension(25, 65);
	JLabel lab_futbolistTehnika = PanelOtrazit.sozdatJLabel("lab_futbolistTehnika", "", razmerLab);
	lab_futbolistTehnika.setLocation(510, 570);
	PanelOtrazit.dobavKartinkaJLabel(lab_futbolistTehnika, "kartinki/futbolist_tehnika.png", razmerLab);
	PanelOtrazit.add(lab_futbolistTehnika);
}//
public void narisovat_kartochka_lovkost(Point p) {
	Dimension razmerLab = new Dimension(10, 18);
	JLabel lab_kartochkaLovkost = PanelOtrazit.sozdatJLabel("lab_kartochkaLovkost", "", razmerLab);
	lab_kartochkaLovkost.setLocation(p);
	PanelOtrazit.dobavKartinkaJLabel(lab_kartochkaLovkost, "kartinki/kartochka_lovkost.png", razmerLab);
	PanelOtrazit.add(lab_kartochkaLovkost);
}//
}//
