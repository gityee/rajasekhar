package com.screenfunctions;

import java.util.List;
import java.util.list;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_Search {

	public static void main(String[] args)

	{

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://in.search.yahoo.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("hello");

		List<WebElement> allLi = driver.findElements(By.xpath("//ul[@class='sa-tray-list-container']/li"));
		int size=allLi.size();
		//System.out.println(size);

		for (int i = 0; i < allLi.size() - 1; i++) {
			String s = allLi.get(i).getText();
			System.out.println(s);
		}

	}
}
