package com.line.comparision;

public class CheckEquality {
	
	public void findEquality() {
		int x1 = 5;
		int x2 = 10;
		int x3 = 5;
		int x4 = 2;
		int y1 = 5;
		int y2 = 10;
		int y3 = 5;
		int y4 = 2;
		
		int lineOne = ((((x2 -x1)*(x2-x1))+((y2-y1)+(y2-y1))));
		int lineTwo = ((((x4 -x3)*(x4-x3))+((y4-y3)+(y4-y3))));
		
		String lengthOne = String.valueOf(lineOne);
		String lengthTwo = String.valueOf(lineTwo);
		
		System.out.println("Length of first Line :"+lineOne);
		System.out.println("Length of Second Line :" +lineTwo);
		System.out.println(lengthOne.equals(lengthTwo));
	}

}
