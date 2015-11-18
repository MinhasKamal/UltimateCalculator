/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 10-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.dateCalculator;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * A Date Calculator Gui
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class DateCalculatorGui extends JLabel {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JLabel[] jLabelFT;
	JTextField[] jTFieldDay, jTFieldMonth, jTFieldYear;
	JButton jButtonCalculate;
	
	JLabel jLabelOutput;
	JTextField jTFieldOutput;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public DateCalculatorGui() {

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
    	jLabelFT=new JLabel[2];
    	jTFieldDay=new JTextField[2]; jTFieldMonth=new JTextField[2]; jTFieldYear=new JTextField[2];
    	jButtonCalculate=new JButton();
    	
    	jLabelOutput=new JLabel();
    	jTFieldOutput=new JTextField();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
    	//input space
    	for(int i=0; i<2; i++){
    		jLabelFT[i]=new JLabel();
    		jLabelFT[i].setBounds(10, 45+i*75, 275, 40);
        	jLabelFT[i].setFont(new Font("Calibri", 0, 18));
        	jLabelFT[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    		
    		jTFieldDay[i]=new JTextField();
        	jTFieldDay[i].setFont(new Font("Calibri", 0, 20));
    		jTFieldDay[i].setBounds(90, 48+i*75, 40, 35);
    		jTFieldDay[i].setBackground(new Color(244, 243, 241));
    		
    		jTFieldMonth[i]=new JTextField();
        	jTFieldMonth[i].setFont(new Font("Calibri", 0, 20));
        	jTFieldMonth[i].setBounds(145, 48+i*75, 40, 35);
    		jTFieldMonth[i].setBackground(new Color(244, 243, 241));

    		jTFieldYear[i]=new JTextField();
        	jTFieldYear[i].setFont(new Font("Calibri", 0, 20));
        	jTFieldYear[i].setBounds(200, 48+i*75, 80, 35);
    		jTFieldYear[i].setBackground(new Color(244, 243, 241));
    	}
    	jLabelFT[0].setText(" From                    -            -");
    	jLabelFT[1].setText(" To                         -            -");
    	
    	//button
    	jButtonCalculate.setText("Calculate");
    	jButtonCalculate.setBounds(200, 190, 80, 30);
    	jButtonCalculate.setBackground(new Color(244, 243, 241));
    	
    	//output
    	jLabelOutput.setText(" Difference  ");
    	jLabelOutput.setBounds(10, 255, 275, 42);
    	jLabelOutput.setFont(new Font("Calibri", 0, 17));
		jLabelOutput.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));

    	jTFieldOutput.setText("");
    	jTFieldOutput.setBounds(90, 257, 193, 39);
    	jTFieldOutput.setEditable(false);
    	jTFieldOutput.setFont(new Font("Calibri", 0, 17));
		jTFieldOutput.setBackground(new Color(234, 233, 231));
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		for(int i=0; i<2; i++){
    		add(jLabelFT[i]);
    		add(jTFieldDay[i]);
    		add(jTFieldMonth[i]);    		
    		add(jTFieldYear[i]);    		
    	}
    	add(jButtonCalculate);
    	add(jLabelOutput);
    	add(jTFieldOutput);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
    	setBounds(0, 0, 300, 400);
    	setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/" +
    			"DateCalculatorBackground.jpg")));
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
		DateCalculatorGui gui = new DateCalculatorGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 310, 420);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
