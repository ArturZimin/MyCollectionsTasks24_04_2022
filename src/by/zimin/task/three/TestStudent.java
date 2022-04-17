package by.zimin.task.three;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

    /**
     * /**
     * * 2 Добавить студентов в коллекцию. Создать класс Student, содержащий следующие
     * * характеристики – имя, группа, курс, оценки по предметам. Создать коллекцию,
     * * содержащую объекты класса Student.
     * * 1.	Написать метод, который удаляет студентов со средним баллом <3.
     * * 2.	Если средний балл>=3, студент переводится на следующий курс.
     * * 3.	Напишите метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
     * * 4.	Напечатат на консоль имена тех студентов из списка, которые обучаются на данном курсе.
     */
    public static List<Student> listStudents = new ArrayList<>(10);

    public static void main(String[] args) {

        Student student1 = new Student("Andrey Ivanov", "2021j", 3);
        student1.addSubjectAndGrade("Java", 10);
        student1.addSubjectAndGrade("JavaScript", 8);
        student1.addSubjectAndGrade("HTML", 7);
        listStudents.add(student1);

        Student student2 = new Student("Kostia Sidorov", "2020j", 4);
        student2.addSubjectAndGrade("Java", 2);
        student2.addSubjectAndGrade("JavaScript", 3);
        student2.addSubjectAndGrade("HTML", 2);

        listStudents.add(student2);
        Student student3 = new Student("Tatiana Climetc", "2022j", 3);
        student3.addSubjectAndGrade("Java", 5);
        student3.addSubjectAndGrade("JavaScript", 6);
        student3.addSubjectAndGrade("HTML", 4);
        listStudents.add(student3);


        deleteStudentsWithAverageBallLessThree(listStudents);
        System.out.println("-----------------------------------------");
        printCollection();

        printStudentsAndCourse(listStudents);
        findStudentsByCourse(listStudents, 3);

    }

    private static void printCollection() {
        listStudents.stream()
                .forEach(x -> System.out.println(x));
    }

    private static void findStudentsByCourse(List<Student> listStudents, int course) {
        listStudents.stream()
                .filter(x -> x.getCourse() == course)
                .forEach(x -> System.out.println(x.getName()));
    }


    private static void printStudentsAndCourse(List<Student> listStudents) {
        listStudents.stream()
                .forEach(x -> System.out.println(x.getName() + " : " + x.getCourse()));
    }

    private static void deleteStudentsWithAverageBallLessThree(List<Student> listStudents) {

        for (Student s : listStudents) {
            if (s.getAverageGrade() < 3) {
                System.out.println("Student " + s + " average bal = " + s.getAverageGrade() + " does not move to the next course.");
                listStudents.remove(s);
            } else {
                System.out.println("Student " + s + " average bal = " + s.getAverageGrade() + "  move to the next course.");

            }
        }
    }


}
