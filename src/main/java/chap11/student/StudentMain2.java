package chap11.student;

public class StudentMain2 {
    public static void main(String[] args) {
        Student student = createStudent("황상익", 30, 100);
        System.out.println(student);
        printStudent(student);
    }

    public static void printStudent(Student student) {
        System.out.println("이름 : " + student.name + " 나이 : " + student.age
                + " 성적 : " + student.grade);
    }

    public static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println(student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}

