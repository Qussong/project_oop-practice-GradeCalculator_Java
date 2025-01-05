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
}
