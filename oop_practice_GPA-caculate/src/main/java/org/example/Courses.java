package org.example;

import java.util.List;

public class Courses {
    private final List<Course> courses; // 일급 컬렉션

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();

        /*double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            //multipliedCreditAndCourseGrade += (course.getCredit() * course.getGradeToNumber());
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }
        return multipliedCreditAndCourseGrade;*/
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
