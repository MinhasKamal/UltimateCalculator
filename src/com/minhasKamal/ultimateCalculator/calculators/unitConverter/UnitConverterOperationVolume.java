/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 03-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationVolume {
	/**
	 * Volume											
	**/
	public double Volume(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Cubic Centimeter
			if(to==1){				//Cubic Centimeter
				output = input;
			}else if(to==2){		//Cubic Meter
				output = input*0.000001;
			}else if(to==3){		//Cubic Inch
				output = input*0.0610237440947323;
			}else if(to==4){		//Cubic Feet
				output = input*3.531466672148859e-5;
			}else if(to==5){		//Cubic Yard
				output = input*1.307950619314392e-6;
			}else if(to==6){		//Liter
				output = input*0.001;
			}else if(to==7){		//Gallon(UK)
				output = input*2.199692482990878e-4;
			}else if(to==8){		//Gallon(US)
				output = input*2.641720523581484e-4;
			}
		}
		else if(from==2){									//Cubic Meter
			if(to==1){				//Cubic Centimeter
				output = input*1000000;
			}else if(to==2){		//Cubic Meter
				output = input;
			}else if(to==3){		//Cubic Inch
				output = input*61023.74409473228;
			}else if(to==4){		//Cubic Feet
				output = input*35.31466672148859;
			}else if(to==5){		//Cubic Yard
				output = input*1.307950619314392;
			}else if(to==6){		//Liter
				output = input*1000;
			}else if(to==7){		//Gallon(UK)
				output = input*219.9692482990878;
			}else if(to==8){		//Gallon(US)
				output = input*264.1720523581484;
			}
		}
		else if(from==3){									//Cubic Inch
			if(to==1){				//Cubic Centimeter
				output = input*16.387064;
			}else if(to==2){		//Cubic Meter
				output = input*0.000016387064;
			}else if(to==3){		//Cubic Inch
				output = input;
			}else if(to==4){		//Cubic Feet
				output = input*5.787037037037037e-4;
			}else if(to==5){		//Cubic Yard
				output = input*2.143347050754458e-5;
			}else if(to==6){		//Liter
				output = input*0.016387064;
			}else if(to==7){		//Gallon(UK)
				output = input*0.003604650149909;
			}else if(to==8){		//Gallon(US)
				output = input*0.0043290043290043;
			}
		}
		else if(from==4){									//Cubic Feet
			if(to==1){				//Cubic Centimeter
				output = input*28316.846592;
			}else if(to==2){		//Cubic Meter
				output = input*0.028316846592;
			}else if(to==3){		//Cubic Inch
				output = input*1728;
			}else if(to==4){		//Cubic Feet
				output = input;
			}else if(to==5){		//Cubic Yard
				output = input*0.037037037037037;
			}else if(to==6){		//Liter
				output = input*28.316846592;
			}else if(to==7){		//Gallon(UK)
				output = input*6.228835459042826;
			}else if(to==8){		//Gallon(US)
				output = input*7.480519480519481;
			}
		}
		else if(from==5){									//Cubic Yard
			if(to==1){				//Cubic Centimeter
				output = input*764554.857984;
			}else if(to==2){		//Cubic Meter
				output = input*0.764554857984;
			}else if(to==3){		//Cubic Inch
				output = input*46656;
			}else if(to==4){		//Cubic Feet
				output = input*27;
			}else if(to==5){		//Cubic Yard
				output = input;
			}else if(to==6){		//Liter
				output = input*764.554857984;
			}else if(to==7){		//Gallon(UK)
				output = input*168.1785573941563;
			}else if(to==8){		//Gallon(US)
				output = input*201.974025974026;
			}
		}
		else if(from==6){									//Liter
			if(to==1){				//Cubic Centimeter
				output = input*1000;
			}else if(to==2){		//Cubic Meter
				output = input*0.001;
			}else if(to==3){		//Cubic Inch
				output = input*61.02374409473228;
			}else if(to==4){		//Cubic Feet
				output = input*0.0353146667214886;
			}else if(to==5){		//Cubic Yard
				output = input*0.0013079506193144;
			}else if(to==6){		//Liter
				output = input;
			}else if(to==7){		//Gallon(UK)
				output = input*0.2199692482990878;
			}else if(to==8){		//Gallon(US)
				output = input*0.2641720523581484;
			}
		}
		else if(from==7){									//Gallon(UK)
			if(to==1){				//Cubic Centimeter
				output = input*4546.09;
			}else if(to==2){		//Cubic Meter
				output = input*0.00454609;
			}else if(to==3){		//Cubic Inch
				output = input*277.4194327916215;
			}else if(to==4){		//Cubic Feet
				output = input*0.1605436532358921;
			}else if(to==5){		//Cubic Yard
				output = input*0.005946061230959;
			}else if(to==6){		//Liter
				output = input*4.54609;
			}else if(to==7){		//Gallon(UK)
				output = input;
			}else if(to==8){		//Gallon(US)
				output = input*1.200949925504855;
			}
		}
		else if(from==8){									//Gallon(US)
			if(to==1){				//Cubic Centimeter
				output = input*3785.411784;
			}else if(to==2){		//Cubic Meter
				output = input*0.003785411784;
			}else if(to==3){		//Cubic Inch
				output = input*231;
			}else if(to==4){		//Cubic Feet
				output = input*0.1336805555555556;
			}else if(to==5){		//Cubic Yard
				output = input*0.0049511316872428;
			}else if(to==6){		//Liter
				output = input*3.785411784;
			}else if(to==7){		//Gallon(UK)
				output = input*0.8326741846289889;
			}else if(to==8){		//Gallon(US)
				output = input;
			}
		}
	
		return output;
	}
}
