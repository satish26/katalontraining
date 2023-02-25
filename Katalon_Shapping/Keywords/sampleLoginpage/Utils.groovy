package sampleLoginpage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import groovy.transform.CompileStatic


import internal.GlobalVariable

public class Utils {

	static int timeout = 60


	/**
	 * Click on select2 text box.
	 */
	@CompileStatic


	@Keyword
	def static clickOnSelect2(TestObject to) {
		findContainer(to).click()
	}

	/**
	 * Find the container class after the select element.
	 */
	@CompileStatic
	@Keyword
	static WebElement findContainer(TestObject to) {
		WebElement select2Element = WebUiCommonHelper.findWebElement(to, timeout)
		String subContainerClass ="./following-sibling::*[contains(@class,'container')]"
		return select2Element.findElement(By.xpath(subContainerClass))
	}

	/**
	 * Select the result after filling text search to select2 text box.
	 */
	@CompileStatic
	@Keyword
	def static selectResult(String option, String subContainerOpenClass) {
		WebDriver driver = DriverFactory.getWebDriver()
		String resultClass = "//li[contains(@class,'select2-results__option') and normalize-space(text())='" + option + "']"
		WebElement result = driver.findElement(By.xpath(subContainerOpenClass + resultClass))
		result.click()
	}

	/**
	 * Enter text search to the select2 text box.
	 */
	@CompileStatic
	@Keyword
	def static String enterText(String option) {
		WebDriver driver = DriverFactory.getWebDriver()
		String subContainerOpenClass = "//*[contains(@class,'container--open')]"
		WebElement searchBox =  driver.findElement(By.xpath(subContainerOpenClass + "//input"))
		searchBox.sendKeys(option)
		return subContainerOpenClass
	}
}
