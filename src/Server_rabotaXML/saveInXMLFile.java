package Server_rabotaXML;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class saveInXMLFile {
	String dopDir = "";
public saveInXMLFile(){
System.out.println("�������� ����� saveInXMLFile ��� ������ � XML ����");		
}//saveInXMLFile(){
	
public void ispolnitZapis(Document document, String nameFile){
	try{
	/*	
	Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
	Element company = document.createElement("company");
	document.appendChild(company);
	*/
	Transformer transform = TransformerFactory.newInstance().newTransformer();
	DOMSource source = new DOMSource(document );
	StreamResult result = new StreamResult(System.out);
	//transform.transform(source, result); System.out.println("");
	String rashirenie = ".xml";
	nameFile = nameFile + rashirenie;
	System.out.println("��� ����� ����� ��� ������ " + nameFile);
	File file = new File("resurs");
	String s_file = file.getAbsolutePath();
	s_file = s_file + dopDir;
	System.out.println("���������� ���� ��� ������ ����� " + s_file);
	//File file_zapis = new File(s_file, "test_file.xml");
	File file_zapis = new File(s_file, nameFile);
	System.out.println("���� ��� ������ " + file_zapis);
	StreamResult result_zapis = new StreamResult(file_zapis);
	transform.transform(source, result_zapis);
	
	}//try
	catch(/*ParserConfigurationException |*/ TransformerConfigurationException ex){
		Logger.getLogger(saveInXMLFile.class.getName()).log(Level.SEVERE, null, ex);
	}//catch(ParserConfigurationException | TransformerConfigurationException ex){
	catch(TransformerException ex){
		Logger.getLogger(saveInXMLFile.class.getName()).log(Level.SEVERE, null, ex);
	}//catch(TransformerException ex){
}//public void isponitZapis(){
public void sozdatNewDir(String nameNewDir){
	File file = new File("resurs");
	String s_file = file.getAbsolutePath();
	s_file = s_file + dopDir;
	new File(s_file + "/" + nameNewDir).mkdir();
}//public void sozdatNewDir(String putDir, String nameBewDir){
public void setDopDir(String dopDir){
//� ��������� ��������� ����� ���������� � ����� ������
	this.dopDir = dopDir;
}//public void setDopDir(String dopDir){
public void saveFile_v_xml(Document document, String nameFile){
	try{
	Transformer transform = TransformerFactory.newInstance().newTransformer();
	DOMSource source = new DOMSource(document );
	StreamResult result = new StreamResult(System.out);
	//transform.transform(source, result); System.out.println("");
	File file = new File("resurs");
	String s_file = file.getAbsolutePath();
	nameFile = s_file + nameFile;
	System.out.println("� ������ saveInXMLFile � ������ saveFile_v_xml");
	System.out.println("���� � ������ ����� ������� " + nameFile);
	File file_zapis = new File(nameFile);
	StreamResult result_zapis = new StreamResult(file_zapis);
	transform.transform(source, result_zapis);
	}//try
	catch(/*ParserConfigurationException |*/ TransformerConfigurationException ex){
		Logger.getLogger(saveInXMLFile.class.getName()).log(Level.SEVERE, null, ex);
	}//catch(ParserConfigurationException | TransformerConfigurationException ex){
	catch(TransformerException ex){
		Logger.getLogger(saveInXMLFile.class.getName()).log(Level.SEVERE, null, ex);
	}//catch(TransformerException ex){
}//public void saveFile_v_xml(Document document, String nameFile){
}//public class saveInXMLFile {
