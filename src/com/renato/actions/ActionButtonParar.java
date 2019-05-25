package com.renato.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.renato.model.RunnerModel;
import com.renato.thread.MouseRunnerThread;
import com.renato.thread.TabRunnerThread;

public class ActionButtonParar implements ActionListener{

	public ActionButtonParar() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		RunnerModel.rdbtnIniciar.setSelected(false);
		RunnerModel.go = false;
		RunnerModel.txtTimer.setEnabled(true);
	}

}
