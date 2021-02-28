package com.exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sample.test.demo.TestBase;

public class SqeDemoTest extends TestBase {

	@Test
	public void HappyPath() throws InterruptedException {
		WebElement pizza1 = driver.findElement(By.id("pizza1Pizza"));
		Select SelectPizza1 = new Select(pizza1);
		SelectPizza1.selectByIndex(2);

		WebElement topping1 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']"));
		Select SelectTopping1 = new Select(topping1);
		SelectTopping1.selectByIndex(2);

		WebElement topping2 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']"));
		Select SelectTopping2 = new Select(topping2);
		SelectTopping2.selectByIndex(3);

		WebElement pizza1Quantity = driver.findElement(By.id("pizza1Qty"));
		pizza1Quantity.sendKeys("1");

		WebElement pizza1Cost = driver.findElement(By.id("pizza1Cost"));
		pizza1Cost.sendKeys("9.75");

		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("Mohammed Khan");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mohammed.khan.testng@gmail.com");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("5164516113");

		WebElement radioCash = driver.findElement(By.id("cashpayment"));
		radioCash.click();

		WebElement placeOrderButton = driver.findElement(By.id("placeOrder"));
		placeOrderButton.click();

		WebElement messageBox = driver.findElement(By.xpath("//*[@class='ui-button-icon ui-icon ui-icon-closethick']"));
		messageBox.click();

		WebElement resetButton = driver.findElement(By.id("reset"));
		resetButton.click();

	}

	@Test
	public void negativeTest() throws InterruptedException {
		WebElement pizza1 = driver.findElement(By.id("pizza1Pizza"));
		Select SelectPizza1 = new Select(pizza1);
		SelectPizza1.selectByIndex(3);

		WebElement topping1 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings1']"));
		Select SelectTopping1 = new Select(topping1);
		SelectTopping1.selectByIndex(2);

		WebElement topping2 = driver.findElement(By.xpath("//div[@id='pizza1']//select[@class='toppings2']"));
		Select SelectTopping2 = new Select(topping1);
		SelectTopping2.selectByIndex(3);

		WebElement pizza1Quantity = driver.findElement(By.id("pizza1Qty"));
		pizza1Quantity.sendKeys("1");

		WebElement pizza1Cost = driver.findElement(By.id("pizza1Cost"));
		pizza1Cost.sendKeys("9.75");

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("mohammed.khan.testng@gmail.com");

		WebElement phone = driver.findElement(By.id("phone"));
		phone.sendKeys("5164516113");

		WebElement radioCash = driver.findElement(By.id("cashpayment"));
		radioCash.click();

		WebElement placeOrderButton = driver.findElement(By.id("placeOrder"));
		placeOrderButton.click();

		WebElement resetButton = driver.findElement(By.id("reset"));
		resetButton.click();

		// Name validation

		String expected = "Missing name";
		String actual = driver.findElement(By.xpath("//div[@id='dialog']/p")).getText();
		Assert.assertTrue(actual.contains(expected));

	}

}
