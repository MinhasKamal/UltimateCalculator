/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 14-Jan-2014																								*
* Modified: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.baseCalculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * A Base Calculator GUI
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class BaseCalculatorGui extends JLabel {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JToggleButton[] jTButtonBase;
	
	JButton[] jButtonNumerical;
	JButton[] jButtonAlphaNumerical;
	JButton[] jButtonOperator;
	JButton[] jButtonMemory;
	JButton[] jButtonClear;
	JButton jButtonPoint;
	
	JLabel[] jLabelDisplay;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public BaseCalculatorGui() {

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
		jTButtonBase = new JToggleButton[4];
		
		jButtonNumerical=new JButton[10];	//10 buttons(0-9)
		jButtonPoint=new JButton();			//point(.)
		jButtonAlphaNumerical=new JButton[6];//A-F
		jButtonOperator=new JButton[5];		//+, -, *, /, SQRT(), =
		jButtonMemory=new JButton[2];		//M, MS
		jButtonClear=new JButton[3]; 		//AC, C, back space
		
		jLabelDisplay=new JLabel[2];	//operation, result
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		//toggle buttons base
		for(int i=0; i<4; i++){
			jTButtonBase[i] = new JToggleButton();
			jTButtonBase[i].setSize(40, 25);
			jTButtonBase[i].setBackground(new Color(200, 200, 200));
			jTButtonBase[i].setBorder(null);
		}
		jTButtonBase[0].setLocation(150, 130); jTButtonBase[0].setText("Bin");
		jTButtonBase[1].setLocation(190, 130); jTButtonBase[1].setText("Oct");
		jTButtonBase[2].setLocation(230, 130); jTButtonBase[2].setText("Dec");
		jTButtonBase[3].setLocation(270, 130); jTButtonBase[3].setText("Hex");
	
		//Numeric Buttons
		for(int i=0; i<10; i++){
			jButtonNumerical[i] = new JButton(""+i);
			jButtonNumerical[i].setSize(50, 40);
			jButtonNumerical[i].setLocation(((i-1)%3)*50+10, 310-(((i-1)/3)*40));
			jButtonNumerical[i].setFont(new Font("Calibri", 0, 19));
			jButtonNumerical[i].setBackground(new Color(200, 200, 190));
			jButtonNumerical[i].setBorder(null);
		}
		jButtonNumerical[0].setLocation(10, 350); jButtonNumerical[0].setSize(100, 40);
	
		//Point
		jButtonPoint.setBackground(new Color(210, 210, 190));
		jButtonPoint.setText(""); jButtonPoint.setBounds(110, 350, 50, 40);
		jButtonPoint.setFont(new Font("Vrinda", 0, 26));
		jButtonPoint.setRolloverEnabled(false);
			
		//Alpha Numerical Buttons
		for(int i=0; i<6; i++){
			jButtonAlphaNumerical[i]=new JButton();
			jButtonAlphaNumerical[i].setSize(45, 40);
			jButtonAlphaNumerical[i].setFont(new Font("Times New Roman", 1, 18));
			jButtonAlphaNumerical[i].setBorder(null);
			jButtonAlphaNumerical[i].setBackground(new Color(180, 170, 165));
		}
		jButtonAlphaNumerical[0].setLocation(220, 230); jButtonAlphaNumerical[0].setText("A");
		jButtonAlphaNumerical[1].setLocation(220, 270); jButtonAlphaNumerical[1].setText("B");
		jButtonAlphaNumerical[2].setLocation(267, 230); jButtonAlphaNumerical[2].setText("C");
		jButtonAlphaNumerical[3].setLocation(267, 270); jButtonAlphaNumerical[3].setText("D");
		jButtonAlphaNumerical[4].setLocation(267, 310); jButtonAlphaNumerical[4].setText("E");
		jButtonAlphaNumerical[5].setLocation(267, 350); jButtonAlphaNumerical[5].setText("F");
		
		//Operator Buttons
		for(int i=0; i<5; i++){
			jButtonOperator[i] = new JButton();
			jButtonOperator[i].setSize(45, 40);
			jButtonOperator[i].setFont(new Font("Calibri", 0, 17));
			jButtonOperator[i].setBackground(new Color(188, 188, 188));
			jButtonOperator[i].setBorder(null);
		}
		jButtonOperator[0].setText("+"); jButtonOperator[0].setLocation(173, 350);
		jButtonOperator[1].setText("-"); jButtonOperator[1].setLocation(173, 310);
		jButtonOperator[2].setText("x"); jButtonOperator[2].setLocation(173, 270);
		jButtonOperator[3].setText("/"); jButtonOperator[3].setLocation(173, 230);
		jButtonOperator[4].setText("="); jButtonOperator[4].setBounds(220, 310, 45, 80);
		jButtonOperator[4].setFont(new Font("Arial", 0, 19));
			
		
		//Memory Buttons
		for(int i=0; i<2; i++){
			jButtonMemory[i] = new JButton(); 
			jButtonMemory[i].setSize(50, 33);
			jButtonMemory[i].setFont(new Font("Arial", 0, 13));
			jButtonMemory[i].setBorder(null);
		}
		jButtonMemory[0].setText("M"); jButtonMemory[0].setLocation(10, 185);
		jButtonMemory[1].setText("MS"); jButtonMemory[1].setLocation(60, 185);
		
		//Clear Buttons
		for(int i=0; i<3; i++){
			jButtonClear[i] = new JButton();
			jButtonClear[i].setSize(45, 33);
			jButtonClear[i].setFont(new Font("Vrinda", 0, 17));
			jButtonClear[i].setBorder(null);
		}
		jButtonClear[0].setText("C"); jButtonClear[0].setLocation(221, 185);
		jButtonClear[1].setText("AC"); jButtonClear[1].setLocation(266, 185);
		jButtonClear[2].setText("<B"); jButtonClear[2].setLocation(110, 185); jButtonClear[2].setSize(50, 33);

		//Display label
		for(int i=0; i<2; i++){
			jLabelDisplay[i] = new JLabel();
			jLabelDisplay[i].setSize(298, 45);
			jLabelDisplay[i].setHorizontalAlignment(4);
			jLabelDisplay[i].setFont(new Font("Calibri", 0, 18));
			jLabelDisplay[i].setBackground(new Color(100, 100, 90));
			jLabelDisplay[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		}
		jLabelDisplay[0].setLocation(10, 18);
		jLabelDisplay[1].setLocation(10, 63); jLabelDisplay[1].setSize(298, 60);
			jLabelDisplay[1].setFont(new Font("Calibri", 0, 22));
		
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		//adding toggle buttons
		for(int i=0; i<4; i++){
			add(jTButtonBase[i]);
		}
		
		//adding buttons
		for(int i=0; i<10; i++){
			add(jButtonNumerical[i]);
		}
		for(int i=0; i<6; i++){
			add(jButtonAlphaNumerical[i]);
		}
		add(jButtonPoint);
		for(int i=0; i<5; i++){
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

		//**Setting Criterion of the Frame**//
		setBounds(0, 0, 327, 475);
		setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/" +
				"BaseCalculatorBackground.jpg")));
			
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
		BaseCalculatorGui gui = new BaseCalculatorGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 332, 450);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
