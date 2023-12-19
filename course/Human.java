package course;

public class Human {
	private String name;
	
	public Human(String name) { this.name = name; }
	public void setName(String name) { this.name = name; }
	
	public String getName() { return name; }
	
	public void printInfo() { System.out.println("Этот человек с именем " + name); }
	
}


class Student extends Human{
	String group;
	
	public Student(String name, String group) {
		super(name);
		this.group = group;
	}
	
	public void setGroup(String group) { this.group = group; }
	
	public String getGroup() { return group; }
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Это студент с именем " + getName());
	}
}

class Teacher extends Human{
	String subject;
	
	public Teacher(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	public void setSubject(String subject) { this.subject = subject; }
	
	public String getSubject() { return subject; }
	
	public void printInfo() {
		super.printInfo();
		System.out.println("Этот преподаватель с именем " + getName());
	}
}