package com.shaan.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class CL {
public static void main(String[] args) {
	
	/*Resource r=new ClassPathResource("/com/shaan/springcore/Spring-core1.xml");
	BeanFactory bf=new XmlBeanFactory(r);
	A ob=(A)bf.getBean("a");
	ob.m();
	System.out.println(ob.getAdd());*/
	 
	
	  ApplicationContext cnxt=new ClassPathXmlApplicationContext("/com/shaan/springcore/Spring-core1.xml");
	   
	  A ob=(A)cnxt.getBean("rani");
	  ob.m(); 
	  System.out.println(ob.getAdd());
	   B b=ob.getB();
	   b.m1();
	  
	  
	 
	}

}
