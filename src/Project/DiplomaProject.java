package Project;

class DiplomaProject {
    String projectTitle;
    int studentId;
    ResearchPaper researchPapers;

    public DiplomaProject(String projectTitle, int studentId, ResearchPaper researchPapers) {
        this.projectTitle = projectTitle;
        this.studentId = studentId;
        this.researchPapers = researchPapers;
    }

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public ResearchPaper getResearchPapers() {
		return researchPapers;
	}

	public void setResearchPapers(ResearchPaper researchPapers) {
		this.researchPapers = researchPapers;
	}
    
    

}
