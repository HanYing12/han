package javarun;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.Semaphore;

public class ThreadExample2 implements Runnable    //Muti thread
{

    static String sss;
    private EslTest et;
    private Runstate javaJe;
    static boolean l = false;

    ThreadExample2(EslTest eslEt, Runstate je) {
        et = eslEt;
        javaJe = je;
    }
   public static boolean  flag = true;
    public  void run() {

        int a = 0;
        boolean flag=true;
        while (flag) {
               if (javaJe == null)
                    continue;
            String str = javaJe.GetContent();
            if (str != null) {
                a++;
                //获取编码方式
                    //String strCode = getEncoding(str);
                    byte[] msg;
                    try {
                        msg = str.getBytes("GB2312");
                        int iLen = msg.length;
                        //System.out.println(new String(str.getBytes("GB2312"),"GB2312"));
                        String strOut = new String();

                        for (int i = 0; i < iLen; i++) {
                            strOut += String.format("%02X ", msg[i]);
                            //strOut += String.format("%02X ",data );
                        }
                        //解析 的反馈的数据信息
                        System.err.println(strOut);
                    } catch (UnsupportedEncodingException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    javaJe.AppendString(str);

            }

        }

    }



    public static String getEncoding(String str) {
        String encode = "GB2312";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s = encode;
                return s;
            }
        } catch (Exception exception) {
        }
        encode = "ISO-8859-1";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s1 = encode;
                return s1;
            }
        } catch (Exception exception1) {
        }
        encode = "UTF-8";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s2 = encode;
                return s2;
            }
        } catch (Exception exception2) {
        }
        encode = "GBK";
        try {
            if (str.equals(new String(str.getBytes(encode), encode))) {
                String s3 = encode;
                return s3;
            }
        } catch (Exception exception3) {
        }
        return "";
    }
}
