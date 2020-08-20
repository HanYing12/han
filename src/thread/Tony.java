package thread;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Tony {
    public static void main(String[] args) throws ClassNotFoundException {

       Tony tony=new Tony();
       tony.gong();
    }
    public int gong() throws ClassNotFoundException {

        Class<?> aClass = Class.forName("thread.Rfid");

        Class<?>[] declaredClasses = aClass.getDeclaredClasses();

        for (Class<?> declaredClass : declaredClasses) {

            Constructor<?>[] declaredConstructors = declaredClass.getDeclaredConstructors();

            for (Constructor<?> constructor : declaredConstructors) {

                String name = constructor.getName();

                String www = name.substring(name.indexOf("$") + 1);

                try {

                    Class<?> c2=Class.forName("thread.Rfid$"+www);

                    Class<?> superclass = c2.getSuperclass();


                    Method run1 = superclass.getDeclaredMethod("start");

                    run1.invoke(c2.getDeclaredConstructors()[0].newInstance());

                } catch (Exception e) {

                    e.printStackTrace();
                }
            }
        }
        return 0;
    }
}
