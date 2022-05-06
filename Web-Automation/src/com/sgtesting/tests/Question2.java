package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
		private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimise();
			createUser();
			modifyUser();
			deleteUser();
			logout();
			closeApplication();
			
		}
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumAutomation\\New folder\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimise()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User");
				oBrowser.findElement(By.name("lastName")).sendKeys("Demo1");
				oBrowser.findElement(By.name("email")).sendKeys("User.Demo@gmail.com");
				oBrowser.findElement(By.name("username")).sendKeys("UserName1");
				oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifyUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Demo1, User']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("firstName")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("firstName")).sendKeys("User Modified");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("lastName")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("lastName")).sendKeys("Demo Modified");
				Thread.sleep(1000);
				oBrowser.findElement(By.name("username")).clear();
				Thread.sleep(1000);
				oBrowser.findElement(By.name("username")).sendKeys("UserNameModified");
				Thread.sleep(1000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
				Thread.sleep(4000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser()
		{
			try
			{
				oBrowser.findElement(By.xpath("//span[text()='Demo1Demo Modified, UserUser Modified']")).click();
				Thread.sleep(1000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(1000);
				Alert oAlert=oBrowser.switchTo().alert();
				oAlert.accept();
				Thread.sleep(3000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
	            Thread.sleep(2000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try
			{
				oBrowser.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

