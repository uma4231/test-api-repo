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

WebUI.click(findTestObject('Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/form_LOGIN Panel                           _b98207'))

WebUI.setEncryptedText(findTestObject('Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Page_OrangeHRM/b_Leave'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img_From_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_12'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img_From_ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_30'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Scheduled_leaveListchkSearchFilter'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Employee_leaveListtxtEmployeeempName'), 'uma')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_AllSalesAdministrationITFinance'), '7', 
    true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Include Past Employees_btnSearch'))

WebUI.closeBrowser()

