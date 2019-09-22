import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import org.openqa.selenium.By
import org.openqa.selenium.Keys
import plp.Resources
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable


//@Author :Amit Baghel
WebUI.setText(findTestObject('Object Repository/CompareFunctionality/input_Select another product_selectpro'), 'LG')

WebUI.click(findTestObject('Object Repository/CompareFunctionality/li_LG G4 32 GB Brown (3 GB RAM)'))

WebUI.setText(findTestObject('Object Repository/CompareFunctionality/input_Select another product_selectpro'), 'LG G4 32 GB Brown (3 GB RAM)')

WebUI.click(findTestObject('Object Repository/CompareFunctionality/a_Add Product'))

Resources.incrementnoOfProducts();

Thread.sleep(3000)

WebUI.setText(findTestObject('Object Repository/CompareFunctionality/input_Select another product_selectpro_6'), 'iphone')

Thread.sleep(3000)

WebUI.sendKeys(findTestObject("Object Repository/CompareFunctionality/input_Select another product_selectpro_6"), Keys.chord(Keys.ARROW_DOWN,Keys.ENTER))

//WebUI.setText(findTestObject('Object Repository/CompareFunctionality/input_Select another product_selectpro_7'), 'iPhone xr')

WebUI.click(findTestObject('Object Repository/CompareFunctionality/a_Add Product'))

Resources.incrementnoOfProducts();


