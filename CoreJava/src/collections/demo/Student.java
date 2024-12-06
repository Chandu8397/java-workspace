package collections.demo;

/**
*Author :Mekapothula.Reddy
*Date   :6 Nov 2024
*Time   :12:01:02 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int age;
	
	
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
		return -1;
	}
	
	

	
	
}
