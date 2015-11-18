/**
 * Developer: Minhas Kamal (IIT, DU, BSSE-0509)
 * Date: 17-Jan-2014
 * Comment: I want to make a calculator that contains all the criterion that a calculator can have.
 * 	I am working real hard to make this complex system.
**/


package com.minhasKamal.ultimateCalculator;

import com.minhasKamal.ultimateCalculator.calculators.simpleCalculator.SimpleCalculator;


public class MainApp {
	public static void main(String args[]) {
		
		/**///using NIMBUS 
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			//javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");			
			//javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
			//javax.swing.UIManager.setLookAndFeel("com.alee.laf.WebLookAndFeel");
			
		} catch (Exception ex) {
			//do nothing
		}
		
		new SimpleCalculator();
	}
}
