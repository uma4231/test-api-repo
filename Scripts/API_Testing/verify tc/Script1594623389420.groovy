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

res1 = WS.sendRequest(findTestObject('API/post_create'))

def result1 = WS.getElementPropertyValue(res1, 'id')

println(result1)

WS.verifyGreaterThan(result1, 2)

res2 = WS.sendRequest(findTestObject('API/get_list'))

result2 = WS.getElementsCount(res2, 'data')

println(result2)

WS.verifyGreaterThanOrEqual(result2, 5)

result3 = WS.verifyGreaterThanOrEqual(result2, 6)

println(result3)

WS.verifyLessThan(GlobalVariable.getcount, 10)

WS.verifyLessThan(getcountlocal, 6)

WS.verifyLessThanOrEqual(result2, 6)

WS.verifyLessThan(result2, 10)

result4 = WS.getElementPropertyValue(res2, 'data[1].email')

WS.verifyMatch(result4, 'lindsay.ferguson@reqres.in', false)

WS.verifyNotMatch('result4', 'ferguson@reqres.in', false)

WS.verifyNotMatch('result4', 'lindsay.ferguson@reqres.in', true)

WS.verifyNotEqual(result4, 'lindsay.ferguson@reqres.in')

