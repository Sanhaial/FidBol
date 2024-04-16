package EvintSobitie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;

import InterfeisKlient.OknoKlient;

public class SobitieMenu implements MouseListener, MouseMotionListener, ActionListener{

OknoKlient objOknoKlient;
	
public void ustanovitOknoKlient(OknoKlient objOknoKlient) {
	this.objOknoKlient = objOknoKlient;
}//
public void ustanovitJButton(JButton ust_button){
	ActionListener massActionListener[] = ust_button.getActionListeners();
	for(ActionListener objActionListener: massActionListener){
		if(objActionListener == this){
			return;
		}//if(objActionListener == this){
	}//for(ActionListener objActionListener: massActionListener){
	ust_button.addActionListener(this);
}//public void ustanovitJButton(JButton ust_button){

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("В классе SobitieMenu в методе actionPerformed");
		objOknoKlient.obrabotat_actionPerformed(arg0);
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

}
