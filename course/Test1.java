package course;

public class Test1 {

	public static void main(String[] args) {
		Student student1 = new Student("Vlad", "IVT");
		Teacher teacher1 = new Teacher("Bob", "Anatomy");
		
		System.out.println("Это студент группы " + student1.getGroup());
		student1.printInfo();
		System.out.println("Это преподаватель предмета " + teacher1.getSubject());
		teacher1.printInfo();
	}

}
