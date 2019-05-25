package com.renato.actions;

import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JOptionPane;

import com.renato.model.RunnerModel;
import com.renato.thread.MouseRunnerThread;
import com.renato.thread.TabRunnerThread;

public class ActionMouseForm implements MouseListener, MouseMotionListener {
	
	private Point p = new Point();
	
	public ActionMouseForm() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
	    RunnerModel.lblMouseStatus.setText("Mouse clicked at coordinate : ["+getPosicaoMouse()+"]");     
	} 
	@Override
	public void mouseEntered(MouseEvent e) {
		RunnerModel.lblMouseStatus.setText("Current mouse Coordinates : ["+getPosicaoMouse()+"]");     
	} 
	@Override
	public void mouseExited(MouseEvent e) {		
		RunnerModel.lblMouseStatus.setText("Current outside mouse coordinates : ["+getPosicaoMouse()+"]");     
	} 
	
	@Override
	public void mousePressed(MouseEvent e) {
		RunnerModel.lblMouseStatus.setText("Mouse pressed at coordinates : ["+getPosicaoMouse()+"]");     
	} 
	@Override
	public void mouseReleased(MouseEvent e) {
		RunnerModel.lblMouseStatus.setText("Current mouse coordinates : ["+getPosicaoMouse()+"]");     
	} 
	@Override
	public void mouseDragged(MouseEvent e) {
		RunnerModel.lblMouseStatus.setText("Mouse dragged at coordinates : ["+getPosicaoMouse()+"]"); 
	} 
	@Override
	public void mouseMoved(MouseEvent e) {
		RunnerModel.lblMouseStatus.setText("Mouse moved to coordinates : ["+getPosicaoMouse()+"]");     
	}

	public String getPosicaoMouse() {
		p = MouseInfo.getPointerInfo().getLocation();
		return p.toString();
	}



	
	

}
