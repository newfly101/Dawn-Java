package basic.chap2Ref;

public class Method2 {
    public static void main(String[] args) {
        Student s1 = initStudent("학생1", 15, 90);
        Student s2 = initStudent("학생2", 16, 80);

        printStudent(s1);
        printStudent(s2);
    }
    static Student initStudent(String name, Integer age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
    static void printStudent(Student s) {
        System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
    }
}
