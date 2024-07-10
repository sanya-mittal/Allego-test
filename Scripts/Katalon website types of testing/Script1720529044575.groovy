import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_Katalon AI-augmented Test Automation Platform/img_Book a call_insent-popup-card-close-icon'))

WebUI.waitForElementVisible(findTestObject('Object Repository/katalon website types of testing/Page_Katalon AI-augmented Software Quality _596167/div_Web Testing'), 
    30)

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_Katalon AI-augmented Software Quality _596167/div_Web Testing'))

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_Web Testing Made Simple  Katalon/div_API Testing'))

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_API Testing Made Simple  Katalon/div_Mobile Testing'))

WebUI.click(findTestObject('Object Repository/katalon website types of testing/Page_Mobile Testing Made Simple  Katalon/div_Desktop Testing'))

WebUI.closeBrowser()

