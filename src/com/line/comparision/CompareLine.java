package com.line.comparision;

public class CompareLine {
	
	public void checkCompareLine() {
		
		int x1 = 5;
		int x2 = 10;
		int x3 = 15;
		int x4 = 20;
		int y1 = 55;
		int y2 = 100;
		int y3 = 25;
		int y4 = 28;
		int lineOne = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int lineTwo = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
	
		System.out.println(lineOne); 
		System.out.println(lineTwo); 
			if(lineOne > lineTwo){
		System.out.println("Line one is greater:" +lineOne);

		}
			else if(lineTwo > lineOne){

             System.out.println("Line Two is greater:" +lineTwo);

            }
             else {
             System.out.println("Both Lines are equal:");

			}
		
	}

}
