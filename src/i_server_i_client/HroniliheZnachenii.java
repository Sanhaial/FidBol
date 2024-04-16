package i_server_i_client;

import java.io.Serializable;

public class HroniliheZnachenii implements Serializable{
	String xmlName;
	int znachInt;
	String znachStr;
	public HroniliheZnachenii(){
		
	}//public HroniliheZnachenii(Boolean znach){
	public HroniliheZnachenii(int znach){
		znachInt = znach;
		znachStr = String.valueOf(znach);
	}//public HroniliheZnachenii(int znach){
	public HroniliheZnachenii(String znach){
		try{
			znachInt = Integer.parseInt(znach);
		}//try{
		catch(NumberFormatException nfe){
			znachInt = 0;
		}//catch(NumberFormatException nfe){
		znachStr = znach;
	}//public HroniliheZnachenii(int znach){
	public void setZnach(int znach){
		znachInt = znach;
		znachStr = String.valueOf(znach);
	}//public void setZnach(int znach){
	public void setZnach(String znach){
		try{
			znachInt = Integer.parseInt(znach);
		}//try{
		catch(NumberFormatException nfe){
			znachInt = 0;
		}//catch(NumberFormatException nfe){
		znachStr = znach;
	}//public void setZnach(int znach){
	public int getZnachInt(){
		return znachInt;
	}//public int getZnachInt(){
	public String getZnachStr(){
		return znachStr;
	}//public String getZnachStr(){
	public void set_xmlName(String str){
		xmlName = str;
	}//public void set_xmlName(String str){
	public String get_xmlName(){
		return xmlName;
	}//public String get_xmlName(){
}
