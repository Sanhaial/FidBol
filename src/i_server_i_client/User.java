package i_server_i_client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class User implements Serializable{
	public HroniliheZnachenii login_user = new  HroniliheZnachenii();
	public HroniliheZnachenii user_pasword = new  HroniliheZnachenii();
	public HroniliheZnachenii userNikName = new  HroniliheZnachenii();
	public String userDeistvie = "";
	ArrayList<HroniliheZnachenii> listAtribute = new ArrayList<>();
	public Object objDljaPeredat;
	
	
	 public User(){
		 ustanovitXMLname();
	 }//public User(){

public void ustanovitXMLname(){
	login_user.xmlName = "login_user"; listAtribute.add(login_user);
	
	user_pasword.xmlName = "user_pasword"; listAtribute.add(user_pasword);
	userNikName.xmlName = "userNikName"; listAtribute.add(userNikName);
	
}//public void ustanovitXMLname(){

public Document get_Document_v3(){
	Document document = null;
	try {
		document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element element = document.createElement("userRoot");
		document.appendChild(element);
		dobavElementDok_v3(document, element);
		//dobavElementDok(document, root);
	}//try { 
	catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}//catch (ParserConfigurationException e) {
	return document;
}//public Document get_Document_v2(){
public void dobavElementDok_v3(Document document, Element element){
	Element rootElement = document.getDocumentElement();
		
	Element element1 = document.createElement("user");
		for(HroniliheZnachenii objHroniliheZnachenii: listAtribute){
			String name = objHroniliheZnachenii.xmlName;
			String value = objHroniliheZnachenii.getZnachStr();
			element1.setAttribute(name, value);
			//element1.setAttribute(tagName, listPeremenie_dlja_xml.get(tagName).getZnachStr());
		}//for(HroniliheZnachenii objHroniliheZnachenii: listAtribute){
	
		
	element.appendChild(element1);
		
}//public void dobavElementDok(Document document, Element element){
public void set_node_iz_xml(Node item){
	if(item.getNodeName().equals("user") != true){
		return;
	}//if(item.getNodeName().equals("PanelUnitSuit") != true){
	//System.out.println("В классе User в методе set_node_iz_xml");
	//System.out.println("Проверка пройдена " );
	NamedNodeMap atributes = item.getAttributes();
	for(HroniliheZnachenii objHroniliheZnachenii: listAtribute){
		String znach = atributes.getNamedItem(objHroniliheZnachenii.xmlName).getNodeValue();
		objHroniliheZnachenii.setZnach(znach);
	}//
}//public void set_node_iz_xml(Node item){
public Boolean proverUserSovpadenieRegestracija(User provUser){
	Boolean flagProvUser = false;
	String login_user = provUser.login_user.getZnachStr();
	String user_pasword = provUser.user_pasword.getZnachStr();
	String userNikName = provUser.userNikName.getZnachStr();
	if(this.login_user.getZnachStr().equals(login_user)){
		flagProvUser = true;
	}//
	if(this.user_pasword.getZnachStr().equals(user_pasword)){
		flagProvUser = true;
	}//
	if(this.userNikName.getZnachStr().equals(userNikName)){
		flagProvUser = true;
	}//
	return flagProvUser;
}//public Boolean proverUserSovpadenieRegestracija(User provUser){
public Boolean prover_loginUser(User provUser) {
	Boolean flagProvUser = false;
	String login_user = provUser.login_user.getZnachStr();
	if(this.login_user.getZnachStr().equals(login_user)){
		flagProvUser = true;
	}//
	return flagProvUser;
}//
public Boolean prover_user_pasword(User provUser) {
	Boolean flagProvUser = false;
	String user_pasword = provUser.user_pasword.getZnachStr();
	if(this.user_pasword.getZnachStr().equals(user_pasword)){
		flagProvUser = true;
	}//
	return flagProvUser;
}//
public Boolean prover_userNikName(User provUser) {
	Boolean flagProvUser = false;
	String userNikName = provUser.userNikName.getZnachStr();
	if(this.userNikName.getZnachStr().equals(userNikName)){
		flagProvUser = true;
	}//
	return flagProvUser;
}//
}//public class User implements Serializable{
