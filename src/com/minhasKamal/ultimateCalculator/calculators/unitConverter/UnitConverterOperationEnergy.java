/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 03-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationEnergy {
	/**
	 * Energy											
	**/
	public double Energy(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Joule
			if(to==1){				//Joule
				output = input;
			}else if(to==2){		//Kilojoule
				output = input/1000;
			}else if(to==3){		//Calorie
				output = input/4.1868;
			}else if(to==4){		//Kilocalorie
				output = input/4186.8;
			}else if(to==5){		//Electron-Volts
				output = input*6.241509479607718e+18;
			}else if(to==6){		//Foot-Pound
				output = input*0.7375621492772656;
			}
		}
		else if(from==2){									//Kilojoule
			if(to==1){				//Joule
				output = input*1000;
			}else if(to==2){		//Kilojoule
				output = input;
			}else if(to==3){		//Calorie
				output = input*238.8458966274959;
			}else if(to==4){		//Kilocalorie
				output = input*0.2388458966274959;
			}else if(to==5){		//Electron-Volts
				output = input*6.241509479607718e+21;
			}else if(to==6){		//Foot-Pound
				output = input*737.5621492772656;
			}
		}
		else if(from==3){									//Calorie
			if(to==1){				//Joule
				output = input*4.1868;
			}else if(to==2){		//Kilojoule
				output = input*0.0041868;
			}else if(to==3){		//Calorie
				output = input;
			}else if(to==4){		//Kilocalorie
				output = input*0.001;
			}else if(to==5){		//Electron-Volts
				output = input*2.61319518892216e+19;
			}else if(to==6){		//Foot-Pound
				output = input*3.088025206594056;
			}
		}
		else if(from==4){									//Kilocalorie
			if(to==1){				//Joule
				output = input*4186.8;
			}else if(to==2){		//Kilojoule
				output = input*4.1868;
			}else if(to==3){		//Calorie
				output = input*1000;
			}else if(to==4){		//Kilocalorie
				output = input;
			}else if(to==5){		//Electron-Volts
				output = input*2.61319518892216e+22;
			}else if(to==6){		//Foot-Pound
				output = input*3088.025206594056;
			}
		}
		else if(from==5){									//Electron-Volts
			if(to==1){				//Joule
				output = input*1.60217653e-19;
			}else if(to==2){		//Kilojoule
				output = input*1.60217653e-22;
			}else if(to==3){		//Calorie
				output = input*3.826732898633801e-20;
			}else if(to==4){		//Kilocalorie
				output = input*3.826732898633801e-23;
			}else if(to==5){		//Electron-Volts
				output = input;
			}else if(to==6){		//Foot-Pound
				output = input*1.181704764988391e-19;
			}
		}
		else if(from==6){									//Foot-Pound
			if(to==1){				//Joule
				output = input*1.3558179483314;
			}else if(to==2){		//Kilojoule
				output = input*0.0013558179483314;
			}else if(to==3){		//Calorie
				output = input*0.3238315535328652;
			}else if(to==4){		//Kilocalorie
				output = input*3.238315535328652e-4;
			}else if(to==5){		//Electron-Volts
				output = input*8.462350577132721e+18;
			}else if(to==6){		//Foot-Pound
				output = input;
			}
		}
		
		
		return output;
	}
}
