package Assignment_1;

public class Student {
    private static int counter = 1;
    private int rollNo;
    private String studName;
    private int marksInEng;
    private int marksInMaths;
    private int marksInScience;

    public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
        this.rollNo = counter++;
        this.studName = studName;
        this.marksInEng = marksInEng;
        this.marksInMaths = marksInMaths;
        this.marksInScience = marksInScience;
    }

    public int getRollNo() {
    	return rollNo; 
    	}
    public String getStudName() {
    	return studName; 
    	}
    public int getMarksInEng() {
    	return marksInEng; 
    	}
    public int getMarksInMaths() {
    	return marksInMaths;
    	}
    public int getMarksInScience() {
    	return marksInScience;
    	}

    public void setStudName(String studName) {
    	this.studName = studName; 
    	}
    public void setMarksInEng(int marksInEng) {
    	this.marksInEng = marksInEng;
    	}
    public void setMarksInMaths(int marksInMaths) { 
    	this.marksInMaths = marksInMaths;
    	}
    public void setMarksInScience(int marksInScience) {
    	this.marksInScience = marksInScience;
    	}

    public int getTotalMarks() {
        return marksInEng + marksInMaths + marksInScience;
    }

    public double getPercentage() {
        return getTotalMarks() / 3.0;
    }
}


