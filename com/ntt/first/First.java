package com.ntt.first;

 class First {
	int a;
	int b;
	int c;
	


	public First() {
	
	}



	public First(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}



	public static void main(String[] args) {
		System.out.println("hello world");
		First f=new First(1,1,1);
		System.out.println("++\t"+f.a+"\t"+f.b+"\t "+f.c);

		


	}

 }
