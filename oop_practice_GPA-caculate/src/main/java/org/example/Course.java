package org.example;

public class Course {
    private final String subject;   // 과목명
    private final int credit;       // 학점
    private final String grade;     // 성적

    public Course(String subject, int credit, String grade) {
        this.subject = subject;
        this.credit = credit;
        this.grade = grade;
    }

    public double multiplyCreditAndCourseGrade() {
        return credit * getGradeToNumber();
    }

    public int getCredit() {
        return credit;
    }

    public double getGradeToNumber() {
        double grade = 0.0d;
        switch (this.grade) {
            case "A+":
                grade = 4.5d;
                break;
            case "A":
                grade = 4.0d;
                break;
            case "B+":
                grade = 3.5d;
                break;
            case "B":
                grade = 3.0d;
                break;
            case "C+":
                grade = 2.5d;
                break;
            case "C":
                grade = 2.0d;
                break;
        };

        return grade;
    }

}
