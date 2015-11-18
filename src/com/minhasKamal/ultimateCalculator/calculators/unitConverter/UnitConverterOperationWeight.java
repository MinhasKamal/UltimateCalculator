/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 02-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationWeight {
	/**
	 * Weight											
	**/
	public double Weight(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Milligram
			if(to==1){				//Milligram
				output = input;
			}else if(to==2){		//Gram
				output = input*0.001;
			}else if(to==3){		//Kilogram
				output = input*0.000001;
			}else if(to==4){		//Tonne
				output = input*0.00000001;
			}else if(to==5){		//Ounce
				output = input*0.001*0.0352739619495804;
			}else if(to==6){		//Pound
				output = input*0.001*0.0022046226218488;
			}else if(to==7){		//Carat
				output = input*0.005;
			}
		}
		else if(from==2){									//Gram
			if(to==1){				//Milligram
				output = input*1000;
			}else if(to==2){		//Gram
				output = input;
			}else if(to==3){		//Kilogram
				output = input*0.001;
			}else if(to==4){		//Tonne
				output = input*0.000001;
			}else if(to==5){		//Ounce
				output = input*0.0352739619495804;
			}else if(to==6){		//Pound
				output = input*0.0022046226218488;
			}else if(to==7){		//Carat
				output = input*5;
			}
		}
		else if(from==3){									//Kilogram
			if(to==1){				//Milligram
				output = input*1000000;
			}else if(to==2){		//Gram
				output = input*1000;
			}else if(to==3){		//Kilogram
				output = input;
			}else if(to==4){		//Tonne
				output = input*0.001;
			}else if(to==5){		//Ounce
				output = input*35.2739619495804;
			}else if(to==6){		//Pound
				output = input*2.2046226218488;
			}else if(to==7){		//Carat
				output = input*5000;
			}
		}
		else if(from==4){									//Tonne
			if(to==1){				//Milligram
				output = input*1000000000;
			}else if(to==2){		//Gram
				output = input*1000000;
			}else if(to==3){		//Kilogram
				output = input*1000;
			}else if(to==4){		//Tonne
				output = input;
			}else if(to==5){		//Ounce
				output = input*35273.9619495804;
			}else if(to==6){		//Pound
				output = input*2204.6226218488;
			}else if(to==7){		//Carat
				output = input*5000000;
			}
		}
		else if(from==5){									//Ounce
			if(to==1){				//Milligram
				output = input*28349.523125;
			}else if(to==2){		//Gram
				output = input*28.349523125;
			}else if(to==3){		//Kilogram
				output = input*0.028349523125;
			}else if(to==4){		//Tonne
				output = input*0.000028349523125;
			}else if(to==5){		//Ounce
				output = input;
			}else if(to==6){		//Pound
				output = input*0.0625;
			}else if(to==7){		//Carat
				output = input*141.747615625;
			}
		}
		else if(from==6){									//Pound
			if(to==1){				//Milligram
				output = input*453592.37;
			}else if(to==2){		//Gram
				output = input*453.59237;
			}else if(to==3){		//Kilogram
				output = input*0.45359237;
			}else if(to==4){		//Tonne
				output = input*0.00045359237;
			}else if(to==5){		//Ounce
				output = input*16;
			}else if(to==6){		//Pound
				output = input;
			}else if(to==7){		//Carat
				output = input*2267.96185;
			}
		}
		else if(from==7){									//Carat
			if(to==1){				//Milligram
				output = input*200;
			}else if(to==2){		//Gram
				output = input*0.2;
			}else if(to==3){		//Kilogram
				output = input*0.0002;
			}else if(to==4){		//Tonne
				output = input*0.0000002;
			}else if(to==5){		//Ounce
				output = input*0.0070547923899161;
			}else if(to==6){		//Pound
				output = input*0.0070547923899161*0.0625;
			}else if(to==7){		//Carat
				output = input;
			}
		}
		
		return output;
	}
}

