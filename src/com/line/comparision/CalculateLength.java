package com.line.comparision;

public class CalculateLength {
	
	public void getLength() {
		 int x1 = 5;
         int x2 = 10;
         int y1 = 5;
         int y2 = 2;
         int Line = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
         System.out.println( "Length of line is: "+Line);
	}

}
