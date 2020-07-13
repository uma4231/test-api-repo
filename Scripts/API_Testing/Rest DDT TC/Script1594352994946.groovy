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
import groovy.json.JsonOutput as JsonOutput

println('using username->' + username)

println('using desegnation->' + desegnation)

res1 = WS.sendRequest(findTestObject('RestDataDriven/Post', [('username') : username, ('desegnation') : desegnation]))

def output = JsonOutput.toJson([res1])
println(output)
WS.containsString(res1, 'uma', false)
//println(res1.responseText)
//responseText
/*def nameresult1 = WS.getElementPropertyValue(res1, 'name')
println(nameresult1)
def v1 = WS.verifyElementPropertyValue(res1, 'name', username)
println(v1)
def nameresult2 = WS.getElementPropertyValue(res1, 'job')
println(nameresult2)

def v2 = WS.verifyElementPropertyValue(res1, 'job', desegnation)
println(v2)*/

