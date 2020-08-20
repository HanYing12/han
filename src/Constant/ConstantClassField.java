package Constant;

public final class ConstantClassField {

    // mysql 常量
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String DB_URL = "jdbc:mysql://localhost:3306/timo?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT%2B8";
    public static final String USER = "root";
    public static final String PASS = "123456";

    // mysql 常亮正式库地址
//  public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//  public static final String DB_URL = "jdbc:mysql://10.1.68.177:3306/timo?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone = GMT%2B8";
//  public static final String USER = "admin";
//  public static final String PASS = "X$lPN@*5!nkd";


    // 请求参数常亮
    public static final String SOAPURL = "http://10.1.133.210:8090/SPDWebService.asmx?wsdl";
    public static final String SOAPACTION = "http://tempuri.org/DataExchange";



    // 请求参数常亮
    public static final String SOAPURL_CK = "http://localhost:8888/Service/ServiceHello?wsdl";
    public static final String SOAPACTION_CK = "http://tempuri.org/DataExchange";
    public static final String SOAPXML = "";

}
