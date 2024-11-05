package wb;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        POMParser parser = new POMParser();
        Dependency[] dependencies = parser.getDependencies();
        for (Dependency dependency : dependencies) {
            System.out.println(dependency);
        }
    }
}