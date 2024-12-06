package collections.demo;

import java.util.ArrayList;
import java.util.Collections;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :12:06:34 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al= new ArrayList<Student>();
		al.add(new Student(111,"Chandu",28));
		al.add(new Student(222,"Mike",35));
		al.add(new Student(333,"Mary",27));
		al.add(new Student(444,"Mary",29));

		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
		}
	}

}
