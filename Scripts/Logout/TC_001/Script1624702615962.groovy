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

WebUI.click(findTestObject('Object Repository/Logout/Page_Homepage/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Logout/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input'), '01307692610')

WebUI.setEncryptedText(findTestObject('Object Repository/Logout/Page_Daraz.com.bd Online Shopping Banglades_9a0738/input_1'), 
    'h/Sbbl5V15ksKyVwREnwng==')

WebUI.click(findTestObject('Object Repository/Logout/Page_Daraz.com.bd Online Shopping Banglades_9a0738/button_LOGIN'))

WebUI.verifyTextPresent('MD MAHABUB HOSSAIN SHOZIB\'S ACCOUNT', false)

WebUI.click(findTestObject('Object Repository/Logout/Page_Homepage/span_Md Mahabub Hossain Shozibs account'))

WebUI.click(findTestObject('Object Repository/Logout/Page_Homepage/a_Logout'))

WebUI.verifyTextPresent('SIGNUP / LOGIN', false)

