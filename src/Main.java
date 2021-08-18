
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1= new Instructor();
		instructor1.setUserName("Görkem");
		instructor1.setCourse("Java");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(instructor1);
		
		
		
		Student student1 = new Student();
		student1.setUserName("Merve");
		student1.setLesson("PHP");
		
		StudentManager studentManager = new StudentManager();
		studentManager.takeLesson(student1);
 	}

}
