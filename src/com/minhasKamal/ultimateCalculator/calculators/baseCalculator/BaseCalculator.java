/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 14-Jan-2014																								*
* Modified: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.baseCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * 
 * 
 * @author Minhas Kamal
 */
public class BaseCalculator extends UltimateCalculatorFrame{
	// GUI Declaration
	private BaseCalculatorGui baseCalcGui;
	
	//operation object
	private BaseCalculatorOperation bcOperation;
	
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JToggleButton[] jTButtonBase;
	
	private JButton[] jButtonNumerical;
	private JButton[] jButtonAlphaNumerical;
	private JButton[] jButtonOperator;
	private JButton[] jButtonMemory;
	private JButton[] jButtonClear;
	private JButton jButtonPoint;
	
	private JLabel[] jLabelDisplay;
	
    //other variables
    private String number;
    private String operand1="";
    private String operand2="";
    private String operator="";
    private String memory;
    private int base;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public BaseCalculator() {
		number="";
	    memory="";
		
		initialComponent();
		
		super.jCBItemMode[2].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings("serial")
	private void initialComponent() {
		// GUI Initialization
		baseCalcGui = new BaseCalculatorGui();
		
		//operation object
		bcOperation = new BaseCalculatorOperation();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"BaseCalculatorInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
				
		//**
		// Assignation 																			#*******A*******#
		//**
		jTButtonBase = baseCalcGui.jTButtonBase;
		
		jButtonNumerical = baseCalcGui.jButtonNumerical;			//10 buttons(0-9)
		jButtonPoint = baseCalcGui.jButtonPoint;					//point(.)
		jButtonAlphaNumerical = baseCalcGui.jButtonAlphaNumerical;	//A-F
		jButtonOperator = baseCalcGui.jButtonOperator;				//+, -, *, /, SQRT(), =
		jButtonMemory = baseCalcGui.jButtonMemory;					//M, MS
		jButtonClear = baseCalcGui.jButtonClear; 					//AC, C, back space
		
		jLabelDisplay = baseCalcGui.jLabelDisplay;					//operation, result
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
		//toggle buttons base
		for(int i=0; i<4; i++){
			jTButtonBase[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jTButtonBaseActionPerformed(evt);
	            }
	        });
		}
		jTButtonBase[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.CTRL_MASK), "BIN_pressed");
		jTButtonBase[0].getActionMap().put("BIN_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jTButtonBaseActionPerformed(evt);
	        	
	        }
	    });
		jTButtonBase[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK), "OCT_pressed");
		jTButtonBase[1].getActionMap().put("OCT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jTButtonBaseActionPerformed(evt);
	        	
	        }
	    });
		jTButtonBase[2].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_MASK), "DEC_pressed");
		jTButtonBase[2].getActionMap().put("DEC_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jTButtonBaseActionPerformed(evt);
	        	
	        }
	    });
		jTButtonBase[3].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.CTRL_MASK), "HEX_pressed");
		jTButtonBase[3].getActionMap().put("HEX_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jTButtonBaseActionPerformed(evt);
	        	
	        }
	    });
	
		//Numeric Buttons
		for(int i=0; i<10; i++){
			jButtonNumerical[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonNumericalActionPerformed(evt);
	            }
	        });
			jButtonNumerical[i].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
				put(KeyStroke.getKeyStroke(48+i, 0), i+"_pressed");
			jButtonNumerical[i].getActionMap().put(i+"_pressed", new AbstractAction() {
				public void actionPerformed(ActionEvent evt) {
					jButtonNumericalActionPerformed(evt);
				}
			});
		}
	
		//Point
		//disabled
		jButtonPoint.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
        });
			
		//Alpha Numerical Buttons
		for(int i=0; i<6; i++){
			jButtonAlphaNumerical[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonNumericalActionPerformed(evt);
	            }
	        });
		}
		jButtonAlphaNumerical[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.SHIFT_MASK), "A_pressed");
		jButtonAlphaNumerical[0].getActionMap().put("A_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonAlphaNumerical[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.SHIFT_MASK), "B_pressed");
		jButtonAlphaNumerical[1].getActionMap().put("B_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonAlphaNumerical[2].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.SHIFT_MASK), "C_pressed");
		jButtonAlphaNumerical[2].getActionMap().put("C_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonAlphaNumerical[3].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.SHIFT_MASK), "D_pressed");
		jButtonAlphaNumerical[3].getActionMap().put("D_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonAlphaNumerical[4].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.SHIFT_MASK), "E_pressed");
		jButtonAlphaNumerical[4].getActionMap().put("E_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonAlphaNumerical[5].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.SHIFT_MASK), "F_pressed");
		jButtonAlphaNumerical[5].getActionMap().put("F_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		
		
		//Operator Buttons
		for(int i=0; i<5; i++){
			jButtonOperator[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonOperatorActionPerformed(evt);
	            }
	        });
		}
		jButtonOperator[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS, InputEvent.SHIFT_MASK), "PLUS_pressed");
		jButtonOperator[0].getActionMap().put("PLUS_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,0), "MINUS_pressed");
		jButtonOperator[1].getActionMap().put("MINUS_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[2].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_8, InputEvent.SHIFT_MASK), "MULT_pressed");
		jButtonOperator[2].getActionMap().put("MULT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[3].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH,0), "DIVD_pressed");
		jButtonOperator[3].getActionMap().put("DIVD_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[4].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,0), "EQL_pressed");
		jButtonOperator[4].getActionMap().put("EQL_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
			
		
		//Memory Buttons
		for(int i=0; i<2; i++){
			jButtonMemory[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonMemoryActionPerformed(evt);
	            }
	        });
		}
		jButtonMemory[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_M,0), "MEM_pressed");
		jButtonMemory[0].getActionMap().put("MEM_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonMemoryActionPerformed(evt);
	        }
	    });
		jButtonMemory[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_S,0), "STO_pressed");
		jButtonMemory[1].getActionMap().put("STO_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonMemoryActionPerformed(evt);
	        }
	    });
		
		//Clear Buttons
		for(int i=0; i<3; i++){
			jButtonClear[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonClearActionPerformed(evt);
	            }
	        });
		}
		jButtonClear[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_C,0), "CLR_pressed");
		jButtonClear[0].getActionMap().put("CLR_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonClearActionPerformed(evt);
	        }
	    });
		jButtonClear[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_A,0), "ACLR_pressed");
		jButtonClear[1].getActionMap().put("ACLR_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonClearActionPerformed(evt);
	        }
	    });
		jButtonClear[2].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE,0), "BSPACE_pressed");
		jButtonClear[2].getActionMap().put("BSPACE_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonClearActionPerformed(evt);
	        }
	    });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
		
		/*Some extra settings*/
		jTButtonBase[2].setSelected(true);
		base=3;
		for(int i=0; i<6; i++){
			jButtonAlphaNumerical[i].setEnabled(false);
		}
		//end
		
		//**Setting Criterion of the Frame**//
		super.gui.add(baseCalcGui);
		super.gui.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		super.gui.setTitle("Base Calculator");
		super.gui.setResizable(false);
		super.gui.setBounds(230, 115, 327, 450);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	//Base Buttons
	private void jTButtonBaseActionPerformed(ActionEvent evt){
		for(int i=0; i<4; i++){
			jTButtonBase[i].setSelected(false);
		}
		
		jLabelDisplay[0].setText("");
		number="";
		operand1="";
		operand2="";
		operator="";
		memory="";
		
		if(evt.getActionCommand()=="Bin" || evt.getActionCommand().equals("")){
			jTButtonBase[0].setSelected(true);
			
			jLabelDisplay[1].setText(bcOperation.conversion(base, 1, jLabelDisplay[1].getText()));
			base=1;
			
			for(int i=2; i<10; i++){
				jButtonNumerical[i].setEnabled(false);
			}
			for(int i=0; i<6; i++){
				jButtonAlphaNumerical[i].setEnabled(false);
			}
		}else if(evt.getActionCommand()=="Oct" || evt.getActionCommand().equals("")){
			jTButtonBase[1].setSelected(true);

			jLabelDisplay[1].setText(bcOperation.conversion(base, 2, jLabelDisplay[1].getText()));
			base=2;

			for(int i=2; i<8; i++){
				jButtonNumerical[i].setEnabled(true);
			}
			for(int i=8; i<10; i++){
				jButtonNumerical[i].setEnabled(false);
			}
			for(int i=0; i<6; i++){
				jButtonAlphaNumerical[i].setEnabled(false);
			}
		}else if(evt.getActionCommand()=="Dec" || evt.getActionCommand().equals("")){
			jTButtonBase[2].setSelected(true);

			jLabelDisplay[1].setText(bcOperation.conversion(base, 3, jLabelDisplay[1].getText()));
			base=3;

			for(int i=2; i<10; i++){
				jButtonNumerical[i].setEnabled(true);
			}
			for(int i=0; i<6; i++){
				jButtonAlphaNumerical[i].setEnabled(false);
			}
		}else if(evt.getActionCommand()=="Hex" || evt.getActionCommand().equals("")){
			jTButtonBase[3].setSelected(true);

			jLabelDisplay[1].setText(bcOperation.conversion(base, 4, jLabelDisplay[1].getText()));
			base=4;

			for(int i=2; i<10; i++){
				jButtonNumerical[i].setEnabled(true);
			}
			for(int i=0; i<6; i++){
				jButtonAlphaNumerical[i].setEnabled(true);
			}
			
		}
	}
	
	//Numerical Buttons
	private void jButtonNumericalActionPerformed(ActionEvent evt){
		if(base==1 && number.length()<19){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				number=number+evt.getActionCommand();
			}
		}else if(base==2 && number.length()<16){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				number=number+evt.getActionCommand();
			}
		}else if(base==3 && number.length()<15){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				number=number+evt.getActionCommand();
			}
		}else if(base==4 && number.length()<12){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				number=number+evt.getActionCommand();
			}
		}
		
		jLabelDisplay[0].setText(number);
	}
	
	//memory buttons
	private void jButtonMemoryActionPerformed(ActionEvent evt){
		if(evt.getActionCommand()=="M" || evt.getActionCommand().equals("m")){
			if((number+memory).length()<12){
				number=number+memory;
			}
			jLabelDisplay[0].setText(number);
		}else if(evt.getActionCommand()=="MS" || evt.getActionCommand().equals("s")){
				memory=jLabelDisplay[1].getText();
		}
	}
	//clear buttons
	private void jButtonClearActionPerformed(ActionEvent evt){
		if(evt.getActionCommand()=="<B" || evt.getActionCommand().equals("\b")){
			if(number.length()>0){
				number=number.substring(0, number.length()-1);
			}
			jLabelDisplay[0].setText(number);
		}else if(evt.getActionCommand()=="C" || evt.getActionCommand().equals("c")){
			number="";
			jLabelDisplay[0].setText(number);
		}else if(evt.getActionCommand()=="AC" || evt.getActionCommand().equals("a")){
			number="";
			operand1="";
			operand2="";
			operator="";
			jLabelDisplay[0].setText("");
			jLabelDisplay[1].setText("");
		}
	}
	
	//operand buttons
	private void jButtonOperatorActionPerformed(ActionEvent evt){
		
		if(evt.getActionCommand().equals("=")){			//when '=' is pressed
			operand2=number;	//take the input
			
			String ans=bcOperation.operation(base, operand1, operand2, operator);	//calculate the result
			
			jLabelDisplay[1].setText(ans);	//show the answer
			
			operator="";					//empty operator
		}else{										//when operator is pressed
			if(!number.isEmpty()){
				if(operator.isEmpty()){	//general time
					operand1=number;
					operator=evt.getActionCommand();
				}else{	//for chain work, eg. 2+3+4+....
					operand2=number;	//get the input
					
					String ans=bcOperation.operation(base, operand1, operand2, operator);//calculate
					jLabelDisplay[1].setText(ans);		//show ans.
					
					operand1=ans;	//take the ans as the input
					operator=evt.getActionCommand();	//get the operator
				}
			}else{	//when some thing is done to the answer, eg.  ..=3 + 2 ...
				operand1=jLabelDisplay[1].getText();	//get the ans.
				operator=evt.getActionCommand();		//get the operator
			}
		}
		
		number="";						//empty input string
		jLabelDisplay[0].setText("");	//empty input space
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
		new BaseCalculator();
	}
}
