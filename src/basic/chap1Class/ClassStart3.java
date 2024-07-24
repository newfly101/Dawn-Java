package basic.chap1Class;

public class ClassStart3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.age = 18;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "Jannie Call";
        s2.age = 19;
        s2.grade = 90;

        Student[] student = new Student[]{s1, s2};

        for (Student s : student) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
