package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :3:00:29 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to Add 2 Complex Numbers - Real & Imaginary Part
* Demonstrate constructors & this keyword
*/

public class Complex {
	
	private double real;
	private double imaginary;
	
	//Generate parameterized constructor
	public Complex(double real, double imaginary) {
	this.real = real;
	this.imaginary= imaginary;
	}
	
	//Logic to add 2 complex numbers
	public void add(Complex obj) {
		this.real+= obj.real;            //***This keyword*** access complex1 Object - complex1.real+complex2.real
		this.imaginary+=obj.imaginary;
		}
	
	public void display() {
		System.out.println("The Addition of 2 Complex Numbers is :");
		System.out.println("r"+this.real+" i"+this.imaginary);
	}
}
