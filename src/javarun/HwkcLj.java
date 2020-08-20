package javarun;

import entity.P3Class;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HwkcLj {

        public synchronized void hwkcGp(String ip , Map<Integer , List<P3Class>> rsm) throws UnsupportedEncodingException {

                System.err.println(ip);
                byte[] msgBytes;
                int i = EslTest.Instance.PickupSys_StartUp(null, 1, ip, 6780);
                System.err.println(i);
                for (Integer add2 : rsm.keySet()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.err.println("add" + add2);
                    EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                            new EslTest.P3_infor().toArray(rsm.get(add2).size());

                    msgStruts[0].addr = rsm.get(add2).get(0).getAddr();
                    msgStruts[0].modemNo = 3;
                    //操作前 112无色 114绿色 116红色 118黄 120粉
                    msgStruts[0].displaySet = (byte) 112;
                    // msgStruts[0].msg = rsm.get(add2).get(1).getStr().getBytes("GB2312");
                    msgBytes = rsm.get(add2).get(0).getStr().getBytes("GB2312");
                    msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                    msgStruts[0].len = msgStruts[0].msg.length;
                    EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                EslTest.Instance.PickupSys_ShutDown(1);
            }
        }


