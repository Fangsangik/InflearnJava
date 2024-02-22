package chap10;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "학생 1";
        student.age = 15;
        student.grade = 90;

        Student student2 = new Student();
        student2.name = "힉셍2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student);
        System.out.println(student2);

        System.out.println("===================");

        System.out.println("이름 : " + student2.name  + " 나이 : " + student2.age
                + " 성적 : " + student2.grade);

        System.out.println("이름 : " + student.name  + " 나이 : " + student.age
                + " 성적 : " + student.grade);



    }
}
