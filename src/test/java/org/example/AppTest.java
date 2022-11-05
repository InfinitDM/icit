package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.example.model.Root;
import org.xml.sax.SAXException;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testParse() {
        SaxMyParser parser = new SaxMyParser();

        Root root = parser.parse();
        System.out.println(root.toString());
    }
    public void testApp()
    {
        assertTrue( true );
    }
}
