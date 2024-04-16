package Server_rabotaXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class OpenFile {

public File openFile(String put){
	//�������� put ���� ������ ���� �� ����� ������ �������
	System.out.println("� ������ OpenFile");
	String put_k_file = "resurs";
	put_k_file = put_k_file + put;
	File f = new File(put_k_file);
	System.out.println("���� � ������������ ����� " + put_k_file);
	try{
		if(f.isFile()){
			System.out.println("���� ����������");
		}//if(f.exists()){
		if(f.isDirectory()){
			System.out.println("��� ����������");
		}//if(f.isDirectory()){
		}//try{
		catch(SecurityException e){
			e.printStackTrace();
		}//catch(SecurityException e){
	return f;
}//public void openFile(String put){
public void scanerFile(File scanFile){
	if(scanFile.isDirectory()){
		return;
	}//if(scanFile.isDirectory()){
	try{
		//File op_file = new File(f, "spiskiDannih.xml");
		if(scanFile.isFile()){
			System.out.println("���� " + scanFile.getName() + " ����������");
		
			Scanner sc = new Scanner(scanFile);
		while(sc.hasNextLine()){
			String line = sc.nextLine();
			System.out.println(line);
			//ConsolOtladkaMesage ObjConMes = new ConsolOtladkaMesage();
			//ObjConMes.systemOutPrintln(false, line);
		}//while(){
		sc.close();
		}//if(op_file.isFile()){
	}//try{
	catch(FileNotFoundException e){
		e.printStackTrace();
	}//catch(FileNotFoundException e){
}//public void scanerFile(){
public Node parserXMLDok(File fileXML_dljaParser){
	if(fileXML_dljaParser.isDirectory()){
		System.out.println("�������� ���������� �������� �������� ����������");
		return null;
	}//if(fileXML_dljaParser.isDirectory()){
	if(fileXML_dljaParser.isFile()){
		System.out.println("���� ��� �������� " + fileXML_dljaParser.getName());
	}//if(fileXML_dljaParser.isFile()){
	try{
		 DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 Document docXML = documentBuilder.parse(fileXML_dljaParser);
		 Node root = docXML.getDocumentElement();
		 String nameUzel = root.getNodeName();
		 System.out.println("� ������ openFile � ������ parserXMLDok");
		 System.out.println("���� ���� " + nameUzel);
		 /////
		 NodeList listNacElement =  root.getChildNodes();
		 //System.out.print("����� ��������� � " + root.getNodeName());
		 //System.out.println(" " + listNacElement.getLength());
		 //String nameElement_rootEl = listNacElement.item(0).getNodeName();
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
public ArrayList<File> file_is_dir_v_ArrayList(File nameDir){
	ArrayList<File> listFile_is_Dir = new ArrayList<>();
	if(nameDir.isFile()){
		System.out.println("������� �� ���������� � ���� �������� �� ��������");
		return null;
	}//if(nameDir.isFile()){
	if(nameDir.isDirectory()){
		System.out.println("���������� ����������");
		for(File dir_item : nameDir.listFiles()){
			if(dir_item.isFile()){
				System.out.print("��� ���� " + dir_item.getName());
				System.out.println(" ���� � ����� " + dir_item.getAbsolutePath());
				listFile_is_Dir.add(dir_item);
			}//if(dir_item.isFile()){
		}//for(File item : f.listFiles()){
	}//if(nameDir.isDirectory()){
	System.out.println("��������� ������ ������ �� ����������");
	System.out.println(listFile_is_Dir);
	return listFile_is_Dir;
}//public ArrayList file_is_dir_v_ArrayList(String nameDir){
public ArrayList<File> getSpisokDir(File nameDir){
	ArrayList<File> spisokDir = new ArrayList<>();
	if(nameDir.isFile()){
		System.out.println("������� �� ���������� � ���� �������� �� ��������");
		return null;
	}//if(nameDir.isFile()){
	for(File dir_item : nameDir.listFiles()){
		if(dir_item.isFile()){
			continue;
		}//if(dir_item.isFile()){
		spisokDir.add(dir_item);
	}//for(File dir_item : nameDir.listFiles()){
	System.out.println("� ������ File openFile � ������ getSpisokDir");
	System.out.println("������ ��� " + spisokDir);
	return spisokDir;
}//public void getSpisokDir(){
public File getFileKarta(File dirKarta){
	String test = "karta.xml";
	for(File itemFile: dirKarta.listFiles()){
		if(itemFile.isFile()){
			System.out.println("� ������ File openFile � ������ getFileKarta");
			System.out.println("��� ����� ����� ��� ������ " + itemFile.getName());
			if(itemFile.getName().equals("karta.xml")){
				System.out.println("� ������ File openFile � ������ getFileKarta");
				System.out.println("���� ����� ������ " + itemFile);
				return itemFile;
			}//if(dirKarta.getName() == itemFile.getName()){
		}//if(itemFile.isFile()){
	}//for(File itemFile: dirKarta.listFiles()){
	return null; 
}//public File getFileKarta(File absolutPathFile){
}//public class OpenFile {
