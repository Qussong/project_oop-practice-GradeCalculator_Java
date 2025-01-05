# 📌학점 계산기

### 🔻조건

1. 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
2. MVC패턴(Model-View-Controller) 기반으로 구현한다.
3. 일급 컬렉션 사용

### 🔻환경

- OS : Windows 11
- Language : Java 17

    >openjdk version "17.0.13" 2024-10-15</br>OpenJDK Runtime Environment Temurin-17.0.13+11 (build 17.0.13+11)</br>OpenJDK 64-Bit Server VM Temurin-17.0.13+11 (build 17.0.13+11, mixed mode, sharing)<br>

- IDE : IntelliJ IDEA Ultimate 2024.3.1.1</br>
- Build Tool : Gradle
- Test Tool : JUnit 5
- Library : AssertJ, Passay


### 🔻학점 계산 Test 코드 (GradeCalculateTest.java)

```java
public class GradeCalculateTest {

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(
                new Course("OOP", 3, "A+")
                , new Course("자료구조", 3, "A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(courses);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
```

<img src="/img/test_pass.png" width="">

- [GradeCalculateTest URL](https://github.com/Qussong/project_oop-practice-GradeCalculator_Java/blob/main/oop_practice_GPA-caculate/src/test/java/org/example/GradeCalculateTest.java)

### 🔻일급 컬렉션 방식 클래스 구현 (Courses.java)

```java
public class Courses {
    private final List<Course> courses; // 일급 컬렉션

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
```
- [Courses URL](https://github.com/Qussong/project_oop-practice-GradeCalculator_Java/blob/main/oop_practice_GPA-caculate/src/main/java/org/example/Courses.java)

