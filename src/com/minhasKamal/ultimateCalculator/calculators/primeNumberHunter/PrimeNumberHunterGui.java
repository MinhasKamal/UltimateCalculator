/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 09-Jan-2014																								*
* Modification: 01-Jan-2015																						*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.primeNumberHunter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * A Prime Number Hunter Gui
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class PrimeNumberHunterGui extends JLabel{
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JLabel jLabelFT;
	JTextField[] jTFieldFT;
	JButton jButtonFind;

	JLabel jLabelOutput;
	JTextField jTFieldOutput;
	JScrollPane jSPaneOutput;
	JTextPane jTPaneOutput; 
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public PrimeNumberHunterGui() {

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
    	jLabelFT=new JLabel();
    	jTFieldFT=new JTextField[2];
    	jButtonFind=new JButton();
    	
    	jLabelOutput=new JLabel();
    	jTFieldOutput=new JTextField();
    	jSPaneOutput=new JScrollPane();
    	jTPaneOutput=new JTextPane();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
    	jLabelFT.setText(" Find Prime Number From                                        To");
    	jLabelFT.setFont(new Font("Arial", 0, 13));
    	jLabelFT.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    	jLabelFT.setForeground(new Color(24, 23, 25));
    	jLabelFT.setBounds(9, 8, 488, 35);
    	
    	for(int i=0; i<2; i++){
    		jTFieldFT[i]=new JTextField();
    		jTFieldFT[i].setBounds(165+i*175, 11, 150, 30);
    		jTFieldFT[i].setBackground(new Color(234, 233, 225));
    	}
    	jTFieldFT[0].setText("0");
    	
    	jButtonFind.setText("Find");
    	jButtonFind.setBounds(427, 52, 70, 30);
		jButtonFind.setBackground(new Color(214, 203, 195));
    	
    	jLabelOutput.setText(" Total Prime Numbers Found ");
    	jLabelOutput.setFont(new Font("Arial", 0, 13));
    	jLabelOutput.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
    	jLabelOutput.setForeground(new Color(24, 23, 25));
		jLabelOutput.setBounds(9, 50, 410, 35);
    	
    	jTFieldOutput.setEditable(false);
    	jTFieldOutput.setBounds(180, 53, 236, 30);
    	jTFieldOutput.setForeground(new Color(24, 23, 25));
    	jTFieldOutput.setBackground(new Color(234, 233, 225));
    	
    	jTPaneOutput.setEditable(false);
    	jTPaneOutput.setForeground(new Color(24, 23, 25));
    	jTPaneOutput.setFont(new Font("Lucida Console", 0, 13));
    	
    	jSPaneOutput.setViewportView(jTPaneOutput);
    	jSPaneOutput.setBounds(7, 90, 492, 350);
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
    	add(jLabelFT);
    	add(jTFieldFT[0]); add(jTFieldFT[1]);
    	add(jButtonFind);
    	add(jLabelOutput);
    	add(jTFieldOutput);
    	add(jSPaneOutput);
    	
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
    	setBounds(0, 0, 515, 495);
    	setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
    			"PrimeNumberHunterBackground.png")));
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
		PrimeNumberHunterGui gui = new PrimeNumberHunterGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(200, 115, 520, 495);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
