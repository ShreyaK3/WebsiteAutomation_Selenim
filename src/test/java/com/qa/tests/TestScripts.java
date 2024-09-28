package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.basepage.TestBase;
import com.qa.pages.HomePage;

public class TestScripts extends TestBase{
	HomePage hp;
	public TestScripts() {
		super();
	}
	
	@Test
	public void testCase1() {
		initialization();
		hp=new HomePage();
		String homeText= hp.verfiyHomeButtonText();
		Assert.assertEquals(homeText," Home");
		
	}

}
