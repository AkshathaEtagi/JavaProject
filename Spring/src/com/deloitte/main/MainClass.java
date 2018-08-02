package com.deloitte.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.deloitte.pojo.HelloIndia;
import com.deloitte.pojo.HelloWorld;
import com.deloitte.pojo.Point;
import com.deloitte.pojo.SpellChecker;
import com.deloitte.pojo.TextEditor;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Point point1=(Point)context.getBean("pointBean");
		System.out.println("Point1 : " +point1);
		Point point2= (Point)context.getBean("pointBean");
		System.out.println("Point2 : "+point2);
		
	HelloWorld hello1 =(HelloWorld)context.getBean("hello1");
	hello1.getMessage1();
	hello1.getMessage2();
	
	HelloIndia helloI=(HelloIndia)context.getBean("hello2");
	helloI.getMessage1();
	helloI.getMessage2();
	helloI.getMessage3();
	
//	SpellChecker spch=(SpellChecker)context.getBean("sp");
	TextEditor txt=(TextEditor)context.getBean("tcdi");
	txt.spellCheck();
	TextEditor txt1=(TextEditor)context.getBean("tsdi");
	txt1.spellCheck();
	TextEditor txt2=(TextEditor)context.getBean("tawd");
	txt2.spellCheck();
	TextEditor txt3=(TextEditor)context.getBean("tawt");
	txt3.spellCheck();
	}

}
