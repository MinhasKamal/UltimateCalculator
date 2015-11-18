/**
 * Developer: Minhas Kamal(BSSE-0509, IIT, DU)
 * Date: 31-May-2013
**/

package com.minhasKamal.ultimateCalculator.calculators.primeNumberHunter;


/**
 * My most improved version of haunting prime numbers. As finding prime number is very time consuming,
 * I have tried to make it more time efficient, but at the same time more complex.It finds all prime 
 * number in its domain (3 - 999,999,999,999,999,999).
 *
 * @author Minhas Kamal
 */
public class PrimeNumberHunterOperation {
	public String primeNumberFinder(long start, long finish){
		String result="";
		
		//handle extreme cases
		if(finish<start){
			long i=start;
			start=finish;
			finish=i;
		}
		if(start<3){
			start =3;
			result="2, ";
		}
		if(finish<2){
			result="No Number Found!";
			return result;
		}
		
	    long x; //possible prime number
	
	    if(start%2==0) x=(start+1);   //I have made starting number odd, this will save time
	    else x=start;
	
	    for(; x<=finish; x=x+2){   //The program will work only with odd numbers
	        int flag=1;  //the flag
	
	        if(x>500){
	            if(x%3 == 0) flag=0;
	            else if(x%5 == 0) flag=0;
	            else if(x%7 == 0) flag=0;
	            else if(x%11 == 0) flag=0;
	            else if(x%13 == 0) flag=0;
	            else if(x%17 == 0) flag=0;
	            else if(x%19 == 0) flag=0;
	            else if(x%23 == 0) flag=0;
	            else if(x%29 == 0) flag=0;
	            else if(x%31 == 0) flag=0;
	            else if(x%37 == 0) flag=0;
	            else if(x%41 == 0) flag=0;
	            else if(x%43 == 0) flag=0;
	            else if(x%47 == 0) flag=0;
	
	            else if(x%53 == 0) flag=0;
	            else if(x%59 == 0) flag=0;
	            else if(x%61 == 0) flag=0;
	            else if(x%67 == 0) flag=0;
	            else if(x%71 == 0) flag=0;
	            else if(x%73 == 0) flag=0;
	            else if(x%79 == 0) flag=0;
	            else if(x%83 == 0) flag=0;
	            else if(x%89 == 0) flag=0;
	            else if(x%97 == 0) flag=0;
	
	            else if(x%101 == 0) flag=0;
	            else if(x%103 == 0) flag=0;
	            else if(x%107 == 0) flag=0;
	            else if(x%109 == 0) flag=0;
	            else if(x%113 == 0) flag=0;
	            else if(x%127 == 0) flag=0;
	            else if(x%131 == 0) flag=0;
	            else if(x%137 == 0) flag=0;
	            else if(x%139 == 0) flag=0;
	            else if(x%149 == 0) flag=0;
	
	            else if(x%151 == 0) flag=0;
	            else if(x%157 == 0) flag=0;
	            else if(x%163 == 0) flag=0;
	            else if(x%167 == 0) flag=0;
	            else if(x%173 == 0) flag=0;
	            else if(x%179 == 0) flag=0;
	            else if(x%181 == 0) flag=0;
	            else if(x%191 == 0) flag=0;
	            else if(x%193 == 0) flag=0;
	            else if(x%197 == 0) flag=0;
	            else if(x%199 == 0) flag=0;
	
	            else if(x%211 == 0) flag=0;
	            else if(x%223 == 0) flag=0;
	            else if(x%227 == 0) flag=0;
	            else if(x%229 == 0) flag=0;
	            else if(x%233 == 0) flag=0;
	            else if(x%239 == 0) flag=0;
	            else if(x%241 == 0) flag=0;
	
	            else if(x%251 == 0) flag=0;
	            else if(x%257 == 0) flag=0;
	
	            else{ 
	            	int limit=(int) Math.sqrt(x);
	            	
	            	for(long y=263; y<=limit; y=y+2){
	                     if(x%y==0){
	                    	 flag=0; 
	                    	 break;
	                     }
	                 }
	            }
	        }
		    else {
		    	for(long y=3; y<=x/3; y=y+2) {
		    		if(x%y==0) flag=0;
		    	}
		    }
		
	        
		    if (flag==1){
		    	result = result + x + ", ";
		    }
	    }
		 
	    result=result + "End.";
	    
		return result;
	}
	
	
	//returns specific number of a char in a string
	public int charNumber(String string, char ch){
		int num=0;
		int length=string.length();

		for(int i=0; i<length; i++){
			if(string.charAt(i)==ch) num++;
		}
		
		return num;
	}
}




