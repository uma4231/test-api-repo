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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.delay(3)

WebUI.click(findTestObject('cura/make appointment'))

WebUI.setText(findTestObject('cura/username'), 'John Doe')

WebUI.setText(findTestObject('cura/password'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('cura/Login'))

WebUI.selectOptionByIndex(findTestObject('cura/facility_dropdown'), 2)

WebUI.check(findTestObject('cura/checkbox in makeappoint page'))

WebUI.delay(2)

WebUI.uncheck(findTestObject('cura/checkbox in makeappoint page'))

WebUI.check(findTestObject('cura/radio btn in make app page'))

WebUI.delay(1)

WebUI.setText(findTestObject('cura/comment_Makeapp'), 'Hello World')

WebUI.selectOptionByValue(findTestObject('cura/facility_dropdown'), 'Hongkong CURA Healthcare Center', false)

WebUI.delay(1)

WebUI.clearText(findTestObject('cura/comment_Makeapp'))

WebUI.click(findTestObject('cura/Calender'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('cura/Date'))

WebUI.getText(findTestObject('cura/Date textbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('cura/Book APpointment'))

WebUI.getUrl()

WebUI.click(findTestObject('cura/icon for logout'))

WebUI.click(findTestObject('cura/logout'))

WebUI.closeBrowser()

