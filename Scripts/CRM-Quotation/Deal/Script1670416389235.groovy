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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/deal/Page_trisys POS  Login/div_Username                               _81067a'))

WebUI.setText(findTestObject('Object Repository/deal/Page_trisys POS  Login/input_Username_username'), 'nandan_pos@trisysit.com')

WebUI.click(findTestObject('Object Repository/deal/Page_trisys POS  Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/a_Deal Mgmt'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/a_Deal'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/button_NewDeal'))

WebUI.setText(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input__dealName'), '1234567')

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/button_Products_btn btn-default btng-right'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input_ALENZA 001 RFT_id_product_011d7de5-47_55bb2f'))

WebUI.setText(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input_Deal Description_dealDescription'), '98876543')

WebUI.setText(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input__dealAmount'), '45999')

WebUI.selectOptionByValue(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/select_LowMediumHigh'), 'Medium',
	true)

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/i_Associate With Account Records_fa fa-search'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input_Wilkswage_id_account_30149379-fd28-4b_d72bbb'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/i_Associate With Contact Records_fa fa-search'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/input_Associate With Contact Records_id_con_8b5b60'))

WebUI.click(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/button_Create Deal'))

WebUI.verifyElementPresent(findTestObject('Object Repository/deal/deal2/Page_Trisys CRM/h3_Deals'), 0)

