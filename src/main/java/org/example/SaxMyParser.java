package org.example;
import org.example.model.Root;
import org.xml.sax.SAXException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxMyParser {
    public Root parse(){
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SaxParserHandler handler = new SaxParserHandler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception e) {
            System.out.println("OPen sax parser error " +e.toString());
            return null;
        }

        File file = new File("test.xml");
        try {
            parser.parse(file,handler);
        } catch (SAXException e) {
            System.out.println("sax parser error " +e.toString());
            return null;
        } catch (IOException e) {
            System.out.println("io parser error " +e.toString());
            return null;
        }

        return handler.getRoot();
    }
}
