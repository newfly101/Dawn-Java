package mid1.chap1Object.lang.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id-100");
        UserV1 user2 = new UserV1("id-100");
        UserV1 user3 = user2;

        System.out.println("identity = " + (user1 == user2));
        System.out.println("identity(user3 = user2) = " + (user2 == user3));
        System.out.println("equality = " + user1.equals(user2));
    }
}
