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

WebUI.callTestCase(findTestCase('Registrasi/regist tahap1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/p_Plaza 89, Kav. X7Jln'), 
    100, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/input_Saya sudah membaca dan setuju dengan_setujuKebijakan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/button_Lanjutkan2'))

WebUI.verifyElementVisible(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/label_Kamu sudah berhasil mendaftar sebagai Pemberi Dana'))

WebUI.verifyElementVisible(findTestObject('Page_Daftar Sebagai Pemberi Dana  ALAMI Peer-to-Peer Lending Syariah/label_TerimaKasih'))

