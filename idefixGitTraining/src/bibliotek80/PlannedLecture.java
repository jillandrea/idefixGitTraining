package bibliotek80;

import java.util.Date;

public class PlannedLecture {
	private Lecture lecture;
	private String forum;
	private Date calendar;
	private double entryfee;
	
	public PlannedLecture() {
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return "Lecture: " + null;
	}

	public void setLecture(Lecture lecture) {
		this.lecture = lecture;
	}

	public void setForum(String forum) {
		this.forum = forum;
	}

	public void setCalendar(Date calendar) {
		this.calendar = calendar;
	}

	public void setEntryfee(double entryfee) {
		this.entryfee = entryfee;
	}

}
