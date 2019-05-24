package com.ntt.Second;


class Calculate{
	int length;
    int breadth;
    int height;
    int width;
    double height1;
    double width1;
     
Calculate(){
	length=1;
	breadth=3;
}
 Calculate(int l,int b,int h,int w){
	 length=l;
	 breadth=b;
	 height=h;
	 width=w;
 }
 
 Calculate(Calculate c3)
 {
	 length=c3.length;
	 breadth=c3.breadth;
	 height=c3.height;
	 width=c3.width;
	 
 }
 
 Calculate(int hei,int wid){
	 height=hei;
	 width=wid;
	 
 }
 Calculate(double hei,double wid){

	 height1=hei;
	 width1=wid;
	 
 }
}

public class AreaCalculations {

	public static void main(String[] args) {
      
		Calculate c1=new Calculate();
		Calculate c2=new Calculate(5, 2, 3, 4);
		Calculate c3=new Calculate(c2);
	    Calculate c4=new Calculate(3,4);	
		Calculate c5=new Calculate(1.2,1.3);
		System.out.println("c4 is\t"+c4.height+"\t"+c4.width);
		System.out.println("c5 is \t"+c5.height1+"\t"+c5.width1);

	}

}
