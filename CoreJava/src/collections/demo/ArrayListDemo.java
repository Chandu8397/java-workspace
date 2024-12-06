package collections.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
*Author :Mekapothula.Reddy
*Date   :5 Nov 2024
*Time   :12:39:26 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1= new ArrayList<String>();
		
		a1.add("Java");
		a1.add("Perl");
		a1.add("C++");
		a1.add("C# 5.0");
		a1.add("Java");
		a1.add("Python");
		
		System.out.println(a1);
		
		System.out.println("Element at Index 1: "+a1.get(1));
		System.out.println("Does list contains element Java ?:"+a1.contains("java"));
		
		a1.add(2,"Oracle");
		System.out.println(a1);
		
		//add elements at specific index
		System.out.println("Is Arraylist Empty ? :"+a1.isEmpty());
		System.out.println("Index of Perl :"+a1.indexOf("Perl"));
		System.out.println("Size of ArrayList :"+a1.size());
		
		//Collection of utility classes
		Collections.sort(a1);
		System.out.println("ArrayList after Sorting : " +a1);
		
		//a1.add(100);
		ArrayList<Integer> a2= new ArrayList<Integer>();   //default size of an ArrrayList is 10
		
		a2.add(100);
		a2.add(400);
		a2.add(73);
		a2.add(66);
		a2.add(350);
		a2.add(73);
		
		System.out.println(a2);
		System.out.println("Size :"+a2.size());
		}

}
