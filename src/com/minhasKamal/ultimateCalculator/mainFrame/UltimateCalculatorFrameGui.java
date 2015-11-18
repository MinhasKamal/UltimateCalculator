/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 16-Jan-2014																								*
* Modified: 31-Dec-2014																							*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.mainFrame;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.UIManager;


/**
 * This is the super class of all calculator frames, which contains all the common features.
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class UltimateCalculatorFrameGui extends JFrame {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JMenuBar jMenuBarMain;
	JMenu jMenuMode, jMenuHelp, jMenuAccessories;
    JCheckBoxMenuItem jCBItemMode[];
    JSeparator separator;
    JMenuItem jMenuItemInstruction, jMenuItemDeveloper, jMenuItemAbout;
    
    //other variables
    int modes;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public UltimateCalculatorFrameGui() {
		modes=7;
		
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
		jMenuBarMain = new JMenuBar();
		jMenuMode = new JMenu(); jMenuHelp = new JMenu(); jMenuAccessories = new JMenu();
		jCBItemMode = new JCheckBoxMenuItem[modes];	//number of modes
		separator = new JSeparator();
		jMenuItemInstruction =  new JMenuItem();
		jMenuItemDeveloper = new JMenuItem();
		jMenuItemAbout = new JMenuItem();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		//Menus
		jMenuMode.setText("Mode  ");
		jMenuHelp.setText("Help  ");
		jMenuAccessories.setText("Accessories");
		
		//Menu Items
		for(int i=0; i<modes; i++) {
			jCBItemMode[i] = new JCheckBoxMenuItem();
		}
		jCBItemMode[0].setText("Simple"); jCBItemMode[1].setText("Advanced"); 
			jCBItemMode[2].setText("Base"); jCBItemMode[3].setText("Equation");
			jCBItemMode[4].setText("Unit Converter"); jCBItemMode[5].setText("Date Calculator");
			jCBItemMode[6].setText("Prime Number");
		
		jMenuItemInstruction.setText("Instruction"); 
		jMenuItemInstruction.setIcon(new ImageIcon(getClass().getResource("/res/imgs/InstructionIcon.png"))); 
		
		jMenuItemDeveloper.setText("Developer");
		jMenuItemDeveloper.setIcon(new ImageIcon(getClass().getResource("/res/imgs/DeveloperIcon.png"))); 
		
		jMenuItemAbout.setText("About");
		jMenuItemAbout.setIcon(new ImageIcon(getClass().getResource("/res/imgs/AboutIcon.png"))); 
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		//adding menus to the menu bar
		jMenuBarMain.add(jMenuMode);
		jMenuBarMain.add(jMenuHelp);
		
		//adding menu items
		for(int i=0; i<4; i++) {
			jMenuMode.add(jCBItemMode[i]);	//adding modes
		}
		jMenuMode.add(separator);
		jMenuMode.add(jMenuAccessories);
		
		for(int i=4; i<modes; i++) {
			jMenuAccessories.add(jCBItemMode[i]);	//adding modes
		}
		jMenuHelp.add(jMenuItemInstruction); jMenuHelp.add(jMenuItemDeveloper);
		jMenuHelp.add(jMenuItemAbout);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
		setJMenuBar(jMenuBarMain);
		setTitle("Ultimate Calculator");
		setIconImage(new ImageIcon(getClass().getResource("/res/imgs/UltimateCalculatorIcon.png")).getImage());
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
    	setResizable(false);
    	setBounds(230, 115, 200, 300);
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
		UltimateCalculatorFrameGui gui = new UltimateCalculatorFrameGui();
		gui.setVisible(true);
	}
}
