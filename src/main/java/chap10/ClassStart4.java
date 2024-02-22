package chap10;

public class ClassStart4 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "학생 1";
        st1.age = 15;
        st1.grade = 90;

        Student st2 = new Student();
        st2.name = "학생 2";
        st2.age = 16;
        st2.grade = 80;

        Student[] sts = new Student[2];
        System.out.println("이름 : " + sts[0].name
        + " 나이 : " + sts[0].age + " 학점 : " + sts[0].grade);

        System.out.println("이름 : " + sts[1].name
                + " 나이 : " + sts[1].age + " 학점 : " + sts[1].grade);

    }
}
