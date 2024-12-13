package Project;

class Marks {
    private Course course;
    private double firstAtt;
    private double secondAtt;
    private double finalGrades;
    private double totalGrades;

    public Marks(Course course, double firstAtt, double secondAtt, double finalGrades, double totalGrades) {
        this.course = course;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalGrades = finalGrades;
        this.totalGrades = totalGrades;
    }

    public String gradesToLetter() { return ""; }
    public double calculateGpaForCourse() { return 0.0; }
    public boolean isAllowedToFinal() { return true; }
    public boolean checkScholarship() { return false; }

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getFirstAtt() {
		return firstAtt;
	}

	public void setFirstAtt(double firstAtt) {
		this.firstAtt = firstAtt;
	}

	public double getSecondAtt() {
		return secondAtt;
	}

	public void setSecondAtt(double secondAtt) {
		this.secondAtt = secondAtt;
	}

	public double getFinalGrades() {
		return finalGrades;
	}

	public void setFinalGrades(double finalGrades) {
		this.finalGrades = finalGrades;
	}

	public double getTotalGrades() {
		return totalGrades;
	}

	public void setTotalGrades(double totalGrades) {
		this.totalGrades = totalGrades;
	}
    
    
}