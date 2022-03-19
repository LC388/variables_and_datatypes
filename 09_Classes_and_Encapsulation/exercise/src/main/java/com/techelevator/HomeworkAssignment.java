package com.techelevator;

public class HomeworkAssignment {
private int earnedMarks;
private int possibleMarks;
private String submitterName;
private String letterGrade;

public String getLetterGrade(){
 double grade = ((earnedMarks * 1.0) / (1.0 * possibleMarks)) * 100.00;

    if (grade >= 90){
     letterGrade = "A";
      } if (grade < 90 && grade >= 80){
               letterGrade = "B";
        } if (grade < 80 && grade >= 70){
            letterGrade = "C";
            } if (grade < 70 && grade >= 60){
                letterGrade = "D";
                } if (grade < 60){
                    letterGrade = "F";}
                    return letterGrade;}


    public HomeworkAssignment(int possibleMarks, String submitterName){
    this.possibleMarks = possibleMarks;
    this.submitterName = submitterName;
}

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = getLetterGrade();
    }

}
