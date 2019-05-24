package com.ntt.Second;

class Basic{
	static {System.out.println("static trial");}//always executed before main
	int a;
	int b;
	int h;
	int w;
	static int area=30; 
	
	
	static void change() {
		area=40;
	}
Basic (){
	a=10;
	b=20;
}

Basic (int a1,int b2){
	a=a1;
	b=b2;
}
	
Basic(Basic b3){
	
	a=b3.a;
	b=b3.b;
}

Basic (int a,int b,int h){

	a=a;
	b=b;
	h=h;
}

Basic (int a,int b,int h,int w){

	this.a=a;
	this.b=b;
	this.h=h;
}


Basic (int a){

	this.a=a;
}

}

public class BasicMath {
	
	static {System.out.println("static trial inside BasicMath class");}//always executed before main(wherever it is).
	
	public static void main(String[] args) {
		
		
		Basic b=new Basic();//default
		
		Basic b1=new Basic( 20,3);//Parameterized 
		Basic b4=new Basic(b1);//copy
		Basic b5=new Basic();//copy
		b5.a=b.b;
		b5.b=b.a;
		Basic b6=new Basic( 20,3,1);//without using this keyword
		Basic b7=new Basic( 20,3,1,2);//with this keyword
		Basic b8=new Basic( 20);
		
        int sum=b.a+b.b;
		int sum1=b1.a+b1.b;
		int sum2=b4.a+ b4.b;
		int sum3=b5.a+b5.b;
		int sum4=b6.a+b6.b+b6.h;
		int sum5=b7.a+b7.b+b7.h+b7.w;
		int sum6=b8.a;
		System.out.println("sum b is \t"+sum);
		System.out.println("Sum in second class  b1 is \t"+sum1);
		System.out.println("Sum in copy construct class  b4 is \t"+sum2);
		System.out.println("Sum in copy construct class second method b5 is \t"+sum3);
		System.out.println("Sum in  construct class without using this keyword b6 is\t"+sum4);
		System.out.println("Sum in  construct class with using this keyword b7is \t"+sum5+" value of static variale area before change method is called is\t"+b7.area);
		Basic.change();
		
		System.out.println("Sum in  construct class with using this keyword b8 lis\t"+sum6+" value of static variale area after change method is called is\t"+b7.area);

//hence a static method can change value of static variable by calling method as show above.

		
	}

}
