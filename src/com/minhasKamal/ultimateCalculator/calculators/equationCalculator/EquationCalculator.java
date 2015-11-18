/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 15-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.equationCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * A Equation Calculator
 * 
 * @author Minhas Kamal
 */
public class EquationCalculator extends UltimateCalculatorFrame{
	// GUI Declaration
	private EquationCalculatorGui equaCalcGui;
	
	//necessary objects
	private EquationSovlerOperation equaSovlOperation;
	
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	//Equation Ax+By=C
    private JTextField jTFieldaxbyc[];
    private JButton jButtonaxbycSolve;
    
    //Equation Ax+By+Cz=D
    private JTextField jTFieldaxbyczd[];
    private JButton jButtonaxbyczdSolve;
    
  	//Equation Ax2+Bx=C
    private JTextField jTFieldax2bxc[];
    private JButton jButtonax2bxcSolve;
    
  	//Equation Ax3+Bx2+Cx=D
    private JTextField jTFieldax3bx2cxd[];
    private JButton jButtonax3bx2cxdSolve;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public EquationCalculator() {

		initialComponent();
		
		super.jCBItemMode[3].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings("serial")
	private void initialComponent() {
		// GUI Initialization
		equaCalcGui = new EquationCalculatorGui();
		
		//necessary objects
		equaSovlOperation = new EquationSovlerOperation();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"EquationCalculatorInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
				
		//**
		// Assignation 																			#*******A*******#
		//**
   		//Equation Ax+By=C
	    jTFieldaxbyc = equaCalcGui.jTFieldaxbyc;
	    jButtonaxbycSolve = equaCalcGui.jButtonaxbycSolve;
	    
	    //Equation Ax+By+Cz=D
	    jTFieldaxbyczd = equaCalcGui.jTFieldaxbyczd;
	    jButtonaxbyczdSolve = equaCalcGui.jButtonaxbyczdSolve;
	    
	  	//Equation Ax2+Bx=C
	    jTFieldax2bxc = equaCalcGui.jTFieldax2bxc;
	    jButtonax2bxcSolve = equaCalcGui.jButtonax2bxcSolve;
	    
	  	//Equation Ax3+Bx2+Cx=D
	    jTFieldax3bx2cxd = equaCalcGui.jTFieldax3bx2cxd;
	    jButtonax3bx2cxdSolve = equaCalcGui.jButtonax3bx2cxdSolve;
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
	    jButtonaxbycSolve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "SOLVE_pressed");
	    jButtonaxbycSolve.getActionMap().put("SOLVE_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonaxbycSolveActionPerformed(evt);
	        }
	    });
	    jButtonaxbycSolve.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonaxbycSolveActionPerformed(evt);
	        }
	    });
	    
	    jButtonaxbyczdSolve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "SOLVE_pressed");
	    jButtonaxbyczdSolve.getActionMap().put("SOLVE_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonaxbyczdSolveActionPerformed(evt);
	        }
	    });
	    jButtonaxbyczdSolve.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonaxbyczdSolveActionPerformed(evt);
	        }
	    });
	    
	    jButtonax2bxcSolve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "SOLVE_pressed");
	    jButtonax2bxcSolve.getActionMap().put("SOLVE_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonax2bxcSolveActionPerformed(evt);
	        }
	    });
	    jButtonax2bxcSolve.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonax2bxcSolveActionPerformed(evt);
	        }
	    });
	    
	    jButtonax3bx2cxdSolve.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0), "SOLVE_pressed");
	    jButtonax3bx2cxdSolve.getActionMap().put("SOLVE_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonax3bx2cxdSolveActionPerformed(evt);
	        }
	    });
	    jButtonax3bx2cxdSolve.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonax3bx2cxdSolveActionPerformed(evt);
	        }
	    });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
	    
	    //**Setting Criterion of the Frame**//
	    super.gui.add(equaCalcGui);
	    super.gui.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    super.gui.setTitle("Equation Calculator");
	    super.gui.setResizable(false);
	    super.gui.setBounds(230, 115, 276, 420);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	//solve button
   	private void jButtonaxbycSolveActionPerformed(ActionEvent evt){
   		String a1=jTFieldaxbyc[0].getText();
   		String b1=jTFieldaxbyc[1].getText();
   		String c1=jTFieldaxbyc[2].getText();
   		String a2=jTFieldaxbyc[3].getText();
   		String b2=jTFieldaxbyc[4].getText();
   		String c2=jTFieldaxbyc[5].getText();
   		
   		String[] xy=new String[2];
   		
   		xy = equaSovlOperation.AXBYC(a1, b1, c1, a2, b2, c2);
   		
   		jTFieldaxbyc[6].setText(xy[0]);
   		jTFieldaxbyc[7].setText(xy[1]);   		
   	}
   	private void jButtonaxbyczdSolveActionPerformed(ActionEvent evt){
   		String a1=jTFieldaxbyczd[0].getText();
   		String b1=jTFieldaxbyczd[1].getText();
   		String c1=jTFieldaxbyczd[2].getText();
   		String d1=jTFieldaxbyczd[3].getText();   		
   		String a2=jTFieldaxbyczd[4].getText();
   		String b2=jTFieldaxbyczd[5].getText();
   		String c2=jTFieldaxbyczd[6].getText();
   		String d2=jTFieldaxbyczd[7].getText();   	
   		String a3=jTFieldaxbyczd[8].getText();
   		String b3=jTFieldaxbyczd[9].getText();
   		String c3=jTFieldaxbyczd[10].getText();
   		String d3=jTFieldaxbyczd[11].getText();   	

   		String[] xyz=new String[3];
   		
   		xyz = equaSovlOperation.AXBYCZD(a1, b1, c1, d1, a2, b2, c2, d2, a3, b3, c3, d3);
   		
   		jTFieldaxbyczd[12].setText(xyz[0]);
   		jTFieldaxbyczd[13].setText(xyz[1]);   
   		jTFieldaxbyczd[14].setText(xyz[2]);   
   	}
	private void jButtonax2bxcSolveActionPerformed(ActionEvent evt){
		String a=jTFieldax2bxc[0].getText();
		String b=jTFieldax2bxc[1].getText();
		String c=jTFieldax2bxc[2].getText();
		
		String x[] = new String[2];
		
		x = equaSovlOperation.AX2BXC(a, b, c);
		
		jTFieldax2bxc[3].setText(x[0]);
		jTFieldax2bxc[4].setText(x[1]);		
	}
	private void jButtonax3bx2cxdSolveActionPerformed(ActionEvent evt){
		String a=jTFieldax3bx2cxd[0].getText();
		String b=jTFieldax3bx2cxd[1].getText();
		String c=jTFieldax3bx2cxd[2].getText();
		String d=jTFieldax3bx2cxd[3].getText();
		
		String x[] = new String[3];
		
		x = equaSovlOperation.AX3BX2CXD(a, b, c, d);
		
		jTFieldax3bx2cxd[4].setText(x[0]);
		jTFieldax3bx2cxd[5].setText(x[1]);	
		jTFieldax3bx2cxd[6].setText(x[2]);	
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
		new EquationCalculator();
	}
}
