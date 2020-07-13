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

res1 = WS.sendRequest(findTestObject('API/get_list'))

count = WS.getElementsCount(res1, 'data')

println('number of elements through keyword are' + count)

if (count == 6) {
    println('number of elements through if loop are:' + count)
} else {
    println('number of elements are not identified')
}

result = WS.verifyElementsCount(res1, 'data', 6)

println(result)

result1 = WS.verifyEqual(6, 6)

println(result1)

result2 = WS.getElementsCount(res1, 'data')

println(result2)

result3 = WS.verifyGreaterThan(result2, 5)

println(result3)

result4 = WS.verifyGreaterThan('first_name', 3)

println(result4)

