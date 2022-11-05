package org.example;

import org.example.model.Root;

public class App
{



    public static void main( String[] args )
    {
        //DOMParser DOMParser = new DOMParser();
        // Root root = DOMParser.parse();
        SaxMyParser parser = new SaxMyParser();

        Root root = parser.parse();
        System.out.println(root.toString());
    }

}
