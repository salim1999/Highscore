/**
 * Created by doumbsa on 22.12.2017.
 */
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
         XML test =new XML();
         XML.generateNodeList("C:\\Schule\\Modul 411\\XML\\XML.xml");
                for (int i=0;i<XML.list.getlength();i++){
Node node =test.findSubNode("ARTIST",XML.list.item(i));
NodeList textList=node.getChildNodes();
System.out.println("Artist="+textList.item(0).getNodeValue());
                }
    }



}
