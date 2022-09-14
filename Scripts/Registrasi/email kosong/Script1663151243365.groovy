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

WebUI.openBrowser(GlobalVariable.url)

WebUI.click(findTestObject('Page_Login  ALAMI Peer-to-Peer Lending Syariah/button_Daftar disini'))

WebUI.click(findTestObject('Page_ALAMI Daftar  ALAMI Peer-to-Peer Lending Syariah/icon_Pemberi Dana'))

WebUI.setText(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_Nama'), 'Heru Apriatama')

WebUI.setText(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_No. Handphone_phone'), 
    '081288477287')

WebUI.setText(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_Password'), 'P@ssw0rd12ed')

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/label_Individual'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/button_Lanjutkan'))

WebUI.verifyElementVisible(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/label_Bagian ini harus diisi_email'))

WebUI.closeBrowser()

