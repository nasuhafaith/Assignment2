package assignment2;
public class StudentModel {
	
	private int id;
	private String name;
	private String department;
	private double mathMark;
	private double scienceMark;
	private double englishMark;
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public double getMathMark() {
		return mathMark;
	}
	
	public void setMathMark(double mathMark) {
		this.mathMark = mathMark;
	}
	
	public double getScienceMark() {
		return scienceMark;
	}
	
	public void setScienceMark(double  scienceMark) {
		this.scienceMark = scienceMark;
	}
	
	public double getEnglishMark() {
		return englishMark;
	}
	
	public void setEnglishMark(double englishMark) {
		this.englishMark = englishMark;
	}

}
