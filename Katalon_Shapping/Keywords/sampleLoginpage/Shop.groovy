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

import internal.GlobalVariable

public class Shop {


	@Keyword
	def static void navigatetoDetailsPage(String productName, String urlProduct){
		String temp = '/'+productName.replace(" ", "-").toLowerCase()
		String urlDetail = urlProduct + temp
		WebUI.navigateToUrl(urlDetail)
	}

	@Keyword
	def static void addToCart(String productName, String urlProduct){
		navigatetoDetailsPage(productName, urlProduct)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Shopping page/btnAddToCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Shopping page/btnAddToCart'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Shopping page/btnViewCart'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Shopping page/btnViewCart'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Shopping page/btnProceed'), GlobalVariable.waitPresentTimeout)
		WebUI.click(findTestObject('Object Repository/Shopping page/btnProceed'))
	}
}
