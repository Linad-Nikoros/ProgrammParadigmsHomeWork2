package org.example;

import java.util.ArrayList;
import java.util.List;

public class AdditionalTask1ProceduralParadigm {
    public static List<Student> CreatListStudent() {
        List<Student> StudentList = new ArrayList<Student>();
        Student student1 = new Student("Tor", 57);
        Student student2 = new Student("Ivan", 92);
        Student student3 = new Student("Denis", 74);
        Student student4 = new Student("Petr", 84);
        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        StudentList.add(student4);
        return StudentList;
    }

    public static int findAverageScore(List<Student> studentList) {
        int sumScore = 0;
        for (Student student : studentList) {
            int score = student.getScore();
            sumScore += score;
        }
        int averageScore = sumScore / studentList.toArray().length;
        System.out.println("Средняя оценка по студентам = " + averageScore);
        return averageScore;
    }

    public static void findScoreAboveAverage(List<Student> studentList, int averageScore) {
        for (Student student : studentList) {
            if (averageScore > student.getScore()) {
                System.out.println(" балл выше среднего: " + student.getName());
            }
        }

    }
}
