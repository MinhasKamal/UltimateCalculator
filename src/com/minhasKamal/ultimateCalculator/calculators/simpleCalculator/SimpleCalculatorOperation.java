/****************************************************************************************************************
* Developer: Minhas Kamal(BSSE-0509, IIT, DU)																	*
* Date: Dec-2013																								*
* Date: 11-Jan-2014																								*
****************************************************************************************************************/

package com.minhasKamal.ultimateCalculator.calculators.simpleCalculator;


import com.minhasKamal.ultimateCalculator.notifications.message.Message;

/**
 * Controls operation of simple calculator.
 *
 * @author Minhas Kamal
 */
public class SimpleCalculatorOperation {
	
	public SimpleCalculatorOperation() {

	}
	
	//Interfacing method
	public String operation(String operand1, String operand2, String operator){
		
		try{
			if(!operand1.equals("")){	//general case
				if(operator.equals("+")) return sum(operand1, operand2);
				else if(operator.equals("-")) return substract(operand1, operand2);
				else if(operator.equals("x") || operator.equals("*")) return multiply(operand1, operand2);
				else if(operator.equals("/")) return divide(operand1, operand2);
				else if(operator.equals("^")) return power(operand1, operand2);
				else return ""+Double.parseDouble(operand2);
			}
			else if(!operand2.equals("")) return ""+Double.parseDouble(operand2);	//when 0.999999999=1
			else return operand2;
		}catch(Exception e){
			new Message("Wrong input!", 420);
			
			return "";
		}
	}
	
	//operational methods
	private String sum(String operand1, String operand2) throws Exception{
		double a=Double.parseDouble(operand1);
		double b=Double.parseDouble(operand2);

		return ""+(a+b);
	}
	private String substract(String operand1, String operand2) throws Exception{
		double a=Double.parseDouble(operand1);
		double b=Double.parseDouble(operand2);
		
		return ""+(a-b);
	}
	private String multiply(String operand1, String operand2) throws Exception{
		double a=Double.parseDouble(operand1);
		double b=Double.parseDouble(operand2);

		return ""+(a*b);
	}
	private String divide(String operand1, String operand2) throws Exception{
		String r="0";
		double a=Double.parseDouble(operand1);
		double b=Double.parseDouble(operand2);
		
		if(b!=0){
			r= ""+(a/b);
		}else{
			new Message("Cannot divide by Zero!", 420);
		}
		
		return r;
	}
	public String power(String operand1, String operand2){
		double a=Double.parseDouble(operand1);
		double b=Double.parseDouble(operand2);
		
		return ""+Math.pow(a, b);
	}
		
	
	//sqrt method
	public String sqrt(String operand1){
		double a=Double.parseDouble(operand1);
		
		if(a>=0){
			return ""+Math.pow(a, 0.5);
		}else{
			new Message("There is no square-root of \n   negative number!", 420);
			return "";
		}
	}
}
