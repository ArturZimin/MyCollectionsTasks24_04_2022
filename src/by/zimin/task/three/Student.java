package by.zimin.task.three;

import java.util.*;

public class Student implements Comparable<Student> {

    private String name;
    private String group;
    private Map<String, Integer> subjectGrades;
    private int course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group) && Objects.equals(subjectGrades, student.subjectGrades);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, group, subjectGrades, course);
    }

    public Student(String name, String group,int course, Map<String, Integer> subjectGrades, int countPredmets) {
        this.name = name;
        this.group = group;
        this.course=course;
        subjectGrades = new HashMap<>(countPredmets);
        this.subjectGrades = subjectGrades;
    }

    public Student(String name, String group,int course) {
        this.name = name;
        this.group = group;
        this.course=course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }


    public Map<String, Integer> getSubjectGrades() {
        return subjectGrades;
    }

    public void addSubjectAndGrade(String subject, int grade) {
        subjectGrades = new HashMap<>();
        subjectGrades.put(subject, grade);
    }

    public double getAverageGrade() {
        Collection<Integer> value = subjectGrades.values();
        int result = value.stream()
                .reduce((x, c) -> x + c)
                .get();
        return result / value.size();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", subjectGrades=" + subjectGrades + '\'' + " course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result = 0;
        if (o.getClass() == getClass() && o != null) {
            Student b = this;
            result = o.getGroup().compareTo(b.getGroup());
        } else {
            throw new IllegalArgumentException("The argument is wrong!");
        }
        return result;
    }
}
