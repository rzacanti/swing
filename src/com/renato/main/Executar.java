package com.renato.main;

import java.awt.EventQueue;

import com.renato.model.RunnerModel;

public class Executar {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RunnerModel window = new RunnerModel();
					window.frmRunnerProgram.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}
