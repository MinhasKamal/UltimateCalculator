/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 16-Jan-2014																								*
* Modified: 31-Dec-2014																							*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.mainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.calculators.advancedCalculator.AdvancedCalculator;
import com.minhasKamal.ultimateCalculator.calculators.baseCalculator.BaseCalculator;
import com.minhasKamal.ultimateCalculator.calculators.dateCalculator.DateCalculator;
import com.minhasKamal.ultimateCalculator.calculators.equationCalculator.EquationCalculator;
import com.minhasKamal.ultimateCalculator.calculators.primeNumberHunter.PrimeNumberHunter;
import com.minhasKamal.ultimateCalculator.calculators.simpleCalculator.SimpleCalculator;
import com.minhasKamal.ultimateCalculator.calculators.unitConverter.UnitConverter;
import com.minhasKamal.ultimateCalculator.help.about.About;
import com.minhasKamal.ultimateCalculator.help.developer.Profile;
import com.minhasKamal.ultimateCalculator.help.instruction.Instruction;


/**
 * This is the super class of all calculator frames, which contains all the common features.
 * 
 * @author Minhas Kamal
 */
public class UltimateCalculatorFrame{
	// GUI Declaration
	protected UltimateCalculatorFrameGui gui;
	
	//**
	// Variable Declaration 																	#*******D*******#
	//**
    protected JCheckBoxMenuItem jCBItemMode[];
    private JMenuItem jMenuItemInstruction, jMenuItemDeveloper, jMenuItemAbout;
    
    
    //other variables
    private int modes;
    protected String instruction;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public UltimateCalculatorFrame() {
		instruction="";
		
		initialComponent();
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	private void initialComponent() {
		// GUI Initialization
		gui = new UltimateCalculatorFrameGui();
		gui.setVisible(true);
		
		//**
		// Assignation 																			#*******A*******#
		//**
		jCBItemMode = gui.jCBItemMode;	//number of modes
		jMenuItemInstruction =  gui.jMenuItemInstruction;
		jMenuItemDeveloper = gui.jMenuItemDeveloper;
		jMenuItemAbout = gui.jMenuItemAbout;
		
		modes = gui.modes;
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
		for(int i=0; i<modes; i++) {
			jCBItemMode[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jCBItemModeActionPerformed(evt);
	            }
	        });
		}
		
		jMenuItemInstruction.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jMenuItemInstructionActionPerformed(evt);
            }
        });
		
		jMenuItemDeveloper.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jMenuItemDeveloperActionPerformed(evt);
            }
        });
		
		jMenuItemAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jMenuItemAboutActionPerformed(evt);
            }
        });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	//menu items
  	private void jCBItemModeActionPerformed(ActionEvent evt){
  		if(evt.getActionCommand()=="Simple"){
  			new SimpleCalculator();
  		}else if(evt.getActionCommand()=="Advanced"){
  			new AdvancedCalculator();
  		}else if(evt.getActionCommand()=="Base"){
  			new BaseCalculator();
  		}else if(evt.getActionCommand()=="Equation"){
  			new EquationCalculator();
  		}else if(evt.getActionCommand()=="Unit Converter"){
  			new UnitConverter();
  		}else if(evt.getActionCommand()=="Date Calculator"){
  			new DateCalculator();
  		}else if(evt.getActionCommand()=="Prime Number"){
  			new PrimeNumberHunter();
  		}
  		
  		gui.dispose();
  	}
  	private void jMenuItemInstructionActionPerformed(ActionEvent evt){
  		new Instruction(instruction).setVisible(true);
  	}
  	private void jMenuItemDeveloperActionPerformed(ActionEvent evt){
  		new Profile("17-Jan-2014");
  	}
  	private void jMenuItemAboutActionPerformed(ActionEvent e){
  		new About();
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
		new UltimateCalculatorFrame();
	}
}
