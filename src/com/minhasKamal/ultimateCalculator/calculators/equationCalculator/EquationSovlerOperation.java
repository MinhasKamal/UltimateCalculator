/**
 * Developers: Minhas Kamal(BSSE-0509)
 * Date: 13-Dec-2013
**/

package com.minhasKamal.ultimateCalculator.calculators.equationCalculator;

import com.minhasKamal.ultimateCalculator.notifications.message.Message;


public class EquationSovlerOperation {
	
	//solves the equation ax+by=c
	public String[] AXBYC(String a1, String b1, String c1, String a2, String b2, String c2){	
		String xy[] = new String[2];	//holds resulting values
		
		try{
			double A1 = Double.parseDouble(a1);
			double B1 = Double.parseDouble(b1);
			double C1 = Double.parseDouble(c1);
			double A2 = Double.parseDouble(a2);
			double B2 = Double.parseDouble(b2);
			double C2 = Double.parseDouble(c2);
			
			if((A1*B2-A2*B1)!=0){
				xy[0]= "" + ( (C1*B2-C2*B1)/(A1*B2-A2*B1) );
				xy[1]= "" + ( (A1*C2-A2*C1)/(A1*B2-A2*B1) );
				
				//For better understanding ignore double number
				if((xy[0].indexOf(".")+4)<xy[0].length()){
					double gcd=gcdFinder(C1*B2-C2*B1, A1*B2-A2*B1);
					
					xy[0]= "(" + (C1*B2-C2*B1)/gcd + ") / (" + (A1*B2-A2*B1)/gcd + ")";
				}
				if((xy[1].indexOf(".")+4)<xy[1].length()){
					double gcd=gcdFinder(A1*C2-A2*C1, A1*B2-A2*B1);
					
					xy[1]= "(" + (A1*C2-A2*C1)/gcd + ") / (" + (A1*B2-A2*B1)/gcd + ")";
				}
			}else{
				xy[0]= "No Answer!";
				xy[1]= "No Answer!";
			}
		}catch(Exception e){
			new Message("Wrong Input! \n   Numbers only!", 420);
		}
		
		return xy;
	}
	
	//solves the equation ax+by+cz=d
	public String[] AXBYCZD(String a1, String b1, String c1, String d1, String a2, String b2, String c2, String d2, String a3,
							String b3, String c3, String d3){	
		String xyz[] = new String[3];	//holds resulting values
		
		try{
			double A1 = Double.parseDouble(a1);
			double B1 = Double.parseDouble(b1);
			double C1 = Double.parseDouble(c1);
			double D1 = Double.parseDouble(d1);
			double A2 = Double.parseDouble(a2);
			double B2 = Double.parseDouble(b2);
			double C2 = Double.parseDouble(c2);
			double D2 = Double.parseDouble(d2);
			double A3 = Double.parseDouble(a3);
			double B3 = Double.parseDouble(b3);
			double C3 = Double.parseDouble(c3);
			double D3 = Double.parseDouble(d3);
			
			
			Double divisor = A1*(B2*C3-C2*B3) + B1*(C2*A3-A2*C3) + C1*(A2*B3-B2*A3);
			
			if(divisor!=0){
				xyz[0]= "" + ( (D1*(B2*C3-C2*B3) + B1*(C2*D3-D2*C3) + C1*(D2*B3-B2*D3)) / divisor );
				xyz[1]= "" + ( (A1*(D2*C3-C2*D3) + D1*(C2*A3-A2*C3) + C1*(A2*D3-D2*A3)) / divisor );
				xyz[2]= "" + ( (A1*(B2*D3-D2*B3) + B1*(D2*A3-A2*D3) + D1*(A2*B3-B2*A3)) / divisor );
				
				//For better understanding ignore double number
				if((xyz[0].indexOf(".")+4)<xyz[0].length()){
					double gcd=gcdFinder(D1*(B2*C3-C2*B3) + B1*(C2*D3-D2*C3) + C1*(D2*B3-B2*D3), divisor);
					
					xyz[0]="(" + (D1*(B2*C3-C2*B3) + B1*(C2*D3-D2*C3) + C1*(D2*B3-B2*D3))/gcd + ") / (" + divisor/gcd + ")";
				}
				if((xyz[1].indexOf(".")+4)<xyz[1].length()){
					double gcd=gcdFinder(A1*(D2*C3-C2*D3) + D1*(C2*A3-A2*C3) + C1*(A2*D3-D2*A3), divisor);
					
					xyz[1]="(" + (A1*(D2*C3-C2*D3) + D1*(C2*A3-A2*C3) + C1*(A2*D3-D2*A3))/gcd + ") / (" + divisor/gcd + ")";
				}
				if((xyz[2].indexOf(".")+4)<xyz[2].length()){
					double gcd=gcdFinder(A1*(B2*D3-D2*B3) + B1*(D2*A3-A2*D3) + D1*(A2*B3-B2*A3), divisor);
					
					xyz[2]="(" + (A1*(B2*D3-D2*B3) + B1*(D2*A3-A2*D3) + D1*(A2*B3-B2*A3))/gcd + ") / (" + divisor/gcd + ")";
				}
			}else{
				xyz[0]= "No Answer!";
				xyz[1]= "No Answer!";
				xyz[2]= "No Answer!";
			}
		}catch(Exception e){
			new Message("Wrong Input! \n   Numbers only!", 420);
		}
		
		return xyz;
	}
	
	//solves the equation ax2+b2=c
	public String[] AX2BXC(String a, String b, String c){
		String[] x=new String[2];	//holds resulting values
		
		try{
			double A = Double.parseDouble(a);
			double B = Double.parseDouble(b);
			double C = Double.parseDouble(c);
			
			double det = B*B - 4*A*C;		//determiner 
			
			if(det<0){	//unreal root
				
				x[0]=(-B)/(2*A) + " + i Sqrt(" + det/(4*A*A) + ")";
				x[1]=(-B)/(2*A) + " - i Sqrt(" + det/(4*A*A) + ")";
				
				if(x[0].length()>35){
					double gcd1=gcdFinder(-B, 2*A),
						gcd2=gcdFinder(det, 4*A*A);
					
					x[0] = "(" + (-B)/gcd1 + "/" + (2*A)/gcd1 + ") + i Sqrt(" + det/gcd2 + "/" + (4*A*A)/gcd2 + ")";
					x[1] = "(" + (-B)/gcd1 + "/" + (2*A)/gcd1 + ") - i Sqrt(" + det/gcd2 + "/" + (4*A*A)/gcd2 + ")";				
				}
				
			}else{		//real root
				double Sqrtd = Math.sqrt(det);

				x[0]="" + ( (-B+Sqrtd)/(2*A) );
				x[1]="" + ( (-B-Sqrtd)/(2*A) );
				
				if((x[0].indexOf(".")+4)<x[0].length()){
					double gcd1=gcdFinder(-B, 2*A),
							gcd2=gcdFinder(det, 4*A*A);
					
					x[0] = "(" + (-B)/gcd1 + "/" + (2*A)/gcd1 + ") + Sqrt(" + det/gcd2 + "/" + (4*A*A)/gcd2 + ")";
					x[1] = "(" + (-B)/gcd1 + "/" + (2*A)/gcd1 + ") - Sqrt(" + det/gcd2 + "/" + (4*A*A)/gcd2 + ")";				
				}
			}
			
			
		}catch(Exception e){
			new Message("Wrong Input! \n   Numbers only!", 420);
		}
		
		return x;
	}
	
	//solves the equation ax3+bx2+cx=d
	public String[] AX3BX2CXD(String a, String b, String c, String d){
		String x[] = new String[3];	//holds resulting values
		
		try{
			double A = Double.parseDouble(a);
			double B = Double.parseDouble(b);
			double C = Double.parseDouble(c);
			double D = Double.parseDouble(d);
		

			double result=0;		//The first real root
			for(double i=0; i<=500; i=(i+0.001)){	//finds the first real root
				
				result=(A*i*i*i)+(B*i*i)+(C*i)-D;
				
				if(result<0.0001 && result>-0.0001){	//when root is positive
					x[0] = ""+numberSimpleMaker(i);
				}
				else{									//when root is not positive
					result=-(A*i*i*i)+(B*i*i)-(C*i)-D;
					
					if(result<0.0001 && result>-0.0001){
						x[0] = ""+numberSimpleMaker(-i);
					}
				}
			}

			//finding the other two;
			if(!x[0].equals(null)){
				String[] rawX = new String[2];	//x of binary equation
				
				String rawA="" + ( Double.parseDouble(a) );
				String rawB="" + ( Double.parseDouble(b)+(Double.parseDouble(a)*Double.parseDouble(x[0])) );
				String rawC="" + (Double.parseDouble(c)+(Double.parseDouble(rawB)*Double.parseDouble(x[0]))) ;
				
				rawX=AX2BXC(rawA, rawB, rawC);	//AX2BXC() method call
				
				x[1]=rawX[0];
				x[2]=rawX[1];
			}
			
		}catch(NumberFormatException e){
			new Message("Wrong Input! \n   Numbers only!", 420);
		}catch(Exception e){
			//when result is not real
			for(int n=0; n<3; n++){	
				if(x[n]==null) x[n]="Does not have a real solution!";
			}
		}
		
		
		
		
		return x;
	}
	
	//private methods//
	
	//takes a number and makes it simpler
	private float numberSimpleMaker(double d){	//eg: takes 2.99987767 and returns 3
		int sign=1;
		if(d<0){	//if 'd' is negative makes 'd' positive
			d=-d;
			sign = -1;
		}
		float result=(float) d;
		
		int i= (int) Math.floor(d);
		
		for(float f=i; f<=(i+1); f=(float) (f+0.5)){
			if((d>f && d-f<0.001) || (d<f && f-d<0.001)){
				result = f;
				break;
			}
		}
		
		return result*sign;
	}
	
	//takes two number and finds the g.c.d
	private double gcdFinder(double a, double b){
		double gcd=1;
		boolean neg=false;
		
		long A=(long)a;
		long B=(long)b;
		
		if(A!=a || B!=b){
			//do nothing
		}else{
			if(A<0 && B<0) neg=true;	//both are negative
			
			if(A<0) A=A*(-1);	//make positive
			if(B<0) B=B*(-1);
			
			if(A>B){	//make A smaller
				A=A+B;
				B=A-B;
				A=A-B;
			}
			
			for(long i=1; i<=A; i++){
				if(A%i==0 && B%i==0)
					gcd=i;
			}
			
			if(neg) gcd=gcd*(-1);
		}
		
		return gcd;
	}
}


