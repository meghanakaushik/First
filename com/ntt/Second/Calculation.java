package com.ntt.Second;

 class Calculations {
	int area ;
	int length;
	int breadth;
	int height;

Calculations(){
area=0;
length=25;
breadth=1;
height=3;

}

Calculations(int length,int breadth,int height){
	length=1;
	breadth=6;
	height=12;
	
}	
 }

class Calculation{

	public static void main(String[] args) {
	Calculations c=new Calculations();
	c.area=c.length*c.breadth;
	System.out.println("area is"+c.area);
	
	}

}
