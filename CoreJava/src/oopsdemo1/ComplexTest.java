package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :3:06:40 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to Add 2 Complex Numbers - Real & Imaginary Part
*
*/

public class ComplexTest {

	public static void main(String[] args) {
		
		//create Complex object with Real & Imaginary
		Complex complex1=new Complex(10.3, 67.4);
		Complex complex2=new Complex(0.7, 3.6);
		
		complex1.add(complex2);   //Invoke add()method
		complex1.display();
		
		Complex complex3=new Complex(11.66, 22.5);  //Invokes the constructor
		Complex complex4=new Complex(20.20, 30.60);
		
		complex3.add(complex4);
		complex3.display();
		
		}

}
