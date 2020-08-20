package thread;

import entity.P3Class;
import entity.P4Class;
import javarun.EslTest;


import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestThread {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/xian?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "root";
    static final String PASS = "123456";

    //38控制器
             static  class ThreadSql extends Thread {
        static public void gonggong(int id, String sql) throws SQLException {
            int isCon;
            byte[] msgBytes = null;
            while (true) {

                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "10.35.63.38", 6780);
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
                        // str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                        str.append(TAGCODE + "," + ITEMNAME + "," + ITEMSPEC + "," + QTY + "," + UNIT + "," + BATCHNO + ",").toString();
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

             static class Thread1 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(1, Mysql.sql1);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread2 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(2, Mysql.sql1);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread3 extends Thread {

                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(3, Mysql.sql2);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread4 extends Thread {

                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(4, Mysql.sql3);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread5 extends Thread {

                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(5, Mysql.sql4);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread6 extends Thread {

                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(6, Mysql.sql5);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread7 extends Thread {
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(7, Mysql.sql6);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread8 extends Thread {

                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(8, Mysql.sql7);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread9 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(9, Mysql.sql8);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }

             }
             static class Thread10 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(10, Mysql.sql9);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread11 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(11, Mysql.sql10);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread12 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(12, Mysql.sql11);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread13 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(13, Mysql.sql12);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread14 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(14, Mysql.sql13);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread15 extends Thread {
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(15, Mysql.sql14);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread16 extends Thread{
                         @Override
                         public void run() {
                             while (true) {
                                 try {
                                     ThreadSql.gonggong(16, Mysql.sql15);
                                 } catch (SQLException e) {
                                     e.printStackTrace();
                                 }
                             }
                         }
                     }
             static class Thread17 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(17, Mysql.sql16);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread18 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(18, Mysql.sql17);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread19 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(19, Mysql.sql18);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread20 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(20, Mysql.sql19);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread21 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(21, Mysql.sql20);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread22 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(22, Mysql.sql21);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread23 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(23, Mysql.sql22);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread24 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(24, Mysql.sql23);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread25 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(25, Mysql.sql24);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread26 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(26, Mysql.sql25);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread27 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(27, Mysql.sql26);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread28 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(28, Mysql.sql27);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread29 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(29, Mysql.sql28);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread30 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(30, Mysql.sql29);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread31 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(31, Mysql.sql30);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread32 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(32, Mysql.sql31);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread33 extends Thread {
                    @Override
                    public void run() {
                        while (true) {
                            try {
                                ThreadSql.gonggong(33, Mysql.sql32);
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
             }

            static class Thread34 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(34, Mysql.sql33);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread35 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(35, Mysql.sql34);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread36 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(36, Mysql.sql35);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread37 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(37, Mysql.sql36);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread38 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(38, Mysql.sql37);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread39 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(39, Mysql.sql38);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread40 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(40, Mysql.sql39);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread41 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(41, Mysql.sql40);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread42 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(42, Mysql.sql41);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread43 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(43, Mysql.sql42);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread44 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(44, Mysql.sql43);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread45 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(45, Mysql.sql44);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread46 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(46, Mysql.sql45);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread47 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(47, Mysql.sql46);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread48 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(48, Mysql.sql47);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread49 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(49, Mysql.sql48);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread50 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(50, Mysql.sql49);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread51 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(51, Mysql.sql50);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread52 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(52, Mysql.sql51);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread53 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(53, Mysql.sql52);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread54 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(54, Mysql.sql53);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread55 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(55, Mysql.sql54);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread56 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(56, Mysql.sql55);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread57 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(57, Mysql.sql56);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread58 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(58, Mysql.sql57);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread59 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(59, Mysql.sql58);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread60 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(60, Mysql.sql59);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread61 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(61, Mysql.sql60);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread62 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(62, Mysql.sql61);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread63 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(63, Mysql.sql62);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

            static class Thread64 extends Thread {
                @Override
                public void run() {
                    while (true) {
                        try {
                            ThreadSql.gonggong(64, Mysql.sql63);
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

             static class Thread65 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {

                             ThreadSql.gonggong(65, Mysql.sql64);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread66 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(66, Mysql.sql65);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread67 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(67, Mysql.sql66);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread68 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(68, Mysql.sql67);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread69 extends Thread{
                 @Override
                 public void run() {
                     while (true) {
                         try {
                             ThreadSql.gonggong(69, Mysql.sql68);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread70 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(70,Mysql.sql69);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread71 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(71,Mysql.sql70);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread72 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(72,Mysql.sql71);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread73 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(73,Mysql.sql72);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread74 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(74,Mysql.sql73);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread75 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(75,Mysql.sql74);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread76 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(76,Mysql.sql75);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread77 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(77,Mysql.sql76);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread78 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(78,Mysql.sql77);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread79 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(79,Mysql.sql78);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread80 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(80,Mysql.sql79);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread81 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(81,Mysql.sql80);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread82 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(82,Mysql.sql81);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread83 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(83,Mysql.sql82);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread84 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(84,Mysql.sql83);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread85 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(85,Mysql.sql84);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread86 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(86,Mysql.sql85);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread87 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(87,Mysql.sql86);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread88 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(88,Mysql.sql87);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread89 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(89,Mysql.sql88);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread90 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(90,Mysql.sql89);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread91 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(91,Mysql.sql90);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread92 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(92,Mysql.sql91);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread93 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(93,Mysql.sql92);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread94 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(94,Mysql.sql93);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread95 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(95,Mysql.sql94);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }
             static class Thread96 extends Thread{
                 @Override
                 public void run() {
                     while (true){
                         try {
                             ThreadSql.gonggong(96,Mysql.sql96);
                         } catch (SQLException e) {
                             e.printStackTrace();
                         }
                     }
                 }
             }

}