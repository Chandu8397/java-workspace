package java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
*Author :Mekapothula.Reddy
*Date   :8 Nov 2024
*Time   :2:56:35 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class LambdaComparatorDemo {

	public static void main(String[] args) {
	

				Student s1=new Student(101,"Gosling",78);
				Student s2=new Student(102,"Rod Jhonson",55);
				Student s3=new Student(103,"Steve Jobs",95);
				Student s4=new Student(104,"Zuckerberg",82);
				Student s5=new Student(105,"Mike",72.8);
				
				// add students to arrayList
				List<Student> sList=new ArrayList<Student>();
				sList.add(s1);
				sList.add(s2);
				sList.add(s3);
				sList.add(s4);
				sList.add(s5);
				
				System.out.println("Sort Students based on Names :");
				
				// implementing Lambda expression to sort User defined objects using 
				// Comparator Interface's compareTo() method
				
				Collections.sort(sList,(st1,st2)->{
					return st1.name.compareTo(st2.name);
				});
				
				//enhanced for loop
				for(Student s:sList) {
					System.out.println(s.rollNumber+ " "+s.name+" "+s.marks);
				}
				
				// Sort in descending order based on marks of a student
				System.out.println("******* Descending Order based on Marks :");

				Collections.sort(sList,(st1,st2) -> {
					return st2.marks.compareTo(st1.marks);
				});
				// foreach() loop
				sList.forEach(s->System.out.println(s.rollNumber+ " "+s.name+" "+s.marks));
				}
						
	}
