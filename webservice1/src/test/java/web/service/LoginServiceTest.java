package web.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginServiceTest {

	private void sleep(long sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void checkAll() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);
		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2003-03-30");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkUsername() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("abcdefgh");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2002-7-25");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkPassword() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("anything");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2000-8-5");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkDOB() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("anything");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("abcdefgh");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2003-03-30");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkUsernameAndPassword() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2003-05-14");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkUsernameAndDOB() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("ahsan");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("abcdefgh");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2003-03-30");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkPasswordAndDOB() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("anything");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("ahsan_pass");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("2003-03-30");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}

	@Test
	public void checkAllInvalid() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ishik\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);

		driver.navigate()
				.to("D:\\Assessments & Quiz\\Software Quality and Testing\\8.1P\\8.1P-resources\\pages\\login.html");
		sleep(5);

		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys("anything");

		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys("abcdefgh");

		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys("1999-09-5");

		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();

		sleep(5);

		String title = driver.getTitle();
		System.out.println("Title: " + title);

		Assert.assertEquals(title, "fail");

		driver.close();
	}
}
