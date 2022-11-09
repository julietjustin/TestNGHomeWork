package com.obsqura.TestNGSample;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebElementCommands extends Base{
	@Test(description="Single Input Field Obsqura demo page")
	public void sendKeySample(){
		String inputMessage="Apple",outputMessage;
		boolean flag=false;
		driver.findElement(By.xpath("//input[@id='single-input-field']")).sendKeys("Apple");
		driver.findElement(By.xpath("//button[@id='button-one']")).click();
		outputMessage=driver.findElement(By.xpath("//div[@id='message-one']")).getText();
		//Your Message : Apple
		if(outputMessage.equals("Your Message : "+inputMessage)) {
			flag=true;
		}
		Assert.assertTrue(flag,"not same");
	}
	@Test(description="Two Input Fields(giving numbers in that field) Obsqura demo page")
	public void twoInputFieldWithIntegers(){
		String outputValue;
		String s="5",t="10";
		int i=Integer.parseInt(s);//converting integer to string value
		int j=Integer.parseInt(t);
		int inputValue=i+j;
		boolean flag=false;
		driver.findElement(By.xpath("//input[@id='value-a']")).sendKeys(s);
		driver.findElement(By.xpath("//input[@id='value-b']")).sendKeys(t);
		driver.findElement(By.xpath("//button[@id='button-two']")).click();
		outputValue=driver.findElement(By.xpath("//div[@id='message-two']")).getText();
		if(outputValue.equals("Total A + B : "+inputValue)){
			flag=true;
		}
		Assert.assertTrue(flag,"The value not matching");
	}
	@Test(description="Two Input Fields(giving characters in that field) Obsqura demo page")
	public void twoInputFieldWithCharacters(){
		String c="hi",d="hello",inputValue=" NaN",outputValue;
		boolean flag=false;
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(c);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(d);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		outputValue=driver.findElement(By.xpath("(//div[@class='my-2'])[2]")).getText();
		if(outputValue.equals("Total A + B :"+inputValue)) {
			flag=true;
		}
		Assert.assertTrue(flag, "Not Same");
	}
}


