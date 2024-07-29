package mid1.questResolve.immutable;

public class ImmutableEx1Resolve {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2024,1,1);
        MyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("2025 -> date1");
        date1 = date1.setYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        //실행 결과 ```
        //date1 = 2024-1-1
        //date2 = 2024-1-1
        //2025 -> date1
        //date1 = 2025-1-1
        //date2 = 2025-1-1
    }
}
