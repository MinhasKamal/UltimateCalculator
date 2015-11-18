/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 01-Jan-2014																								*
* Modified: 14-Jul-2014																							*
* Modified: 31-Dec-2014																							*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.help.about;


import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * Shows necessary information over the software.
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class AboutGui extends JFrame {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JLabel jLabelMain;
	JScrollPane jScrollPane;
	JTextArea jTextAreaNotification;
	JButton jButtonOK;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public AboutGui() {

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
		jLabelMain=new JLabel();
		jScrollPane = new JScrollPane();
		jTextAreaNotification = new JTextArea();
		jButtonOK = new JButton();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		jLabelMain.setIcon(new ImageIcon(getClass().getResource("/res/imgs/AboutBackground.jpg")));
        jLabelMain.setBounds(0, 0, 370, 425);
        jLabelMain.setLayout(null);
        
		
		jScrollPane.setViewportView(jTextAreaNotification);
		jScrollPane.setBounds(10, 10, 348, 356);
		jScrollPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		jScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
        jTextAreaNotification.setForeground(new Color(102, 0, 106));
        jTextAreaNotification.setSelectedTextColor(new Color(255, 170, 255));
        jTextAreaNotification.setSelectionColor(new Color(80, 0, 80));
        jTextAreaNotification.setFont(new Font("Gabriola", 0, 19)); // NOI18N
        jTextAreaNotification.setEditable(false);
        jTextAreaNotification.setLineWrap(true);
        jTextAreaNotification.setWrapStyleWord(true);
        
        jButtonOK.setText("OK");
        jButtonOK.setBounds(297, 380, 60, 30);
        jButtonOK.setBackground(new Color(212, 227, 250));
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
        jLabelMain.add(jScrollPane); 
        jLabelMain.add(jButtonOK);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
        setIconImage(new ImageIcon(getClass().getResource("/res/imgs/AboutIcon.png")).getImage());
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(200, 150, 375, 450);
		setTitle("About");
		setLayout(null);
		add(jLabelMain);
		setResizable(false);
		setFocusable(true);
	}

	/********* Main Method *********/
	public static void main(String args[]) {
		/*// Set the NIMBUS look and feel //*/
		try {
			javax.swing.UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
		} catch (Exception ex) {
			// do nothing if operation is unsuccessful
		}

		/* Create and display the form */
		AboutGui gui = new AboutGui();
		gui.setVisible(true);
	}
}
