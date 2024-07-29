package mid1.quest.immutable;

public class ImmutableEx1Question {
    //MyDate 클래스는 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다. 이를 불변 클래스로 만들어라.
    //새로운 불변 클래스는 ImmutableMyDate 로 이름 지으면 된다.
    //새로운 실행 클래스는 ImmutableMyDateMain 으로 이름 지으면 된다.
    //```java
    //package lang.immutable.test;
    //public class MyDate {
    // private int year;
    // private int month;
    // private int day;
    // public MyDate(int year, int month, int day) {
    // this.year = year;
    // this.month = month;
    // this.day = day;
    // }
    // public void setYear(int year) {
    // this.year = year;
    // }
    // public void setMonth(int month) {
    // this.month = month;
    // }
    // public void setDay(int day) {
    // this.day = day;
    // }
    // @Override
    // public String toString() {
    // return year + "-" + month + "-" + day;
    // }
    //}
    //```
    //```java
    //package lang.immutable.test;
    //public class MyDateMain {
    // public static void main(String[] args) {
    // MyDate date1 = new MyDate(2024,1,1);
    // MyDate date2 = date1;
    // System.out.println("date1 = " + date1);
    // System.out.println("date2 = " + date2);
    // System.out.println("2025 -> date1");
    // date1.setYear(2025);
    // System.out.println("date1 = " + date1);
    // System.out.println("date2 = " + date2);
    // }
    //}
    //```
    //실행 결과 ```
    //date1 = 2024-1-1
    //date2 = 2024-1-1
    //2025 -> date1
    //date1 = 2025-1-1
    //date2 = 2025-1-1
}
