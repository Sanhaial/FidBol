package rab_client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class openFileTest {
	File f = new File("resurs");//C:\al\java_programm\NachProgOdin\src\resurs	
	File dop_direct = null;
public void testMetod(){
	//System.out.println("�������� ����� testMetod");
}//public void testMetod(){
public File OpenFileXML(){
	//System.out.println("������ ������ OpenFileXML()");
	
//File f = new File("resurs");//C:\al\java_programm\NachProgOdin\src\resurs
String s_file = f.getAbsolutePath();
//System.out.println("���������� ���� � ����� " + s_file);
File op_file = new File(f, "spiskiDannih.xml");
	try{
	if(f.isFile()){
		//System.out.println("���� ����������");
	}//if(f.exists()){
	if(f.isDirectory()){
		//System.out.println("���������� ����������");
		for(File dir_item : f.listFiles()){
			if(dir_item.isFile()){
				//System.out.print("��� ���� " + dir_item.getName());
				//System.out.println(" ���� � ����� " + dir_item.getAbsolutePath());
			}//if(dir_item.isFile()){
		}//for(File item : f.listFiles()){
	}//if(f.isDirectory()){
	}//try{
	catch(SecurityException e){
		e.printStackTrace();
	}//catch(SecurityException e){
	
	try{
		//File op_file = new File(f, "spiskiDannih.xml");
		if(op_file.isFile()){
			//System.out.println("���� " + op_file.getName() + " ����������");
		
			Scanner sc = new Scanner(op_file);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			//System.out.println(line);
			////ConsolOtladkaMesage ObjConMes = new ConsolOtladkaMesage();
			////ObjConMes.systemOutPrintln(false, line);
		}//while(){
		sc.close();
		}//if(op_file.isFile()){
	}//try{
	catch(FileNotFoundException e){
		e.printStackTrace();
	}//catch(FileNotFoundException e){
	
	return op_file;
}//static void OpenFileXML(){
public Node parserXMLDok(File fileXML_dljaParser){
	if(fileXML_dljaParser.isFile()){
		//System.out.println("���� ��� �������� " + fileXML_dljaParser.getName());
	}//if(fileXML_dljaParser.isFile()){
	try{
		 DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 Document docXML = documentBuilder.parse(fileXML_dljaParser);
		 Node root = docXML.getDocumentElement();
		 String nameUzel = root.getNodeName();
		 ///ConsolOtladkaMesage ObjConMes = new ConsolOtladkaMesage();
		 ///ObjConMes.systemOutPrintln(true, nameUzel);
		 /////
		 NodeList listNacElement =  root.getChildNodes();
		 //System.out.print("����� ��������� � " + root.getNodeName());
		 //System.out.println(" " + listNacElement.getLength());
		 //String nameElement_rootEl = listNacElement.item(1).getNodeName();
		 //System.out.println(nameElement_rootEl);
	return root;	 
	}//try{
	catch(ParserConfigurationException e){
		
	}//catch(ParserConfigurationException e){
	catch(SAXException e){
		
	}//catch(SAXException e){
	catch(IOException e){
		
	}//catch(IOException e){
	return null;
	
    // ��������� ������ DOM ��������� �� �����
   // Document document = documentBuilder.parse("BookCatalog.xml");

    // �������� �������� �������
    //Node root = document.getDocumentElement();
}//public Node parserXMLDok(File fileXML_dljaParser){

public File vernutPatchFile(String nameFile){
	String s_file = f.getAbsolutePath();
	//System.out.println("���������� ���� � ����� " + s_file);
	
	File op_file = new File(f, nameFile);
	//System.out.println("������ ���� � �������� � ����� " + op_file);
		try{
		if(f.isFile()){
			//System.out.println("���� ����������");
		}//if(f.exists()){
		if(f.isDirectory()){
			//System.out.println("���������� ����������");
			for(File dir_item : f.listFiles()){
				if(dir_item.isFile()){
					//System.out.print("��� ���� " + dir_item.getName());
					//System.out.println(" ���� � ����� " + dir_item.getAbsolutePath());
				}//if(dir_item.isFile()){
				if(dir_item.isDirectory()){
					//System.out.print("��� ���������� " + dir_item.getName());
					//System.out.println(" ���� � ���������� " + dir_item.getAbsolutePath());
				}//if(dir_item.isDirectory()){
			}//for(File item : f.listFiles()){
		}//if(f.isDirectory()){
		}//try{
		catch(SecurityException e){
			e.printStackTrace();
		}//catch(SecurityException e){
		
		try{
			//File op_file = new File(f, "spiskiDannih.xml");
			if(op_file.isFile()){
				//System.out.println("���� " + op_file.getName() + " ����������");
			
				Scanner sc = new Scanner(op_file);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				//System.out.println(line);
				///ConsolOtladkaMesage ObjConMes = new ConsolOtladkaMesage();
				///ObjConMes.systemOutPrintln(false, line);
			}//while(){
			sc.close();
			}//if(op_file.isFile()){
		}//try{
		catch(FileNotFoundException e){
			e.printStackTrace();
		}//catch(FileNotFoundException e){
		
		return op_file;
}//public void vernutPatchFile(){


}//public class openFileTest {
