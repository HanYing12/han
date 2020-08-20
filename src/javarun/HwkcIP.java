package javarun;

import MySqlData.MySqlDemo;
import entity.P3Class;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HwkcIP {
    public static String ip;
    public Integer addr;
    MySqlDemo mySqlDemo = new MySqlDemo();
    List<P3Class> list = mySqlDemo.getP3Class();
    Map<String, List<P3Class>> map = new HashMap<>();

    public Map<String, List<P3Class>> iprun() {
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        List list4 = new ArrayList();
        List list5 = new ArrayList();
        List list6 = new ArrayList();
        List list7 = new ArrayList();
        List list8 = new ArrayList();
        for (P3Class l : list) {
            addr = l.getAddr();
            if (addr <= 96) {
                list1.add(l);
                map.put("10.35.63.38", list1);
            } else if (addr > 96 && addr <= 144) {
                list2.add(l);
                map.put("10.35.63.40", list2);
            } else if (addr > 144 && addr <= 237) {
                list3.add(l);
                map.put("10.35.63.44", list3);
            } else if (addr > 237 && addr <= 304) {
                list4.add(l);
                map.put("10.35.63.39", list4);
            } else if (addr > 304 && addr <= 384) {
                list5.add(l);
                map.put("10.35.63.43", list5);
            } else if (addr > 384 && addr <= 464) {
                list6.add(l);
                map.put("10.35.63.37", list6);
            } else if (addr > 464 && addr <= 532) {
                list7.add(l);
                map.put("10.35.63.41", list7);
            } else if (addr > 532 && addr <= 632) {
                list8.add(l);
                map.put("10.35.63.42", list8);
            }

        }
        return map;
    }
}
