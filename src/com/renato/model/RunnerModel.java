package com.renato.model;

import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.renato.actions.ActionButtonAtivar;
import com.renato.actions.ActionButtonFechar;
import com.renato.actions.ActionButtonParar;
import com.renato.actions.ActionButtonRdbtnMouse;
import com.renato.actions.ActionButtonRdbtnTab;
import com.renato.actions.ActionMouseForm;
import com.renato.layout.FormularioUtilitario;
import com.renato.thread.MouseRunnerThread;
import com.renato.thread.TabRunnerThread;

import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class RunnerModel {

	public static JFrame frmRunnerProgram;
	public static JTextArea txtTimer;
	public static JButton btnFechar;
	public static JLabel lblEscolha;
	public static JLabel lblStatus;		
	public static JRadioButton rdbtnParar;
	public static JRadioButton rdbtnIniciar;	
	public static JRadioButton rdbtnTab;
	public static JRadioButton rdbtnMouse;
	public static JLabel lblTimer;
	public static JPanel panel;
	public static JLabel lblMouseStatus;	
	public static int timer = 5000;
	public static boolean go;


	
	/**
	 * Create the application.
	 */
	public RunnerModel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmRunnerProgram = new JFrame();		
		frmRunnerProgram.setResizable(false);
		frmRunnerProgram.setTitle("Runner - Program ");
		frmRunnerProgram.setBounds(100, 100, 578, 300);
		frmRunnerProgram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRunnerProgram.getContentPane().setLayout(null);
		
		//Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		//frmRunnerProgram.setSize(size );
		
		FormularioUtilitario.InicializaForm();
		
		ActionMouseForm actionMouseForm = new ActionMouseForm();
		frmRunnerProgram.addMouseMotionListener(actionMouseForm);
		frmRunnerProgram.addMouseListener(actionMouseForm);
			
		
		ActionButtonAtivar actionButtonAtivar = new ActionButtonAtivar();
		rdbtnIniciar.addActionListener(actionButtonAtivar);

		ActionButtonFechar actionButtonFechar = new ActionButtonFechar();
		btnFechar.addActionListener(actionButtonFechar);
		
		ActionButtonParar actionButtonParar = new ActionButtonParar();		
		rdbtnParar.addActionListener(actionButtonParar);
		
		ActionButtonRdbtnTab actionButtonRdbtnTab = new ActionButtonRdbtnTab();
		rdbtnTab.addActionListener(actionButtonRdbtnTab);
		
		ActionButtonRdbtnMouse actionButtonRdbtnMouse = new ActionButtonRdbtnMouse();
		rdbtnMouse.addActionListener(actionButtonRdbtnMouse);

		
	}
}
