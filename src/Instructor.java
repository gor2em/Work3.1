
public class Instructor extends User {
	private String course;

	public Instructor() {
		
	}
	
	public Instructor(String course) {
		super();
		this.course = course;
	}
	
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}



	
	
}
