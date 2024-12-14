package Project;

class Marks {
    private Course course;
    private double firstAtt;
    private double secondAtt;
    private double finalGrades;
    private double totalGrades;

    public Marks(Course course, double firstAtt, double secondAtt, double finalGrades) {
        this.course = course;
        this.firstAtt = firstAtt;
        this.secondAtt = secondAtt;
        this.finalGrades = finalGrades;        
    }

    public boolean isAllowedToFinal() {
    	return (firstAtt + secondAtt) >= 30; 
    }


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
	    if (firstAtt < 0) {
	        throw new IllegalArgumentException("Marks cannot be negative");
	    }
	    this.firstAtt = firstAtt;
	}

	public double getSecondAtt() {
		return secondAtt;
	}

	public void setSecondAtt(double secondAtt) {
		if (secondAtt < 0) {
			throw new IllegalArgumentException("Marks cannot be negative");
		}
		this.secondAtt = secondAtt;
	}

	public double getFinalGrades() {
		return finalGrades;
	}

	public void setFinalGrades(double finalGrades) {
		this.finalGrades = finalGrades;
	}

	public double getTotalGrades() {
		return firstAtt + secondAtt + finalGrades;
	}
	
	@Override
	public String toString() {
	    return "Marks{" +
	            "course=" + course +
	            ", firstAtt=" + firstAtt +
	            ", secondAtt=" + secondAtt +
	            ", finalGrades=" + finalGrades +
	            ", totalGrades=" + getTotalGrades() +
	            '}';
	}

    
    
}