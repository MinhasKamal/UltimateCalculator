/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 02-Jan-2014
**/


package com.minhasKamal.ultimateCalculator.calculators.unitConverter;

public class UnitConverterOperationTime {
	/**
	 * Time											
	**/
	public double Time(int from, int to, double input){
		double output=0.0;
		
		if(from==1){									//Nanosecond
			if(to==1){				//Nanosecond
				output = input;
			}else if(to==2){		//Millisecond
				output = input*0.000001;
			}else if(to==3){		//Second
				output = input*0.000001*0.001;
			}else if(to==4){		//Minute
				output = (input*0.000001*0.001)/60;
			}else if(to==5){		//Hour
				output = (input*0.000001*0.001)/3600;
			}else if(to==6){		//Day
				output = ((input*0.000001*0.001)/3600)/24;
			}else if(to==7){		//Week
				output = ((input*0.000001*0.001)/3600)/168;
			}
		}
		else if(from==2){									//Millisecond
			if(to==1){				//Nanosecond
				output = input*1000000;
			}else if(to==2){		//Millisecond
				output = input;
			}else if(to==3){		//Second
				output = input*0.001;
			}else if(to==4){		//Minute
				output = (input*0.001)/60;
			}else if(to==5){		//Hour
				output = (input*0.001)/3600;
			}else if(to==6){		//Day
				output = ((input*0.001)/3600)/24;
			}else if(to==7){		//Week
				output = ((input*0.001)/3600)/168;
			}
		}
		else if(from==3){									//Second
			if(to==1){				//Nanosecond
				output = input*1000000000;
			}else if(to==2){		//Millisecond
				output = input*1000;
			}else if(to==3){		//Second
				output = input;
			}else if(to==4){		//Minute
				output = input/60;
			}else if(to==5){		//Hour
				output = input/3600;
			}else if(to==6){		//Day
				output = (input/3600)/24;
			}else if(to==7){		//Week
				output = (input/3600)/168;
			}
		}
		else if(from==4){									//Minute
			if(to==1){				//Nanosecond
				output = input*1000000000*60;
			}else if(to==2){		//Millisecond
				output = input*1000*60;
			}else if(to==3){		//Second
				output = input*60;
			}else if(to==4){		//Minute
				output = input;
			}else if(to==5){		//Hour
				output = input/60;
			}else if(to==6){		//Day
				output = (input/60)/24;
			}else if(to==7){		//Week
				output = (input/60)/168;
			}
		}
		else if(from==5){									//Hour
			if(to==1){				//Nanosecond
				output = input*1000000000*3600;
			}else if(to==2){		//Millisecond
				output = input*1000*3600;
			}else if(to==3){		//Second
				output = input*3600;
			}else if(to==4){		//Minute
				output = input*60;
			}else if(to==5){		//Hour
				output = input;
			}else if(to==6){		//Day
				output = input/24;
			}else if(to==7){		//Week
				output = input/168;
			}
		}
		else if(from==6){									//Day
			if(to==1){				//Nanosecond
				output = input*1000000000*3600*24;
			}else if(to==2){		//Millisecond
				output = input*1000*3600*24;
			}else if(to==3){		//Second
				output = input*3600*24;
			}else if(to==4){		//Minute
				output = input*60*24;
			}else if(to==5){		//Hour
				output = input*24;
			}else if(to==6){		//Day
				output = input;
			}else if(to==7){		//Week
				output = input/7;
			}
		}
		else if(from==7){									//Week
			if(to==1){				//Nanosecond
				output = input*1000000000*3600*168;
			}else if(to==2){		//Millisecond
				output = input*1000*3600*168;
			}else if(to==3){		//Second
				output = input*3600*168;
			}else if(to==4){		//Minute
				output = input*60*168;
			}else if(to==5){		//Hour
				output = input*168;
			}else if(to==6){		//Day
				output = input*7;
			}else if(to==7){		//Week
				output = input;
			}
		}
		

		return output;
	}	
}
