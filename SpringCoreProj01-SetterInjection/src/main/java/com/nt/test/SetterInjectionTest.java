//SetterInjectionTest.java
package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.sbeans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory beanFactory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(beanFactory);
		beanDefinitionReader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		WishMessageGenerator generator=beanFactory.getBean("wmg",WishMessageGenerator.class);
		String resultString=generator.showWishMessage("raja");
		System.out.println(resultString);
		}

}
