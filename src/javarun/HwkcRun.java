package javarun;


import entity.P3Class;

import java.io.UnsupportedEncodingException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class HwkcRun implements Runnable {

    //给每个控制器发送该有的信息
    public void fz() throws InterruptedException, UnsupportedEncodingException {
        Map<Integer, List<P3Class>> groupMap; //获取排序后的map
        Map<String, List<P3Class>> map = new HwkcIP().iprun();//获取数据
        //遍历发送信息
        for (String ip : map.keySet()) {
            System.err.println("ip" + ip);
                groupMap = map.get(ip).stream().collect(Collectors.groupingBy(P3Class::getAddr));
                new Thread(new HwkcGp(ip, groupMap)).run();
                Thread.sleep(1000);
        }
    }


    @Override
    public void run() {
        try {
            fz();
        } catch (InterruptedException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}



