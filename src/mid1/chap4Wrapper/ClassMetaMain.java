package mid1.chap4Wrapper;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        // Class 조회
        Class clazz = String.class;
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field.getType() = " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("method = " + method);
        }
        System.out.println("Superclass = " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface = " + i.getName());
        }
    }
}
