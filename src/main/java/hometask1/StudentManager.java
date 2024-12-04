package hometask1;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    //это конструктор, называется по названию класса
    public StudentManager (ArrayList<Student> students) {
        this.students = students;
    }

    //создаем пустую структуру данных
    public StudentManager () {
        this.students = new ArrayList<>();
    }
    public ArrayList<Student> getStudents() {
        return this.students;
    }

    //добавляем нового студента в нашу структуру данных students
    public void addStudent (Student newStudent) {
        this.students.add (newStudent);
    }


    //удаляем студента
    public void removeStudent (Student oldStudent) {
        this.students.remove (oldStudent);
    }

    //удаляем студента по id
    public void removeStudent (String id) {
        //Вариант 1:
        //1) найти студента по id
        //2) удалить студента

        Student targetStudent = null;

        for (Student student : students) {
            if (student.getId().equals(id)) {
                targetStudent = student;
            }
        }
        if (targetStudent!= null) {
            students.remove (targetStudent);

        } else {
            System.out.println("Student with id " + id + "not found");
        }

    }
}
