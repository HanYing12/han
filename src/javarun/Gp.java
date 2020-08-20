package javarun;

import entity.P3Class;
import entity.P4Class;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Gp {
    P3Class p3;
    byte[] msgBytes;
    int count=0;


    public void gptest(Map<Integer, List<P3Class>> rsm, String ip, int i) throws UnsupportedEncodingException, InterruptedException {
        EslTest eslTest=EslTest.Instance;
        System.err.println(ip);
                for (Integer add2 : rsm.keySet()) {
                    //判定是否为null
                    if (rsm.get(add2).size()> i) {

                        System.err.println(rsm.get(add2).get(i).getAddr());
                        Thread.sleep(100);
                        EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                                new EslTest.P3_infor().toArray(rsm.get(add2).size());

                        msgStruts[0].addr = rsm.get(add2).get(i).getAddr();
                        System.err.println(rsm.get(add2).get(i).getAddr());
                        msgStruts[0].modemNo = 3;
                        //操作前 112无色 114绿色 116红色 118黄 120粉
                        msgStruts[0].displaySet = (byte) 112;
                        msgStruts[0].msg = rsm.get(add2).get(i).getStr().getBytes("GB2312");
                        msgBytes = rsm.get(add2).get(i).getStr().getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        eslTest.PickupSysnew_P3(1, msgStruts, (byte) 1);

                    }
                }
            }
    // Thread.sleep(300);
}


