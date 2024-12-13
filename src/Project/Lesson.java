package Project;
import java.util.Date;

public class Lesson {
	private LessonType lessonType;
	private String room;
	private Date time;
	private Course course;
	
	public Lesson(LessonType lessonType, String room, Date time, Course course) {
		super();
		this.lessonType = lessonType;
		this.room = room;
		this.time = time;
		this.course = course;
	}
	
	public LessonType getLessonType() {
		return lessonType;
	}
	public void setLessonType(LessonType lessonType) {
		this.lessonType = lessonType;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
