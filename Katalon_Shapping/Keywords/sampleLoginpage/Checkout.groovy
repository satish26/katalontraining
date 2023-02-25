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

public class Checkout {

	@Keyword
	def static void CheckoutShoplistpage(String firstname, String lastname, String companyname, String Country, String address, String postcode, String city, String Phone){

		WebUI.click(findTestObject('Object Repository/Checkout page/linkCheckout'))

		WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout page/txtFirstname'), GlobalVariable.waitPresentTimeout)

		WebUI.setText(findTestObject('Object Repository/Checkout page/txtFirstname'), firstname)

		WebUI.setText(findTestObject('Object Repository/Checkout page/txtLastname'), lastname)
		WebUI.waitForElementVisible(findTestObject('Object Repository/Checkout page/inputCompanyName'), GlobalVariable.waitPresentTimeout)

		WebUI.setText(findTestObject('Object Repository/Checkout page/inputCompanyName'), companyname)

		//WebUI.selectOptionByLabel(findTestObject('Object Repository/Checkout page/inputCountry'), Country)

		Select2.selectOptionByLabel(findTestObject('Object Repository/Checkout page/Select2/selectCountry'), Country)
		Select2.getAllOptionsLabel(findTestObject('Object Repository/Checkout page/Select2/selectCountry'))
		Select2.getSelectedOptionsLabel(findTestObject('Object Repository/Checkout page/Select2/selectCountry'))



		WebUI.setText(findTestObject('Object Repository/Checkout page/inputAddress'), address)

		WebUI.setText(findTestObject('Object Repository/Checkout page/inputPostcode'), postcode)

		WebUI.setText(findTestObject('Object Repository/Checkout page/inputTownCity'), city)

		WebUI.setText(findTestObject('Object Repository/Checkout page/inputTownCity'), Phone)

		//WebUI.setText(findTestObject('Object Repository/Checkout page/inputTownCity'), email)

		//WebUI.setText(findTestObject('Object Repository/Checkout page/inputTownCity'), ordernotes)


	}
}
