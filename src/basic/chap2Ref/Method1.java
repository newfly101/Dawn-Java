package basic.chap2Ref;

public class Method1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        initStudent(s1, "학생1", 15, 90);

        Student s2 = new Student();
        initStudent(s2, "학생2", 16, 80);

        printStudent(s1);
        printStudent(s2);
    }
    static void initStudent(Student student, String name, Integer age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }
    static void printStudent(Student s) {
        System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
    }
}
