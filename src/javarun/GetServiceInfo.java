package javarun;

import Constant.ConstantClassField;
import Service.HttpClient;
import Service.SaveStock;
import entity.P4Class;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public  class GetServiceInfo {


	// 替换
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

//    static String ORDERNO2 = null;
//    static String str1 = null;
//    static String Datetime = "'2019-09-18 17:24:09'";
//    static String CREATEDATE = "'2019-09-18 17:24:00'";


    // 测试WebService接口返回的内容并进行解析、库存单数据获取接口4006 测试数据
//    public static String xml4006 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
//            "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">  \n" +
//            "  <soap:Body> \n" +
//            "    <DataExchangeResponse xmlns=\"http://tempuri.org/\">  \n" +
//            "      <DataExchangeResult><![CDATA[\n" +
//            "\t\t <?xml version=\"1.0\" encoding=\"utf-8\" ?> \n" +
//            "\t\t <DOC>\n" +
//            "\t\t <HEADER SUCCEED=\"0\" MESSAGE=\"成功\" TOTAL_RECORDS=\"0\" /><TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR2439\" EXPIRYDATE=\"2021/6/1 0:00:00\" QTY=\"10\" TAGCODE=\"0110111014060\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"9\" TAGCODE=\"0110111014060\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"1\" TAGCODE=\"0110111014060\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR2439\" EXPIRYDATE=\"2021/6/1 0:00:00\" QTY=\"10\" TAGCODE=\"0110111014061\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"9\" TAGCODE=\"0110111014061\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"1\" TAGCODE=\"0110111014061\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR2439\" EXPIRYDATE=\"2021/6/1 0:00:00\" QTY=\"10\" TAGCODE=\"0110111014062\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"9\" TAGCODE=\"0110111014062\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"1\" TAGCODE=\"0110111014062\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR2439\" EXPIRYDATE=\"2021/6/1 0:00:00\" QTY=\"10\" TAGCODE=\"0110111014063\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"9\" TAGCODE=\"0110111014063\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR0299\" EXPIRYDATE=\"2021/8/31 0:00:00\" QTY=\"1\" TAGCODE=\"0110111014063\" />\n" +
//            "<TRANS LOCATIONID=\"1-1-1-1\" ITEMNAME=\"经外周插管的中心静脉导附件、 微插管器\"  MANUFACTURER=\"Bard Access Systems ,Inc\" UNIT=\"套\" ITEMSPEC=\"4.5F单腔\" BATCHNO=\"REDR2439\" EXPIRYDATE=\"2021/6/1 0:00:00\" QTY=\"10\" TAGCODE=\"0110111014064\" />\n" +
//            "</DOC>]]></DataExchangeResult> \n" +
//            "    </DataExchangeResponse> \n" +
//            "  </soap:Body> \n" +
//            "</soap:Envelope>\n";


    // 出库单数据获取接口4008 测试数据
    public static String xml4008 = "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
            "   <soap:Body>\n" +
            "\t\t<DataExchangeResponse xmlns=\"http://tempuri.org/\">\n" +
            "         <DataExchangeResult>\n" +
            "\t\t <![CDATA[<?xml version='1.0' encoding='utf-8' ?> \n" +
            "\t\t\t<DOC>\n" +
            "\t\t\t\t<HEADER SUCCEED='1' MESSAGE='成功' TOTAL_RECORDS='0' />\n" +
            "<TRANS ORDERNO='123454' ORDERdetailid='123456789'  LOCATIONID='0-0-0-1' ITEMNAME='压舌板' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='2' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:30' DZHGCOLOR='114'/>\n"+
            "<TRANS ORDERNO='123454' ORDERdetailid='123456789'  LOCATIONID='0-0-0-1' ITEMNAME='压舌板' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='24' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:50' DZHGCOLOR='114'/>\n"+
            "<TRANS ORDERNO='123458' ORDERdetailid='123456789'  LOCATIONID='0-0-0-2' ITEMNAME='消毒液' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='100' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:58' DZHGCOLOR='116'/>\n"+
            "<TRANS ORDERNO='123458' ORDERdetailid='123456789'  LOCATIONID='0-0-0-2' ITEMNAME='84消毒' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='10' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:59' DZHGCOLOR='116'/>\n"+
            "<TRANS ORDERNO='123458' ORDERdetailid='123456789'  LOCATIONID='0-0-0-2' ITEMNAME='过氧化氢' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='2' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:01' DZHGCOLOR='116'/>\n"+
            "<TRANS ORDERNO='123458' ORDERdetailid='123456789'  LOCATIONID='0-0-0-2' ITEMNAME='过氧化氢' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='2' STATE='10' Operator='万序' CreateDate='2019-09-18 17:25:57' DZHGCOLOR='116'/>\n"+
            "<TRANS ORDERNO='123459' ORDERdetailid='123456789'  LOCATIONID='0-0-0-3' ITEMNAME='管道' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='3' STATE='10' Operator='万序' CreateDate='2019-09-18 17:27:59' DZHGCOLOR='118'/>\n"+
            "<TRANS ORDERNO='123459' ORDERdetailid='123456789'  LOCATIONID='0-0-0-4' ITEMNAME='手术衣' MANUFACTURER='上海浦东金环医疗用品股份有限公司' SUPPLIER='陕西华泰医疗器械有限公司' UNIT='个' ITEMSPEC='12Fr' BATCHNO='20190809' EXPIRYDATE='2022/7/8' PLANQTY='4' STATE='10' Operator='万序' CreateDate='2019-09-18 17:28:00' DZHGCOLOR='118'/>\n"+
            "\t\t\t</DOC>]]>\n" +
            "\t\t</DataExchangeResult>\n" +
            "      </DataExchangeResponse>\n" +
            "   </soap:Body>\n" +
            "</soap:Envelope>";

    /**
	 * 更新货位库存信息数据
	 *
	 * @throws ParseException

	public  void TimerKcDataUpdate() throws ParseException {
		// 一天的毫秒数
		long daySpan = 24 * 60 * 60 * 1000;
		// 规定的每天时间15:33:30运行
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd '16:15:00'");
		// 首次运行时间
		Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf.format(new Date()));
		// 如果今天的已经过了 首次运行时间就改为明天
		if (System.currentTimeMillis() > startTime.getTime())
			startTime = new Date(startTime.getTime() + daySpan);
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// 要执行的代码
				GetServiceInfo get = new GetServiceInfo();
				get.postServiceStockData();
			}
		};
		// 以每24小时执行一次
		t.scheduleAtFixedRate(task, startTime, daySpan);
	}

     */
	/**
	 * 清空货位库存信息数据
	 *
	 * @throws ParseException

	public void TimerKcDataDelete() throws ParseException {
		// 一天的毫秒数
		long daySpan = 24 * 60 * 60 * 1000;
		// 规定的每天时间15:33:30运行
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd '16:13:00'");
		// 首次运行时间
		Date startTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(sdf.format(new Date()));
		// 如果今天的已经过了 首次运行时间就改为明天
		if (System.currentTimeMillis() > startTime.getTime())
			startTime = new Date(startTime.getTime() + daySpan);
		Timer t = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				// 要执行的代码
				SaveStock saveKc = new SaveStock();
				try {
					int count = saveKc.DeleteHwkcData();
					if (count > 0) {
						System.out.println("delete success!");
					} else {
						System.out.println("delete faild!");
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		};
		// 以每24小时执行一次
		t.scheduleAtFixedRate(task, startTime, daySpan);
	}
     */

	/**
	 * 库存数据获取数据
	 *
	 * @return SUCCESS:成功
	 */
	public String postServiceStockData() {

		String soapXml = HttpClient.soapXml("4006");
		String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL, soapXml, ConstantClassField.SOAPACTION);
		// reqXml 返回WebServiceXml体
		Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
		Element root = xmlDocument.getRootElement();
		Element response = root.element("Body").element("DataExchangeResponse");
		Element result = response.element("DataExchangeResult");
		String resultXml = result.getText().trim();
		Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
		Element docRoot = resultXmlDocument.getRootElement();
		Element header = docRoot.element("HEADER");
		System.out.println(HttpClient.getMapByNode(header));
		List<Element> transList = docRoot.elements("TRANS");
		JSONObject headerJson = null;
		JSONObject transJson = null;
		headerJson = HttpClient.getMapByNode(header);
		String succeed = headerJson.getString("SUCCEED").toString();
		String message = headerJson.getString("MESSAGE").toString();
		if (succeed != "0") {
			List<Map<String, Object>> datas = new ArrayList<>();
			for (int i = 0; i < transList.size(); i++) {
				transJson = HttpClient.getMapByNode(transList.get(i));
				try {
					Map<String, Object> map = new HashMap<>();
					map.put("LOCATION", transJson.getString("LOCATIONID").toString());
					map.put("ITEMNAME", transJson.getString("ITEMNAME").toString());
					map.put("MANUFACTURER", transJson.getString("MANUFACTURER").toString());
					map.put("UNIT", transJson.getString("UNIT"));
					map.put("ITEMSPEC", transJson.getString("ITEMSPEC"));
					map.put("BATCHNO", transJson.getString("BATCHNO"));
					map.put("EXPIRYDATE", transJson.getString("EXPIRYDATE"));
					map.put("QTY", transJson.getString("QTY"));
					map.put("TAGCODE", transJson.getString("TAGCODE"));
					datas.add(map);
					SaveStock saveKc = new SaveStock();
					int count = saveKc.insertAll("locationinfo", datas);
					if (count > 0) {
						System.out.println("更新货位信息数据成功！！！！");
					} else {
						System.out.println("更新货位信息数据失败！！！！");
					}
				} catch (Exception e) {
					System.out.println("抛出异常信息" + e);
				}
			}
		} else {
			return "库 存 数 据 获 取：" + message;
		}
		return "SUCCESS";
	}


	/**
     * 出库数据获取数据
     * @return
     */
    public Map<String, List<P4Class>> postServiceOutStockData(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        try {
            //String soapXml = strBuff.toString().trim();
            // 切换正式
            String soapXml = HttpClient.soapXmlCk();
            String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL_CK,soapXml,ConstantClassField.SOAPACTION_CK);
            /*String soapXml = HttpClient.soapXml("4007");
            String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL,soapXml,ConstantClassField.SOAPACTION);*/

            // xml4008 测试串
            Document xmlDocument = HttpClient.StrChangeToDocument(xml4008);
            Element root = xmlDocument.getRootElement();
            Element response = root.element("Body").element("DataExchangeResponse");
            Element result = response.element("DataExchangeResult");
            String resultXml = result.getText().trim();
            Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
            Element docRoot = resultXmlDocument.getRootElement();
            Element header = docRoot.element("HEADER");
            List<Element> transList = docRoot.elements("TRANS");
            JSONObject headerJson = null;
            JSONObject transJson = null;
            headerJson = HttpClient.getMapByNode(header);
            String succeed = headerJson.getString("SUCCEED").toString();
            String message = headerJson.getString("MESSAGE").toString();
            if(!succeed.equals("0")){
                for (int i = 0; i < transList.size(); i++) {
                    transJson = HttpClient.getMapByNode(transList.get(i));
                    String orderno = transJson.getString("ORDERNO");
                    if(orderno.equals(ORDERNO2)){
                        str1 = ORDERNO2;
                    }else if (orderno == null) {

                    } else {
                        System.err.println("清空了");
                        ORDERNO2 = orderno;
                        str1 = ORDERNO2;
                        list = new ArrayList<>();
                    }
                    System.err.println(str1);
                    CREATEDATE = transJson.getString("CreateDate");
                    String ITEMNAME = transJson.getString("ITEMNAME");
                    String UNIT = transJson.getString("UNIT");
                    String BATCHNO = transJson.getString("BATCHNO");
                    String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                    Integer PLANQTY = transJson.getInt("PLANQTY");
                    String LOCATIONID = transJson.getString("LOCATIONID");
                    String ITEMSPEC = transJson.getString("ITEMSPEC");
                    String dzhgcolor = transJson.getString("DZHGCOLOR");
                    Integer lamp = Integer.parseInt(dzhgcolor);
                    System.out.println("lamp====="+lamp);
                    CREATEDATE = "'"+CREATEDATE + "'";
                    System.err.println(CREATEDATE);
                    StringBuffer str = new StringBuffer();

                    //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                    str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                    System.err.println(str);
                    P4Class p4Class = new P4Class();
                    p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                    p4Class.setStr(str.toString());
                    p4Class.setLamp(lamp);
                    p4Class.setDisplaySet((byte) 118);
                    System.err.println(str1);
                    list.add(p4Class);
                    map.put(str1, list);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        for (Map.Entry<String, List<P4Class>> a : map.entrySet()) {
            System.err.println("key:" + a.getKey());
            for (P4Class l : a.getValue()
            ) {
                System.err.println(l.getAddr());
            }
        }
        if (Datetime.equals(CREATEDATE)) {
            System.err.println("不执行");
            return null;
        } else {
            Datetime = CREATEDATE;
            System.err.println("执行");
            System.err.println(list);
            return map;
        }
    }


    /**
     * 入库数据获取数据
     * @return
     */
    public Map<String, List<P4Class>> postServiceStorageData(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        try {
            //String soapXml = strBuff.toString().trim();
            // 切换正式
        	String soapXml = HttpClient.soapXmlRk();
            String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL_CK,soapXml,ConstantClassField.SOAPACTION_CK);
            /*String soapXml = HttpClient.soapXml("4008");
            String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL,soapXml,ConstantClassField.SOAPACTION);*/

            // xml4008 测试串
            Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
            Element root = xmlDocument.getRootElement();
            Element response = root.element("Body").element("DataExchangeResponse");
            Element result = response.element("DataExchangeResult");
            String resultXml = result.getText().trim();
            Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
            Element docRoot = resultXmlDocument.getRootElement();
            Element header = docRoot.element("HEADER");
            List<Element> transList = docRoot.elements("TRANS");
            JSONObject headerJson = null;
            JSONObject transJson = null;
            headerJson = HttpClient.getMapByNode(header);
            String succeed = headerJson.getString("SUCCEED").toString();
            String message = headerJson.getString("MESSAGE").toString();
            if(!succeed.equals("0")){
                for (int i = 0; i < transList.size(); i++) {
                    transJson = HttpClient.getMapByNode(transList.get(i));
                    String orderno = transJson.getString("ORDERNO");
                    if(orderno.equals(ORDERNO23)){
                        str3 = ORDERNO23;
                    }else if (orderno == null) {

                    } else {
                        System.err.println("清空了");
                        ORDERNO23 = orderno;
                        str3 = ORDERNO23;
                        list = new ArrayList<>();
                    }
                    System.err.println(str3);
                    CREATEDATE = transJson.getString("CreateDate");
                    String ITEMNAME = transJson.getString("ITEMNAME");
                    String UNIT = transJson.getString("UNIT");
                    String BATCHNO = transJson.getString("BATCHNO");
                    String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                    Integer PLANQTY = transJson.getInt("PLANQTY");
                    String LOCATIONID = transJson.getString("LOCATIONID");
                    String ITEMSPEC = transJson.getString("ITEMSPEC");
                    String dzhgcolor = transJson.getString("DZHGCOLOR");
                    Integer lamp = Integer.parseInt(dzhgcolor);
                    System.out.println("lamp====="+lamp);
                    CREATEDATE = "'"+CREATEDATE + "'";
                    System.err.println(CREATEDATE);
                    StringBuffer str = new StringBuffer();

                    //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                    str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                    System.err.println(str);
                    P4Class p4Class = new P4Class();
                    p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                    p4Class.setStr(str.toString());
                    p4Class.setLamp(lamp);
                    p4Class.setDisplaySet((byte) 118);
                    System.err.println(str1);
                    list.add(p4Class);
                    map.put(str1, list);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        for (Map.Entry<String, List<P4Class>> a : map.entrySet()) {
            System.err.println("key:" + a.getKey());
            for (P4Class l : a.getValue()
            ) {
                System.err.println(l.getAddr());
            }
        }
        if (Datetime.equals(CREATEDATE)) {
            System.err.println("不执行");
            return null;
        } else {
            Datetime = CREATEDATE;
            System.err.println("执行");
            System.err.println(list);
            return map;
        }
    }


    /**
     * 盘点数据获取实体
     * return
     */
    public Map<String, List<P4Class>> postServiceInventoryData(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        try {
            //String soapXml = strBuff.toString().trim();
            // 切换正式
            /*String soapXml = HttpClient.soapXml("4009");
            String reqXml = HttpClient.doPostSoap(ConstantClassField.SOAPURL,soapXml,ConstantClassField.SOAPACTION);*/

            // xml4008 测试串
            Document xmlDocument = HttpClient.StrChangeToDocument(xml4008);
            Element root = xmlDocument.getRootElement();
            Element response = root.element("Body").element("DataExchangeResponse");
            Element result = response.element("DataExchangeResult");
            String resultXml = result.getText().trim();
            Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
            Element docRoot = resultXmlDocument.getRootElement();
            Element header = docRoot.element("HEADER");
            List<Element> transList = docRoot.elements("TRANS");
            JSONObject headerJson = null;
            JSONObject transJson = null;
            headerJson = HttpClient.getMapByNode(header);
            String succeed = headerJson.getString("SUCCEED").toString();
            String message = headerJson.getString("MESSAGE").toString();
            if(!succeed.equals("0")){
                for (int i = 0; i < transList.size(); i++) {
                    transJson = HttpClient.getMapByNode(transList.get(i));
                    String orderno = transJson.getString("ORDERNO");
                    if(orderno.equals(ORDERNO22)){
                        str2 = ORDERNO22;
                    }else if (orderno == null) {

                    } else {
                        System.err.println("清空了");
                        ORDERNO22 = orderno;
                        str2 = ORDERNO22;
                        list = new ArrayList<>();
                    }
                    System.err.println(str2);
                    CREATEDATE = transJson.getString("CreateDate");
                    String ITEMNAME = transJson.getString("ITEMNAME");
                    String UNIT = transJson.getString("UNIT");
                    String BATCHNO = transJson.getString("BATCHNO");
                    String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                    Integer PLANQTY = transJson.getInt("PLANQTY");
                    String LOCATIONID = transJson.getString("LOCATIONID");
                    String ITEMSPEC = transJson.getString("ITEMSPEC");
                    String dzhgcolor = transJson.getString("DZHGCOLOR");
                    Integer lamp = Integer.parseInt(dzhgcolor);
                    System.out.println("lamp====="+lamp);
                    CREATEDATE = "'"+CREATEDATE + "'";
                    System.err.println(CREATEDATE);
                    StringBuffer str = new StringBuffer();

                    //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                    str.append(ITEMNAME + "," + ITEMSPEC + "," + BATCHNO + "," + EXPIRYDATE + "," + PLANQTY + "," + UNIT + ",").toString();
                    System.err.println(str);
                    P4Class p4Class = new P4Class();
                    p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                    p4Class.setStr(str.toString());
                    p4Class.setLamp(lamp);
                    p4Class.setDisplaySet((byte) 118);
                    System.err.println(str1);
                    list.add(p4Class);
                    map.put(str1, list);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
        for (Map.Entry<String, List<P4Class>> a : map.entrySet()) {
            System.err.println("key:" + a.getKey());
            for (P4Class l : a.getValue()
            ) {
                System.err.println(l.getAddr());
            }
        }
        if (Datetime.equals(CREATEDATE)) {
            System.err.println("不执行");
            return null;
        } else {
            Datetime = CREATEDATE;
            System.err.println("执行");
            System.err.println(list);
            return map;
        }
    }

    /**
     * 出库
     * @return
     */
    public synchronized Map<String, List<P4Class>>   ckMian(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        String soapXml = HttpClient.soapXml("4008");
        String reqXml = HttpClient.doPostSoap("http://10.1.68.60:8090/SPDWebService.asmx?wsdl", soapXml, "http://tempuri.org/DataExchange");
        Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
        System.err.println("ckckckckckckkckkckckckcckc");
        Element root = xmlDocument.getRootElement();
        Element response = root.element("Body").element("DataExchangeResponse");
        Element result = response.element("DataExchangeResult");
        String resultXml = result.getText().trim();
        Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
        Element docRoot = resultXmlDocument.getRootElement();
        Element header = docRoot.element("HEADER");
        System.out.println(HttpClient.getMapByNode(header));
        List<Element> transList = docRoot.elements("TRANS");
        JSONObject headerJson = null;
        JSONObject transJson = null;
        headerJson = HttpClient.getMapByNode(header);
        String succeed = headerJson.getString("SUCCEED").toString();
        String message = headerJson.getString("MESSAGE").toString();
        if(!succeed.equals("0")){
            for (int i = 0; i < transList.size(); i++) {
                transJson = HttpClient.getMapByNode(transList.get(i));
                String orderno = transJson.getString("ORDERNO");
                if(orderno.equals(ORDERNO2)){
                    str1 = ORDERNO2;
                }else if (orderno == null) {

                } else {
                    System.err.println("清空了");
                    ORDERNO2 = orderno;
                    str1 = ORDERNO2;
                    list = new ArrayList<>();
                }
                CREATEDATE = transJson.getString("CreateDate");
                String ITEMNAME = transJson.getString("ITEMNAME");
                String UNIT = transJson.getString("UNIT");
                String BATCHNO = transJson.getString("BATCHNO");
                String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                Integer PLANQTY = transJson.getInt("PLANQTY");
                String LOCATIONID = transJson.getString("LOCATIONID");
                String ITEMSPEC = transJson.getString("ITEMSPEC");
                String dzhgcolor = transJson.getString("DZHGCOLOR");
                Integer lamp = Integer.parseInt(dzhgcolor);

                CREATEDATE = "'"+CREATEDATE + "'";

                StringBuffer str = new StringBuffer();

                //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                System.err.println(str);
                P4Class p4Class = new P4Class();
                p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                p4Class.setStr(str.toString());
                p4Class.setLamp(lamp);
                p4Class.setDisplaySet((byte) 118);
                System.err.println(str1);
                list.add(p4Class);
                map.put(str1, list);
            }

            return  map;
        }else {
            return null;
        }

    }
    public synchronized Map<String, List<P4Class>>   rkMian(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        String soapXml = HttpClient.soapXml("4007");
        String reqXml = HttpClient.doPostSoap("http://10.1.68.60:8090/SPDWebService.asmx?wsdl", soapXml, "http://tempuri.org/DataExchange");
        Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
        System.err.println("rkrkkrkrkrkrkrkrkrkrkrk");
        Element root = xmlDocument.getRootElement();
        Element response = root.element("Body").element("DataExchangeResponse");
        Element result = response.element("DataExchangeResult");
        String resultXml = result.getText().trim();
        Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
        Element docRoot = resultXmlDocument.getRootElement();
        Element header = docRoot.element("HEADER");
        System.out.println(HttpClient.getMapByNode(header));
        List<Element> transList = docRoot.elements("TRANS");
        JSONObject headerJson = null;
        JSONObject transJson = null;
        headerJson = HttpClient.getMapByNode(header);
        String succeed = headerJson.getString("SUCCEED").toString();
        String message = headerJson.getString("MESSAGE").toString();
        if(!succeed.equals("0") ){
            for (int i = 0; i < transList.size(); i++) {
                transJson = HttpClient.getMapByNode(transList.get(i));
                String orderno = transJson.getString("ORDERNO");
                if(orderno.equals(ORDERNO2)){
                    str1 = ORDERNO2;
                }else if (orderno == null) {

                } else {
                    System.err.println("清空了");
                    ORDERNO2 = orderno;
                    str1 = ORDERNO2;
                    list = new ArrayList<>();
                }

                CREATEDATE = transJson.getString("CreateDate");
                String ITEMNAME = transJson.getString("ITEMNAME");
                String UNIT = transJson.getString("UNIT");
                String BATCHNO = transJson.getString("BATCHNO");
                String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                Integer PLANQTY = transJson.getInt("PLANQTY");
                String LOCATIONID = transJson.getString("LOCATIONID");
                String ITEMSPEC = transJson.getString("ITEMSPEC");
                String dzhgcolor = transJson.getString("DZHGCOLOR");
                Integer lamp = Integer.parseInt(dzhgcolor);
                CREATEDATE = "'"+CREATEDATE + "'";

                StringBuffer str = new StringBuffer();


                //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                System.err.println(str);
                P4Class p4Class = new P4Class();
                p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                p4Class.setStr(str.toString());
                p4Class.setLamp(lamp);
                p4Class.setDisplaySet((byte) 118);
                System.err.println(str1);
                list.add(p4Class);
                map.put(str1, list);
            }

            return  map;
        }else {
            return null;
        }
    }
    public synchronized Map<String, List<P4Class>>   pdMian(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        String soapXml = HttpClient.soapXml("4009");
        String reqXml = HttpClient.doPostSoap("http://10.1.68.60:8090/SPDWebService.asmx?wsdl", soapXml, "http://tempuri.org/DataExchange");
        System.err.println("pdpdpdpdpdpdpdpdpdppd");
        if(reqXml!=null) {
        Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
            Element root = xmlDocument.getRootElement();
            Element response = root.element("Body").element("DataExchangeResponse");
            Element result = response.element("DataExchangeResult");
            String resultXml = result.getText().trim();
            Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
            Element docRoot = resultXmlDocument.getRootElement();
            Element header = docRoot.element("HEADER");
            System.out.println(HttpClient.getMapByNode(header));
            List<Element> transList = docRoot.elements("TRANS");
            JSONObject headerJson = null;
            JSONObject transJson = null;
            headerJson = HttpClient.getMapByNode(header);
            String succeed = headerJson.getString("SUCCEED").toString();
            String message = headerJson.getString("MESSAGE").toString();
            if (!succeed.equals("0")) {
                for (int i = 0; i < transList.size(); i++) {
                    transJson = HttpClient.getMapByNode(transList.get(i));
                    String orderno = transJson.getString("ORDERNO");
                    if (orderno.equals(ORDERNO2)) {
                        str1 = ORDERNO2;
                    } else if (orderno == null) {

                    } else {
                        System.err.println("清空了");
                        ORDERNO2 = orderno;
                        str1 = ORDERNO2;
                        list = new ArrayList<>();
                    }
                    CREATEDATE = transJson.getString("CreateDate");
                    String ITEMNAME = transJson.getString("ITEMNAME");
                    String UNIT = transJson.getString("UNIT");
                    String BATCHNO = transJson.getString("BATCHNO");
                    String EXPIRYDATE = transJson.getString("EXPIRYDATE");
                    Integer PLANQTY = transJson.getInt("PLANQTY");
                    String LOCATIONID = transJson.getString("LOCATIONID");
                    String ITEMSPEC = transJson.getString("ITEMSPEC");
                    String dzhgcolor = transJson.getString("DZHGCOLOR");
                    Integer lamp = Integer.parseInt(dzhgcolor);
                    CREATEDATE = "'" + CREATEDATE + "'";
                    StringBuffer str = new StringBuffer();
                    //str.append(ITEMNAME + "," + UNIT + "," + BATCHNO + "," + EXPIRYDATE + "," + 55 + "," + PLANQTY + "," + UNIT + ",").toString();
                    str.append(ITEMNAME + "," + ITEMSPEC + "," + PLANQTY + "," + UNIT + ",").toString();
                    System.err.println(str);
                    P4Class p4Class = new P4Class();
                    p4Class.setAddr(Integer.valueOf(LOCATIONID.replace("-", "")));
                    p4Class.setStr(str.toString());
                    p4Class.setLamp(lamp);
                    p4Class.setDisplaySet((byte) 118);
                    System.err.println(str1);
                    list.add(p4Class);
                    map.put(str1, list);
                }

                return map;
            } else {
                return null;
            }
        }
        return null;

    }

}
