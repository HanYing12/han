package javarun;

import entity.P3Class;


import java.io.UnsupportedEncodingException;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

public class HwkcTest implements Runnable {


    public EslTest eslTest = EslTest.Instance;
    P3Class p3;
    long time;
    String ip;
  public   static List<Integer> a=new ArrayList<Integer>();
    HwkcTest(P3Class p3, long time,String ip) {
        this.p3 = p3;
        this.time = time;
        this.ip = ip;
    }
    ReentrantLock lock=new ReentrantLock();
  
    //货位单
    public void allPerformed() throws UnsupportedEncodingException, InterruptedException {
        byte[] msgBytes;
        boolean b = true;
        lock.lock();
        synchronized (this) {
            for (Integer num : a) {
                if (p3.getAddr() == num) {
                    b = false;
                }

            }

        }
      //  Thread.sleep(200);
        if (b) {
            synchronized (this) {
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);

                msgStruts[0].addr = p3.getAddr();
                msgStruts[0].modemNo = 3;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                //操作后 136无色 138绿色闪烁 140红色闪烁 142黄色闪烁
                //  msgStruts[0].displaySetPress = (byte) 136;
                //数据库拼接数据
                //  String str = "一次性使用气管插管导丝,100g*6片/盒，铝盒,00A-00B-00E-A,320111,55,555,箱,";
                msgStruts[0].msg = p3.getStr().getBytes("GB2312");


                msgBytes = p3.getStr().getBytes("GB2312");
                msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                msgStruts[0].len = msgStruts[0].msg.length;
                eslTest.SetMsgGap(1, 200);
                // Thread.sleep(300);
                eslTest.PickupSysnew_P3(1, msgStruts, (byte) 1);

                lock.unlock();


            }

        }

    }



    @Override
    public synchronized void run() {
        try {
            allPerformed();
            eslTest.PickupSys_ShutDown(1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }


}
