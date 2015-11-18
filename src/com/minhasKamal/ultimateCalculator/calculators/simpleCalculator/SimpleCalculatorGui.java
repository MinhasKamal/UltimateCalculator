/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 11-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.simpleCalculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * A Simple Calculator GUI
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class SimpleCalculatorGui extends JLabel{
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JButton[] jButtonNumerical;
	JButton[] jButtonOperator;
	JButton[] jButtonMemory;
	JButton[] jButtonClear;
	JButton jButtonPoint;
	
	JLabel[] jLabelDisplay;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public SimpleCalculatorGui() {

		initialComponent();
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	private void initialComponent() {
		//**
		// Initialization 																		#*******I*******#
		//**
		jButtonNumerical=new JButton[10];	//10 buttons(0-9)
		jButtonPoint=new JButton();			//point(.)
		jButtonOperator=new JButton[7];		//+, -, *, /, SQRT(), =
		jButtonMemory=new JButton[2];		//M, MS
		jButtonClear=new JButton[3]; 		//AC, C, back space
		
		jLabelDisplay=new JLabel[2];	//operation, result
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		//Numeric Buttons
		for(int i=0; i<10; i++){
			jButtonNumerical[i] = new JButton(""+i);
			jButtonNumerical[i].setSize(50, 40);
			jButtonNumerical[i].setLocation(((i-1)%3)*50+10, 280-(((i-1)/3)*40));
			jButtonNumerical[i].setFont(new Font("Calibri", 0, 19));
			jButtonNumerical[i].setBackground(new Color(200, 200, 190));
			jButtonNumerical[i].setBorder(null);
		}
		jButtonNumerical[0].setLocation(10, 320); jButtonNumerical[0].setSize(100, 40);
		
		//Point
		jButtonPoint.setBackground(new Color(210, 210, 190));
		jButtonPoint.setText("."); jButtonPoint.setBounds(110, 320, 50, 40);
		jButtonPoint.setFont(new Font("Vrinda", 0, 26));
			
		//Operator Buttons
		for(int i=0; i<7; i++){
			jButtonOperator[i] = new JButton();
			jButtonOperator[i].setSize(45, 40);
			jButtonOperator[i].setFont(new Font("Calibri", 0, 17));
			jButtonOperator[i].setBackground(new Color(188, 188, 188));
			jButtonOperator[i].setBorder(null);
		}
		jButtonOperator[0].setText("+");
		jButtonOperator[0].setLocation(170, 320);
		
		jButtonOperator[1].setText("-"); 
		jButtonOperator[1].setLocation(170, 280);
		
		jButtonOperator[2].setText("x");
		jButtonOperator[2].setLocation(170, 240);
		
		jButtonOperator[3].setText("/"); 
		jButtonOperator[3].setLocation(170, 200);

		jButtonOperator[5].setText("=");
		jButtonOperator[5].setBounds(215, 280, 45, 80);

		jButtonOperator[4].setText("sqrt"); 
		jButtonOperator[4].setLocation(215, 240);

		jButtonOperator[6].setText("^"); 
		jButtonOperator[6].setLocation(215, 200);
		
		//Memory Buttons
		for(int i=0; i<2; i++){
			jButtonMemory[i] = new JButton(); 
			jButtonMemory[i].setSize(50, 33);
			jButtonMemory[i].setFont(new Font("Arial", 0, 13));
			jButtonMemory[i].setBorder(null);
		}
		jButtonMemory[0].setText("M"); 
		jButtonMemory[0].setLocation(10, 150);

		jButtonMemory[1].setText("MS"); 
		jButtonMemory[1].setLocation(60, 150);
		
		//Clear Buttons
		for(int i=0; i<3; i++){
			jButtonClear[i] = new JButton();
			jButtonClear[i].setSize(45, 33);
			jButtonClear[i].setFont(new Font("Vrinda", 0, 17));
			jButtonClear[i].setBorder(null);
		}
		jButtonClear[0].setText("C"); 
		jButtonClear[0].setLocation(170, 150);

		jButtonClear[1].setText("AC"); 
		jButtonClear[1].setLocation(215, 150);
		
		jButtonClear[2].setText("<B"); 
		jButtonClear[2].setLocation(110, 150); 
		jButtonClear[2].setSize(50, 33);

		//Display label
		for(int i=0; i<2; i++){
			jLabelDisplay[i] = new JLabel();
			jLabelDisplay[i].setSize(250, 45);
			jLabelDisplay[i].setHorizontalAlignment(4);
			jLabelDisplay[i].setFont(new Font("Lucida Console", 0, 16));
			jLabelDisplay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		}
		jLabelDisplay[0].setLocation(10, 18);
		jLabelDisplay[1].setLocation(10, 63); jLabelDisplay[1].setSize(250, 60);
			jLabelDisplay[1].setFont(new Font("Lucida Console", 0, 20));
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		//adding buttons
		for(int i=0; i<10; i++){
			add(jButtonNumerical[i]);
		}
		add(jButtonPoint);
		for(int i=0; i<7; i++){
			add(jButtonOperator[i]);
		}
		for(int i=0; i<2; i++){
			add(jButtonMemory[i]);
		}
		for(int i=0; i<3; i++){
			add(jButtonClear[i]);
		}
		
		//adding display labels
		for(int i=0; i<2; i++){
			add(jLabelDisplay[i]);
		}
		
		// End of Adding Components 															#_______A_______#
		
		//set criteria of main label
		setBounds(0, 0, 276, 425);
		setIcon(new ImageIcon(getClass().getResource("/res/imgs/SimpleCalculatorBackground.jpg")));
	}

	/********* Main Method *********/
	public static void main(String args[]) {
		/*// Set the NIMBUS look and feel //*/
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception ex) {
			// do nothing if operation is unsuccessful
		}

		/* Create and display the form */
		SimpleCalculatorGui gui = new SimpleCalculatorGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 280, 420);
		jFrame.setVisible(true);
		//jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
