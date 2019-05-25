package com.renato.layout;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.renato.model.RunnerModel;

public class FormularioUtilitario extends RunnerModel {

	public static void InicializaForm() {
		inicializacao();		
		setPosicionamento();
		setFonte();
		addComponente();
		
	}
	
	public static void inicializacao()
	{
		panel = new JPanel();
		frmRunnerProgram.getContentPane().add(panel, BorderLayout.CENTER);
		rdbtnParar = new JRadioButton("Parar");
		rdbtnParar.setSelected(true);
		rdbtnIniciar = new JRadioButton("Iniciar");		
		txtTimer = new JTextArea();
		btnFechar = new JButton("Fechar");
		lblEscolha = new JLabel("Escolha uma opcao: ");
		rdbtnTab = new JRadioButton("Alt + Tab");
		rdbtnMouse = new JRadioButton("Move Mouse");
		lblTimer = new JLabel("Timer delay (segundos)");		
		lblStatus = new JLabel("Status");
		lblMouseStatus = new JLabel("");
	
	}
	
	public static void addComponente()
	{
		
		panel.add(RunnerModel.lblTimer);
		panel.add(RunnerModel.txtTimer);		
		panel.add(RunnerModel.lblEscolha);
		panel.add(RunnerModel.rdbtnTab);
		panel.add(RunnerModel.rdbtnMouse);
		panel.add(RunnerModel.lblStatus);
		panel.add(RunnerModel.rdbtnParar);
		panel.add(RunnerModel.rdbtnIniciar);	
		panel.add(RunnerModel.btnFechar);
		panel.add(RunnerModel.lblMouseStatus);
		
		
		frmRunnerProgram.getContentPane().add(lblTimer);
		frmRunnerProgram.getContentPane().add(txtTimer);
		frmRunnerProgram.getContentPane().add(RunnerModel.lblEscolha);
		frmRunnerProgram.getContentPane().add(RunnerModel.rdbtnTab);
		frmRunnerProgram.getContentPane().add(RunnerModel.rdbtnMouse);
		frmRunnerProgram.getContentPane().add(RunnerModel.lblEscolha);
		frmRunnerProgram.getContentPane().add(RunnerModel.lblStatus);
		frmRunnerProgram.getContentPane().add(RunnerModel.rdbtnIniciar);
		frmRunnerProgram.getContentPane().add(RunnerModel.rdbtnParar);
		frmRunnerProgram.getContentPane().add(RunnerModel.btnFechar);
		frmRunnerProgram.getContentPane().add(RunnerModel.lblMouseStatus);
	}
	
	public static void setPosicionamento()
	{	
		lblTimer.setBounds(15, 20, 150, 20);
		txtTimer.setBounds(180, 20, 180, 20);
		lblEscolha.setBounds(15, 50, 120, 20);
		rdbtnTab.setBounds(180, 50, 100, 20);
		rdbtnMouse.setBounds(260, 50, 100, 20);
		lblStatus.setBounds(15, 80, 100, 20);
		rdbtnIniciar.setBounds(180, 80, 100, 20);
		rdbtnParar.setBounds(260, 80, 100, 20);
		btnFechar.setBounds(15, 130, 350, 20);
		lblMouseStatus.setBounds(15, 200, 350, 20);
		
		
	}
	
	public static void setFonte()
	{
		//rdbtnParar.setFont(new Font("Tahoma", Font.BOLD, 18));
		//rdbtnIniciar.setFont(new Font("Tahoma", Font.BOLD, 18));		
	}
	
	

}
