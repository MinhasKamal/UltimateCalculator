/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 02-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationLength {
	/**
	 * Length											
	**/
	public double Length(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Angstrom
			if(to==1){				//Angstrom
				output = input;
			}else if(to==2){		//Nanometer
				output = input*0.1;
			}else if(to==3){		//Micron
				output = input*0.0001;
			}else if(to==4){		//Millimeter
				output = input*0.0000001;
			}else if(to==5){		//Centimeter
				output = input*0.00000001;
			}else if(to==6){		//Meter
				output = input*0.0000000001;
			}else if(to==7){		//Kilometer
				output = input*0.0000000000001;
			}else if(to==8){		//Inch
				output = input*0.00000001*0.3937007874015748;
			}else if(to==9){		//Feet
				output = input*0.00000001*0.0328083989501312;
			}else if(to==10){		//Yard
				output = input*0.00000001*0.0109361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.0000000000001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.0000000000001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.00000001*0.0019883878151595;
			}
		}
		else if(from==2){							//Nanometer
			if(to==1){				//Angstrom
				output = input*10;
			}else if(to==2){		//Nanometer
				output = input;
			}else if(to==3){		//Micron
				output = input*0.0001;
			}else if(to==4){		//Millimeter
				output = input*0.000001;
			}else if(to==5){		//Centimeter
				output = input*0.0000001;
			}else if(to==6){		//Meter
				output = input*0.000000001;
			}else if(to==7){		//Kilometer
				output = input*0.000000000001;
			}else if(to==8){		//Inch
				output = input*0.0000001*0.3937007874015748;
			}else if(to==9){		//Feet
				output = input*0.0000001*0.0328083989501312;
			}else if(to==10){		//Yard
				output = input*0.0000001*0.0109361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.000000000001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.000000000001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.0000001*0.0019883878151595;
			}
		}
		else if(from==3){							//Micron
			if(to==1){				//Angstrom
				output = input*10000;
			}else if(to==2){		//Nanometer
				output = input*1000;
			}else if(to==3){		//Micron
				output = input;
			}else if(to==4){		//Millimeter
				output = input*0.001;
			}else if(to==5){		//Centimeter
				output = input*0.0001;
			}else if(to==6){		//Meter
				output = input*0.000001;
			}else if(to==7){		//Kilometer
				output = input*0.000000001;
			}else if(to==8){		//Inch
				output = input*0.0001*0.3937007874015748;
			}else if(to==9){		//Feet
				output = input*0.0001*0.0328083989501312;
			}else if(to==10){		//Yard
				output = input*0.0001*0.0109361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.000000001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.000000001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.0001*0.0019883878151595;
			}
		}
		else if(from==4){							//Millimeter
			if(to==1){				//Angstrom
				output = input*10000000;
			}else if(to==2){		//Nanometer
				output = input*1000000;
			}else if(to==3){		//Micron
				output = input*1000;
			}else if(to==4){		//Millimeter
				output = input;
			}else if(to==5){		//Centimeter
				output = input*0.1;
			}else if(to==6){		//Meter
				output = input*0.001;
			}else if(to==7){		//Kilometer
				output = input*0.000001;
			}else if(to==8){		//Inch
				output = input*0.1*0.3937007874015748;
			}else if(to==9){		//Feet
				output = input*0.1*0.0328083989501312;
			}else if(to==10){		//Yard
				output = input*0.1*0.0109361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.000001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.000001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.1*0.0019883878151595;
			}
		}
		else if(from==5){							//Centimeter
			if(to==1){				//Angstrom
				output = input*100000000;
			}else if(to==2){		//Nanometer
				output = input*10000000;
			}else if(to==3){		//Micron
				output = input*10000;
			}else if(to==4){		//Millimeter
				output = input*10;
			}else if(to==5){		//Centimeter
				output = input;
			}else if(to==6){		//Meter
				output = input*0.01;
			}else if(to==7){		//Kilometer
				output = input*0.00001;
			}else if(to==8){		//Inch
				output = input*0.3937007874015748;
			}else if(to==9){		//Feet
				output = input*0.0328083989501312;
			}else if(to==10){		//Yard
				output = input*0.0109361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.00001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.00001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.0019883878151595;
			}
		}
		else if(from==6){							//Meter
			if(to==1){				//Angstrom
				output = input*100000000*100;
			}else if(to==2){		//Nanometer
				output = input*1000000000;
			}else if(to==3){		//Micron
				output = input*1000000;
			}else if(to==4){		//Millimeter
				output = input*1000;
			}else if(to==5){		//Centimeter
				output = input*100;
			}else if(to==6){		//Meter
				output = input;
			}else if(to==7){		//Kilometer
				output = input*0.001;
			}else if(to==8){		//Inch
				output = input*39.37007874015748;
			}else if(to==9){		//Feet
				output = input*3.28083989501312;
			}else if(to==10){		//Yard
				output = input*1.09361329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.001*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.001*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.19883878151595;
			}
		}
		else if(from==7){							//Kilometer
			if(to==1){				//Angstrom
				output = input*100000000*100000;
			}else if(to==2){		//Nanometer
				output = input*100000000*10000;
			}else if(to==3){		//Micron
				output = input*1000000000;
			}else if(to==4){		//Millimeter
				output = input*1000000;
			}else if(to==5){		//Centimeter
				output = input*100000;
			}else if(to==6){		//Meter
				output = input*1000;
			}else if(to==7){		//Kilometer
				output = input;
			}else if(to==8){		//Inch
				output = input*39370.07874015748;
			}else if(to==9){		//Feet
				output = input*3280.83989501312;
			}else if(to==10){		//Yard
				output = input*1093.61329833771;
			}else if(to==11){		//Nautical Mile
				output = input*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*198.83878151595;
			}
		}
		else if(from==8){							//Inch
			if(to==1){				//Angstrom
				output = input*254000000;
			}else if(to==2){		//Nanometer
				output = input*25400000;
			}else if(to==3){		//Micron
				output = input*25400;
			}else if(to==4){		//Millimeter
				output = input*25.4;
			}else if(to==5){		//Centimeter
				output = input*2.54;
			}else if(to==6){		//Meter
				output = input*0.0254;
			}else if(to==7){		//Kilometer
				output = input*0.0000254;
			}else if(to==8){		//Inch
				output = input;
			}else if(to==9){		//Feet
				output = input*0.0833333333333333;
			}else if(to==10){		//Yard
				output = input*0.0277777777777778;
			}else if(to==11){		//Nautical Mile
				output = input*0.0000254*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.0000254*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.0050505050505051;
			}
		}
		else if(from==9){							//Feet
			if(to==1){				//Angstrom
				output = input*30480000*100;
			}else if(to==2){		//Nanometer
				output = input*304800000;
			}else if(to==3){		//Micron
				output = input*304800;
			}else if(to==4){		//Millimeter
				output = input*304.8;
			}else if(to==5){		//Centimeter
				output = input*30.48;
			}else if(to==6){		//Meter
				output = input*0.3048;
			}else if(to==7){		//Kilometer
				output = input*0.0003048;
			}else if(to==8){		//Inch
				output = input*12;
			}else if(to==9){		//Feet
				output = input;
			}else if(to==10){		//Yard
				output = input*0.3333333333333333;
			}else if(to==11){		//Nautical Mile
				output = input*0.0003048*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.0003048*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.0606060606060606;
			}
		}
		else if(from==10){							//Yard
			if(to==1){				//Angstrom
				output = input*30480000*300;
			}else if(to==2){		//Nanometer
				output = input*304800000*3;
			}else if(to==3){		//Micron
				output = input*304800*3;
			}else if(to==4){		//Millimeter
				output = input*304.8*3;
			}else if(to==5){		//Centimeter
				output = input*30.48*3;
			}else if(to==6){		//Meter
				output = input*0.3048*3;
			}else if(to==7){		//Kilometer
				output = input*0.0009144;
			}else if(to==8){		//Inch
				output = input*36;
			}else if(to==9){		//Feet
				output = input*3;
			}else if(to==10){		//Yard
				output = input;
			}else if(to==11){		//Nautical Mile
				output = input*0.0009144*0.5399568034557235;
			}else if(to==12){		//Mile
				output = input*0.0009144*0.621371192237334;
			}else if(to==13){		//Rod
				output = input*0.1818181818181818;
			}
		}
		else if(from==11){							//Nautical Mile
			if(to==1){				//Angstrom
				output = input*18520*1000000000;
			}else if(to==2){		//Nanometer
				output = input*1852*1000000000;
			}else if(to==3){		//Micron
				output = input*1852*1000000;
			}else if(to==4){		//Millimeter
				output = input*1852000;
			}else if(to==5){		//Centimeter
				output = input*185200;
			}else if(to==6){		//Meter
				output = input*1852;
			}else if(to==7){		//Kilometer
				output = input*1.852;
			}else if(to==8){		//Inch
				output = input*72913.38582677165;
			}else if(to==9){		//Feet
				output = input*6076.115485564304;
			}else if(to==10){		//Yard
				output = input*2025.371828521435;
			}else if(to==11){		//Nautical Mile
				output = input;
			}else if(to==12){		//Mile
				output = input*1.150779448023543;
			}else if(to==13){		//Rod
				output = input*368.2494233675336;
			}
		}
		else if(from==12){							//Mile
			if(to==1){				//Angstrom
				output = input*1609344*10000000;
			}else if(to==2){		//Nanometer
				output = input*1609344*1000000;
			}else if(to==3){		//Micron
				output = input*1609344*1000;
			}else if(to==4){		//Millimeter
				output = input*1609344;
			}else if(to==5){		//Centimeter
				output = input*160934.4;
			}else if(to==6){		//Meter
				output = input*1609.344;
			}else if(to==7){		//Kilometer
				output = input*1.609344;
			}else if(to==8){		//Inch
				output = input*63360;
			}else if(to==9){		//Feet
				output = input*5280;
			}else if(to==10){		//Yard
				output = input*1760;
			}else if(to==11){		//Nautical Mile
				output = input*0.8689762419006479;
			}else if(to==12){		//Mile
				output = input;
			}else if(to==13){		//Rod
				output = input*320;
			}
		}
		else if(from==13){							//Rod
			if(to==1){				//Angstrom
				output = input*50292000*1000;
			}else if(to==2){		//Nanometer
				output = input*50292000*100;
			}else if(to==3){		//Micron
				output = input*5029200;
			}else if(to==4){		//Millimeter
				output = input*5029.2;
			}else if(to==5){		//Centimeter
				output = input*502.92;
			}else if(to==6){		//Meter
				output = input*5.0292;
			}else if(to==7){		//Kilometer
				output = input*0.0050292;
			}else if(to==8){		//Inch
				output = input*198;
			}else if(to==9){		//Feet
				output = input*16.5;
			}else if(to==10){		//Yard
				output = input*5.5;
			}else if(to==11){		//Nautical Mile
				output = input*0.0027155507559395;
			}else if(to==12){		//Mile
				output = input*0.003125;
			}else if(to==13){		//Rod
				output = input;
			}
		}
		
		return output;
	}	
}
