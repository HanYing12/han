package thread;

import entity.P3Class;
import javarun.EslTest;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRfid {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/xian?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "root";
    static final String PASS = "123456";

    static class ThreadSql extends Thread {
        //40控制器
        static public void common(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.40", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //44控制器
        static public void common1(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.44", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //39控制器
        static public void common2(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.39", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //41控制器
        static public void common3(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.41", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //37控制器
        static public void common4(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.37", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //42控制器
        static public void common5(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.42", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
        //43控制器
        static public void common6(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.43", 6780);
                EslTest.P3_infor[] msgStruts = (EslTest.P3_infor[])
                        new EslTest.P3_infor().toArray(1);
                msgStruts[0].addr = id;
                msgStruts[0].modemNo = 1;
                //操作前 112无色 114绿色 116红色 118黄 120粉
                msgStruts[0].displaySet = (byte) 112;
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement();
                List<P3Class> list = new ArrayList<>();
                ResultSet rs = stmt.executeQuery(sql);
                try {
                    Class.forName(JDBC_DRIVER);
                    while (rs.next()) {
                        Thread.sleep(10000);
                        P3Class p3Class = new P3Class();
                        StringBuffer str = new StringBuffer();
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer QTY = rs.getInt("QTY");
                        String TAGCODE = rs.getString("TAGCODE");
                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        //p3Class.setName(ITEMNAME);
                        p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p3Class.setStr(str.toString());
                        p3Class.setDisplaySet((byte) 118);
                        //p3Class.setKcnum(QTY);
                        list.add(p3Class);
                        System.err.println(str);
                        String bufffer = new String(str);
                        msgStruts[0].msg = bufffer.getBytes("GB2312");
                        msgBytes = bufffer.getBytes("GB2312");
                        msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                        msgStruts[0].len = msgStruts[0].msg.length;
                        EslTest.Instance.PickupSysnew_P3(1, msgStruts, (byte) 1);
                    }
                    EslTest.Instance.PickupSys_ShutDown(1);
                    isCon = 1;
                } catch (SQLException se) {
                    se.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (stmt == null) stmt.close();
                    } catch (SQLException se2) {
                    }
                    try {
                        if (conn == null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();
                    }
                }
            }
        }
    }
    static class Thread97 extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    ThreadSql.common(97, Mysql.sql97);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
        static class Thread98 extends Thread {
            @Override
            public void run() {
                while (true) {
                    try {
                        ThreadSql.common(98, Mysql.sql98);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


            static class Thread99 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(99,Mysql.sql99);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread100 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(100,Mysql.sql100);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread101 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(101,Mysql.sql101);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread102 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(102,Mysql.sql102);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread103 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(103,Mysql.sql103);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread104 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(104,Mysql.sql104);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread105 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(105,Mysql.sql105);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread106 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(106,Mysql.sql106);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread107 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(107,Mysql.sql107);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread108 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(108,Mysql.sql108);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread109 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(109,Mysql.sql109);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread110 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(110,Mysql.sql110);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread111 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(111,Mysql.sql111);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread112 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(112,Mysql.sql112);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread113 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(113,Mysql.sql113);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread114 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(114,Mysql.sql114);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread115 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(115,Mysql.sql115);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread116 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(116,Mysql.sql116);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread117 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(117,Mysql.sql117);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread118 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(118,Mysql.sql118);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread119 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(119,Mysql.sql119);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread120 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(120,Mysql.sql120);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread121 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(121,Mysql.sql121);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread122 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(122,Mysql.sql122);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread123 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(123,Mysql.sql123);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread124 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(124,Mysql.sql124);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread125 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(125,Mysql.sql125);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread126 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(126,Mysql.sql126);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread127 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(127,Mysql.sql127);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread128 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(128,Mysql.sql128);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread129 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(129,Mysql.sql129);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread130 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(130,Mysql.sql130);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread131 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(131,Mysql.sql131);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread132 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(132,Mysql.sql132);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread133 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(133,Mysql.sql133);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread134 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(134,Mysql.sql134);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread135 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(135,Mysql.sql135);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread136 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(136,Mysql.sql136);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread137 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(137,Mysql.sql137);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread138 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(138,Mysql.sql138);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread139 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(139,Mysql.sql139);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread140 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(140,Mysql.sql140);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread141 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(141,Mysql.sql141);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread142 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(142,Mysql.sql142);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread143 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(143,Mysql.sql143);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            static class Thread144 extends Thread{
                @Override
                public void run() {
                    while (true){
                        try {
                            ThreadSql.common(144,Mysql.sql144);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }


}
