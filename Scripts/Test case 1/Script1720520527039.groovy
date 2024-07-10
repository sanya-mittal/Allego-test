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

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'Sanya')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'Rbh8quGg62E=')

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Demo account_form-control'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_18'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_18'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_18'))

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'This is a test')

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Go to Homepage'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.doubleClick(findTestObject('Object Repository/Page_CURA Healthcare Service/h1_CURA Healthcare Service'))

WebUI.closeBrowser()

