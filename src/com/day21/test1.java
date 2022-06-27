package com.day21;

import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class test1 {

	public static void main(String[] args) {

		try {

			// DOM Document 객체를 생성하기위한 팩토리 생성
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			DocumentBuilder parser = f.newDocumentBuilder();

			// (Dom parser에서 받아온)입력받은 파일을 파싱하도록 요청
			Document xmlDoc = null;

			String url = "book.xml";

			if (url.indexOf("https://") != -1) {

				URL u = new URL(url);
				InputStream is = u.openStream();
				xmlDoc = parser.parse(is);

			} else {
				xmlDoc = parser.parse(url);
			}

			// Element : xml문서의 요소를 표현하기 위해 사용한다.
			Element root = xmlDoc.getDocumentElement();
			System.out.println(root.getTagName()); // root : booklist

			// 첫번째 book
			// Node : 각 요소를 읽기위해 사용한다.
			Node book1 = root.getElementsByTagName("book").item(0); // book1 : book(컴퓨터)
			System.out.println(((Element) book1).getAttribute("kind")); // Element로 다운케스팅후 출력

			Node title = book1.getFirstChild(); // title = title
			Node title1 = title.getNextSibling();
			System.out.println(title1.getNodeName());
			Node title1_1 = title1.getFirstChild();
			System.out.println(title1_1.getNodeValue());

			String out = "";
			String str = "";

			NodeList books = root.getElementsByTagName("book");

			for (int i = 0; i < books.getLength(); i++) {

				Node book = books.item(i);
				str = book.getNodeName();

				out += "노드명:" + str;

				NamedNodeMap bookMap = book.getAttributes();
				str = bookMap.getNamedItem("kind").getNodeValue();

				out += ",kind:" + str;

				NodeList elementList = book.getChildNodes();

				for (int j = 0; j < elementList.getLength(); j++) {

					Node e = elementList.item(j);
					str = "";
					if (e.getNodeType() == Node.ELEMENT_NODE) {
						str = ", " + e.getNodeName();
						out += str + ":";
						out += e.getChildNodes().item(0).getNodeValue();
					}
				}

				out += "\n";

			}

			System.out.println(out);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
