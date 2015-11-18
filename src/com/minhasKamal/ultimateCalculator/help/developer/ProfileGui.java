/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 17-Dec-2013																								*
* Modified: 25-Dec-2013																							*
* Modified: 13-May-2014																							*
* Modified: 31-Dec-2014																							*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.help.developer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;


/**
 * Shows developer's profile.
 * 
 * @author Minhas Kamal
 */
@SuppressWarnings("serial")
public class ProfileGui extends JFrame {
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	JLabel jLabelMain;
	JButton jButtonPhoto;
	JLabel jLabelName, jLabelInstitute, jLabelDate, jLabelEmail;
    JLabel jLabelPhoto[];
    JTextArea jTextAreaInformation;
    
    //other variables
    int numberOfPhotos;		//number of profile photos
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public ProfileGui() {
		numberOfPhotos=7;
		
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
		jLabelMain = new JLabel();
    	jButtonPhoto = new JButton();
        jLabelName = new JLabel();
        jLabelInstitute = new JLabel();
        jLabelDate = new JLabel();
        jLabelEmail = new JLabel();
        jLabelPhoto = new JLabel[numberOfPhotos+1];	//we need one extra photo
     
        jTextAreaInformation = new JTextArea();
		// End of Initialization																#_______I_______#

		//**
		// Setting Bounds and Attributes of the Elements 										#*******S*******#
		//**
        jLabelMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/DeveloperBackGround.jpg")));
        jLabelMain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelMain.setBounds(0, 0, 525, 340);
        jLabelMain.setLayout(null);

        jLabelName.setFont(new java.awt.Font("Lucida Bright", 2, 15)); // NOI18N
        jLabelName.setText("Minhas Kamal");
        jLabelName.setToolTipText("Name");
        jLabelName.setBounds(20, 60, 120, 20);

        jLabelInstitute.setFont(new java.awt.Font("Lucida Bright", 2, 15)); // NOI18N
        jLabelInstitute.setText("Institute of Information Technology, DU.");
        jLabelInstitute.setToolTipText("Educational Institute");
        jLabelInstitute.setBounds(20, 90, 290, 20);

        jLabelDate.setFont(new java.awt.Font("Lucida Bright", 2, 15)); // NOI18N
        jLabelDate.setToolTipText("Date of Completion");
        jLabelDate.setBounds(20, 120, 200, 20);

        jLabelEmail.setFont(new java.awt.Font("Lucida Bright", 2, 15)); // NOI18N
        jLabelEmail.setText("Email: minhaskamal024@gmail.com");
        jLabelEmail.setBounds(20, 150, 260, 20);


        jButtonPhoto.setToolTipText("Click to play/pause");
        jButtonPhoto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonPhoto.setLayout(null);
        jButtonPhoto.setBounds(328, 15, 180, 195);
        
        //photos
        for(int i=0; i<numberOfPhotos; i++){
        	jLabelPhoto[i]=new JLabel();
        	jLabelPhoto[i].setBounds(i*181, 0, 180, 195);
        	jLabelPhoto[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/DeveloperImg" +
        			(i+1) + ".png")));
        }
        jLabelPhoto[numberOfPhotos]=new JLabel();
    	jLabelPhoto[numberOfPhotos].setBounds(numberOfPhotos*181, 0, 180, 195);
    	jLabelPhoto[numberOfPhotos].setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imgs/DeveloperImg" +
    			1 + ".png")));
       
        //text area
        jTextAreaInformation.setEditable(false);
        jTextAreaInformation.setBackground(new java.awt.Color(210, 210, 210));
        jTextAreaInformation.setColumns(20);
        jTextAreaInformation.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jTextAreaInformation.setRows(5);
        jTextAreaInformation.setToolTipText("My Study Life");
        jTextAreaInformation.setBorder((new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED)));
        jTextAreaInformation.setBounds(10, 225, 500, 75);
        
		// End of Setting Bounds and Attributes 												#_______S_______#

		//**
		// Adding Components 																	#*******A*******#
		//**
        for(int i=0; i<=numberOfPhotos; i++){
        	jButtonPhoto.add(jLabelPhoto[i]);
        }
       
        //adding features to the main panel
        jLabelMain.add(jLabelName); jLabelMain.add(jLabelInstitute); jLabelMain.add(jLabelDate); jLabelMain.add(jLabelEmail);
        jLabelMain.add(jButtonPhoto); jLabelMain.add(jTextAreaInformation);
		// End of Adding Components 															#_______A_______#

		//**Setting Criterion of the Frame**//
        setIconImage(new ImageIcon(getClass().getResource("/res/imgs/DeveloperIcon.png")).getImage());
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        setTitle("Developer's Profile");
        setLayout(null);
        setSize(525, 340);
        setLocation(250, 200);
        setResizable(false);
        add(jLabelMain);
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
		ProfileGui gui = new ProfileGui();
		gui.setVisible(true);
	}
}
