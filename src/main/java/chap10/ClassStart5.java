package chap10;

public class ClassStart5 {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "학생 1";
        st1.age = 15;
        st1.grade = 90;

        Student st2 = new Student();
        st2.name = "학생 2";
        st2.age = 16;
        st2.grade = 80;

        Student[] sts = new Student[]{st1, st2};
        for (int i = 0; i < sts.length; i++) {
            System.out.println("이름 : " + sts[i].name
            + " 나이 : " + sts[i].age + " 학점 : " + sts[i].grade);
        }

        for (int i = 0; i < sts.length; i++) {
            //배열의 요소를 하나 축약해서 생성
            Student s = sts[i];

            System.out.println("이름 : " + s.name
                    + " 나이 : " + s.age + " 학점 : " +
                    s.grade);
        }

        for (Student s:
             sts) {
            System.out.println("이름 : " + s.name
                    + " 나이 : " + s.age + " 학점 : " +
                    s.grade);
        }
    }
}
