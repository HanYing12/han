package javarun;

import MySqlData.MySqlDemo;
import entity.P3Class;
import sun.rmi.server.Dispatcher;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestScrolling {

    /*  //测试滚屏
        public void test() throws InterruptedException, UnsupportedEncodingException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {
                //连接192.168.1.136服务器
                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.38", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                List<String> list = new ArrayList<>();
                list.add("一次性使用医用橡胶检查手套,7号（小号）,50双/盒,2022-06-03,141404HC0028,1150,双,");
                list.add("葡泰2%葡萄糖酸氯已定醇皮肤消毒液60ml,60ml,100瓶/件,2022-06-03,141805HC0001,175,瓶,");
                list.add("一次性使用气管插管导丝,6Fr,10个/盒,2022-06-03,021203HC0030,20,个,");
                list.add("一次性使用气管切开套管,14mm,5套/盒,2022-06-03,080603HC0302,10,套,");
                list.add("一次性使用气管插管导丝,12Fr,10个/盒,2022-06-03,021203HC0028,26,个,");
                list.add("一次性无菌旋塞,三通旋塞,50个/盒,2022-06-03,140209HC0031,450,个,");
                //list.add("输液用三通,输液用三通，白色手柄,500个/箱,2022-06-03,140209HC0012,500,个,");
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    Thread.sleep(5000);
                    //先循环 P3指令
                    for (int i = 1; i <= 96; i++) {
                        msgStruts[0].addr = i;
                        if (i == 1) {
                            msgStruts[0].modemNo = 1;
                            //操作前 112无色 114绿色 116红色 118黄 120粉
                            msgStruts[0].displaySet = (byte) 112;
                            System.out.println(next);
                            msgStruts[0].msg = next.getBytes("GB2312");
                            msgBytes = next.getBytes("GB2312");
                            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                            msgStruts[0].len = msgStruts[0].msg.length;
                            Thread.sleep(300);
                            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                        } else if (i == 2) {
                            msgStruts[0].modemNo = 1;
                            //操作前 112无色 114绿色 116红色 118黄 120粉
                            msgStruts[0].displaySet = (byte) 112;
                            System.out.println(next);
                            msgStruts[0].msg = next.getBytes("GB2312");
                            msgBytes = next.getBytes("GB2312");
                            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                            msgStruts[0].len = msgStruts[0].msg.length;
                            Thread.sleep(300);
                            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                        } else if (i == 3) {
                            msgStruts[0].modemNo = 1;
                            //操作前 112无色 114绿色 116红色 118黄 120粉
                            msgStruts[0].displaySet = (byte) 112;
                            System.out.println(next);
                            msgStruts[0].msg = next.getBytes("GB2312");
                            msgBytes = next.getBytes("GB2312");
                            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                            msgStruts[0].len = msgStruts[0].msg.length;
                            Thread.sleep(300);
                            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                        } else if (i == 4) {
                            msgStruts[0].modemNo = 1;
                            //操作前 112无色 114绿色 116红色 118黄 120粉
                            msgStruts[0].displaySet = (byte) 112;
                            System.out.println(next);
                            msgStruts[0].msg = next.getBytes("GB2312");
                            msgBytes = next.getBytes("GB2312");
                            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                            msgStruts[0].len = msgStruts[0].msg.length;
                            Thread.sleep(300);
                            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                        }else if (i == 5) {
                            msgStruts[0].modemNo = 1;
                            //操作前 112无色 114绿色 116红色 118黄 120粉
                            msgStruts[0].displaySet = (byte) 112;
                            System.out.println(next);
                            msgStruts[0].msg = next.getBytes("GB2312");
                            msgBytes = next.getBytes("GB2312");
                            msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                            msgStruts[0].len = msgStruts[0].msg.length;
                            Thread.sleep(300);
                            EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                        }else if(i==6){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==7){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==8){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==9){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==10){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==11){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==12){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==13){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==14){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==15){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==16){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==17){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==18){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==19){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==20){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==21){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==22){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==23){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==24){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==25){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==26){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==27){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==28){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==29){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==30){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if (i==31){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==32){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==33){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==34){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==35){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==36){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==37){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==38){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==39){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==40){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==41){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==42){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==43){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==44){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==45){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==46){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==47){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==48){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==49){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==50){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==51){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }else if(i==52){
                            msgStruts[0].modemNo=1;
                            msgStruts[0].displaySet=(byte)112;
                            System.out.println(next);
                            msgStruts[0].msg=next.getBytes("GB2312");
                            msgBytes=next.getBytes("GB2312");
                            msgStruts[0].msg=Arrays.copyOf(msgBytes,200);
                            msgStruts[0].len=msgStruts[0].msg.length;
                            EslTest.Instance.PickupSysnew_P3(1,msgStruts,(byte)1);
                        }
                    }
                }
                EslTest.Instance.PickupSys_ShutDown(1);
                isCon = 1;
            }

        }
        public static void main(String[] args) throws UnsupportedEncodingException, InterruptedException {
            TestScrolling ts = new TestScrolling();
            ts.test();
        }*/
    public void test(){

        byte[] msgBytes=null;
        EslTest.Instance.PickupSys_StartUp(null,1,"192.168.1.136",6780);

        EslTest.Instance.PickupSysnew_G(6780,1001,"O");

        EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                new EslTest.P3_infor().toArray(1);

      /*  msgStruts[0].addr = 1;
        msgStruts[0].modemNo = 1;*/

      /*
      * if("扫描枪一维码"=="数据库一维码"){
      * 在数据库找到耗材信息
      * 塔灯亮起
      * 指示灯亮起
      * msgS
      * truts[0].displaySet = (byte) 114;
      * msgStruts[0].displaySetPress = (byte) 136;
      * 结束
      * }
      * */
        //操作前 112无色 114绿色 116红色 118黄 120粉
        msgStruts[0].displaySet = (byte) 114;
        //操作后 136无色 138绿色闪烁 140红色闪烁 142黄色闪烁
        //  msgStruts[0].displaySetPress = (byte) 136;
        //数据库拼接数据
        String str = "甲苯咪唑片,100g*6片/盒，铝盒,00A-00B-00E-A,320111,55, 786,箱,";

        try {
            msgBytes = str.getBytes("GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
        msgStruts[0].len = msgStruts[0].msg.length;

        // Thread.sleep(300);
        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
        EslTest.Instance.PickupSys_ShutDown(1);
       /*// P4指令
        EslTest.P4_infor[] msgStruts=(EslTest.P4_infor[]) new EslTest.P4_infor().toArray(1);
        msgStruts[0].addr = 1;
        msgStruts[0].modemNo = 1;
        //操作前 112无色 114绿色 116红色 118黄 120粉
        //msgStruts[0].displaySet = (byte) 112;
        msgStruts[0].displaySet = (byte) 116;
        //操作后 136无色 138绿色闪烁 140红色闪烁 142黄色闪烁
          msgStruts[0].displaySetPress = (byte) 140;
        //数据库拼接数据
        //String str = "测试,一次性使用,10*30,20171201,18,片,";
        String str="测试,一次性,10*30,20171201,17,片,1,";
        //String str="甲苯咪唑片,100g*6片/盒，铝盒,00A-00B-00E-A,320111,55," + 12 + ",箱,";
        try {
            msgBytes = str.getBytes("GB2312");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
        msgStruts[0].len = msgStruts[0].msg.length;

            EslTest.Instance.PickupSysnew_P4(1, msgStruts, (byte) 1);
            EslTest.Instance.PickupSys_ShutDown(1);
*/
    }
}