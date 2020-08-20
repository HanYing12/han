package javarun;


import entity.P3Class;

import java.io.UnsupportedEncodingException;
import java.time.Month;
import java.util.List;
import java.util.Map;


public class HwkcGp implements Runnable {
    public List<P3Class> list;
    String ip;
    static Map<Integer, List<P3Class>> groupMap;
    public static boolean flag = true;
    Map<Integer, List<P3Class>> rsm;
    HwkcGp(String ip, Map<Integer, List<P3Class>> groupMap) {
        this.ip = ip;
        this.groupMap = groupMap;
    }

    //滚屏方法
    public  synchronized void gp() throws InterruptedException, UnsupportedEncodingException {
        rsm=this.groupMap;
        int c = 0;
        for (int i = 0; i < 10000; i++) {
            //连接控制器
            if(ApplyRun.over) {
                int isCon = EslTest.Instance.PickupSys_StartUp(null, 1, ip, 6780);
                if (isCon == 0) {
                    Integer a = null;
                    for (Integer add2 : rsm.keySet()) {
              //          System.err.println(rsm.get(add2).get(1));
                        if (rsm.get(add2).size() > i) {
                            try {
                                a = rsm.get(add2).get(i).getAddr();
                            } finally {
                                //发送屏幕显示信息
                                Thread.sleep(1000);
                                HwkcTest hwkcTest = new HwkcTest(rsm.get(add2).get(i), 200, ip);
                                hwkcTest.allPerformed();
                            }

                        }

                        c = c + 1;
                        if (c == 90) {
//                        System.err.println("暂停5");
//                        Thread.sleep(1000);
                            c = 0;
                        }
                        // EslTest.Instance.PickupSys_ShutDown(1);
                    }
                    System.err.println(a);
                    if (a == null) {
                        i = -1;
                    }

                } else {
                    Thread.sleep(3000);
                    isCon = EslTest.Instance.PickupSys_StartUp(null, 1, ip, 6780);
                }

                //防止p4指令冲突 暂时关闭
                if (flag == false) {
                    i = 100001;
                }
            }
        }
    }


    @Override
    public synchronized void run() {
        try {
            gp();
        } catch (InterruptedException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}


