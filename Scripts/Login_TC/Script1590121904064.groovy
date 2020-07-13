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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/')

WebUI.setText(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/form_LOGIN Panel                           _b98207'))

WebUI.setEncryptedText(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/img'))

WebUI.setText(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/input__timeemployeeName'), 'uma')

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/input__btnView'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/li_ Required field'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/li_ Required field'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/ol_Employee Name                         In_632ce6'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/li_ Required field'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/li_ Required field'))

not_run: WebUI.doubleClick(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/li_ Required field'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/b_PIM'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/b_Admin'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/a_Welcome Admin'))

WebUI.click(findTestObject('Object Repository/Login_OR/Page_OrangeHRM/a_Logout'))

WebUI.closeBrowser()

