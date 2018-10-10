package com.etc.RentMarket.entity;

public class Example {
	String str = new String("good");
	int ch = 1;

	public static void main(String args[]){ 
	Example ex=new Example(); 
	ex.change(ex.str,ex.ch); 
	System.out.print(ex.str+" and "); 
	for(int i=0;i<2;i++){
	 System.out.print(ex.ch);
	 
	} 
}

	public void change(String str,int a){ 
	str="test ok"; 
	ch=2;
}
}
