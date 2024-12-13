package Project;

class ResearchPaper {
    private String title;
    private String citations;
    private int pages;
    private Journal journal;
    private int articleLength;

    public ResearchPaper(String title, String citations, int pages, Journal journal, int articleLength) {
        this.title = title;
        this.citations = citations;
        this.pages = pages;
        this.journal = journal;
        this.articleLength = articleLength;
    }

    public Format getCitation() { 
    	return new Format("", ""); 
    	}
}
