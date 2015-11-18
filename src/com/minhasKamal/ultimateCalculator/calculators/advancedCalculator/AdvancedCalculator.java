/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 16-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.advancedCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.mainFrame.UltimateCalculatorFrame;
import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * A Advanced Calculator
 * 
 * @author Minhas Kamal
 */
public class AdvancedCalculator extends UltimateCalculatorFrame{
	// GUI Declaration
	private AdvancedCalculatorGui AdvCalcGui;
	
	//operational object
	private AdvancedCalculatorOperationsExecutor advCalcOptExecutor;
		
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JButton[] jButtonNumerical;
	private JButton[] jButtonOperator;
	private JButton[] jButtonComplexOperator;
	private JButton[] jButtonBracket;
	private JButton[] jButtonMemory;
	private JButton[] jButtonClear;
	private JButton jButtonShift;
	private JButton jButtonPoint;
	
	private JLabel jLabelDisplay;
	private JTextField jTextDisplay;
	
    //other variables
    private String inputString;
    private String number;
  	private boolean shiftOn;
  	private double memory;
  	private String ans;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public AdvancedCalculator() {
		inputString="";
    	number="";
    	shiftOn=false;
    	memory=0;
    	ans="";

		initialComponent();
		
		super.jCBItemMode[1].setSelected(true);
	}

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	@SuppressWarnings("serial")
	private void initialComponent() {
		// GUI Initialization
		AdvCalcGui = new AdvancedCalculatorGui();
		
		//operation object
		advCalcOptExecutor = new AdvancedCalculatorOperationsExecutor();
		
		//instruction
		try {
			super.instruction = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/" +
					"AdvancedCalculatorInstruction.txt"));
		} catch (Exception e) {
			super.instruction = "EMPTY";
		}
		
		//**
		// Assignation 																			#*******A*******#
		//**
		jButtonNumerical = AdvCalcGui.jButtonNumerical;					//10 buttons(0-9)
		jButtonPoint = AdvCalcGui.jButtonPoint;							//point(.)
		jButtonOperator = AdvCalcGui.jButtonOperator;					//+, -, *, /, SQRT(), =
		jButtonComplexOperator = AdvCalcGui.jButtonComplexOperator;		//trigonometric, logarithm, factorial
		jButtonShift = AdvCalcGui.jButtonShift;							//Inverter
		jButtonMemory = AdvCalcGui.jButtonMemory;						//M, MS
		jButtonBracket = AdvCalcGui.jButtonBracket;						// (, )
		jButtonClear = AdvCalcGui.jButtonClear; 						//AC, C, back space
		
		jLabelDisplay = AdvCalcGui.jLabelDisplay;						//result
		jTextDisplay = AdvCalcGui.jTextDisplay;
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
	            	jButtonOperator(evt);
	            }
	        });
		}
		jButtonOperator[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,InputEvent.SHIFT_MASK), "PLUS_pressed");
		jButtonOperator[0].getActionMap().put("PLUS_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,0), "MINUS_pressed");
		jButtonOperator[1].getActionMap().put("MINUS_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[2].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_8,InputEvent.SHIFT_MASK), "MULT_pressed");
		jButtonOperator[2].getActionMap().put("MULT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[3].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_SLASH,0), "DIVD_pressed");
		jButtonOperator[3].getActionMap().put("DIVD_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[5].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_EQUALS,0), "EQL_pressed");
		jButtonOperator[5].getActionMap().put("EQL_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[4].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_R,0), "SQRT_pressed");
		jButtonOperator[4].getActionMap().put("SQRT_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonOperator[6].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_6,InputEvent.SHIFT_MASK), "POW_pressed");
		jButtonOperator[6].getActionMap().put("POW_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		
		//Complex Operator Buttons
		for(int i=0; i<22; i++){	
			jButtonComplexOperator[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonOperator(evt);
	            }
	        });
		}

		//shift button
		jButtonShift.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	jButtonShiftActionPerformed(evt);
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
		
		//bracket button
		for(int i=0; i<2; i++){
			jButtonBracket[i].addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent evt) {
	            	jButtonOperator(evt);
	            }
	        });
		}
		jButtonBracket[0].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_9,InputEvent.SHIFT_MASK), "(_pressed");
		jButtonBracket[0].getActionMap().put("(_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
	        }
	    });
		jButtonBracket[1].getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).
	    	put(KeyStroke.getKeyStroke(KeyEvent.VK_0,InputEvent.SHIFT_MASK), ")_pressed");
		jButtonBracket[1].getActionMap().put(")_pressed", new AbstractAction() {
	        public void actionPerformed(ActionEvent evt) {
	        	jButtonOperator(evt);
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
		super.gui.add(AdvCalcGui);
		super.gui.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		super.gui.setTitle("Advanced Calculator");
		super.gui.setResizable(false);
		super.gui.setBounds(230, 115, 500, 420);
		super.gui.setFocusable(true);
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	//numarical buttons
	private void jButtonNumericalActionPerformed(ActionEvent evt){
		if(inputString.length()<100){
			if(!(number.contains(".") && evt.getActionCommand().equals("."))){
				inputString=inputString + evt.getActionCommand();	
				number=number+evt.getActionCommand();
			}
		}
		jTextDisplay.setText(inputString);
	}
	
	//operator buttons
	private void jButtonOperator(ActionEvent evt){
		if(evt.getActionCommand().equals("=")){
			if(!inputString.endsWith(" ")) {
				inputString = inputString + " ";
			}
			
			String result = advCalcOptExecutor.infixEvaluation(inputString);
			
			jLabelDisplay.setText(result);
			if(!result.equals("")) ans=result;
		}
		else{
			if(number.length()>0){
				inputString=inputString + " ";
			}
			
			if(inputString.length()<120){
				String actionCommand=evt.getActionCommand();
				
				if(actionCommand=="PI"){
					inputString=inputString + "3.141592654 ";
				}else if(actionCommand=="E"){
					inputString=inputString + "2.718281828 ";
				}else if(actionCommand=="Ans"){
					inputString=inputString + ans + " ";
				}else if(actionCommand=="nPr"){
					inputString=inputString + "P ";
				}else if(actionCommand=="nCr"){
					inputString=inputString + "C ";
				}else if(actionCommand=="n!"){
					inputString=inputString + "fact ";
				}else if(actionCommand=="x 10^"){
					inputString=inputString + "x 10 ^ ";
				}else{
					if(actionCommand.equals("*")){
						actionCommand="x";
					}else if(actionCommand.equals("r")){
						actionCommand="sqrt";
					}
					
					inputString=inputString + actionCommand + " ";
				}
			}
			jTextDisplay.setText(inputString);
		}
		
		number=""; 
	}
	
	//Shift
	private void jButtonShiftActionPerformed(ActionEvent evt){
		if(!shiftOn){
			shiftOn=true;
			
			jButtonComplexOperator[0].setLocation(600, 320); 
			jButtonComplexOperator[1].setLocation(600, 320); 
			jButtonComplexOperator[2].setLocation(270, 320); 
			jButtonComplexOperator[3].setLocation(324, 320); 
			jButtonComplexOperator[6].setLocation(600, 280);
			jButtonComplexOperator[7].setLocation(600, 280);
			jButtonComplexOperator[8].setLocation(270, 280);
			jButtonComplexOperator[9].setLocation(324, 280);
			jButtonComplexOperator[12].setLocation(600, 240);
			jButtonComplexOperator[13].setLocation(600, 240);
			jButtonComplexOperator[14].setLocation(270, 240);
			jButtonComplexOperator[15].setLocation(324, 240);
			
			jButtonShift.setBackground(new java.awt.Color(255, 255, 225));
			jButtonShift.setText("<~Shift~>");
		}else{
			shiftOn=false;
			
			jButtonComplexOperator[0].setLocation(270, 320);
			jButtonComplexOperator[1].setLocation(324, 320);
			jButtonComplexOperator[2].setLocation(600, 320);
			jButtonComplexOperator[3].setLocation(600, 320);
			jButtonComplexOperator[6].setLocation(270, 280);
			jButtonComplexOperator[7].setLocation(324, 280);
			jButtonComplexOperator[8].setLocation(600, 280);
			jButtonComplexOperator[9].setLocation(600, 280);
			jButtonComplexOperator[12].setLocation(270, 240);
			jButtonComplexOperator[13].setLocation(324, 240);
			jButtonComplexOperator[14].setLocation(600, 240);
			jButtonComplexOperator[15].setLocation(600, 240);
			
			jButtonShift.setBackground(new java.awt.Color(178, 190, 200));
			jButtonShift.setText("Shift");
		}
	}
	
	//memory buttons
	private void jButtonMemoryActionPerformed(ActionEvent evt){
		if(evt.getActionCommand()=="M" || evt.getActionCommand().equals("m")){
			number=number+memory;
			inputString=inputString+memory;
			jTextDisplay.setText(inputString);
		}else if(evt.getActionCommand()=="MS" || evt.getActionCommand().equals("s")){
			if(jLabelDisplay.getText().length()>0){
				memory=Double.parseDouble(jLabelDisplay.getText());
			}
		}
	}
	
	//clear button
	private void jButtonClearActionPerformed(ActionEvent evt){
		if(evt.getActionCommand()=="<B" || evt.getActionCommand().equals("\b")){
			if(inputString.length()>0){
				inputString=inputString.substring(0, inputString.length()-1);
			}
			if(number.length()>0){
				number=number.substring(0, number.length()-1);
			}
			jTextDisplay.setText(inputString);
		}else if(evt.getActionCommand()=="C" || evt.getActionCommand().equals("c")){
			inputString="";
			number="";
			jTextDisplay.setText(inputString);
		}else if(evt.getActionCommand()=="AC" || evt.getActionCommand().equals("a")){
			inputString="";
			number="";
			jTextDisplay.setText("");
			jLabelDisplay.setText("");
		}
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
		new AdvancedCalculator();
	}
}
