/************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																*
* Date: 03-Jun-2014																							*
*************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.notifications.message;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;


/**
 * Shows different types of messages.
 *
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class Message extends JDialog {
	public static final int NORMAL_MESSAGE = 0;
	public static final int CONFIRMATION_MESSAGE = 1;
	public static final int WARNING_MESSAGE = 210;
	public static final int ERROR_MESSAGE = 420;
	
	//**
	// Variable Declaration 																				#*******D*******#
	//**
	private JLabel jLabelMain;
	private JLabel jLabelIcon;
	private JLabel[] jLabelText;	
	private JButton jButtonOK;
	
	//other variables
	private String[] message;
	private int messageType;
	// End of Variable Declaration 																			#_______D_______#

	
	/**
	 * Constructor.
	 * Shows message to the user to guide or give information of the operation status.
	 * @param message main part of message to be shown
	 * @param messageType type of message, like- plain message(0), confirmation message(1), warning message(210) and
	 * 	error message(420)
	 */
	public Message(String message, int messageType) {
		this.message = getMessage(message);
		this.messageType=messageType;

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
		jLabelText = new JLabel[3];	
		jButtonOK = new JButton();
		// End of Initialization																			#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 													#*******S*******#
		//**
		jLabelMain.setIcon(new ImageIcon(getClass().getResource("/res/imgs/MessageBackground.png")));
        jLabelMain.setBounds(0, 0, 400, 200);
        jLabelMain.setLayout(null);
        
        
        jLabelIcon.setBounds(10, 33, 70, 70);
        if(messageType==CONFIRMATION_MESSAGE){
        	jLabelIcon.setIcon(new ImageIcon(getClass().getResource("/res/imgs/MessageConfirmation.png")));
        }else if(messageType==WARNING_MESSAGE){
        	jLabelIcon.setIcon(new ImageIcon(getClass().getResource("/res/imgs/MessageWarning.png")));
        }else if(messageType==ERROR_MESSAGE){
        	jLabelIcon.setIcon(new ImageIcon(getClass().getResource("/res/imgs/MessageError.png")));
        }else {
        	jLabelIcon.setIcon(new ImageIcon(getClass().getResource("/res/imgs/MessageNormal.png")));
        }
        
        for(int i=0; i<3; i++){
        	jLabelText[i] = new JLabel();
	        jLabelText[i].setBounds(100, 40+i*25, 280, 25);
	        jLabelText[i].setFont(new Font("Lucida", 0, 16));
	        jLabelText[i].setText(message[i]);
		}
        
        jButtonOK.setText("OK");
        jButtonOK.setBounds(310, 130, 60, 30);
        jButtonOK.setBackground(new Color(212, 227, 250));
        jButtonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonOKActionPerformed(evt);
            }
        });
        jButtonOK.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "ENTER_pressed");
	    jButtonOK.getActionMap().put("ENTER_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOKActionPerformed(evt);
	        }
	    });
		// End of Setting Bounds and Attributes 															#_______S_______#

		//**
		// Adding Components 																				#*******A*******#
		//**
		jLabelMain.add(jLabelIcon);
		jLabelMain.add(jLabelText[0]);
		jLabelMain.add(jLabelText[1]);
		jLabelMain.add(jLabelText[2]);
		jLabelMain.add(jButtonOK);
		// End of Adding Components 																		#_______A_______#

		//**Setting Criterion of the Frame**//
		setIconImage(new ImageIcon(getClass().getResource("")).getImage());
		setBounds(240, 200, 400, 200);
		setTitle("Message");
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
	private void jButtonOKActionPerformed(ActionEvent evt){
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
		new Message("Hi You are grounded for your \ninsignificant and nonsence \nactions.", Message.CONFIRMATION_MESSAGE);
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
	// End of Auxiliary Methods 																			#________AM_______#
}
