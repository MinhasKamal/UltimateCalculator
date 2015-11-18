/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 15-Jan-2014																								*
* Date: 01-Jan-2015																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.equationCalculator;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;


/**
 * A Equation Calculator GUI
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class EquationCalculatorGui extends JTabbedPane{
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JPanel jPanelMain[];
	JLabel jLabelMain[];
	//Additional Variables																		*******
    //Equation Ax+By=C
    JTextField jTFieldaxbyc[];
    JLabel jLabelaxbyc[];
    JButton jButtonaxbycSolve;
    
    //Equation Ax+By+Cz=D
    JTextField jTFieldaxbyczd[];
    JLabel jLabelaxbyczd[];
    JButton jButtonaxbyczdSolve;
    
  	//Equation Ax2+Bx=C
    JTextField jTFieldax2bxc[];
    JLabel jLabelax2bxc[];
    JButton jButtonax2bxcSolve;
    
  	//Equation Ax3+Bx2+Cx=D
    JTextField jTFieldax3bx2cxd[];
    JLabel jLabelax3bx2cxd[];
    JButton jButtonax3bx2cxdSolve;
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public EquationCalculatorGui() {

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
   		jPanelMain = new JPanel[4];
   		jLabelMain = new JLabel[4];
   		//Additional Initialization 																	***
		//Equation Ax+By=C
	    jTFieldaxbyc = new JTextField[8];
	    jLabelaxbyc = new JLabel[6];
	    jButtonaxbycSolve = new JButton();
	    
	    //Equation Ax+By+Cz=D
	    jTFieldaxbyczd = new JTextField[15];
	    jLabelaxbyczd = new JLabel[12];
	    jButtonaxbyczdSolve = new JButton();
	    
	  	//Equation Ax2+Bx=C
	    jTFieldax2bxc = new JTextField[5];
	    jLabelax2bxc = new JLabel[8];
	    jButtonax2bxcSolve = new JButton();
	    
	  	//Equation Ax3+Bx2+Cx=D
	    jTFieldax3bx2cxd = new JTextField[7];
	    jLabelax3bx2cxd = new JLabel[13];
	    jButtonax3bx2cxdSolve = new JButton();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
	    for(int i=0; i<4; i++){
			jPanelMain[i] = new JPanel();
			jPanelMain[i].setLayout(null);
			
			jLabelMain[i] = new JLabel();
			jLabelMain[i].setLayout(null);
			jLabelMain[i].setBounds(0, 0, 276, 420);
		}
		jLabelMain[0].setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
				"EquationCalculatorBackground1.jpg")));
		jLabelMain[1].setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
				"EquationCalculatorBackground2.jpg")));
		jLabelMain[2].setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
				"EquationCalculatorBackground3.jpg")));
		jLabelMain[3].setIcon(new ImageIcon(getClass().getResource("/res/imgs/" +
				"EquationCalculatorBackground4.jpg")));

		//Equation Ax+By=C												***
	    for(int i=0; i<8; i++){
	    	jTFieldaxbyc[i]=new JTextField();
	    	jTFieldaxbyc[i].setSize(40, 30);
	    }
	    jTFieldaxbyc[0].setLocation(24, 40);
	    jTFieldaxbyc[1].setLocation(105, 40);
	    jTFieldaxbyc[2].setLocation(190, 40);
	    jTFieldaxbyc[3].setLocation(24, 100);
	    jTFieldaxbyc[4].setLocation(105, 100);
	    jTFieldaxbyc[5].setLocation(190, 100);
	    jTFieldaxbyc[6].setLocation(57, 210); jTFieldaxbyc[6].setEditable(false); jTFieldaxbyc[6].setSize(185, 30);
	    	jTFieldaxbyc[6].setHorizontalAlignment(4);
	    jTFieldaxbyc[7].setLocation(57, 260); jTFieldaxbyc[7].setEditable(false); jTFieldaxbyc[7].setSize(185, 30);
    		jTFieldaxbyc[7].setHorizontalAlignment(4);

	    for(int i=0; i<6; i++){
	    	jLabelaxbyc[i]=new JLabel();
	    	jLabelaxbyc[i].setFont(new Font("Gabriola", 0, 26));
	    	jLabelaxbyc[i].setSize(40, 30);
	    }
	    jLabelaxbyc[0].setLocation(70, 40); jLabelaxbyc[0].setText("x  +");
	    jLabelaxbyc[1].setLocation(152, 40); jLabelaxbyc[1].setText("y  =");
	    jLabelaxbyc[2].setLocation(70, 100); jLabelaxbyc[2].setText("x  +");
	    jLabelaxbyc[3].setLocation(152, 100); jLabelaxbyc[3].setText("y  =");
	    jLabelaxbyc[4].setLocation(29, 210); jLabelaxbyc[4].setText("x =");
	    jLabelaxbyc[5].setLocation(29, 260); jLabelaxbyc[5].setText("y =");

	    jButtonaxbycSolve.setBounds(24, 155, 60, 30);
	    jButtonaxbycSolve.setText("Solve");
	    
	    
	    //Equation Ax+By+Cz=D											***
	    for(int i=0; i<15; i++){
	    	jTFieldaxbyczd[i]=new JTextField();
	    	jTFieldaxbyczd[i].setSize(40, 30);
	    }
	    jTFieldaxbyczd[0].setLocation(15, 15);
	    jTFieldaxbyczd[1].setLocation(80, 15);
	    jTFieldaxbyczd[2].setLocation(145, 15);
	    jTFieldaxbyczd[3].setLocation(215, 15);
	    jTFieldaxbyczd[4].setLocation(15, 65);
	    jTFieldaxbyczd[5].setLocation(80, 65);
	    jTFieldaxbyczd[6].setLocation(145, 65);
	    jTFieldaxbyczd[7].setLocation(215, 65);
	    jTFieldaxbyczd[8].setLocation(15, 115);
	    jTFieldaxbyczd[9].setLocation(80, 115);
	    jTFieldaxbyczd[10].setLocation(145, 115);
	    jTFieldaxbyczd[11].setLocation(215, 115);
	    jTFieldaxbyczd[12].setLocation(50, 195); jTFieldaxbyczd[12].setEditable(false); jTFieldaxbyczd[12].setSize(190, 30);
	    	jTFieldaxbyczd[12].setHorizontalAlignment(4);
	    jTFieldaxbyczd[13].setLocation(50, 238); jTFieldaxbyczd[13].setEditable(false); jTFieldaxbyczd[13].setSize(190, 30);
	    	jTFieldaxbyczd[13].setHorizontalAlignment(4);
	    jTFieldaxbyczd[14].setLocation(50, 280); jTFieldaxbyczd[14].setEditable(false); jTFieldaxbyczd[14].setSize(190, 30);
    		jTFieldaxbyczd[14].setHorizontalAlignment(4);


	    for(int i=0; i<12; i++){
	    	jLabelaxbyczd[i]=new JLabel();
	    	jLabelaxbyczd[i].setFont(new Font("Gabriola", 0, 22));
	    	jLabelaxbyczd[i].setSize(40, 30);
	    }
	    jLabelaxbyczd[0].setLocation(58, 15); jLabelaxbyczd[0].setText("x +");
	    jLabelaxbyczd[1].setLocation(123, 15); jLabelaxbyczd[1].setText("y +");
	    jLabelaxbyczd[2].setLocation(188, 15); jLabelaxbyczd[2].setText("z =");
	    jLabelaxbyczd[3].setLocation(58, 65); jLabelaxbyczd[3].setText("x +");
	    jLabelaxbyczd[4].setLocation(123, 65); jLabelaxbyczd[4].setText("y +");
	    jLabelaxbyczd[5].setLocation(188, 65); jLabelaxbyczd[5].setText("z =");
	    jLabelaxbyczd[6].setLocation(58, 115); jLabelaxbyczd[6].setText("x +");
	    jLabelaxbyczd[7].setLocation(123, 115); jLabelaxbyczd[7].setText("y +");
	    jLabelaxbyczd[8].setLocation(188, 115); jLabelaxbyczd[8].setText("z =");
	    jLabelaxbyczd[9].setLocation(25, 195); jLabelaxbyczd[9].setText("x =");
	    jLabelaxbyczd[10].setLocation(25, 238); jLabelaxbyczd[10].setText("y =");
	    jLabelaxbyczd[11].setLocation(25, 280); jLabelaxbyczd[11].setText("z =");
	    
	    
	    jButtonaxbyczdSolve.setBounds(15, 155, 60, 30);
	    jButtonaxbyczdSolve.setText("Solve");
	    
	    
	  	//Equation Ax2+Bx=C												***
	    for(int i=0; i<5; i++){
	    	jTFieldax2bxc[i]=new JTextField();
	    	jTFieldax2bxc[i].setSize(40, 30);
	    }
	    jTFieldax2bxc[0].setLocation(20, 60);
	    jTFieldax2bxc[1].setLocation(115, 60);
	    jTFieldax2bxc[2].setLocation(210, 60);
	    jTFieldax2bxc[3].setLocation(60, 200); jTFieldax2bxc[3].setEditable(false); jTFieldax2bxc[3].setSize(188, 30);
	    	jTFieldax2bxc[3].setHorizontalAlignment(4);
	    jTFieldax2bxc[4].setLocation(60, 250); jTFieldax2bxc[4].setEditable(false); jTFieldax2bxc[4].setSize(188, 30);
	    	jTFieldax2bxc[4].setHorizontalAlignment(4);

	    for(int i=0; i<8; i++){
	    	jLabelax2bxc[i]=new JLabel();
	    	jLabelax2bxc[i].setFont(new Font("Gabriola", 0, 28));
	    	jLabelax2bxc[i].setSize(40, 30);
	    }
	    jLabelax2bxc[0].setLocation(70, 60); jLabelax2bxc[0].setText("x");
	    jLabelax2bxc[1].setLocation(84, 53); jLabelax2bxc[1].setText("2"); 
	    	jLabelax2bxc[1].setFont(new Font("Gabriola", 0, 17));
	    jLabelax2bxc[2].setLocation(98, 60); jLabelax2bxc[2].setText("+");
	    jLabelax2bxc[3].setLocation(165, 60); jLabelax2bxc[3].setText("x   =");
	    jLabelax2bxc[4].setLocation(25, 200); jLabelax2bxc[4].setText("x  =");
	    jLabelax2bxc[5].setLocation(39, 204); jLabelax2bxc[5].setText("1");
	    	jLabelax2bxc[5].setFont(new Font("Gabriola", 0, 16));
	    jLabelax2bxc[6].setLocation(25, 250); jLabelax2bxc[6].setText("x  =");
	    jLabelax2bxc[7].setLocation(39, 254); jLabelax2bxc[7].setText("2");
	    	jLabelax2bxc[7].setFont(new Font("Gabriola", 0, 16));

	    jButtonax2bxcSolve.setBounds(20, 130, 60, 30);
	    jButtonax2bxcSolve.setText("Solve");

	    
	  	//Equation Ax3+Bx2+Cx=D											***
	    for(int i=0; i<7; i++){
	    	jTFieldax3bx2cxd[i]=new JTextField();
	    	jTFieldax3bx2cxd[i].setSize(40, 30);
	    }
	    jTFieldax3bx2cxd[0].setLocation(10, 45);
	    jTFieldax3bx2cxd[1].setLocation(80, 45);
	    jTFieldax3bx2cxd[2].setLocation(150, 45);
	    jTFieldax3bx2cxd[3].setLocation(220, 45);
	    jTFieldax3bx2cxd[4].setLocation(55, 165); jTFieldax3bx2cxd[4].setEditable(false); jTFieldax3bx2cxd[4].setSize(200, 30);
	    	jTFieldax3bx2cxd[4].setHorizontalAlignment(4);
	    jTFieldax3bx2cxd[5].setLocation(55, 213); jTFieldax3bx2cxd[5].setEditable(false); jTFieldax3bx2cxd[5].setSize(200, 30);
	    	jTFieldax3bx2cxd[5].setHorizontalAlignment(4);
	    jTFieldax3bx2cxd[6].setLocation(55, 261); jTFieldax3bx2cxd[6].setEditable(false); jTFieldax3bx2cxd[6].setSize(200, 30);
	    	jTFieldax3bx2cxd[6].setHorizontalAlignment(4);
	    

	    for(int i=0; i<13; i++){
	    	jLabelax3bx2cxd[i]=new JLabel();
	    	jLabelax3bx2cxd[i].setFont(new Font("Gabriola", 0, 22));
	    	jLabelax3bx2cxd[i].setSize(40, 30);
	    }
	    jLabelax3bx2cxd[0].setLocation(51, 45); jLabelax3bx2cxd[0].setText("x");
	    jLabelax3bx2cxd[1].setLocation(63, 38); jLabelax3bx2cxd[1].setText("3");
	    	jLabelax3bx2cxd[1].setFont(new Font("Gabriola", 0, 17));
	    jLabelax3bx2cxd[2].setLocation(71, 45); jLabelax3bx2cxd[2].setText("+");
	    jLabelax3bx2cxd[3].setLocation(121, 45); jLabelax3bx2cxd[3].setText("x");
	    jLabelax3bx2cxd[4].setLocation(133, 38); jLabelax3bx2cxd[4].setText("2");
	    	jLabelax3bx2cxd[4].setFont(new Font("Gabriola", 0, 19));
	    jLabelax3bx2cxd[5].setLocation(141, 45); jLabelax3bx2cxd[5].setText("+");
	    jLabelax3bx2cxd[6].setLocation(191, 45); jLabelax3bx2cxd[6].setText("x  =");
	    jLabelax3bx2cxd[7].setLocation(20, 165); jLabelax3bx2cxd[7].setText("x   =");
	    jLabelax3bx2cxd[8].setLocation(30, 169); jLabelax3bx2cxd[8].setText("1");	
	    	jLabelax3bx2cxd[8].setFont(new Font("Gabriola", 0, 15));
	    jLabelax3bx2cxd[9].setLocation(20, 213); jLabelax3bx2cxd[9].setText("x   =");
	    jLabelax3bx2cxd[10].setLocation(30, 215); jLabelax3bx2cxd[10].setText("2");
			jLabelax3bx2cxd[10].setFont(new Font("Gabriola", 0, 15));
	    jLabelax3bx2cxd[11].setLocation(20, 261); jLabelax3bx2cxd[11].setText("x   =");
	    jLabelax3bx2cxd[12].setLocation(30, 264); jLabelax3bx2cxd[12].setText("3");
			jLabelax3bx2cxd[12].setFont(new Font("Gabriola", 0, 14));

	    jButtonax3bx2cxdSolve.setBounds(10, 105, 60, 30);
	    jButtonax3bx2cxdSolve.setText("Solve");
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
	    //adding TabbedPane
	    addTab("  ax+by=c  ", null, jPanelMain[0]);
	    addTab(" ax+by+cz=d ", null, jPanelMain[1]);
		addTab("  ax2+bx=c  ", null, jPanelMain[2]);
		addTab("ax3+bx2+cx=d", null, jPanelMain[3]);
		
		jPanelMain[0].add(jLabelMain[0]);
		jPanelMain[1].add(jLabelMain[1]);
		jPanelMain[2].add(jLabelMain[2]);
		jPanelMain[3].add(jLabelMain[3]);
		
		//Equation Ax+By=C
	    for(int i=0; i<8; i++){
	    	jLabelMain[0].add(jTFieldaxbyc[i]);
	    }
	    for(int i=0; i<6; i++){
	    	jLabelMain[0].add(jLabelaxbyc[i]);
	    }
	    jLabelMain[0].add(jButtonaxbycSolve);
	    
	    //Equation Ax+By+Cz=D
	    for(int i=0; i<15; i++){
	    	jLabelMain[1].add(jTFieldaxbyczd[i]);
	    }
	    for(int i=0; i<12; i++){
	    	jLabelMain[1].add(jLabelaxbyczd[i]);
	    }
	    jLabelMain[1].add(jButtonaxbyczdSolve);
	    
	  	//Equation Ax2+Bx=C
	    for(int i=0; i<5; i++){
	    	jLabelMain[2].add(jTFieldax2bxc[i]);
	    }
	    for(int i=0; i<8; i++){
	    	jLabelMain[2].add(jLabelax2bxc[i]);
	    }
	    jLabelMain[2].add(jButtonax2bxcSolve);
	    
	  	//Equation Ax3+Bx2+Cx=D
	    for(int i=0; i<7; i++){
	    	jLabelMain[3].add(jTFieldax3bx2cxd[i]);
	    }
	    for(int i=0; i<13; i++){
	    	jLabelMain[3].add(jLabelax3bx2cxd[i]);
	    }
	    jLabelMain[3].add(jButtonax3bx2cxdSolve);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
	    setBounds(0, 0, 276, 420);
	    setTabPlacement(JTabbedPane.TOP);
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
		EquationCalculatorGui gui = new EquationCalculatorGui();
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(230, 115, 280, 420);
		jFrame.setVisible(true);
		jFrame.setLayout(null);
		jFrame.add(gui);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
