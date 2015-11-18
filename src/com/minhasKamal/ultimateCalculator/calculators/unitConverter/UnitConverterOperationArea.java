/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 03-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationArea {
	/**
	 * Area											
	**/
	public double Area(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Square Centimeter
			if(to==1){				//Square Centimeter
				output = input;
			}else if(to==2){		//Square Meter
				output = input*0.0001;
			}else if(to==3){		//Hectare
				output = input*0.00000001;
			}else if(to==4){		//Square Kilometer
				output = input*0.0000000001;
			}else if(to==5){		//Square Inch
				output = input*0.15500031000062;
			}else if(to==6){		//Square Feet
				output = input*0.001076391041671;
			}else if(to==7){		//Square Yard
				output = (input*0.001076391041671)/9;
			}else if(to==8){		//Square Mile
				output = (input*0.001076391041671)/27878400;
			}else if(to==9){		//Katha
				output = (input*0.001076391041671)/718.7400071874;
			}else if(to==10){		//Bigha
				output = (input*0.001076391041671)/14374.800143748;
			}else if(to==11){		//Satak
				output = (input*0.001076391041671)/435.60;
			}else if(to==12){		//Acre
				output = (input*0.001076391041671)/43560;
			}
		}
		else if(from==2){									//Square Meter
			if(to==1){				//Square Centimeter
				output = input*10000;
			}else if(to==2){		//Square Meter
				output = input;
			}else if(to==3){		//Hectare
				output = input*0.0001;
			}else if(to==4){		//Square Kilometer
				output = input*0.000001;
			}else if(to==5){		//Square Inch
				output = input*1550.0031000062;
			}else if(to==6){		//Square Feet
				output = input*10.76391041671;
			}else if(to==7){		//Square Yard
				output = (input*10.76391041671)/9;
			}else if(to==8){		//Square Mile
				output = (input*10.76391041671)/27878400;
			}else if(to==9){		//Katha
				output = input/66.9;
			}else if(to==10){		//Bigha
				output = input/1338;
			}else if(to==11){		//Satak
				output = (input*10.76391041671)/435.60;
			}else if(to==12){		//Acre
				output = (input*10.76391041671)/43560;
			}
		}
		else if(from==3){									//Hectare
			if(to==1){				//Square Centimeter
				output = input*100000000;
			}else if(to==2){		//Square Meter
				output = input*10000;
			}else if(to==3){		//Hectare
				output = input;
			}else if(to==4){		//Square Kilometer
				output = input*0.01;
			}else if(to==5){		//Square Inch
				output = input*15500031.000062;
			}else if(to==6){		//Square Feet
				output = input*107639.1041671;
			}else if(to==7){		//Square Yard
				output = (input*107639.1041671)/9;
			}else if(to==8){		//Square Mile
				output = (input*107639.1041671)/27878400;
			}else if(to==9){		//Katha
				output = (input*107639.1041671)/718.7400071874;
			}else if(to==10){		//Bigha
				output = (input*107639.1041671)/14374.800143748;
			}else if(to==11){		//Satak
				output = input*247.1053814671653;
			}else if(to==12){		//Acre
				output = input*2.471053814671653;
			}
		}
		else if(from==4){									//Square Kilometer
			if(to==1){				//Square Centimeter
				output = input*100000000*100;
			}else if(to==2){		//Square Meter
				output = input*1000000;
			}else if(to==3){		//Hectare
				output = input*100;
			}else if(to==4){		//Square Kilometer
				output = input;
			}else if(to==5){		//Square Inch
				output = input*1550003100.0062;
			}else if(to==6){		//Square Feet
				output = input*10763910.41671;
			}else if(to==7){		//Square Yard
				output = (input*10763910.41671)/9;
			}else if(to==8){		//Square Mile
				output = (input*10763910.41671)/27878400;
			}else if(to==9){		//Katha
				output = (input*10763910.41671)/718.7400071874;
			}else if(to==10){		//Bigha
				output = (input*10763910.41671)/14374.800143748;
			}else if(to==11){		//Satak
				output = (input*10763910.41671)/435.60;
			}else if(to==12){		//Acre
				output = (input*10763910.41671)/43560;
			}
		}
		else if(from==5){									//Square Inch
			if(to==1){				//Square Centimeter
				output = input*6.4516;
			}else if(to==2){		//Square Meter
				output = input*0.00064516;
			}else if(to==3){		//Hectare
				output = input*0.000000064516;
			}else if(to==4){		//Square Kilometer
				output = input*0.00000000064516;
			}else if(to==5){		//Square Inch
				output = input;
			}else if(to==6){		//Square Feet
				output = input/144;
			}else if(to==7){		//Square Yard
				output = input/1296;
			}else if(to==8){		//Square Mile
				output = input/(40144896*100);
			}else if(to==9){		//Katha
				output = input/103680;
			}else if(to==10){		//Bigha
				output = input/2073600;
			}else if(to==11){		//Satak
				output = input/62726.40;
			}else if(to==12){		//Acre
				output = input/6272640;
			}
		}
		else if(from==6){									//Square Feet
			if(to==1){				//Square Centimeter
				output = input*929.0304;
			}else if(to==2){		//Square Meter
				output = input*0.09290304;
			}else if(to==3){		//Hectare
				output = input*0.000009290304;
			}else if(to==4){		//Square Kilometer
				output = input*0.00000009290304;
			}else if(to==5){		//Square Inch
				output = input*144;
			}else if(to==6){		//Square Feet
				output = input;
			}else if(to==7){		//Square Yard
				output = input/9;
			}else if(to==8){		//Square Mile
				output = input/27878400;
			}else if(to==9){		//Katha
				output = input/718.7400071874001;
			}else if(to==10){		//Bigha
				output = input/14374.80000143748;
			}else if(to==11){		//Satak
				output = input/435.60;
			}else if(to==12){		//Acre
				output = input/43560;
			}
		}
		else if(from==7){									//Square Yard
			if(to==1){				//Square Centimeter
				output = input*8361.2736;
			}else if(to==2){		//Square Meter
				output = input*0.83612736;
			}else if(to==3){		//Hectare
				output = input*0.000083612736;
			}else if(to==4){		//Square Kilometer
				output = input*0.00000083612736;
			}else if(to==5){		//Square Inch
				output = input*1296;
			}else if(to==6){		//Square Feet
				output = input*9;
			}else if(to==7){		//Square Yard
				output = input;
			}else if(to==8){		//Square Mile
				output = input/3097600;
			}else if(to==9){		//Katha
				output = input/79.860000007986;
			}else if(to==10){		//Bigha
				output = input/1597.20000015972;
			}else if(to==11){		//Satak
				output = input/48.40;
			}else if(to==12){		//Acre
				output = input/4840;
			}
		}
		else if(from==8){									//Square Mile
			if(to==1){				//Square Centimeter
				output = input*25899881103.36;
			}else if(to==2){		//Square Meter
				output = input*2589988.110336;
			}else if(to==3){		//Hectare
				output = input*258.9988110336;
			}else if(to==4){		//Square Kilometer
				output = input*2.589988110336;
			}else if(to==5){		//Square Inch
				output = input*40144896*100;
			}else if(to==6){		//Square Feet
				output = input*27878400;
			}else if(to==7){		//Square Yard
				output = input*3097600;
			}else if(to==8){		//Square Mile
				output = input;
			}else if(to==9){		//Katha
				output = input*38787.8784;
			}else if(to==10){		//Bigha
				output = input*1939.39392;
			}else if(to==11){		//Satak
				output = input*64000;
			}else if(to==12){		//Acre
				output = input*640;
			}
		}
		else if(from==9){									//Katha
			if(to==1){				//Square Centimeter
				output = input*404685.64224*1.65;
			}else if(to==2){		//Square Meter
				output = input*40.468564224*1.65;
			}else if(to==3){		//Hectare
				output = input*0.0040468564224*1.65;
			}else if(to==4){		//Square Kilometer
				output = input*0.000040468564224*1.65;
			}else if(to==5){		//Square Inch
				output = input*62726.40*1.65;
			}else if(to==6){		//Square Feet
				output = input*435.60*1.65;
			}else if(to==7){		//Square Yard
				output = input*48.40*1.65;
			}else if(to==8){		//Square Mile
				output = input*0.000015625*1.65;
			}else if(to==9){		//Katha
				output = input;
			}else if(to==10){		//Bigha
				output = input/20;
			}else if(to==11){		//Satak
				output = input*1.65;
			}else if(to==12){		//Acre
				output = input/60.6060606061;
			}
		}
		else if(from==10){									//Bigha
			if(to==1){				//Square Centimeter
				output = input*404685.64224*33;
			}else if(to==2){		//Square Meter
				output = input*40.468564224*33;
			}else if(to==3){		//Hectare
				output = input*0.0040468564224*33;
			}else if(to==4){		//Square Kilometer
				output = input*0.000040468564224*33;
			}else if(to==5){		//Square Inch
				output = input*62726.40*33;
			}else if(to==6){		//Square Feet
				output = input*435.60*33;
			}else if(to==7){		//Square Yard
				output = input*48.40*33;
			}else if(to==8){		//Square Mile
				output = input*0.000015625*33;
			}else if(to==9){		//Katha
				output = input*0.6060606061*33;
			}else if(to==10){		//Bigha
				output = input;
			}else if(to==11){		//Satak
				output = input*33;
			}else if(to==12){		//Acre
				output = input/3.0303030303;
			}
		}
		else if(from==11){									//Satak
			if(to==1){				//Square Centimeter
				output = input*404685.64224;
			}else if(to==2){		//Square Meter
				output = input*40.468564224;
			}else if(to==3){		//Hectare
				output = input*0.0040468564224;
			}else if(to==4){		//Square Kilometer
				output = input*0.000040468564224;
			}else if(to==5){		//Square Inch
				output = input*62726.40;
			}else if(to==6){		//Square Feet
				output = input*435.60;
			}else if(to==7){		//Square Yard
				output = input*48.40;
			}else if(to==8){		//Square Mile
				output = input*0.000015625;
			}else if(to==9){		//Katha
				output = input*0.6060606061;
			}else if(to==10){		//Bigha
				output = input*0.030303030303;
			}else if(to==11){		//Satak
				output = input;
			}else if(to==12){		//Acre
				output = input/100;
			}
		}
		else if(from==12){									//Acre
			if(to==1){				//Square Centimeter
				output = input*40468564.224;
			}else if(to==2){		//Square Meter
				output = input*4046.8564224;
			}else if(to==3){		//Hectare
				output = input*0.40468564224;
			}else if(to==4){		//Square Kilometer
				output = input*0.0040468564224;
			}else if(to==5){		//Square Inch
				output = input*6272640;
			}else if(to==6){		//Square Feet
				output = input*43560;
			}else if(to==7){		//Square Yard
				output = input*4840;
			}else if(to==8){		//Square Mile
				output = input*0.0015625;
			}else if(to==9){		//Katha
				output = input*60.60606061;
			}else if(to==10){		//Bigha
				output = input*3.0303030303;
			}else if(to==11){		//Satak
				output = input*100;
			}else if(to==12){		//Acre
				output = input;
			}
		}
		
		return output;
	}	
}
