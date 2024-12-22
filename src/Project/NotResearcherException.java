package Project;

public class NotResearcherException extends Exception {
    public NotResearcherException() {
        super(Translator.translate("researcherException", Main.language));
    }
}
