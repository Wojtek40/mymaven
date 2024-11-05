package wb;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class POMParser {
    public Dependency[] getDependencies() throws IOException, SAXException, ParserConfigurationException {
        ArrayList<Dependency> listofdependencies = new ArrayList<>();

        DocumentBuilder builder =  DocumentBuilderFactory.newInstance().newDocumentBuilder();

        Document document = builder.parse(new File("pom.xml"));
        document.getDocumentElement().normalize();
        NodeList dependencies = document.getElementsByTagName("dependency");
        for (int i = 0; i < dependencies.getLength(); i++) {
            Node item = dependencies.item(i);
            item.normalize();
            XPath path = XPathFactory.newInstance().newXPath();


//            listofdependencies.add(new Dependency(artifactID, groupID, null));
        }
        return listofdependencies.toArray(new Dependency[0]);
    }
}
