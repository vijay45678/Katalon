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

WebUI.navigateToUrl('https://trisyspos:9o$TRstr@apps.trisysit.com/pos/login')

for (def row = 1; row <= findTestData('login').getRowNumbers(); row++) {
    //WebUI.setText(findTestObject('Object Repository/login/Page_trisys POS  Login/input_Username_username'), username)
    WebUI.setText(findTestObject('Object Repository/login/Page_trisys POS  Login/input_Username_username'), findTestData(
            'login').getValue(2, row))

    //WebUI.setText(findTestObject('Object Repository/login/Page_trisys POS  Login/input_Password_password'), password)
    WebUI.setText(findTestObject('Object Repository/login/Page_trisys POS  Login/input_Password_password'), findTestData(
            'login').getValue(3, row))

    WebUI.click(findTestObject('Object Repository/login/Page_trisys POS  Login/button_Sign In'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/login/Page_Trisys CRM/button_Forecast'), 0)

    WebUI.click(findTestObject('Object Repository/login/Page_Trisys CRM/a_NandanR'))

    WebUI.click(findTestObject('Object Repository/login/Page_Trisys CRM/span_Logout'))
}

