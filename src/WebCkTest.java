import JavaExample.EslTest;
import Service.HttpClient;
import entity.P4Class;
import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebCkTest {
    public  void   ckMian(){
        List<P4Class> list = new ArrayList<>();
        Map<String, List<P4Class>> map = new HashMap<String, List<P4Class>>();
        String soapXml = HttpClient.soapXml("4008");
        String reqXml = HttpClient.doPostSoap("http://10.1.68.60:8083/SPDWebService.asmx?wsdl", soapXml, "http://tempuri.org/DataExchange");
        Document xmlDocument = HttpClient.StrChangeToDocument(reqXml);
        System.err.println("欢迎出库");
        Element root = xmlDocument.getRootElement();
        Element response = root.element("Body").element("DataExchangeResponse");
        Element result = response.element("DataExchangeResult");
        String resultXml = result.getText().trim();
        System.out.println(resultXml);
        Document resultXmlDocument = HttpClient.StrChangeToDocument(resultXml);
        Element docRoot = resultXmlDocument.getRootElement();
        Element header = docRoot.element("HEADER");
        List<Element> transList = docRoot.elements("TRANS");
        JSONObject headerJson = null;
        JSONObject transJson = null;
        headerJson = HttpClient.getMapByNode(header);
        String succeed = headerJson.getString("SUCCEED").toString();
        String message = headerJson.getString("MESSAGE").toString();
        if(!succeed.equals("0") ) {
            for (int i = 0; i < transList.size(); i++) {
                transJson = HttpClient.getMapByNode(transList.get(i));
                //System.err.println(transJson);
            }
        }
    }

    public static void main(String[] args) {
        WebCkTest test=new WebCkTest();
        test.ckMian();

    }
}
