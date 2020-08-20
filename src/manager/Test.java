package manager;

import Constant.ConstantClassField;
import Service.HttpClient;
import entity.P3Class;
import entity.P4Class;
import gnu.io.SerialPort;
import javarun.EslTest;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;

import java.sql.*;
import java.util.*;

public class Test {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    /*static final String DB_URL = "jdbc:mysql://10.1.68.177:3306/wsl_xagj_test?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "admin";
    static final String PASS = "X$lPN@*5!nkd";*/
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/xian?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT";
    static final String USER = "root";
    static final String PASS = "123456";
    public void selectId(){
        int rate=9600;

        String portName="COM3";

        SerialPort serialPort=null;
        try
        {
            serialPort= (new MySerial(new MySerial.DataCallBack() {
                @Override
                public void onReceive(String result ) {
                    System.out.println("---接收到数据：" + result);
                    int isCon;
                    byte[] msgBytes = null;
                    Connection conn = null;
                    while (true) {
                        isCon = EslTest.Instance.PickupSys_StartUp(null, 1, "192.168.1.136", 6780);
                        EslTest.P4_infor[] msgStruts = (EslTest.P4_infor[])
                                new EslTest.P4_infor().toArray(1);
                        msgStruts[0].addr = 1;
                        msgStruts[0].modemNo = 1;
                        //操作前 112无色 114绿色 116红色 118黄 120粉
                        msgStruts[0].displaySet = (byte) 114;
                        //操作后 136无色 138绿色闪烁 140红色闪烁 142黄色闪烁
                        msgStruts[0].displaySetPress = (byte) 136;
                        Statement stmt = null;
                        try {
                            Class.forName(JDBC_DRIVER);
                            conn = DriverManager.getConnection(DB_URL, USER, PASS);
                            stmt = conn.createStatement();
                            List<P4Class> list = new ArrayList<>();
                            String sql;

                            sql = "SELECT * FROM dzhj_ck  where ORDERNO=" + result + "";

                            ResultSet rs = stmt.executeQuery(sql);
                            while (rs.next()) {
                                Thread.sleep(2000);
                                P4Class p4Class = new P4Class();
                                StringBuffer str = new StringBuffer();
                                String ORDERNO = rs.getString("ORDERNO").toString();
                                String ORDERDETAILID = rs.getString("ORDERDETAILID").toString();
                                String DEPARTMENT = rs.getString("DEPARTMENT").toString();
                                String LOCATIONID = rs.getString("LOCATIONID");
                                String ITEMNAME = rs.getString("ITEMNAME").toString();
                                String MANUFACTURER = rs.getString("MANUFACTURER").toString();
                                String SUPPLIER = rs.getString("SUPPLIER").toString();
                                String UNIT = rs.getString("UNIT");
                                String ITEMSPEC = rs.getString("ITEMSPEC");
                                String EXPIRYDATE = rs.getString("EXPIRYDATE");
                                String BATCHNO = rs.getString("BATCHNO");
                                String PLANQTY = rs.getString("PLANQTY");
                                String STATE = rs.getString("STATE");
                                String Operator = rs.getString("Operator");
                                String CreateDate = rs.getString("CreateDate");
                                String DZHGCOLOR = rs.getString("DZHGCOLOR");
                                // str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + TAGCODE + "," + EXPIRYDATE + "," + QTY + "," + UNIT + ",").toString();
                                //str.append(ORDERNO + "," + ORDERDETAILID + "," + DEPARTMENT + "," + LOCATIONID + "," + ITEMNAME + "," + MANUFACTURER + "," + SUPPLIER + "," + UNIT + "," + ITEMSPEC + "," + EXPIRYDATE + "," + BATCHNO + "," + PLANQTY + "," + STATE + "," + Operator + "," + CreateDate + "," + DZHGCOLOR + ",").toString();
                                str.append(DEPARTMENT + "," + ITEMNAME + "," + SUPPLIER + "," + UNIT + "," + ITEMSPEC + "," + PLANQTY + "," + Operator + ",").toString();
                                //p3Class.setName(ITEMNAME);
                                p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                                p4Class.setStr(str.toString());
                                p4Class.setDisplaySet((byte) 118);
                                //p3Class.setKcnum(QTY);
                                list.add(p4Class);
                                System.err.println(str);
                                String bufffer = new String(str);
                                msgStruts[0].msg = bufffer.getBytes("GB2312");
                                msgBytes = bufffer.getBytes("GB2312");
                                msgStruts[0].msg = Arrays.copyOf(msgBytes, 200);
                                msgStruts[0].len = msgStruts[0].msg.length;
                                Thread.sleep(300);
                                EslTest.Instance.PickupSysnew_P4(1, msgStruts, (byte) 1);
                            }
                        } catch (SQLException se) {
                            se.printStackTrace();
                        } catch (Exception e) {
                            e.printStackTrace();
                        } finally {
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
                    }
                }
            })).connect(portName,rate);
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            serialPort.removeEventListener();
            serialPort.close();
        }
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.selectId();
    }
}