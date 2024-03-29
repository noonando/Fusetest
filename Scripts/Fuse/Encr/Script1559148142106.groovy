import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('http://uatfuse.clearlink.com')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Page_Clearlink Authentication/input_to Insurance_usr'), 'scott.patterson@clearlink.com')

WebUI.setText(findTestObject('Page_Clearlink Authentication/input_to Insurance_pwd'), 'Homer4ver')

WebUI.click(findTestObject('Page_Clearlink Authentication/button_Login'))

WebUI.click(findTestObject('Page_ Fuse (Scott Patterson)/a_ENCR'))

WebUI.switchToWindowIndex(1)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_Street Address _customer_addresses_primary_line1'), Address1)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_First Name _customer_first_name'), firstname)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_Last Name _customer_last_name'), lastname)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_ZipPostal Code _customer_addresses_primary_postal_code'), 
    Canandazip)

WebUI.selectOptionByIndex(findTestObject('Page_ Fuse (Scott Patterson)/select_AlbertaBritish ColumbiaManitobaNew BrunswickNewfoundland and LabradorNorthwest TerritoriesNova ScotiaNunavutOntarioPrince Edward IslandQuebecSaskatchewanYukon'), 
    2)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_City _customer_addresses_primary_city'), 'Townsville')

WebUI.click(findTestObject('Page_ Fuse (Scott Patterson)/label_Yes'), FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Page_ Fuse (Scott Patterson)/input_Email _customer_email'), 'test@mail.com')

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('EncrFolder/Page_ Fuse (Scott Patterson)/button_Next Encr'))

WebUI.delay(4)

WebUI.waitForPageLoad(16)

WebUI.closeBrowser()

