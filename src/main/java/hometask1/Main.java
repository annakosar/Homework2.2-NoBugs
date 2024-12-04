package hometask1;

public class Main {
    public static void main(String[] args) {
        //это примеры вызовов 3 разных конструкторов
        Student student1 = new Student ();
        Student student2 = new Student ("John", "0123");
        Student student3 = new Student ("Hanna");

        //мы можем не писать toString, программа и так понимает, что нужно делать
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3);

        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);

        studentManager.removeStudent("id_Hanna");
        System.out.println(studentManager.getStudents());


    }
}