/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: 17-Dec-2013																								*
* Modified: 25-Dec-2013																							*
* Modified: 13-May-2014																							*
* Modified: 31-Dec-2014																							*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.help.developer;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.UIManager;

import com.minhasKamal.ultimateCalculator.utils.fileIO.FileIO;


/**
 * Shows developer's profile.
 * 
 * @author Minhas Kamal
 */
public class Profile implements Runnable{
	// GUI Declaration
	private ProfileGui gui;
	
	//**
	// Variable Declaration 																	#*******D*******#
	//**
	private JButton jButtonPhoto;
	private JLabel jLabelDate;
    private JLabel jLabelPhoto[];
    private JTextArea jTextAreaInformation;
    
    //other variables
    private String date;			//Change it accordingly
    private int numberOfPhotos;		//number of profile photos
    private int position;			//position determiner 
    private boolean isStanding;		//picture show is standing or not
    private String developerInfo;
    
    //thread
    private Thread thread;			//main thread
	// End of Variable Declaration 																#_______D_______#

	/***##Constructor##***/
	public Profile() {
		date="17-Jan-2014";
    	isStanding=false;
    	position=0;
    	
		initialComponent();
		
		//*Thread*//
        thread = new Thread(this);
        thread.start();
	}
	
	public Profile(String date) {
    	this.date=date;
    	isStanding=false;
    	position=0;

    	initialComponent();
    	
    	//*Thread*//
        thread = new Thread(this);
        thread.start();
    }

	
	/**
	 * Method for Initializing all the GUI variables and placing them all to specific space on 
	 * the frame. It also specifies criteria of the main frame.
	 */
	private void initialComponent() {
		// GUI Initialization
		gui = new ProfileGui();
		gui.setVisible(true);
		
		//**
		// Assignation 																			#*******A*******#
		//**
    	jButtonPhoto = gui.jButtonPhoto;
        jLabelDate = gui.jLabelDate;
        jLabelPhoto = gui.jLabelPhoto;
        jTextAreaInformation = gui.jTextAreaInformation;
        
        numberOfPhotos = gui.numberOfPhotos;
        
        try {
        	developerInfo = FileIO.readWholeFile(getClass().getResourceAsStream("/res/txts/Developer.txt"));
		} catch (Exception e) {
			developerInfo = "EMPTY";
		}
		// End of Assignation																	#_______A_______#

		//**
		// Adding Action Events & Other Attributes												#*******AA*******#
		//**
        jLabelDate.setText("Date: " + date);
        jTextAreaInformation.setText(developerInfo);
        
        jButtonPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jPanelPhotoActionPerformed(evt);
            }
        });
		// End of Adding Action Events & Other Attributes										#_______AA_______#
	}

	//**
	// Action Events 																			#*******AE*******#
	//**
	private void jPanelPhotoActionPerformed(java.awt.event.ActionEvent evt) {  
		if(!isStanding){
			isStanding=true;
		}else{
			isStanding=false;
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
	@SuppressWarnings("static-access")
	public void run() {
		int criticalPoint=numberOfPhotos*(-180) - numberOfPhotos - 1;
		
		while(true){
			if(!isStanding){
				position--;
			}
			
			for(int i=0; i<numberOfPhotos+1; i++){
				jLabelPhoto[i].setLocation(position + (i*181), 0);			
			}
			
			try {
				thread.sleep(4);
				for(int i=0; i<numberOfPhotos; i++){
					if(position == i*(-180) - i - 1){
						thread.sleep(900);
						break;
					}
				}
			}catch(Exception e) {
				//do nothing
			}
			
			if(position == criticalPoint){
				position=0;
			}
		}
	}
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
		new Profile();
	}
}
