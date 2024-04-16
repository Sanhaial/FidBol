package EvintSobitie;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import InterfeisKlient.Graf_JLable;
import InterfeisKlient.InterfeisIgra;
import InterfeisKlient.OknoKlient;

public class SobitieAcaunt implements MouseListener, MouseMotionListener, ActionListener{
OknoKlient objOknoKlient;
InterfeisIgra objInterfeisIgra;
	
public void ustanovitOknoKlient(OknoKlient objOknoKlient) {
	this.objOknoKlient = objOknoKlient;
}//
public void ustanovitInterfeisIgra(InterfeisIgra objInterfeisIgra) {
	this.objInterfeisIgra = objInterfeisIgra;
}//
public void ustanovitMouseListener(JLabel lab) {
	MouseListener massMouseListener[] = lab.getMouseListeners();
	for(MouseListener objMouseListener: massMouseListener) {
		if(objMouseListener == this) {
			//System.out.println("В классе SobitieAcaunt в методе ustanovitMouseListener222");
			//System.out.println("Массив объектов событий в лабле " +  massMouseListener);
			return;
		}//
	}//
	lab.addMouseListener(this);
	//System.out.println("В классе SobitieAcaunt в методе ustanovitMouseListener");
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
		System.out.println("В классе SobitieAcaunt в методе mouseMoved");
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("В классе SobitieAcaunt в методе mouseClicked");
		objInterfeisIgra.obrabotatmouseClicked(arg0);
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
		System.out.println("В классе SobitieAcaunt в методе mousePressed");
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
