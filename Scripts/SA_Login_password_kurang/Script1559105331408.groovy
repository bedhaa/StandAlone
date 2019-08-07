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

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.setText(findTestObject('StandAlone/1. Login/android.widget.EditText0 - User ID Anda'), 'doctorqa23@mailinator.com', 
    0)

Mobile.setText(findTestObject('StandAlone/1. Login/android.widget.EditText1 - Kata Sandi Anda'), 'qw', 0)

Mobile.tap(findTestObject('StandAlone/1. Login/android.widget.Button0 - Masuk'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)
