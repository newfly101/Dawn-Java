package mid1.questResolve.immutable;


public class MyDate {
    //MyDate 클래스는 불변이 아니어서 공유 참조시 사이드 이펙트가 발생한다. 이를 불변 클래스로 만들어라.
    private final int year;
    private final int month;
    private final int day;
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate setYear(int year) {
        return new MyDate(year, month, day);
    }
    public MyDate setMonth(int month) {
        return new MyDate(year, month, day);
    }
    public MyDate setDay(int day) {
        return new MyDate(year, month, day);
    }
    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
