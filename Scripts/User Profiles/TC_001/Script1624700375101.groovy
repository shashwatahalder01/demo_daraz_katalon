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

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Homepage/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/User Profile/editDobGander/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input'), 
    '01307692610')

WebUI.setEncryptedText(findTestObject('Object Repository/User Profile/editDobGander/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input_1'), 
    'h/Sbbl5V15ksKyVwREnwng==')

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Daraz.com.bd Online Shopping Banglades_9a0738/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Homepage/span_Md Mahabub Hossain Shozibs account'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Homepage/a_Manage My Account'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Manage My Account/a_EDIT'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/i_Month_next-icon next-icon-arrow-down next_9c93f7'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/li_February'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/i_Day_next-icon next-icon-arrow-down next-i_e89980'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/li_25'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/i_Year_next-icon next-icon-arrow-down next-_a5df8f'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/li_1998'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/i_Select_next-icon next-icon-arrow-down nex_03a595'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/li_male'))

WebUI.click(findTestObject('Object Repository/User Profile/editDobGander/Page_Edit Profile/button_SAVE CHANGES'))

WebUI.closeBrowser()

