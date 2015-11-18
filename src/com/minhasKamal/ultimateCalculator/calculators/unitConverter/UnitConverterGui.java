/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 04-Jan-2014																								*
* Modified: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;


/**
 * A Unit Converter GUI
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class UnitConverterGui extends JLabel {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	@SuppressWarnings("rawtypes")
	JComboBox jCBoxTypeSelection;
	@SuppressWarnings("rawtypes")
	JComboBox[] jComboBoxType;
 
    JLabel[] jlabelIdentifier;
    JTextField[] jTFieldIO;
    JButton jButtonConvert;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public UnitConverterGui() {

		initialComponent();
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialComponent() {
		//**
		// Initialization 																		#*******I*******#
		//**
		jlabelIdentifier = new JLabel[2];
		jCBoxTypeSelection = new JComboBox(); 
		jComboBoxType = new JComboBox[2]; 
		
		jTFieldIO = new JTextField[2];
		jButtonConvert = new JButton();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		//Main combo box
		jCBoxTypeSelection.setBounds(10, 10, 325, 35);
		jCBoxTypeSelection.setBackground(new Color(154, 152, 151));
		jCBoxTypeSelection.setFont(new Font("Cambria", 0, 17));
		jCBoxTypeSelection.setModel(new DefaultComboBoxModel(new String[]{"  Length", "  Weight", "  Temperature", 
				"  Area", "  Volume", "  Time", "  Energy", "  Power"}));

		//loop for twins
		for(int i=0; i<2; i++){
			//Identification label
			jlabelIdentifier[i]=new JLabel();
			jlabelIdentifier[i].setBounds(18, 135+i*120, 40, 20);
			jlabelIdentifier[i].setFont(new Font("Vrinda", 1, 17));
			
			//combo boxes
			jComboBoxType[i]=new JComboBox();
			jComboBoxType[i].setBounds(10, 160+i*120, 140, 30);
			jComboBoxType[i].setBackground(new Color(134, 132, 131));
			jComboBoxType[i].setModel(new DefaultComboBoxModel(new String[] {"Angstrom", "Nanometer", "Micron", 
					"Millimeter", "Centimeter", "Meter", "KiloMeter", "Inch", "Feet", "Yard", "Nautical Mile", "Mile",
					"Rod"}));
			
			//text fields
			jTFieldIO[i]=new JTextField();
			jTFieldIO[i].setBounds(155, 160+i*120, 180, 30);
			jTFieldIO[i].setFont(new Font("Calibri", 0, 16));
			jTFieldIO[i].setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
//			jTFieldIO[i].setBackground(new Color(174, 172, 171));
		}
		jlabelIdentifier[0].setText("From");
		jlabelIdentifier[1].setText("To");
		jTFieldIO[1].setEditable(false);	//output is not editable
		
		//button
		jButtonConvert.setBounds(173, 220, 90, 30);
		jButtonConvert.setText("Convert");
		jButtonConvert.setBackground(new Color(194, 192, 191));
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		for(int i=0; i<2; i++){
			add(jlabelIdentifier[i]);
			
			add(jComboBoxType[i]);
				
			add(jTFieldIO[i]);
		}
		
		add(jButtonConvert);
		add(jCBoxTypeSelection);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
		//Main label
		setBounds(0, 0, 350, 400);
		setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
				"UnitConverterBackground.jpg")));
		setLayout(null);
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
		/* Create and display the form */
		UnitConverterGui gui = new UnitConverterGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 355, 400);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
