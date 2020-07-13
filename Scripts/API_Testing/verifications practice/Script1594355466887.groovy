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

res1 = WS.sendRequest(findTestObject('API/get_list'))

WS.verifyResponseStatusCode(res1, 200)

WS.comment('api status code is correct')

WS.concatenate(((['hello', 'uma', 'maheshwari']) as String[]))

def name = WS.concatenate(((['uma', '  maheshwari']) as String[]))

println(name)

/*first_name = WS.containsString(res1, 'Michael', false)

//here o/p will be printed as true bcz boolean will return true value into first_name variable as michael is there in response 
println(first_name)

WS.delay(2)

def ele1 = WS.getElementPropertyValue(res1, 'data[0].first_name')

println(ele1)

not_run: def ele2 = WS.getElementText(res1, 'first_name')

WS.getElementsCount('res1', '6')

//response = WS.getResponseStatusCode(res1)

//println(response)

//return true or false 
def a1 = WS.verifyElementPropertyValue(res1, 'data[0].first_name', 'Michael')

println(a1)

//return true or false
def a2 = WS.verifyElementText(res1, 'data[1].first_name', 'Lindsay')

not_run: WS.verifyElementsCount(res1, 'data', 6)

def res2 = res1.getResponseBodyContent()

WS.verifyResponseStatusCodeInRange(res1, 100, 204)*/
def e2 = WS.concatenate(((['sony', 'sam', 'gita']) as String[]))

def abc=WS.verifyElementsCount(res1, 'data', 6)
println(abc)
def count=WS.getElementsCount(res1, 'data')
println(count)
