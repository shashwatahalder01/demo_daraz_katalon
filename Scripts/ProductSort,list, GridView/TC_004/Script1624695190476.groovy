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

WebUI.setText(findTestObject('View/listView/Page_Homepage/input_EN  English_q'), 'laptop')

WebUI.click(findTestObject('View/listView/Page_Homepage/button_SEARCH'))

WebUI.click(findTestObject('View/listView/Page_laptop - Buy laptop at Best Price in B_301328/i_View_lzd-search-common-icon ic-common-lis_d287ad'))

String gridStyleURL = "https://www.daraz.com.bd/catalog/?_keyori=ss&from=input&q=laptop&spm=a2a0e.home.search.go.735279e0xcSw7J&style=wf"; 
String listStyleURL = "https://www.daraz.com.bd/catalog/?_keyori=ss&from=input&q=laptop&spm=a2a0e.home.search.go.735279e0xcSw7J&style=list";
//String a = "asdfg";
//String b = "asdfg"
//WebUI.verifyMatch(gridStyleURL, listStyleURL, false)
String currentUrl = WebUI.getUrl()
printf(currentUrl)

//assert currentUrl == listStyleURL : "url didn't matched "

assert currentUrl.contains("list");


WebUI.closeBrowser()

