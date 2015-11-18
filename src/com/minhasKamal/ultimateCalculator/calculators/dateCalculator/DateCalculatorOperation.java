/**
 * Developer: Minhas Kamal (BSSE-0509, IIT, DU)
 * Date: 05-Jan-2014
**/ 

package com.minhasKamal.ultimateCalculator.calculators.dateCalculator;

import com.minhasKamal.ultimateCalculator.notifications.message.Message;


public class DateCalculatorOperation {
	public String Date(int day1, int month1, int year1, int day2, int month2, int year2){
		String difference="";
		
		int day=0, month=0, year=0;
		int inHand=1;
		
		if(day1<0 || month1<0 || year1<0 || day2<0 || month2<0 || year2<0 ||		//wrong input
				day1>31 || month1>12 || year1>1000000 || day2>31 || month2>12 || year2>1000000 ||
				(day1>29 && month1==2) || (day2>29 && month2==2) || (day1>30 && month1==4) || (day2>30 && month2==4) ||
				(day1>30 && month1==6) || (day2>30 && month2==6) ||(day1>30 && month1==9) || (day2>30 && month2==9) ||
				(day1>30 && month1==11) || (day2>30 && month2==11)){		
			new Message("Wrong Input!\n   You may have exceeded the range.", 420);
		}
		else if((day1+(month1*30)+(year1*365))<(day2+(month2*30)+(year2*365))){		//when from<to
		    //day calculation
			day2=day2+inHand;
			if(day2<day1){
				day=30+day2-day1;
				inHand=-1;
			}
		    else{
		    	day=day2-day1;
		    	inHand=0;
		    }
			
			//month calculation
			month2=month2+inHand;
		    if(month2<month1){
		    	month=12+month2-month1;
		    	inHand=-1;
		    }
		    else {
		    	month=month2-month1;
		    	inHand=0;
		    }
	
		    //year calculation
		    year=year2-year1+inHand;
		}
		else{																		//when to<from
			//day calculation
			day2=day2+inHand;
			if(day1<day2){
				day=30+day1-day2;
				inHand=-1;
			}
		    else{
		    	day=day1-day2;
		    	inHand=0;
		    }
			
			//month calculation
			month2=month2+inHand;
		    if(month1<month2){
		    	month=12+month1-month2;
		    	inHand=-1;
		    }
		    else {
		    	month=month1-month2;
		    	inHand=0;
		    }
	
		    //year calculation
		    year=year1-year2+inHand;
		}
		
		
		difference = " " + year + "Y, " + month + "M, " + day + "D.";
		
		return difference;
	}
}
