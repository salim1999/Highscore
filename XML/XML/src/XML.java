import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
public class XML {
    XML(){

    }
    public static NodeList generateNodeList(String filename){
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db;
        Document doc = null;
        try {
            db=dbf.newDocumentBuilder();
            doc=db.parse(new File(filename));

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        doc.getDocumentElement().normalize();
        NodeList cdElements=doc.getElementsByTagName("CD");
        return cdElements;
    }
    public Node findSubNode(String name, Node node){
        NodeList list =node.getChildNodes();
        for (int i=0;i<list.getLength();i++){
            Node subnode =list.item(i);
            if (subnode.getNodeType()==Node.ELEMENT_NODE){
                if (subnode.getNodeName().equals(name)){
                    return subnode;
                }
            }


        }
    }

}