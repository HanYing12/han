package javarun;

import entity.P3Class;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

public class tset2 {

    public   void gp2() throws InterruptedException {
        TimerTask task = new TimerTask() {
            HwkcIP data=new HwkcIP();
            Map<String, List<P3Class>> map=data.iprun();
            HwkcLj hwkcLj=new HwkcLj();
            Map<Integer, List<P3Class>> groupMap = null;
            @Override
            public void run() {
                // task to run goes here
                // 执行的输出的内容
                int tiem=0;
                while (true) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    for (String i : map.keySet()) {
                        // hwkcGp.hwkcGp(i,map.get(i).get(1));
                        groupMap = map.get(i).stream().collect(Collectors.groupingBy(P3Class::getAddr));
                        try {
                            hwkcLj.hwkcGp(i, groupMap);
                            groupMap.clear();
                            System.gc();
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                    }

                    tiem++;
                    if(tiem==1000){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        groupMap.clear();
                        System.gc();
                        break;
                    }
                }
            }
        };
        Timer timer = new Timer();
        // 定义开始等待时间  --- 等待 5 秒
        // 1000ms = 1s
        long delay = 5000;
        // 定义每次执行的间隔时间
        long intevalPeriod = 5 * 1000;
        // schedules the task to be run in an interval
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
    }
}
