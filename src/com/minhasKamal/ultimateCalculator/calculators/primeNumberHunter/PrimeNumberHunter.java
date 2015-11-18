/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 09-Jan-2014																								*
* Modification: 01-Jan-2015																						*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.primeNumberHunter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.notifications.message.Message;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * A Prime Number Hunter. Hunts down prime number in its range.
 * 
 * @author Minhas Kamal
 */
public class PrimeNumberHunter extends UltimateCalculatorFrame{
	// GUI Declaration
	private PrimeNumberHunterGui primNumHunterGui;
	
	//operation object
	private PrimeNumberHunterOperation pnhOperation;
		
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JTextField[] jTFieldFT;
	private JButton jButtonFind;

	private JTextField jTFieldOutput;
	private JTextPane jTPaneOutput; 
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public PrimeNumberHunter() {

		initialComponent();
		
		super.jCBItemMode[6].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings("serial")
	private void initialComponent() {
		// GUI Initialization
		primNumHunterGui = new PrimeNumberHunterGui();
		
		//operation object
		pnhOperation = new PrimeNumberHunterOperation();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"PrimeNumberHunterInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
				
		//**
		// Assignation 																			#*******A*******#
		//**
    	jTFieldFT = primNumHunterGui.jTFieldFT;
    	jButtonFind = primNumHunterGui.jButtonFind;
    	
    	jTFieldOutput = primNumHunterGui.jTFieldOutput;
    	jTPaneOutput = primNumHunterGui.jTPaneOutput;
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
    	jButtonFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonFindActionPerformed(evt);
            }
        });
    	jButtonFind.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
    		put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "ENTER_pressed");
		jButtonFind.getActionMap().put("ENTER_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonFindActionPerformed(evt);
	        }
	    });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
		
		//**Setting Criterion of the Frame**//
		//add main label to main frame
		super.gui.add(primNumHunterGui);
		super.gui.setBounds(200, 115, 513, 495);
		super.gui.setTitle("Prime Number Hunter");
		super.gui.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		super.gui.setLayout(null);
		super.gui.setResizable(false);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	private void jButtonFindActionPerformed(ActionEvent evt){
	    try{
    		long start=Long.parseLong(jTFieldFT[0].getText());
	    	long finish=Long.parseLong(jTFieldFT[1].getText());
	    	
	    	String Data = pnhOperation.primeNumberFinder(start, finish);
	    	jTPaneOutput.setText(Data);
	    	
	    	long NumOfPrimes = pnhOperation.charNumber(Data, ',');
	    	jTFieldOutput.setText("    " + NumOfPrimes);
	    	
	    }catch(Exception e){
	    	new Message("Input Correctly. \nOnly numbers are allowed. \nor, You may have exceeded the range!", 420);
	    }
    }
	// End of Action Events 																	#_______AE_______#

	//**
	// Auxiliary Methods 																		#*******AM*******#
	//**
	
	// End of Auxiliary Methods 																#_______AM_______#
	
	//**
	// Unimplemented Methods 																	#*******UM*******#
	//**
	
	// End of Unimplemented Methods 															#_______UM_______#
	
	
	/********* Main Method *********/
	public static void main(String args[]) {
		/*// Set the NIMBUS look and feel //*/
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception ex) {
			// do nothing if operation is unsuccessful
		}

		/* Create */
		new PrimeNumberHunter();
	}
}
