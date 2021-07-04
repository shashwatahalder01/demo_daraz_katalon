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

WebUI.navigateToUrl('https://www.daraz.com.bd/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Homepage/a_Signup  Login'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/a_Register'))

WebUI.setText(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input'), 
    'asdfgh123')

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/span_Month'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/li_January'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/i_Day_next-icon next-icon-arrow-down next-i_e89980'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/li_03'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/i_Year_next-icon next-icon-arrow-down next-_a5df8f'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/li_1990'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/i_Select_next-icon next-icon-arrow-down nex_03a595'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/li_male'))

WebUI.setText(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input_1'), 
    'Asif Rouf')

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/button_SIGN UP'))

WebUI.click(findTestObject('Object Repository/SignUpWithoutPhone/Page_Daraz.com.bd Online Shopping Banglades_9a0738/div_Please enter the sms code'))

WebUI.closeBrowser()

