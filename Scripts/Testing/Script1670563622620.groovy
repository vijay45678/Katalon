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
for(def row=1;row<=findTestData('Data Files/Test Data').getRowNumbers();row++)
{

WebUI.navigateToUrl('https://trisyspos:9o$TRstr@apps.trisysit.com/pos/login')

//WebUI.setText(findTestObject('Object Repository/Login/Page_trisys POS  Login/input_Username_username'), Username)
WebUI.setText(findTestObject('Object Repository/Login/Page_trisys POS  Login/input_Username_username'),findTestData('Data Files/Test Data').getValue(2,row))
//WebUI.setText(findTestObject('Object Repository/Login/Page_trisys POS  Login/input_Password_password'), Password)
WebUI.setText(findTestObject('Object Repository/Login/Page_trisys POS  Login/input_Password_password'), findTestData('Data Files/Test Data').getValue(3,row))
}
WebUI.click(findTestObject('Object Repository/Login/Page_trisys POS  Login/button_Sign In'))

WebUI.closeBrowser()

