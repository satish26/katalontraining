package sampleLoginpage

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.codehaus.groovy.tools.shell.completion.KeywordSyntaxCompletor

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

public class Login {

	@Keyword
	def static void loginIntoApplication(String url, String username, String password){
		WebUI.delay(5)
		WebUI.openBrowser(url)
		WebUI.delay(10)
		WebUI.waitForPageLoad(GlobalVariable.waitPresentTimeout)
		WebUI.maximizeWindow()

		WebUI.waitForElementVisible(findTestObject('Object Repository/MyAccountdetails/nav_Homepage'), GlobalVariable.waitPresentTimeout)

		WebUI.sendKeys(findTestObject('Object Repository/MyAccountdetails/UsernameOrEmail'), username)
		WebUI.sendKeys(findTestObject('Object Repository/MyAccountdetails/Password'), password)
		WebUI.click(findTestObject('Object Repository/MyAccountdetails/btnLogin'))
		WebUI.delay(1)
	}

	@Keyword
	def static void loginIntoApplicationWithGlobalVariable(){
		loginIntoApplication(GlobalVariable.url, GlobalVariable.username, GlobalVariable.password)
	}
}


