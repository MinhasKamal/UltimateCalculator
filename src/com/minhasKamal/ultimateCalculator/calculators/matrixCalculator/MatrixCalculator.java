package com.minhasKamal.ultimateCalculator.calculators.matrixCalculator;

import javax.swing.*;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;


public class MatrixCalculator extends UltimateCalculatorFrame{
	/**
	 * Variable Declaration												#*******D*******#
	**/
	private JLabel jLabelMain;
	private JLabel jLabelIO;
	
	private JLabel[] jLabelDisplay;
	private JTextField[] jTextFieldIO;
	
//	private JButton[] jButtonOperands;
//	private JButton[] jButtonOperator;
	//End of Variable Declaration										#_______D_______#
    
    
    //**  Constructor  **//
    public MatrixCalculator(){
    	
    	InitialComponent();
    }
    
    
    //**  Method for Initializing  **//
    private void InitialComponent(){
		/**
		 * Initialization 												#*******I*******#
		**/
    	jLabelMain=new JLabel();
    	jLabelIO=new JLabel();
    	
    	jLabelDisplay=new JLabel[2];
    	jTextFieldIO=new JTextField[9];
    	
//    	jButtonOperands = new JButton[3];
//    	jButtonOperator = new JButton[6];
    	//End of Initialization 										#_______I_______#
		
		
		
		
		/**
		 * Setting Bounds and Attributes of the Elements				#*******S*******#
		**/
    	//Main label
		jLabelMain.setBounds(0, 0, 330, 430);
		jLabelMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/" +
				"MatrixCalculatorBackground.jpg")));
		
		//Label for Input Output
		jLabelIO.setBounds(120, -25, 200, 210);
		jLabelIO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/" +
				"/MatrixCalculatorBrackets.png")));
		
		//Display label
		for(int i=0; i<2; i++){
			jLabelDisplay[i]=new JLabel();
			jLabelDisplay[i].setSize(70, 30);
			jLabelDisplay[i].setHorizontalAlignment(4);
			jLabelDisplay[i].setFont(new java.awt.Font("Lucida Console", 0, 16));
			jLabelDisplay[i].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			jLabelDisplay[i].setLocation(6+i*75, 65);
		}
		jLabelDisplay[1].setSize(35, 30);
		jLabelDisplay[1].setHorizontalAlignment(2);
		
		//Input text
		int row=0, col=0;
		for(int i=0; i<9; i++){
			jTextFieldIO[i] = new JTextField();
			jTextFieldIO[i].setSize(47, 30);
			jTextFieldIO[i].setHorizontalAlignment(4);
			jTextFieldIO[i].setFont(new java.awt.Font("Lucida Console", 0, 16));
			jTextFieldIO[i].setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			if(i==3){ col=1; row=0;}
			if(i==6){ col=2; row=0;}
			jTextFieldIO[i].setLocation(19+row*58, 49+col*42);
			row++;
		}
		
		
    	//End of Setting Bounds and Attributes 							#_______S_______#
		
		
		
		
		/**
		 * Adding Components											#*******A*******#
		**/
		jLabelMain.add(jLabelIO);
		
		//Display label
		for(int i=0; i<2; i++){
			jLabelMain.add(jLabelDisplay[i]);
		}
		
		//Input text
		for(int i=0; i<9; i++){
			jLabelIO.add(jTextFieldIO[i]);
		}
				
    	//End of Adding Components										#_______A_______#
		
		
		
    	//setting criterion of the frame
		super.gui.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		super.gui.setTitle("Matrix Calculator");
		super.gui.setResizable(false);
		super.gui.setBounds(230, 115, 327, 420);
		super.gui.add(jLabelMain);
		//setting criterion of the frame ends
    }
    
    
    /**
	 * Action Events													#********AE*******#
	**/
    
    //End of Action Events												#________AE_______#

    
    
    //**  Main Method  **//
    public static void main(String args[]) {
    	/* Set the NIMBUS look and feel */
    	try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");					
		} catch (Exception ex) {
			//do nothing if operation unsuccessful
		}

        /* Create and display the form */
        new MatrixCalculator();
    }
    
    
    /**
     * Auxiliary Methods												#********AM*******#
    **/
    
    //End of Auxiliary Methods											#________AM_______#
}
