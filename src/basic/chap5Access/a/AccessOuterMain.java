package basic.chap5Access.a;

import basic.chap5Access.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData ad = new AccessData();
        // public 호출 가능
        ad.publicField = 1;
        ad.publicMethod();

        // default 호출 불가
//        ad.defaultField = 2;
//        ad.defaultMethod();

        // private 호출 불가
//        ad.privateField = 3;
//        ad.privateMethod();

        ad.innerAccess();
    }
}
