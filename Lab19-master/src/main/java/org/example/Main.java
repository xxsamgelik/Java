package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void CreateXmlFile() throws TransformerException, ParserConfigurationException {

        ArrayList<Thema> izd = new ArrayList<Thema>();
        izd.add(new Thema(Type.городскойПейзаж, true, "Беларусь", 18, "Семенюк Роман Олегович", Valuable.историческая, Types.обычная));
        izd.add(new Thema(Type.люди, false, "Россия", 19, "Лукашонок Влад Александрович", Valuable.коллекционная, Types.рекламная));
        izd.add(new Thema(Type.религия, false, "Украина", 20, "Баробич Палиначка Сергевишна", Valuable.тематическая, Types.поздравительная));
        izd.add(new Thema(Type.спорт, true, "Беларусь", 18, "Ферезь Роман Олегович", Valuable.коллекционная, Types.обычная));
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.newDocument();
        Element rootElement = doc.createElement("OldCarts");
        doc.appendChild(rootElement);
        for(Thema a : izd) {
            try {

                Element childRoot = doc.createElement("oldCart");
                rootElement.appendChild(childRoot);

                Element thema = doc.createElement("Тема");
                childRoot.appendChild(thema);
                thema.setTextContent(String.valueOf(a.getThema()));

                Element type = doc.createElement("Тип");
                childRoot.appendChild(type);
                type.setTextContent(String.valueOf(a.getType()));

                Element send = doc.createElement("Отправка");
                childRoot.appendChild(send);
                send.setTextContent(String.valueOf(a.getActive()));

                Element country = doc.createElement("Страна");
                childRoot.appendChild(country);
                country.setTextContent(String.valueOf(a.getCountry()));

                Element year = doc.createElement("Год");
                childRoot.appendChild(year);
                year.setTextContent(String.valueOf(a.getYear()));

                Element author = doc.createElement("Автор");
                childRoot.appendChild(author);
                author.setTextContent(String.valueOf(a.getAuthor()));

                Element value = doc.createElement("Ценность");
                childRoot.appendChild(value);
                value.setTextContent(String.valueOf(a.getValue()));


                TransformerFactory transformerFactory =
                        TransformerFactory.newInstance();
                Transformer transformer =
                        transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result =
                        new StreamResult(new File("Thema.xml"));
                transformer.transform(source, result);

                System.out.println("File saved!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void ConvertXmlDocumentToPdf() throws ParserConfigurationException, IOException, SAXException {
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer(new StreamSource("test.xsl"));
            transformer.transform(new StreamSource("Thema.xml"), new StreamResult(new FileOutputStream(new File("output.html"))));
            System.out.println("Conversion completed successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ReadXmlFile() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

        Document doc = dBuilder.parse(new File("Thema.xml"));

        doc.getDocumentElement().normalize();

        System.out.println("Start element: " + doc.getDocumentElement().getNodeName() + "\n");


        NodeList nodeList = doc.getElementsByTagName("*");

        for (int i = 1; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                if(node.getNodeName() == "item")
                {
                    System.out.print("\t" + node.getNodeName() + ":" + node.getTextContent() + "\n" );
                }
                else {
                    System.out.print(node.getNodeName() + ":" + node.getTextContent() + "\n");
                }
            }
        }
    }
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException, SAXException {

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while(flag) {
            System.out.println("Enter 1 - write, 2 - convert, 3 - read, 4- break");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    CreateXmlFile();
                    break;
                case 2:
                    ConvertXmlDocumentToPdf();
                    break;
                case 3:
                    ReadXmlFile();
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }


    }
}