package MySqlData;


import entity.P3Class;
import entity.P4Class;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MySqlDemo {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/xian?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "root";
    static final String PASS = "123456";
   /* static final String DB_URL = "jdbc:mysql://10.1.68.177:3306/wsl_xagj_test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "admin";
    static final String PASS = "X$lPN@*5!nkd";*/

    String Datetime = "'2019-09-18 17:24:09'";
    String CREATEDATE = "'2019-09-18 17:24:00'";
    String ORDERNO2 = null;
    String str1 = null;

    String Datetime2 = "'2019-09-18 17:24:09'";
    String CREATEDATE2 = "'2019-09-18 17:24:00'";
    String ORDERNO22 = null;
    String str2 = null;

    String Datetime3 = "'2019-09-18 17:24:09'";
    String CREATEDATE3 = "'2019-09-18 17:24:00'";
    String ORDERNO23 = null;
    String str3 = null;


    //���ݿ�p3
    public List<P3Class> getP3Class() {
        Connection conn = null;
        Statement stmt = null;
        List<P3Class> list = new ArrayList<>();
        try {
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);
            // ������
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // ִ�в�ѯ
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM dzhj_hwkc  ORDER BY LOCATIONID  ";
            ResultSet rs = stmt.executeQuery(sql);
            // չ����������ݿ�
            while (rs.next()) {
                // ͨ���ֶμ���
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
                //= "һ����ʹ�����ܲ�ܵ�˿,100g*6Ƭ/�У�����,00A-00B-00E-A,320111,55,555,��,";
                // �������
                str.append(TAGCODE + "," + ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + QTY + "," + UNIT + ",").toString();
                // p3Class.setName(ITEMNAME);
                p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                p3Class.setStr(str.toString());
                p3Class.setDisplaySet((byte) 118);
                // p3Class.setKcnum(QTY);
                list.add(p3Class);
                System.err.println(str);
            }
            // ��ɺ�ر�
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // ���� JDBC ����
            se.printStackTrace();
        } catch (Exception e) {
            // ���� Class.forName ����
            e.printStackTrace();
        } finally {
            // �ر���Դ
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return list;
    }

    //���ⵥ
    public synchronized Map<String, List<P4Class>> getAllck() {
        {
            Connection conn = null;
            Statement stmt = null;
            List<P4Class> list = new ArrayList<>();
            Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();

            while (true) {

                try {
                    // ע�� JDBC ����
                    Class.forName(JDBC_DRIVER);
                    // ������
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    // ִ�в�ѯ
                    stmt = conn.createStatement();
                    String sql;

                    sql = "SELECT * FROM dzhj_ck WHERE CREATEDATE>" + Datetime + "ORDER BY ORDERNO,LOCATIONID ASC";

                    ResultSet rs = stmt.executeQuery(sql);
                    // չ����������ݿ�

                    while (rs.next()) {
                        String ORDERNO = rs.getString("ORDERNO");
                        if (ORDERNO.equals(ORDERNO2)) {
                            str1 = ORDERNO2;
                        } else if (ORDERNO == null) {

                        } else {
                            System.err.println("�����");
                            ORDERNO2 = ORDERNO;
                            str1 = ORDERNO2;
                            list = new ArrayList<>();
                        }
                        System.err.println(str1);
                        CREATEDATE = rs.getString("CREATEDATE");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String UNIT = rs.getString("UNIT");
                        Integer PLANQTY = rs.getInt("PLANQTY");
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        Integer lamp = rs.getInt("DZHGCOLOR");
                        CREATEDATE = "'" + CREATEDATE + "'";
                        System.err.println(CREATEDATE);
                        StringBuffer str = new StringBuffer();

                        str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                        P4Class p4Class = new P4Class();
                        p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p4Class.setStr(str.toString());
                        p4Class.setLamp(lamp);
                        p4Class.setDisplaySet((byte) 118);
                        list.add(p4Class);
                        map.put(str1, list);
                    }


                    if (Datetime.equals(CREATEDATE)) {
                        System.err.println("��ִ��");
                        return null;
                    } else {
                        Datetime = CREATEDATE;
                        System.err.println("ִ��");
                        return map;
                    }

                    //    System.err.println("���2:" + Datetime);
                    // ��ɺ�ر�
                } catch (SQLException se) {
                    // ���� JDBC ����
                    se.printStackTrace();
                } catch (Exception e) {
                    // ���� Class.forName ����
                    e.printStackTrace();
                } finally {
                    // �ر���Դ
                    try {
                        if (stmt != null) stmt.close();
                    } catch (SQLException se2) {
                    }// ʲô������
                    try {
                        if (conn != null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }
                }
            }
        }
    }

    //�̵�
    public synchronized Map<String, List<P4Class>> getAllpd() {
        {
            Connection conn = null;
            Statement stmt = null;
            List<P4Class> list = new ArrayList<>();
            Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();

            while (true) {

                try {
                    // ע�� JDBC ����
                    Class.forName(JDBC_DRIVER);
                    // ������
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    // ִ�в�ѯ
                    stmt = conn.createStatement();
                    String sql;

                    sql = "SELECT * FROM dzhj_pd WHERE CREATEDATE>" + Datetime2 + "ORDER BY ORDERNO,LOCATIONID ASC";

                    ResultSet rs = stmt.executeQuery(sql);
                    // չ����������ݿ�

                    while (rs.next()) {
                        String ORDERNO = rs.getString("ORDERNO");
                        if (ORDERNO.equals(ORDERNO22)) {
                            str2 = ORDERNO22;
                        } else if (ORDERNO == null) {

                        } else {
                            System.err.println("�����");
                            ORDERNO22 = ORDERNO;
                            str2 = ORDERNO22;
                            list = new ArrayList<>();
                        }
                        System.err.println(str2);
                        CREATEDATE2 = rs.getString("CREATEDATE");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer PLANQTY = rs.getInt("PLANQTY");
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        Integer lamp = rs.getInt("DZHGCOLOR");

                        CREATEDATE2 = "'" + CREATEDATE2 + "'";
                        System.err.println(CREATEDATE2);
                        StringBuffer str = new StringBuffer();

                        str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + EXPIRYDATE + "," + PLANQTY + "," + UNIT + ",").toString();
                        P4Class p4Class = new P4Class();
                        p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p4Class.setStr(str.toString());
                        p4Class.setLamp(lamp);
                        p4Class.setDisplaySet((byte) 118);
                        list.add(p4Class);
                        map.put(str2, list);
                    }


                    if (Datetime2.equals(CREATEDATE2)) {
                        System.err.println("��ִ��");
                        return null;
                    } else {
                        Datetime2 = CREATEDATE2;
                        System.err.println("ִ��");
                        return map;
                    }

                    //    System.err.println("���2:" + Datetime);
                    // ��ɺ�ر�
                } catch (SQLException se) {
                    // ���� JDBC ����
                    se.printStackTrace();
                } catch (Exception e) {
                    // ���� Class.forName ����
                    e.printStackTrace();
                } finally {
                    // �ر���Դ
                    try {
                        if (stmt != null) stmt.close();
                    } catch (SQLException se2) {
                    }// ʲô������
                    try {
                        if (conn != null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }
                }
            }
        }
    }

    //��ⵥ
    public synchronized Map<String, List<P4Class>> getAllrk() {
        {

            Connection conn = null;
            Statement stmt = null;
            List<P4Class> list = new ArrayList<>();
            Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();

            while (true) {

                try {
                    // ע�� JDBC ����
                    Class.forName(JDBC_DRIVER);
                    // ������
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);
                    // ִ�в�ѯ
                    stmt = conn.createStatement();
                    String sql;

                    sql = "SELECT * FROM dzhj_rk WHERE CREATEDATE>" + Datetime3 + "ORDER BY ORDERNO,LOCATIONID ASC";
                    System.err.println(sql);
                    ResultSet rs = stmt.executeQuery(sql);
                    // չ����������ݿ�

                    while (rs.next()) {
                        String ORDERNO = rs.getString("ORDERNO");
                        if (ORDERNO.equals(ORDERNO23)) {
                            str3 = ORDERNO23;
                        } else if (ORDERNO == null) {

                        } else {
                            System.err.println("�����");
                            ORDERNO23 = ORDERNO;
                            str3 = ORDERNO23;
                            list = new ArrayList<>();
                        }
                        System.err.println(str3);
                        CREATEDATE3 = rs.getString("CREATEDATE");
                        String ITEMNAME = rs.getString("ITEMNAME");
                        String UNIT = rs.getString("UNIT");
                        String BATCHNO = rs.getString("BATCHNO");
                        String EXPIRYDATE = rs.getString("EXPIRYDATE");
                        Integer PLANQTY = rs.getInt("PLANQTY");
                        String LOCATIONID = rs.getString("LOCATIONID");
                        String ITEMSPEC = rs.getString("ITEMSPEC");
                        Integer lamp = rs.getInt("DZHGCOLOR");

                        CREATEDATE3 = "'" + CREATEDATE3 + "'";
                        System.err.println(CREATEDATE3);
                        StringBuffer str = new StringBuffer();

                        str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                        P4Class p4Class = new P4Class();
                        p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                        p4Class.setStr(str.toString());
                        p4Class.setLamp(lamp);
                        p4Class.setDisplaySet((byte) 118);
                        list.add(p4Class);
                        map.put(str3, list);
                    }


                    if (Datetime3.equals(CREATEDATE3)) {
                        System.err.println("��ִ��");
                        return null;
                    } else {
                        Datetime3 = CREATEDATE3;
                        System.err.println("ִ��");
                        return map;
                    }

                    //    System.err.println("���2:" + Datetime);
                    // ��ɺ�ر�
                } catch (SQLException se) {
                    // ���� JDBC ����
                    se.printStackTrace();
                } catch (Exception e) {
                    // ���� Class.forName ����
                    e.printStackTrace();
                } finally {
                    // �ر���Դ
                    try {
                        if (stmt != null) stmt.close();
                    } catch (SQLException se2) {
                    }// ʲô������
                    try {
                        if (conn != null) conn.close();
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }
                }
            }
        }
    }


    //�޸�һ������ state״̬ 1��ʾ���� 2��ʾ��� 3��ʾ�̵�
    public static int setOneDate(String add, String name, String itemspec, Integer num, Integer state) {

        Connection conn = null;
        int rs = 0;
        Statement stmt = null;
        try {
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);
            // ������
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // ִ�в�ѯ
            stmt = conn.createStatement();
            String sql = null;
            if (state == 1) {
                sql = "UPDATE dzhj_hwkc  SET  `QTY` = QTY-" + num + " WHERE LOCATIONID='" + add + "' AND   `ITEMNAME` = '" + name + "'  AND   `ITEMSPEC` = '" + itemspec + "' ";
                System.err.println(sql);
            } else if (state == 2) {
                sql = "UPDATE dzhj_hwkc  SET  `QTY` = QTY+" + num + " WHERE LOCATIONID='" + add + "' AND   `ITEMNAME` = '" + name + "'  AND   `ITEMSPEC` = '" + itemspec + "' ";
                System.err.println(sql);
            } else if (state == 3) {
                sql = "UPDATE dzhj_hwkc  SET  `QTY` ='" + num + "'  WHERE LOCATIONID='" + add + "' AND   `ITEMNAME` = '" + name + "'  AND   `ITEMSPEC` = '" + itemspec + "' ";

            }

            rs = stmt.executeUpdate(sql);

        } catch (SQLException se) {
            // ���� JDBC ����
            se.printStackTrace();
        } catch (Exception e) {
            // ���� Class.forName ����
            e.printStackTrace();
        } finally {
            // �ر���Դ
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// ʲô������
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();

            }
            return rs;
        }

    }


    public static List<P3Class> getOneHwkcbyadd(String add) {
        Connection conn = null;
        Statement stmt = null;
        List<P3Class> list = new ArrayList<>();
        try {
            // ע�� JDBC ����
            Class.forName(JDBC_DRIVER);
            // ������
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            // ִ�в�ѯ
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM dzhj_hwkc  where LOCATIONID ='" + add + "' ";
            ResultSet rs = stmt.executeQuery(sql);
            // չ����������ݿ�
            while (rs.next()) {
                // ͨ���ֶμ���
                P3Class p3Class = new P3Class();
                StringBuffer str = new StringBuffer();
                String LOCATIONID = rs.getString("LOCATIONID");
                String ITEMNAME = rs.getString("ITEMNAME");

                String MANUFACTURER = rs.getString("MANUFACTURER");
                String UNIT = rs.getString("UNIT");
                String BATCHNO = rs.getString("BATCHNO");
                String EXPIRYDATE = rs.getString("EXPIRYDATE");
                Integer QTY = rs.getInt("QTY");
                String ITEMSPEC = rs.getString("ITEMSPEC");
                String TAGCODE = rs.getString("TAGCODE");
                //= "һ����ʹ�����ܲ�ܵ�˿,100g*6Ƭ/�У�����,00A-00B-00E-A,320111,55,555,��,";
                // �������
                str.append(TAGCODE + "," + ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + QTY + "," + UNIT + ",").toString();
                p3Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                p3Class.setStr(str.toString());
                p3Class.setDisplaySet((byte) 118);
                list.add(p3Class);
            }
            // ��ɺ�ر�
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            // ���� JDBC ����
            se.printStackTrace();
        } catch (Exception e) {
            // ���� Class.forName ����
            e.printStackTrace();
        } finally {
            // �ر���Դ
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }// ʲô������
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return list;
    }
}
