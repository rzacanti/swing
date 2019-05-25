package com.renato.actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.renato.model.RunnerModel;
import com.renato.thread.MouseRunnerThread;
import com.renato.thread.TabRunnerThread;

public class ActionButtonAtivar implements ActionListener{

	public ActionButtonAtivar() 
	{
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		RunnerModel.rdbtnParar.setSelected(false);

		if (Integer.parseInt(RunnerModel.txtTimer.getText()) > 4) {
			if (Integer.parseInt(RunnerModel.txtTimer.getText()) > 60) {
				JOptionPane.showMessageDialog(null, "Não é permitido timer > (maior) 60 segundos");
				RunnerModel.rdbtnParar.setSelected(true);
				RunnerModel.rdbtnIniciar.setSelected(false);
			} else {
				RunnerModel.timer = Integer.parseInt(RunnerModel.txtTimer.getText());
				RunnerModel.timer = RunnerModel.timer * 1000;

				RunnerModel.txtTimer.setEnabled(false);
				RunnerModel.go = true;

				if (RunnerModel.rdbtnTab.isSelected()) {
					Thread t = new Thread(new TabRunnerThread());
					t.start();
				} else if (RunnerModel.rdbtnMouse.isSelected()) {
					Thread t = new Thread(new MouseRunnerThread());
					t.start();
				}

			}
		} else {
			JOptionPane.showMessageDialog(null, "Não é permitido timer < (menor) 5 segundos");
			RunnerModel.rdbtnParar.setSelected(true);
			RunnerModel.rdbtnIniciar.setSelected(false);
		}

	}

}
