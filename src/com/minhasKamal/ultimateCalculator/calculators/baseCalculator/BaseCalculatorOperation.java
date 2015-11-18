/**
 * Developers: Minhas Kamal(BSSE-0509) 
 * Date: Dec-2013
 * Date: 13-Jan-2014
**/

package com.minhasKamal.ultimateCalculator.calculators.baseCalculator;

import com.minhasKamal.ultimateCalculator.notifications.message.Message;


public class BaseCalculatorOperation {
	//**principle method**//
	
	//mathematical operations
	public String operation(int base, String operand1, String operand2, String operator){
		String result="";
		
		if(!operand1.equals("") && !operator.equals("")){	//general case
			if(base==1){
				if(operator.equals("+")){
					result=binSum(operand1, operand2);
				}else if(operator.equals("-")){
					result=binSubstract(operand1, operand2);
				}else if(operator.equals("x") || operator.equals("*")){
					result=binMultiply(operand1, operand2);
				}else if(operator.equals("/")){
					result=binDivide(operand1, operand2);
				}
			}else if(base==2){
				if(operator.equals("+")){
					result=octSum(operand1, operand2);
				}else if(operator.equals("-")){
					result=octSubstract(operand1, operand2);
				}else if(operator.equals("x") || operator.equals("*")){
					result=octMultiply(operand1, operand2);
				}else if(operator.equals("/")){
					result=octDivide(operand1, operand2);
				}
			}else if(base==3){
				if(operator.equals("+")){
					result=decSum(operand1, operand2);
				}else if(operator.equals("-")){
					result=decSubstract(operand1, operand2);
				}else if(operator.equals("x") || operator.equals("*")){
					result=decMultiply(operand1, operand2);
				}else if(operator.equals("/")){
					result=decDivide(operand1, operand2);
				}
			}else if(base==4){
				if(operator.equals("+")){
					result=hexSum(operand1, operand2);
				}else if(operator.equals("-")){
					result=hexSubstract(operand1, operand2);
				}else if(operator.equals("x") || operator.equals("*")){
					result=hexMultiply(operand1, operand2);
				}else if(operator.equals("/")){
					result=hexDivide(operand1, operand2);
				}
			}
		}
		else result = operand2;
		
		
		return result;
	}
	
	//base conversions
	public String conversion(int from, int to, String operand){
		String result="";
		
		if(from==1 && to==1){
			result=operand;
		}else if(from==1 && to==2){
			result=binToOctConversion(operand);
		}else if(from==1 && to==3){
			result=binToDecConversion(operand);
		}else if(from==1 && to==4){
			result=binToHexConversion(operand);
		}
		else if(from==2 && to==1){
			if(operand.length()<7){
				result=octToBinConversion(operand);
			}else{
				new Message("Cannot convert!", 420);
			}
		}else if(from==2 && to==2){
			result=operand;
		}else if(from==2 && to==3){
			result=octToDecConversion(operand);
		}else if(from==2 && to==4){
			result=octToHexConversion(operand);
		}
		else if(from==3 && to==1){
			if(operand.length()<6){
				result=decToBinConversion(operand);
			}else{
				new Message("Cannot convert!", 420);
			}
		}else if(from==3 && to==2){
			result=decToOctConversion(operand);
		}else if(from==3 && to==3){
			result=operand;
		}else if(from==3 && to==4){
			result=decToHexConversion(operand);
		}
		else if(from==4 && to==1){
			if(operand.length()<5){
				result=hexToBinConversion(operand);
			}else{
				new Message("Cannot convert!", 420);
			}
		}else if(from==4 && to==2){
			if(operand.length()<10){
				result=hexToOctConversion(operand);
			}else{
				new Message("Cannot convert!", 420);
			}
		}else if(from==4 && to==3){
			if(operand.length()<12){
				result=hexToDecConversion(operand);
			}else{
				new Message("Cannot convert!", 420);
			}
		}else if(from==4 && to==4){
			result=operand;
		}
		
		
		return result;
	}
	
	
	
	/***Decemal***/													//***//
	
	private String decSum(String a, String b){
		return longToString(stringToLong(a)+stringToLong(b));
	}
	private String decSubstract(String a, String b){
		return longToString(stringToLong(a)-stringToLong(b));
	}
	private String decMultiply(String a, String b){
		return longToString(stringToLong(a)*stringToLong(b));
	}
	private String decDivide(String a, String b){
		return longToString(stringToLong(a)/stringToLong(b));
	}
	private String decToBinConversion(String a){
		long result=0;
		long x = stringToLong(a);
		
		for(int i=0; x!=0; i++){
			result = result+ ((x%2) * exponent(10, i));
			x=x/2;
		}
		return longToString(result);
	}
	private String decToOctConversion(String a){
		long result=0;
		long x = stringToLong(a);
		
		for(int i=0; x!=0; i++){
			result = result+ ((x%8) * exponent(10, i));
			x=x/8;
		}
		return longToString(result);
	}
	private String decToHexConversion(String a){
		String result="";
		long x = stringToLong(a);
		
		while(x!=0){
			result = intToChar((int) (x%16)) + result;
			x=x/16;
		}
		return result;
	}
	
	/***Binary***/													//***//
	
	private String binSum(String a, String b){
		String dec1=binToDecConversion(a),
			   dec2=binToDecConversion(b),
			   r=decSum(dec1, dec2);
		
		return decToBinConversion(r);
	}
	private String binSubstract(String a, String b){
		String dec1=binToDecConversion(a),
			   dec2=binToDecConversion(b),
			   r=decSubstract(dec1, dec2);
		return decToBinConversion(r);	
	}
	private String binMultiply(String a, String b){
		String dec1=binToDecConversion(a),
			   dec2=binToDecConversion(b),
			   r=decMultiply(dec1, dec2);
		return decToBinConversion(r);
	}
	private String binDivide(String a, String b){
		String dec1=binToDecConversion(a),
			   dec2=binToDecConversion(b),
			   r=decDivide(dec1, dec2);
			
		return decToBinConversion(r);
	}
	private String binToDecConversion(String a){
		long result=0;
		long x = stringToLong(a);
		
		for(int i=0; x!=0; i++){
			result = result + ((x%10) * exponent(2, i));
			x=x/10;
		}
		return longToString(result);
	}
	private String binToOctConversion(String a){
		String str = binToDecConversion(a);
		
		return decToOctConversion(str);
	}
	private String binToHexConversion(String a){
		String str = binToDecConversion(a);
		
		return decToHexConversion(str);
	}
	
	/***Octal***/													//***//
	
	private String octSum(String a, String b){
		String dec1=octToDecConversion(a),
			   dec2=octToDecConversion(b),
			   r=decSum(dec1, dec2);
		
		return decToOctConversion(r);
	}
	private String octSubstract(String a, String b){
		String dec1=octToDecConversion(a),
			   dec2=octToDecConversion(b),
			   r=decSubstract(dec1, dec2);
		return decToOctConversion(r);	
	}
	private String octMultiply(String a, String b){
		String dec1=octToDecConversion(a),
			   dec2=octToDecConversion(b),
			   r=decMultiply(dec1, dec2);
		return decToOctConversion(r);
	}
	private String octDivide(String a, String b){
		String dec1=octToDecConversion(a),
			   dec2=octToDecConversion(b),
			   r=decDivide(dec1, dec2);
			
		return decToOctConversion(r);
	}
	private String octToDecConversion(String a){
		long result=0;
		long x = stringToLong(a);
		
		for(int i=0; x!=0; i++){
			result = result + ((x%10) * exponent(8, i));
			x=x/10;
		}
		return longToString(result);
	}
	private String octToBinConversion(String a){
		String str = octToDecConversion(a);
		
		return decToBinConversion(str);
	}
	private String octToHexConversion(String a){
		String str = octToDecConversion(a);
		
		return decToHexConversion(str);
	}
	
	/***Hexadecimal***/													//***//
	
	private String hexSum(String a, String b){
		String dec1=hexToDecConversion(a),
			   dec2=hexToDecConversion(b),
			   r=decSum(dec1, dec2);
		
		return decToHexConversion(r);
	}
	private String hexSubstract(String a, String b){
		String dec1=hexToDecConversion(a),
			   dec2=hexToDecConversion(b),
			   r=decSubstract(dec1, dec2);
		return decToHexConversion(r);	
	}
	private String hexMultiply(String a, String b){
		String dec1=hexToDecConversion(a),
			   dec2=hexToDecConversion(b),
			   r=decMultiply(dec1, dec2);
		return decToHexConversion(r);
	}
	private String hexDivide(String a, String b){
		String dec1=hexToDecConversion(a),
			   dec2=hexToDecConversion(b),
			   r=decDivide(dec1, dec2);
			
		return decToHexConversion(r);
	}
	private String hexToDecConversion(String a){
		long result=0;
		
		for(int i=0; i<a.length(); i++){
			int pos = a.length()-i-1;
			result = result + (charToInt(a.charAt(pos)) * exponent(16, i));
		}
		return longToString(result);
	}
	private String hexToBinConversion(String a){
		String str = hexToDecConversion(a);
		
		return decToBinConversion(str);
	}
	private String hexToOctConversion(String a){
		String str = hexToDecConversion(a);
		
		return decToOctConversion(str);
	}
	
	/***Auxiliary Methods***/													//***//
	
	private long stringToLong(String str){
		long l=0;
		for(int i=0; i<str.length(); i++){
			int pos = str.length()-i-1;
			l = l + (charToInt(str.charAt(pos)) * exponent(10, i));
		}
		return l;
	}
	private String longToString(long l){
		String str="";
		while(l!=0){
			int i = (int) (l%10);
			str = intToChar(i) + str;
			l=l/10;
		}
		return str;
	}
	/**/
	private int charToInt(char c){
		int i=0;
		
		if(c=='F') i=15;
		else if(c=='E') i=14;
		else if(c=='D') i=13;
		else if(c=='C') i=12;
		else if(c=='B') i=11;
		else if(c=='A') i=10;
		else i=c-48;
		
		return i;
	}
	private char intToChar(int i){
		char c=0;
		
		if(i==15) c='F';
		else if(i==14) c='E';
		else if(i==13) c='D';
		else if(i==12) c='C';
		else if(i==11) c='B';
		else if(i==10) c='A'; 
		else c=(char) (i+48);
		
		return c;
	}
	/**/
	private long exponent(long a, long b){
		long i=1;
		for( ; b>0; b--)
			i=i*a;

		return i;
	}
}
