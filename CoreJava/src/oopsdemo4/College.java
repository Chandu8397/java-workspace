package oopsdemo4;

/**
*Author :Mekapothula.Reddy
*Date   :30 Oct 2024
*Time   :3:00:34 pm
*Email  :Mekapothula.Reddy@coforge.com
*/

public class College {
	
	String name;;
	int id;
	String university;
	String course;

	//Constructor
public College(String name, int id, String university, String course) {
		super();
		this.name = name;
		this.id = id;
		this.university = university;
		this.course = course;
	}

// Generating Getters
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getUniversity() {
		return university;
	}
	public String getCourse() {
		return course;
	}
	
	

}
