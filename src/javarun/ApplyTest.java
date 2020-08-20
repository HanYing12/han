package javarun;


import MySqlData.MySqlDemo;
import entity.P3Class;
import entity.P4Class;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ApplyTest extends Thread implements Runnable {
    public EslTest eslTest = EslTest.Instance;
    public String ip;
    //标签地址
    public Integer addr = null;
    //返回编码
    public static String isaddr = null;
    public static Integer isnum = null;
    public Integer No;
    public List<P4Class> list;
    public static DengClass d;
    static Integer deng2;
    Integer deng;
    public Integer status;
    public String key;
    public Integer value;
    public Integer dengValue;

    public static Map<String, Integer> map = new HashMap<String, Integer>();

    ApplyTest(List<P4Class> list, Integer status) {
        this.status = status;
        this.list = list;
    }

    int iscon = 0;
    Integer i = 0;
    String str = null;

    //���쵥
    public void actionPerformed() throws UnsupportedEncodingException, InterruptedException {
        byte[] msgBytes = null;
        ApplyRun.over=false;
        if (list != null) {
            for (P4Class l : list) {
                synchronized (this) {
                    i++;
                    HwkcTest.a.add(l.getAddr());
                }
                addr = l.getAddr();
                sleep(100);
                int dong = l.getLamp();
                // 114��ɫ 116��ɫ 118�� 120��
                // 1�� 2�� 3����  4�� 5���  6����  7�����
                if (dong == 116) {
                    deng = 1;
                } else if (dong == 114) {
                    deng = 2;
                } else if (dong == 118) {
                    deng = 4;
                }

                if (addr != null) {
                    if (addr <= 96) {
                        ip = "10.35.63.38 ";
                        if (addr < 36) {
                            No = 1;
                            //���ƺ�
                        } else {
                            No = 1003;
                            //���ƺ�
                        }

                    } else if (addr > 96 && addr <= 144) {
                        ip = "10.35.63.40";

                        if (addr < 118) {
                            No = 1002;
                            //���ƺ�
                        } else {
                            No = 1003;
                        }
                    } else if (addr > 144 && addr <= 237) {
                        ip = "10.35.63.44";
                        if (addr < 180) {
                            No = 1003;
                        } else {
                            No = 1003;
                            //���ƺ�
                        }
                    } else if (addr > 237 && addr <= 304) {
                        ip = "10.35.63.39";
                        if (addr < 216) {
                            No = 1002;
                        } else {
                            No = 1003;
                        }
                    } else if (addr > 304 && addr <= 360) {
                        ip = "10.35.63.43";
                        if (addr < 324) {
                            No = 1002;
                        } else {
                            No = 1003;
                        }
                    } else if (addr > 360 && addr <= 432) {
                        ip = "10.35.63.37";
                        if (addr < 396) {
                            No = 1002;
                        } else {
                            No = 1003;
                        }
                    }else if(addr>432 && addr<=532){
                        ip = "10.35.63.41";
                        if (addr < 396) {
                            No = 1002;
                        } else {
                            No = 1003;
                        }
                    }else if(addr>532 && addr<=632){
                        ip = "10.35.63.42";
                        if (addr < 580) {
                            No = 1002;
                        } else {
                            No = 1003;
                        }
                    }
                }
                iscon = eslTest.PickupSys_StartUp(null, 1, ip, 6780);

                if (iscon == 0) {
                    synchronized (this) {
                        if (d.getDeng() == null || d.getDeng() > 7 || d.getDeng() < 0) {
                            d.setDeng(0);
                        }
                        deng2 = this.deng + d.getDeng();
                        d.setDeng(deng2);
                        dengValue = d.getDeng();
                        System.err.println("--------------------------------------------------------" + dengValue);
                        map.put(ip + No, dengValue);
                        for (Entry<String, Integer> entry : map.entrySet()) {
                            key = entry.getKey();
                            value = entry.getValue();
                            if (key.equals(ip + No)) {
                                System.out.println("Value的值为：====" + value);
                                eslTest.PickupSysnew_T(1, No, value);
                            }
                        }
                    }


                    EslTest.P4_infor[] msgStruts = (EslTest.P4_infor[])
                            new EslTest.P4_infor().toArray(1);
                    msgStruts[0].addr = l.getAddr();
                    msgStruts[0].modemNo = this.status.byteValue();
                    //����ǰ 112��ɫ 114��ɫ 116��ɫ 118�� 120��
                    msgStruts[0].displaySet = l.getLamp().byteValue();
                    System.err.println("l.getLamp" + l.getLamp());
                    //������ 136��ɫ 138��ɫ��˸ 140��ɫ��˸ 142��ɫ��˸
                    msgStruts[0].displaySetPress = (byte) 136;
                    //���ݿ�ƴ������
                    //  String str = "һ����ʹ�����ܲ�ܵ�˿,100g*6Ƭ/�У�����,00A-00B-00E-A,320111,55,555,��,";
                    msgStruts[0].msg = l.getStr().getBytes("GB2312");
                    msgBytes = l.getStr().getBytes("GB2312");
                    System.err.println("l.getStr" + l.getStr());
                    msgStruts[0].msg = Arrays.copyOf(msgBytes, 100);
                    msgStruts[0].len = msgStruts[0].msg.length;
                    eslTest.PickupSysnew_P4(1, msgStruts, (byte) 1);

                    boolean b = true;
                     int count=0;
                    //按键匹配操作
                    synchronized (this) {
                        while (b) {
                            Thread.sleep(10);
                            count++;
                            if (isaddr != null) {
                                str = isaddr;
                                String newStr = isaddr.replaceAll("^(0+)", "");
                                if (newStr.equals(addr.toString())) {
                                    isaddr = null;
                                    b = false;
                                }
                            }
                            //未操作时间
                            if(count==5000){
                                count=0;
                                b = false;
                            }

                        }
                    }
                    //灯的判断
                    synchronized (this) {
                        if (No.equals(this.No)) {
                            d.setDeng(d.getDeng() - deng);
                            //int dengVal = value - deng;
                            System.out.println("相减操作后的dengVal值：=====" + d.getDeng());
                            Thread.sleep(100);
                            for(String str:map.keySet()){

                                if(str.equals(ip + No)){
                                    map.remove(str);
                                    map.put(str,d.getDeng());
                                    System.out.println("++++++++++++++++key" + str+"+++++++++val"+d.getDeng());
                                    eslTest.PickupSysnew_T(1, No, d.getDeng());
                                }
                            }
                        }
                    }
                    sleep(100);
                    synchronized (this) {
                        for (int i = 0; i < HwkcTest.a.size(); i++) {
                            if (addr == HwkcTest.a.get(i)) {
                                HwkcTest.a.remove(i);
                                i--;
                            }
                        }
                    }
                    //判定数据库增加减少盘点
                    String str = l.getStr().substring(0, l.getStr().indexOf(","));
                    int index = l.getStr().indexOf(",");
                    index = l.getStr().indexOf(",", index);
                    String result = l.getStr().substring(index + 1);
                    StringBuffer stringBuffer = new StringBuffer(l.getAddr().toString());
                    for (int i = 0; i < stringBuffer.length(); i++) {
                        if (stringBuffer.length() == 1) {
                            stringBuffer = new StringBuffer("0-0-0-" + stringBuffer.toString());
                        }
                        if (stringBuffer.length() == 2) {
                            stringBuffer.insert(1, "-");
                            stringBuffer = new StringBuffer("0-0-" + stringBuffer.toString());
                        }
                        if (stringBuffer.length() == 3) {
                            stringBuffer.insert(1, "-");
                            stringBuffer.insert(3, "-");
                            stringBuffer = new StringBuffer("0-" + stringBuffer.toString());
                        }
                        if (stringBuffer.length() == 4) {
                            stringBuffer.insert(1, "-");
                            stringBuffer.insert(3, "-");
                            stringBuffer.insert(5, "-");
                            stringBuffer = new StringBuffer(stringBuffer.toString());
                        }
                    }

                    MySqlDemo.setOneDate(stringBuffer.toString(), str, result.substring(0, result.indexOf(",")), isnum, this.status);

                    List<P3Class> list = MySqlDemo.getOneHwkcbyadd(stringBuffer.toString());
                    if(list!=null) {
                        HwkcGp.groupMap.get(addr).clear();
                        for (P3Class p3 : list) {
                            HwkcGp.groupMap.get(addr).add(p3);

                        }
                    }

                } else {
                    boolean istrue = true;
                    while (istrue) {
                        Thread.sleep(5000);
                        iscon = eslTest.PickupSys_StartUp(null, 1, ip, 6780);
                        if (iscon == 0) {
                            istrue = false;
                        }
                    }
                }
                eslTest.PickupSys_ShutDown(1);
            }
            ApplyRun.over=true;

        }
    }
    //     63 30 30 37 32 3F 01 01
    //   64 30 30 37 32 31 32 1F 1F 01

    public synchronized void run() {
        try {
            actionPerformed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





