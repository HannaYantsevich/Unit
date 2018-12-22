package com.epam.cdp.cal.tests;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.xml.XmlSuite;

import com.beust.testng.TestNG;
import com.epam.cdp.cal.listeners.TestListeners;

public class Runner {

	public static void main(String[] args) {
		TestNG testng = new TestNG();
		testng.addListener(new TestListeners());
		
		XmlSuite suite = new XmlSuite();
		suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));
		
		List<XmlSuite> suites = new ArrayList<>();
		suites.add(suite);
		
		testng.setXmlSuites(suites);
		testng.run();
	}
}
