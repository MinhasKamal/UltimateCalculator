/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 11-Jan-2014																								*
* Modified: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.simpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * A Simple Calculator
 * 
 * @author Minhas Kamal
 */
public class SimpleCalculator extends UltimateCalculatorFrame{
	// GUI Declaration
	private SimpleCalculatorGui simpleCalcGui;
	
	//operation object
	private SimpleCalculatorOperation scOperation;
	
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JButton[] jButtonNumerical;
	private JButton[] jButtonOperator;
	private JButton[] jButtonMemory;
	private JButton[] jButtonClear;
	private JButton jButtonPoint;
	
	private JLabel[] jLabelDisplay;
    
    //other variables
    private String number; 
    private double memory;
    private String operand1, operand2;
    private String operator;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public SimpleCalculator() {
		
    	number="";
    	memory=0.0;
    	operand1="";
    	operand2="";
    	operator="";
		
		initialComponent();
		
		super.jCBItemMode[0].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings("serial")
	private void initialComponent() {
		// GUI Initialization
		simpleCalcGui = new SimpleCalculatorGui();
		
		//operation object
		scOperation = new SimpleCalculatorOperation();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"SimpleCalculatorInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
		
		//**
		// Assignation 																			#*******A*******#
		//**
		jButtonNumerical = simpleCalcGui.jButtonNumerical;	//10 buttons(0-9)
		jButtonPoint = simpleCalcGui.jButtonPoint;			//point(.)
		jButtonOperator = simpleCalcGui.jButtonOperator;	//+, -, *, /, SQRT(), =
		jButtonMemory = simpleCalcGui.jButtonMemory;		//M, MS
		jButtonClear = simpleCalcGui.jButtonClear; 			//AC, C, back space
		
		jLabelDisplay = simpleCalcGui.jLabelDisplay;		//operation, result
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
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
		jButtonPoint.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_PERIOD,0), "POINT_pressed");
		jButtonPoint.getActionMap().put("POINT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonNumericalActionPerformed(evt);
	        }
	    });
		jButtonPoint.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jButtonNumericalActionPerformed(evt);
            }
        });
			
		//Operator Buttons
		for(int i=0; i<7; i++){
			jButtonOperator[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonOperatorActionPerformed(evt);
	            }
	        });
		}
		jButtonOperator[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,InputEvent.SHIFT_MASK), "PLUS_pressed");
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
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_8,InputEvent.SHIFT_MASK), "MULT_pressed");
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
		jButtonOperator[5].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,0), "EQL_pressed");
		jButtonOperator[5].getActionMap().put("EQL_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[4].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_R,0), "SQRT_pressed");
		jButtonOperator[4].getActionMap().put("SQRT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperatorActionPerformed(evt);
	        }
	    });
		jButtonOperator[6].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_6,InputEvent.SHIFT_MASK), "POW_pressed");
		jButtonOperator[6].getActionMap().put("POW_pressed", new AbstractAction() {
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
		
		//**Setting Criterion of the Frame**//
		super.gui.add(simpleCalcGui);
		super.gui.setTitle("Simple Calculator");
		super.gui.setBounds(230, 115, 276, 420);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	//numeric buttons
	private void jButtonNumericalActionPerformed(ActionEvent evt){
		if(number.length()<20){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				number=number+evt.getActionCommand();
			}
		}
		jLabelDisplay[0].setText(number);
	}
	//memory buttons
	private void jButtonMemoryActionPerformed(ActionEvent evt){
		if(evt.getActionCommand()=="M" || evt.getActionCommand().equals("m")){
			if((number+memory).length()<23){
				number=number+memory;
			}
			jLabelDisplay[0].setText(number);
		}else if(evt.getActionCommand()=="MS" || evt.getActionCommand().equals("s")){
			if(jLabelDisplay[1].getText().length()>0){
				memory=Double.parseDouble(jLabelDisplay[1].getText());
			}
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
		
		if(evt.getActionCommand().equals("=")){				//when '=' is pressed
			operand2=number;
			String ans=scOperation.operation(operand1, operand2, operator);
			
			jLabelDisplay[1].setText(ans);
			
			operator="";
		}else if(evt.getActionCommand()=="sqrt" || evt.getActionCommand().equals("r")){	
			String ans = scOperation.sqrt(jLabelDisplay[1].getText());
			jLabelDisplay[1].setText(ans);
		}else{											//when operator is pressed
			if(!number.isEmpty()){
				if(operator.isEmpty()){					//general time
					operand1=number;
					operator=evt.getActionCommand();
				}else{									//for chain work, eg. 2+3+4+....
					operand2=number;
					
					String ans=scOperation.operation(operand1, operand2, operator);
					jLabelDisplay[1].setText(ans);
					
					operand1=ans;
					operator=evt.getActionCommand();
				}
			}else{										//when some thing is done to the answer, eg.  ..=3 + 2 ...
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
		new SimpleCalculator();
	}
}
