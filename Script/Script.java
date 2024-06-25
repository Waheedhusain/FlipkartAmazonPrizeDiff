package com.Script;

import java.awt.RenderingHints.Key;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.Generic.BaseClass;
import com.Generic.FileLibrary;
import com.Pom.HomePage;

	public class Script extends BaseClass{
		HomePage h = new HomePage(driver);
		
		@Test
		public void GetMobilePrice() throws IOException {
			FileLibrary f = new FileLibrary();
			String MobName = f.ReadDataFromProperty("MobileName");
			h.getSearchField().sendKeys(MobName);
			h.getSearchField().sendKeys(Keys.ENTER);
			
		}
	}
