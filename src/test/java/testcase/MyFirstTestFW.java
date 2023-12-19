package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirstTestFW extends BaseTest{

	@Test
	public static void SearchTest()
	{
		WebElement searchBar = driver.findElement(By.name("q"));
		searchBar.sendKeys("selenium");
		searchBar.sendKeys(Keys.ENTER);

     // Wait for the search results to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#search")));

        // Find the first link within the search results
        WebElement firstLink = driver.findElement(By.cssSelector("div#search a"));
        String firstLinkUrl = firstLink.getAttribute("href");
        System.out.println(firstLinkUrl);


        // Add the assertion to verify that the URL is equal to the expected value
        Assert.assertEquals(firstLinkUrl, "https://www.selenium.dev/", "The first link URL is not the expected value");
    }

	}


