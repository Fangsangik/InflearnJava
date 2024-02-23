package chap11.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        initStudent(student, "황상익", 29, 100);
        printStudent(student);
    }

    public static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    public static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age
                + " 성적 : " + student.grade);
    }
}

