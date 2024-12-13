package Project;

import java.util.List;

public interface Researcher {                               
    void publishResearch(ResearchPaper paper);
    void participateInProject(ResearchProject project);
    List<ResearchPaper> getPublishedPapers();
    void addPublishedPaper(ResearchPaper paper);
    List<ResearchProject> getResearchProjects();
}
