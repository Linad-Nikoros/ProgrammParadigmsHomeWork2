package org.example;
import java.util.ArrayList;
import java.util.List;

public  class AdditionalTask1StructuralParadigm {
    public static void Student() {
        List<Student> StudentList = new ArrayList<Student>();
        Student student1 = new Student("Tor", 57);
        Student student2 = new Student("Ivan", 92);
        Student student3 = new Student("Denis", 74);
        Student student4 = new Student("Petr", 84);
        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        StudentList.add(student4);

        int sumScore = 0;
        for (Student student: StudentList) {
            int score = student.getScore();
            sumScore += score;
        }
        int averageScore = sumScore / StudentList.toArray().length;
        System.out.println("Средняя оценка по студентам = "+ averageScore);

        for (Student student: StudentList) {
            if (averageScore > student.getScore()) {
                System.out.println(" балл выше среднего: " + student.getName());
            }
        }
    }
}
