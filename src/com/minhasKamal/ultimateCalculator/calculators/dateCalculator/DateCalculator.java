/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 10-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.dateCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.notifications.message.Message;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * A Date Calculator
 * 
 * @author Minhas Kamal
 */
public class DateCalculator extends UltimateCalculatorFrame{
	// GUI Declaration
	private DateCalculatorGui dateCalcGui;
	
	//operation object
	private DateCalculatorOperation dcOperation;
		
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JTextField[] jTFieldDay, jTFieldMonth, jTFieldYear;
	private JButton jButtonCalculate;
	
	private JTextField jTFieldOutput;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public DateCalculator() {

		initialComponent();
		
		super.jCBItemMode[5].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings({ "deprecation", "serial" })
	private void initialComponent() {
		// GUI Initialization
		dateCalcGui = new DateCalculatorGui();
		
		//operation object
		dcOperation = new DateCalculatorOperation();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"DateCalculatorInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
				
		//**
		// Assignation 																			#*******A*******#
		//**
    	jTFieldDay = dateCalcGui.jTFieldDay; 
    	jTFieldMonth = dateCalcGui.jTFieldMonth; 
    	jTFieldYear = dateCalcGui.jTFieldYear;
    	jButtonCalculate = dateCalcGui.jButtonCalculate;
    	
    	jTFieldOutput = dateCalcGui.jTFieldOutput;
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
    	jButtonCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jButtonCalculateActionPerformed(evt);
            }
        });
    	jButtonCalculate.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "ENTER_pressed");
    	jButtonCalculate.getActionMap().put("ENTER_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonCalculateActionPerformed(evt);
	        }
	    });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
    	
    	/**
		 * Additional Work
		**/
    	Date date=new Date();
    	String 	d="",
    			m="";
    	
    	if(date.getDate()<10) d="0";
    	if(date.getMonth()<9) m="0";
    	
    	jTFieldDay[1].setText(d+date.getDate());
    	jTFieldMonth[1].setText(m+(date.getMonth()+1));
    	jTFieldYear[1].setText(""+(date.getYear()+1900));
		//Ends
    	
    	//Setting Criterion of the Frame//
    	super.gui.add(dateCalcGui);
    	super.gui.setTitle("Date Calculator");
    	super.gui.setBounds(230, 115, 300, 400);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	private void jButtonCalculateActionPerformed(ActionEvent evt){
    	int day1, month1, year1, day2, month2, year2;
    	String difference="";
    	
    	try{
	    	day1=Integer.parseInt(jTFieldDay[0].getText());
	    	month1=Integer.parseInt(jTFieldMonth[0].getText());
	    	year1=Integer.parseInt(jTFieldYear[0].getText());
	    	day2=Integer.parseInt(jTFieldDay[1].getText());
	    	month2=Integer.parseInt(jTFieldMonth[1].getText());
	    	year2=Integer.parseInt(jTFieldYear[1].getText());
	    	
	    	difference = dcOperation.Date(day1, month1, year1, day2, month2, year2);
    	}catch(Exception e){
    		new Message("Wrong Input! \nUse numbers only.", 420);
    	}
    	
    	jTFieldOutput.setText(difference);
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
		new DateCalculator();
	}
}
