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

'dibuat disable untuk running test suites, jika akan digunakan klik ctrl +alt + /'
not_run: WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.PAGE_DOWN))

WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos - Katalog/span_Daftar Produk'))

'dibuat disable karena ketika running test suites popup tidak muncul. jika akan digunakan klik ctrl + alt + /'
not_run: WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos/button_LAIN KALI'))

WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos/span_Filter'))

WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos/span_Semua Wilayah'))

WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos/label_Kota Jakarta Pusat, DKI Jakarta'))

WebUI.click(findTestObject('Object Repository/OR_Filter/Page_Evermos/button_Simpan'))

WebUI.click(findTestObject('OR_Filter/Page_Evermos/button_Terapkan'))

not_run: WebUI.closeBrowser()

