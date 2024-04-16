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
	//Аргумент put путь должен идти со всеми косыми слешами
	System.out.println("В классе OpenFile");
	String put_k_file = "resurs";
	put_k_file = put_k_file + put;
	File f = new File(put_k_file);
	System.out.println("Путь к открываемуму фаилу " + put_k_file);
	try{
		if(f.isFile()){
			System.out.println("Фаил существует");
		}//if(f.exists()){
		if(f.isDirectory()){
			System.out.println("Это директория");
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
			System.out.println("Фаил " + scanFile.getName() + " существует");
		
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
		System.out.println("Указанна директория операция парсинга невозможна");
		return null;
	}//if(fileXML_dljaParser.isDirectory()){
	if(fileXML_dljaParser.isFile()){
		System.out.println("Фаил для парсинга " + fileXML_dljaParser.getName());
	}//if(fileXML_dljaParser.isFile()){
	try{
		 DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		 Document docXML = documentBuilder.parse(fileXML_dljaParser);
		 Node root = docXML.getDocumentElement();
		 String nameUzel = root.getNodeName();
		 System.out.println("В классе openFile в Методе parserXMLDok");
		 System.out.println("Наме Юзер " + nameUzel);
		 /////
		 NodeList listNacElement =  root.getChildNodes();
		 //System.out.print("Число элементов в " + root.getNodeName());
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
	
    // Создается дерево DOM документа из файла
   // Document document = documentBuilder.parse("BookCatalog.xml");

    // Получаем корневой элемент
    //Node root = document.getDocumentElement();
}//public Node parserXMLDok(File fileXML_dljaParser){
public ArrayList<File> file_is_dir_v_ArrayList(File nameDir){
	ArrayList<File> listFile_is_Dir = new ArrayList<>();
	if(nameDir.isFile()){
		System.out.println("Указана не деректория а фаил операция не возможна");
		return null;
	}//if(nameDir.isFile()){
	if(nameDir.isDirectory()){
		System.out.println("Директория существует");
		for(File dir_item : nameDir.listFiles()){
			if(dir_item.isFile()){
				System.out.print("имя фаил " + dir_item.getName());
				System.out.println(" Путь к фаилу " + dir_item.getAbsolutePath());
				listFile_is_Dir.add(dir_item);
			}//if(dir_item.isFile()){
		}//for(File item : f.listFiles()){
	}//if(nameDir.isDirectory()){
	System.out.println("Результат списка фаилов из деректории");
	System.out.println(listFile_is_Dir);
	return listFile_is_Dir;
}//public ArrayList file_is_dir_v_ArrayList(String nameDir){
public ArrayList<File> getSpisokDir(File nameDir){
	ArrayList<File> spisokDir = new ArrayList<>();
	if(nameDir.isFile()){
		System.out.println("Указана не деректория а фаил операция не возможна");
		return null;
	}//if(nameDir.isFile()){
	for(File dir_item : nameDir.listFiles()){
		if(dir_item.isFile()){
			continue;
		}//if(dir_item.isFile()){
		spisokDir.add(dir_item);
	}//for(File dir_item : nameDir.listFiles()){
	System.out.println("В классе File openFile в методе getSpisokDir");
	System.out.println("Список Дир " + spisokDir);
	return spisokDir;
}//public void getSpisokDir(){
public File getFileKarta(File dirKarta){
	String test = "karta.xml";
	for(File itemFile: dirKarta.listFiles()){
		if(itemFile.isFile()){
			System.out.println("В классе File openFile в методе getFileKarta");
			System.out.println("Имя фаила карты при поиски " + itemFile.getName());
			if(itemFile.getName().equals("karta.xml")){
				System.out.println("В классе File openFile в методе getFileKarta");
				System.out.println("Фаил карты найден " + itemFile);
				return itemFile;
			}//if(dirKarta.getName() == itemFile.getName()){
		}//if(itemFile.isFile()){
	}//for(File itemFile: dirKarta.listFiles()){
	return null; 
}//public File getFileKarta(File absolutPathFile){
}//public class OpenFile {
