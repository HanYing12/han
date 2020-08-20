package thread;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
  /*  public static void main(String[] args) throws InterruptedException {
        int isCon;
        byte[] msgBytes=null;
        int i=0;
        while (true) {
            i++;
            Thread.sleep(100);
            isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "192.168.1.136", 6780);
            EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                    new EslTest.P3_infor().toArray(1);

            msgStruts[0].addr = 1;
            msgStruts[0].modemNo = 1;
            //操作前 112无色 114绿色 116红色 118黄 120粉
            msgStruts[0].displaySet = (byte) 112;
            //操作后 136无色 138绿色闪烁 140红色闪烁 142黄色闪烁
            //  msgStruts[0].displaySetPress = (byte) 136;
            //数据库拼接数据
            //String str="测试,一次性使用,10*30,20171201,18,片,";
             String str = "甲苯咪唑片,100g*6片/盒，铝盒,00A-00B-00E-A,320111,55," + i + ",箱,";

            try {
                msgStruts[0].msg = str.getBytes("GB2312");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            try {
                msgBytes = str.getBytes("GB2312");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

            tset2 t2=new tset2();

            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
            msgStruts[0].len = msgStruts[0].msg.length;

            Thread.sleep(300);
            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
            EslTest.Instance.PickupSys_ShutDown(1);
            isCon = 1;
        }
    }*/

    public static void main(String[] args) throws ClassNotFoundException {

        Test testRun=new Test();
        testRun.gong();
    }
    public int gong() throws ClassNotFoundException {
         Class<?> aClass = Class.forName("thread.TestRfid");

        Class<?>[] declaredClasses = aClass.getDeclaredClasses();

        for (Class<?> declaredClass : declaredClasses) {

            Constructor<?>[] declaredConstructors = declaredClass.getDeclaredConstructors();

            for (Constructor<?> constructor : declaredConstructors) {

                String name = constructor.getName();

                String www = name.substring(name.indexOf("$") + 1);

                try {

                     Class<?> c2 = Class.forName("thread.TestRfid$" + www);

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