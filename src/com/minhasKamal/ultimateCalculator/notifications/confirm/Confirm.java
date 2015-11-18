/************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																*
* Date: 03-Jun-2014																							*
*************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.notifications.confirm;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

/**
 * Shows a confirmation dialog.
 *
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class Confirm extends JDialog {
	//**
	// Variable Declaration 																				#*******D*******#
	//**
	private JLabel jLabelMain;
	private JLabel jLabelIcon;
	private JLabel jLabelText1, jLabelText2, jLabelText3;	
	private JButton jButtonYes, jButtonNo;
	
	//other variables
	private String[] message;
	private static int decision;	//0-No, 1-Yes
	// End of Variable Declaration 																			#_______D_______#

	
	/**
	 * Constructor.
	 * Shows message to the user & takes confirmation over an important decision.
	 * @param message main part of message to be shown
	 */
	public Confirm(String message) {
		this.message = getMessage("Are you sure?\n" + message);
		decision=0;

		initialComponent();
	}

	
	/**
	 * Method for Initializing all the GUI variables, placing them all to specific space on the frame and adding action
	 * listener to them. Also specifies criteria of the main frame.
	 */
	private void initialComponent() {
		//**
		// Initialization 																					#*******I*******#
		//**
		jLabelMain = new JLabel();
		jLabelIcon = new JLabel();
		jLabelText1 = new JLabel();	
		jLabelText2 = new JLabel();	
		jLabelText3 = new JLabel();	
		jButtonYes = new JButton();
		jButtonNo = new JButton();
		// End of Initialization																			#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 													#*******S*******#
		//**
		jLabelMain.setIcon(new ImageIcon(getClass().getResource("/res/imgs/ConfirmBackground.png")));
        jLabelMain.setBounds(0, 0, 400, 200);
        jLabelMain.setLayout(null);
        
        
        jLabelIcon.setBounds(10, 33, 70, 70);
       	jLabelIcon.setIcon(new ImageIcon(getClass().getResource("/res/imgs/ConfirmQuestion.png")));
        
        
        jLabelText1.setBounds(100, 40, 280, 25);
        jLabelText1.setFont(new Font("Lucida", 0, 16));
        jLabelText1.setText(message[0]);
        
        jLabelText2.setBounds(100, 65, 280, 25);
        jLabelText2.setFont(new Font("Lucida", 0, 16));
        jLabelText2.setText(message[1]);        
        
        jLabelText3.setBounds(100, 90, 280, 25);
        jLabelText3.setFont(new Font("Lucida", 0, 16));
        jLabelText3.setText(message[2]);        
        
        jButtonYes.setText("Yes");
        jButtonYes.setBounds(240, 130, 60, 30);
        jButtonYes.setBackground(new Color(212, 227, 250));
        jButtonYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonYesActionPerformed(evt);
            }
        });
        jButtonYes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "ENTER_pressed");
	    jButtonYes.getActionMap().put("ENTER_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonYesActionPerformed(evt);
	        }
	    });
	    
	    jButtonNo.setText("No");
	    jButtonNo.setBounds(310, 130, 60, 30);
	    jButtonNo.setBackground(new Color(212, 227, 250));
	    jButtonNo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonNoActionPerformed(evt);
            }
        });
	    jButtonNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_N,0), "N_pressed");
	    jButtonNo.getActionMap().put("ENTER_N", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNoActionPerformed(evt);
	        }
	    });
		// End of Setting Bounds and Attributes 															#_______S_______#

		//**
		// Adding Components 																				#*******A*******#
		//**
		jLabelMain.add(jLabelIcon);
		jLabelMain.add(jLabelText1);
		jLabelMain.add(jLabelText2);
		jLabelMain.add(jLabelText3);
		jLabelMain.add(jButtonYes);
		jLabelMain.add(jButtonNo);
		// End of Adding Components 																		#_______A_______#

		//**Setting Criterion of the Frame**//
		setIconImage(new ImageIcon(getClass().getResource("")).getImage());
		setBounds(240, 200, 400, 200);
		setTitle("Confirm");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		setResizable(false);
		setModal(true);
		add(jLabelMain);
		setVisible(true);
	}

	//**
	// Action Events 																						#********AE*******#
	//**
	private void jButtonYesActionPerformed(ActionEvent evt){
		decision=1;
		dispose();
	}
	
	private void jButtonNoActionPerformed(ActionEvent evt){
		decision=0;
		dispose();
	}
	// End of Action Events 																				#________AE_______#

	/**///Main Method
	public static void main(String args[]) {
		/*// Set the Web look and feel //*/
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception ex) {
			// do nothing if operation is unsuccessful
		}

		/* Create and display the form */
		new Confirm("Hi You are grounded for your \ninsignificant and nonsence \nactions.");
	}
	/**/

	//**
	// Auxiliary Methods 																					#********AM*******#
	//**
	private String[] getMessage(String message){
		String[] messages = new String[3];
		
		if(message.contains("\n")){
			messages[0] = message.substring(0, message.indexOf("\n"));
			message = message.substring(message.indexOf("\n")+1);
			if(message.contains("\n")){
				messages[1] = message.substring(0, message.indexOf("\n"));
				messages[2] = message.substring(message.indexOf("\n")+1);
				
			}else{
				messages[1] = message;
			}
		}else{
			messages[0] = message;
		}
		
		
		return messages;
	}
	
	public static int getDecision(){
		return decision;
	}
	// End of Auxiliary Methods 																			#________AM_______#
}
