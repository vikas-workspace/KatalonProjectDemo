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

WebUI.navigateToUrl('https://naveenautomationlabs.com/opencart/index.php?route=account/login')

WebUI.click(findTestObject('Page_Account Login/a_Continue'))

WebUI.verifyTextPresent('', false)

WebUI.setText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_First Name_firstname'), 'Vikas')

WebUI.setText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Last Name_lastname'), 'Khandelote')

WebUI.setText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_E-Mail_email'), 'khandelotevikas@gmail.com')

WebUI.setText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Telephone_telephone'), '9975760976')

WebUI.setEncryptedText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Password_password'), 'HYDeB37nqbRB8QtMa64mtQ==')

WebUI.setEncryptedText(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Password Confirm_confirm'), 'HYDeB37nqbRB8QtMa64mtQ==')

WebUI.click(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Privacy Policy_agree'))

WebUI.click(findTestObject('TC2_RegisterAccount/Page_Register Account/input_Privacy Policy_btn btn-primary'))

