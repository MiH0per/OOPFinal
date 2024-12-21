package Project;

class Course {
    String name;
    String code;
    int credits;
    int maxNumberOfStudents;
    CourseType courseType;
    Teacher instructor;

    public Course(String name, String code, int credits, int maxNumberOfStudents, CourseType courseType, Teacher instructor) {
        this.name = name;
        this.code = code;		
        this.credits = credits;
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.courseType = courseType;
        this.instructor = instructor;
    }

	public String getCourseName() {
		return name;
	}

	public void setCourseName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public int getMaxNumberOfStudents() {
		return maxNumberOfStudents;
	}

	public void setMaxNumberOfStudents(int maxNumberOfStudents) {
		this.maxNumberOfStudents = maxNumberOfStudents;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}

	public Teacher getInstructor() {
		return instructor;
	}

	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}

//	@Override
//	public String toString() {
//		return "Course [name=" + name + ", code=" + code + ", credits=" + credits + ", maxNumberOfStudents="
//				+ maxNumberOfStudents + ", courseType=" + courseType + ", instructor=" + instructor + "]";
//	}
	
	

    
}