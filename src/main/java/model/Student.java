package model;

public class Student {
private String name;
private String address;
private String phone;
public Student(String name,String address,String phone) {
	this.name=name;
	this .address=address;
	this.phone=phone;
	
}
public String toString() {
	return "name " +name+" address "+address+""
			+ " phone "+phone;
}

	}


