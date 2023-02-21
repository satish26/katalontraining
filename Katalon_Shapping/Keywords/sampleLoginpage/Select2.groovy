package sampleLoginpage
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webui.common.WebUiCommonHelper

import org.openqa.selenium.JavascriptExecutor
import groovy.transform.CompileStatic


class Select2 {



	/**
	 * Select an option by label.
	 */
	@CompileStatic

	@Keyword
	static void selectOptionByLabel(TestObject to, String option) throws IOException {
		Utils.clickOnSelect2(to)
		String subContainerOpenClass = Utils.enterText(option)
		Utils.selectResult(option, subContainerOpenClass)
	}


	/**
	 * Select many options by labels. This method just applies for multiple value select boxes.
	 */
	@CompileStatic
	@Keyword
	static void selectManyOptionsByLabel(TestObject to, List<String> options) throws IOException {
		for (String option: options) {
			selectOptionByLabel(to, option)
		}
	}

	/**
	 * Get labels of selected options.
	 */
	@CompileStatic
	@Keyword
	static List<String> getSelectedOptionsLabel(TestObject to) throws IOException {
		List<WebElement> options = getSelectedOptionsList(to)
		List<String> labels = new ArrayList<>()
		for (WebElement option: options) {
			labels.add(option.getAttribute("title"))
		}
		KeywordUtil.logInfo("The selected options list is: " + labels)
		return labels
	}

	
	/**
	 * Get elements of selected options.
	 */
	@CompileStatic
	@Keyword
	static List<WebElement> getSelectedOptionsList(TestObject to) throws IOException {
		List<WebElement> options = new ArrayList<>()
		WebElement subContainerClass = Utils.findContainer(to)
		if (WebUI.getAttribute(to, "class").contains("multiple")){
			options = subContainerClass.findElements(By.xpath(".//li[contains(@class,'choice')]"))
		}
		else {
			WebElement option = subContainerClass.findElement(By.xpath(".//*[@role='textbox']"))
			options.add (option)
		}
		return options
	}

	/**
	 * Get labels of all options.
	 */
	@CompileStatic
	@Keyword
	static List<String> getAllOptionsLabel(TestObject to) throws IOException {
		List<String> result = new ArrayList<>()
		WebElement select2Element = WebUiCommonHelper.findWebElement(to, Utils.timeout)
		List options = select2Element.findElements(By.xpath(".//option"))
		for (WebElement option: options) {
			result.add(option.getText())
		}
		KeywordUtil.logInfo("The list of options is: " + result)
		return result
	}

	
	
	
	/**
	 * Remove selected options. This method just applies for multiple value select boxes.
	 */
	@CompileStatic
	@Keyword
	static void removeOptions(TestObject to, List<String> options) throws IOException {
		List<String> result = new ArrayList<>()
		WebElement select2Element = WebUiCommonHelper.findWebElement(to, Utils.timeout)
		List<String> selectedOptionsLabel = getSelectedOptionsLabel(to)
		for (String option: options) {
			if (selectedOptionsLabel.contains(option)){
				removeOption(to,option)
			}
		}
	}

	/**
	 * Remove one selected option. This method just applies for multiple value select boxes.
	 */
	@CompileStatic
	static void removeOption(TestObject to, String option) throws IOException {
		List<WebElement> selectedOptionsList = getSelectedOptionsList(to)
		for (WebElement selectedOption: selectedOptionsList){
			if (selectedOption.getAttribute("title").contains(option)){
				selectedOption.findElement(By.xpath(".//*[contains(@class,'remove')]")).click()
				break
			}
		}
	}
}