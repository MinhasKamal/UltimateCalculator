/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 16-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.advancedCalculator;

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
 * A Advanced Calculator GUI
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class AdvancedCalculatorGui extends JLabel{
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JButton[] jButtonNumerical;
	JButton[] jButtonOperator;
	JButton[] jButtonComplexOperator;
	JButton[] jButtonBracket;
	JButton[] jButtonMemory;
	JButton[] jButtonClear;
	JButton jButtonShift;
	JButton jButtonPoint;
	
	JLabel jLabelDisplay;
	JTextField jTextDisplay;
	JTextField[] jTextStore;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public AdvancedCalculatorGui() {

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
		jButtonNumerical=new JButton[10];			//10 buttons(0-9)
		jButtonPoint=new JButton();					//point(.)
		jButtonOperator=new JButton[7];				//+, -, *, /, SQRT(), =
		jButtonComplexOperator=new JButton[22];		//trigonometric, logarithm, factorial
		jButtonShift = new JButton();				//Inverter
		jButtonMemory=new JButton[2];				//M, MS
		jButtonBracket=new JButton[2];				// (, )
		jButtonClear=new JButton[3]; 				//AC, C, back space
		
		jLabelDisplay=new JLabel();					//result
		jTextDisplay=new JTextField();
		jTextStore=new JTextField[4];				//space to store
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
		//Numeric Buttons
		for(int i=0; i<10; i++){
			jButtonNumerical[i] = new JButton(""+i);
			jButtonNumerical[i].setSize(50, 40);
			jButtonNumerical[i].setLocation(((i-1)%3)*50+10, 280-(((i-1)/3)*40));
			jButtonNumerical[i].setFont(new Font("Calibri", 0, 19));
			jButtonNumerical[i].setBackground(new Color(200, 200, 190));
			jButtonNumerical[i].setBorder(null);
		}
		jButtonNumerical[0].setLocation(10, 320); jButtonNumerical[0].setSize(100, 40);
				
		
		//Point
		jButtonPoint.setBackground(new Color(210, 210, 190));
		jButtonPoint.setText("."); jButtonPoint.setBounds(110, 320, 50, 40);
		jButtonPoint.setFont(new Font("Vrinda", 0, 26));
			
		//Operator Buttons
		for(int i=0; i<7; i++){
			jButtonOperator[i] = new JButton();
			jButtonOperator[i].setSize(45, 40);
			jButtonOperator[i].setFont(new Font("Calibri", 0, 17));
			jButtonOperator[i].setBackground(new Color(188, 188, 188));
			jButtonOperator[i].setBorder(null);
		}
		jButtonOperator[0].setText("+"); jButtonOperator[0].setLocation(170, 320);
		jButtonOperator[1].setText("-"); jButtonOperator[1].setLocation(170, 280);
		jButtonOperator[2].setText("x"); jButtonOperator[2].setLocation(170, 240);
		jButtonOperator[3].setText("/"); jButtonOperator[3].setLocation(170, 200);
		jButtonOperator[5].setText("="); jButtonOperator[5].setBounds(215, 280, 45, 80);
			jButtonOperator[5].setFont(new Font("Arial", 0, 19));
		jButtonOperator[4].setText("sqrt"); jButtonOperator[4].setLocation(215, 240);
		jButtonOperator[6].setText("^"); jButtonOperator[6].setLocation(215, 200);
		
		
		//Complex Operator Buttons
		for(int i=0; i<22; i++){	
			jButtonComplexOperator[i] = new JButton();
			jButtonComplexOperator[i].setSize(53, 40);
			jButtonComplexOperator[i].setFont(new Font("Calibri", 0, 15));
			jButtonComplexOperator[i].setBackground(new Color(178, 178, 178));
			jButtonComplexOperator[i].setBorder(null);
		}
		jButtonComplexOperator[0].setLocation(270, 320); jButtonComplexOperator[0].setText("tan");
			jButtonComplexOperator[1].setLocation(324, 320); jButtonComplexOperator[1].setText("cbrt");
			jButtonComplexOperator[2].setLocation(600, 320); jButtonComplexOperator[2].setText("atan");
			jButtonComplexOperator[3].setLocation(600, 320); jButtonComplexOperator[3].setText("tanh");
			jButtonComplexOperator[4].setLocation(378, 320); jButtonComplexOperator[4].setText("x 10^");
			jButtonComplexOperator[5].setLocation(432, 320); jButtonComplexOperator[5].setText("Ans");
			jButtonComplexOperator[6].setLocation(270, 280); jButtonComplexOperator[6].setText("cos");
			jButtonComplexOperator[7].setLocation(324, 280); jButtonComplexOperator[7].setText("cube");
			jButtonComplexOperator[8].setLocation(600, 280); jButtonComplexOperator[8].setText("acos");
			jButtonComplexOperator[9].setLocation(600, 280); jButtonComplexOperator[9].setText("cosh");
			jButtonComplexOperator[10].setLocation(378, 280); jButtonComplexOperator[10].setText("ln");
			jButtonComplexOperator[11].setLocation(432, 280); jButtonComplexOperator[11].setText("PI");
			jButtonComplexOperator[12].setLocation(270, 240); jButtonComplexOperator[12].setText("sin");
			jButtonComplexOperator[13].setLocation(324, 240); jButtonComplexOperator[13].setText("sqre");
			jButtonComplexOperator[14].setLocation(600, 240); jButtonComplexOperator[14].setText("asin");
			jButtonComplexOperator[15].setLocation(600, 240); jButtonComplexOperator[15].setText("sinh");
			jButtonComplexOperator[16].setLocation(378, 240); jButtonComplexOperator[16].setText("log");
			jButtonComplexOperator[17].setLocation(432, 240); jButtonComplexOperator[17].setText("E");
			jButtonComplexOperator[18].setLocation(270, 200); jButtonComplexOperator[18].setText("nPr");
			jButtonComplexOperator[19].setLocation(324, 200); jButtonComplexOperator[19].setText("nCr");
			jButtonComplexOperator[20].setLocation(378, 200); jButtonComplexOperator[20].setText("n!");
			jButtonComplexOperator[21].setLocation(432, 200); jButtonComplexOperator[21].setText("mod");
			

		//shift button
		jButtonShift.setText("Shift");
		jButtonShift.setBounds(270, 150, 105, 33);
		jButtonShift.setBorder(null);
			
		//Memory Buttons
		for(int i=0; i<2; i++){
			jButtonMemory[i] = new JButton(); 
			jButtonMemory[i].setSize(50, 33);
			jButtonMemory[i].setFont(new Font("Arial", 0, 13));
			jButtonMemory[i].setBorder(null);
		}
		jButtonMemory[0].setText("M"); jButtonMemory[0].setLocation(10, 150);
		jButtonMemory[1].setText("MS"); jButtonMemory[1].setLocation(60, 150);
		
		//bracket button
		for(int i=0; i<2; i++){
			jButtonBracket[i] = new JButton();
			jButtonBracket[i].setSize(45, 33);
			jButtonBracket[i].setFont(new Font("Arial", 0, 13));
			jButtonBracket[i].setBorder(null);
		}
		jButtonBracket[0].setText("("); jButtonBracket[0].setLocation(170, 150);
		jButtonBracket[1].setText(")"); jButtonBracket[1].setLocation(215, 150);
		
		//Clear Buttons
		for(int i=0; i<3; i++){
			jButtonClear[i] = new JButton();
			jButtonClear[i].setSize(53, 33);
			jButtonClear[i].setFont(new Font("Vrinda", 0, 17));
			jButtonClear[i].setBorder(null);
		}
		jButtonClear[0].setText("C"); jButtonClear[0].setLocation(378, 150);
		jButtonClear[1].setText("AC"); jButtonClear[1].setLocation(432, 150);
		jButtonClear[2].setText("<B"); jButtonClear[2].setLocation(110, 150); jButtonClear[2].setSize(50, 33);
		
		//Display text
		jTextDisplay.setSize(360, 43);
		jTextDisplay.setHorizontalAlignment(2);
		jTextDisplay.setFont(new Font("Tahoma", 0, 17));
		jTextDisplay.setBackground(new Color(220, 220, 220));
		jTextDisplay.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		jTextDisplay.setLocation(10, 18);
		jTextDisplay.setEditable(false);
		
		//Display label
		jLabelDisplay.setSize(360, 60);
		jLabelDisplay.setHorizontalAlignment(4);
		jLabelDisplay.setFont(new Font("Lucida Console", 0, 20));
		jLabelDisplay.setBorder(new SoftBevelBorder(BevelBorder.LOWERED));
		jLabelDisplay.setLocation(10, 63);
		
			
		//text field for store
		for(int i=0; i<4; i++){
			jTextStore[i] = new JTextField();
			jTextStore[i].setSize(105, 25);
			jTextStore[i].setBackground(new Color(235, 235, 235));
			jTextStore[i].setCaretColor(new Color(178, 178, 78));
		}
		jTextStore[0].setLocation(382, 16);
		jTextStore[1].setLocation(382, 44);
		jTextStore[2].setLocation(382, 72);
		jTextStore[3].setLocation(382, 100);
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
		//adding buttons
		for(int i=0; i<10; i++){
			add(jButtonNumerical[i]);
		}
		add(jButtonPoint);
		for(int i=0; i<7; i++){
			add(jButtonOperator[i]);
		}
		for(int i=0; i<22; i++){
			add(jButtonComplexOperator[i]);
		}
		for(int i=0; i<2; i++){
			add(jButtonMemory[i]);
		}
		for(int i=0; i<3; i++){
			add(jButtonClear[i]);
		}
		add(jButtonShift);
		for(int i=0; i<2; i++){
			add(jButtonBracket[i]);
		}
		
		//adding display labels
		add(jLabelDisplay);
		add(jTextDisplay);
		
		//adding text fields
		for(int i=0; i<4; i++){
			add(jTextStore[i]);
		}
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
		setBounds(0, 0, 500, 410);
		setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/" +
				"AdvancedCalculatorBackground.jpg")));
		
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
		AdvancedCalculatorGui gui = new AdvancedCalculatorGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 510, 420);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
