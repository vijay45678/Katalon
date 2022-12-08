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

WebUI.setText(findTestObject('Add_quotation/Page_trisys POS  Login/input_Username_username'), 'nandan_pos@trisysit.com')

WebUI.click(findTestObject('Add_quotation/Page_trisys POS  Login/button_Sign In'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/a_Deal Mgmt'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/a_Quotation'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/button_Add Quotation'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/span_Search-contact'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/input__select2-search__field_Contact'), 'vijay')

WebUI.sendKeys(findTestObject('Add_quotation/Page_Trisys CRM/input__select2-search__field_Contact'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/span_Search-account'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/input__select2-search__field_account'), 'monster wheels')

WebUI.sendKeys(findTestObject('Add_quotation/Page_Trisys CRM/input__select2-search__field_account'), Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/input_Expiration Date_expiryDate_2'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/input_Expiration Date_expiryDate_2'), '15-12-2020')

not_run: WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/input_Quotation No_quotationNo'))

not_run: WebUI.doubleClick(findTestObject('Add_quotation/Page_Trisys CRM/input_Quotation No_quotationNo'), FailureHandling.STOP_ON_FAILURE)

Quotation = WebUI.getText(findTestObject('Add_quotation/Page_Trisys CRM/input_Quotation No_quotationNo'))

println(Quotation)

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/input_Quotation Title_title'))

Actual_Tax = WebUI.getText(findTestObject('Add_quotation/Page_Trisys CRM/tax'))

println(Actual_Tax)

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/input_Quotation Title_title'), 'Quotation for vijay')

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/span_Deal'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input__select2-search__field_deal'), 'monster wheels')

WebUI.sendKeys(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input__select2-search__field_deal'), Keys.chord(
		Keys.ENTER))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/span_Owner'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input_concat(id(, , select2-owner-container, , ))_select2-search__field_owner'),
	'nandan')

WebUI.sendKeys(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input_concat(id(, , select2-owner-container, , ))_select2-search__field_owner'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/span_Draft'))

WebUI.setText(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input_concat(id(, , select2-stage-container, , ))_select2-search__field_Stage'),
	'Draft')

WebUI.sendKeys(findTestObject('Add_quotation/Page_Trisys CRM/Page_Trisys CRM/input_concat(id(, , select2-stage-container, , ))_select2-search__field_Stage'),
	Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/a_4X4'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/a_Firestone 4x4'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/a_Firestone Destination AT GRIP'))

WebUI.click(findTestObject('Add_quotation/Page_Trisys CRM/td_26570R16'))

WebUI.doubleClick(findTestObject('Add_quotation/Page_Trisys CRM/button_Cancel'))

WebUI.verifyElementPresent(findTestObject('Add_quotation/Page_Trisys CRM/button_Add Quotation'), 0)

