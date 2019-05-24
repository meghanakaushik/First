package com.ntt.Thrid;



class A{  
private int data=40;  
 void msg(){System.out.println("Hello java");}


public A() {

}


public A(int data) {

	this.data = data;
}


public int getData() {
	return data;
}


public void setData(int data) {
	this.data = data;
}  



}  
public class MethOver {

	public static void main(String[] args) {
		  A obj=new A();  
		   System.out.println(obj.getData());//Compile Time Error  
		   obj.msg();//Compile Time Error  
	}

}

  
/*public class Simple{  
 public static void main(String args[]){  
 
   }  
}  */