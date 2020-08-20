package Service;

import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.dom4j.*;

import java.nio.charset.Charset;
import java.util.List;

/**
 * Http工具类
 */
public class HttpClient {

	/**
	 * 发起webservice请求
	 * @param url
	 * @param soapXml
	 * @param SOAPAction
	 * @return
	 *
	 */
	public static String doPostSoap(String url, String soapXml, String SOAPAction) {
		// 请求体
		String retStr = "";
		//
		int socketTimeout = 50000;
		int connectTimeout = 50000;
		// 创建HttpClientBuilder
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		// HttpClient
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();
		HttpPost httpPost = new HttpPost(url);
		// 设置请求和传输超时时间
		RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(socketTimeout)
				.setConnectTimeout(connectTimeout).build();
		httpPost.setConfig(requestConfig);
		try {
			httpPost.setHeader("Content-Type", "text/xml;charset=UTF-8");
			httpPost.setHeader("SOAPAction", SOAPAction);
			StringEntity data = new StringEntity(soapXml, Charset.forName("UTF-8"));
			httpPost.setEntity(data);
			CloseableHttpResponse response = closeableHttpClient.execute(httpPost);
			HttpEntity httpEntity = response.getEntity();
			if (httpEntity != null) {
				// 打印响应内容
				retStr = EntityUtils.toString(httpEntity, "UTF-8");
				// System.err.println("response:" + retStr);
			}
			// 释放资源
			closeableHttpClient.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return retStr;
	}

	/**
	 * 通过节点对象获取自身属性Map key 属性名 value 属性值
	 */
	public static JSONObject getMapByNode(Element node) {
		JSONObject para = new JSONObject();
		@SuppressWarnings({ "unchecked" })
		List<Attribute> defattrs = node.attributes();
		for (Attribute defattr : defattrs) {
			para.put(defattr.getName(), defattr.getValue());
		}
		return para;
	}

	/**
	 * 把xml字符串转换为Document对象
	 * 
	 * @param xmlStr
	 * @return document对象
	 */
	public static Document StrChangeToDocument(String xmlStr) {
		Document document = null;
		try {
			document = DocumentHelper.parseText(xmlStr);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return document;
	}

	public static String soapXml(String doc_type) {
		/**
		 * webService出库单数据获取请求体-----测试 DOC_TYPE = 4006 库存单数据获取接口请求端口 DOC_TYPE = 4007
		 * 入库单数据获取接口请求端口 DOC_TYPE = 4008 出库单数据获取接口请求端口 DOC_TYPE = 4009 盘点单数据获取接口请求端口
		 *
		 */
		StringBuffer strBuff = new StringBuffer(
				"<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tem=\"http://tempuri.org/\">");
		strBuff.append("<soapenv:Header/>");
		strBuff.append("<soapenv:Body>");
		strBuff.append("<tem:DataExchange>");
		strBuff.append("<!--Optional:-->");
		strBuff.append("<tem:inxml>");
		strBuff.append("<![CDATA[<DOC>");
		strBuff.append("<HEADER DOC_CODE=\"20180420112233101\" UPLOAD_ORG_CODE=\"211\" DOC_TYPE='" + doc_type
				+ "' TOTAL_RECORDS=\"1\" CREATE_TIME=\"2018-04-20 11:22:33\" />");
		strBuff.append("<TRANS requestor = \"万思翎电子货柜\" />");
		strBuff.append("</DOC>]]>");
		strBuff.append("</tem:inxml>");
		strBuff.append("</tem:DataExchange>");
		strBuff.append("</soapenv:Body>");
		strBuff.append("</soapenv:Envelope>");
		return strBuff.toString().trim();
	}
	
	
	/** 测试数据 **/
	public static String soapXmlCk() {
		/**
		 * webService出库单数据获取请求体-----测试 DOC_TYPE = 4006 库存单数据获取接口请求端口 DOC_TYPE = 4007
		 * 入库单数据获取接口请求端口 DOC_TYPE = 4008 出库单数据获取接口请求端口 DOC_TYPE = 4009 盘点单数据获取接口请求端口
		 *
		 */
		StringBuffer strBuff = new StringBuffer("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:test=\"http://test/\">");
		strBuff.append("<soapenv:Header/>");
		strBuff.append("<soapenv:Body>");
		strBuff.append("<test:getCk/>");
		strBuff.append("</soapenv:Body>");
		strBuff.append("</soapenv:Envelope>");
		return strBuff.toString().trim();
	}
	
	
	public static String soapXmlRk() {
		/**
		 * webService出库单数据获取请求体-----测试 DOC_TYPE = 4006 库存单数据获取接口请求端口 DOC_TYPE = 4007
		 * 入库单数据获取接口请求端口 DOC_TYPE = 4008 出库单数据获取接口请求端口 DOC_TYPE = 4009 盘点单数据获取接口请求端口
		 *
		 */
		StringBuffer strBuff = new StringBuffer("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:test=\"http://test/\">");
		strBuff.append("<soapenv:Header/>");
		strBuff.append("<soapenv:Body>");
		strBuff.append("<test:getRk/>");
		strBuff.append("</soapenv:Body>");
		strBuff.append("</soapenv:Envelope>");
		return strBuff.toString().trim();
	}
}
