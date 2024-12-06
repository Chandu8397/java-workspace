package oopsdemo1;

/**
*Author :Mekapothula.Reddy
*Date   :26 Oct 2024
*Time   :4:12:09 pm
*Email  :Mekapothula.Reddy@coforge.com
*
*Program to demonstarate Constructor Over Loading - Constructor with different parameters
*/

public class Languages {
	
	private String name;
	private float version;
	
	
	//generate Default Constructor
	public Languages() {
		this.name="Java";
		this.version=8.0f;
		System.out.println("The Language is : "+this.name +"-V" +this.version );
		
		}

     //Generating Constructors
	public Languages(String name) {
		this.name = name;
		this.version=5.0f;
		System.out.println("The Language is : "+this.name +"-V" +this.version );
		
	}


	public Languages(float version) {
		this.version = version;
		this.name="Python";
		System.out.println("The Language is : "+this.name +"-V" +this.version );
	}

     
	//constructor with different parameters
	public Languages(String name, float version) {
		this.name = name;
		this.version = version;
		System.out.println("The Language is : "+this.name +"-V" +this.version );
	}
	
	
	}
	
	
