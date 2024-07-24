package basic.chap1Class;

public class ClassStart2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John Doe";
        s1.age = 18;
        s1.grade = 90;

        Student s2 = new Student();
        s2.name = "Jannie Call";
        s2.age = 19;
        s2.grade = 90;

        System.out.print("이름: " + s1.name);
        System.out.print(" 나이: " + s1.age);
        System.out.print(" 성적: " + s1.grade);
        System.out.println();

        System.out.print("이름: " + s2.name);
        System.out.print(" 나이: " + s2.age);
        System.out.print(" 성적: " + s2.grade);
        System.out.println();
    }
}
