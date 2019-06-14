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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.EditText0 - User ID Anda'), 'uus@gmail.com', 
    0)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.EditText1'), 'qwerty', 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.RelativeLayout1'), 0)

String charset = ('0'..'9').join()
Integer length = 16
String rekammedis = RandomStringUtils.random(length, charset.toCharArray())

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.EditText0 - Nomor Rekam Medis'), rekammedis, 
    0)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.EditText1 - Nama Lengkap Pasien'), 'Rudi tabuti', 
    0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.EditText2 - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.Button0 - Pilih'), 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/android.widget.Button0 - Selanjutnya'), 0)

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_gravida'), 0)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_gravida'), '2', 0, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_para'), '1', 0)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_abortus'), '0', 0)

Mobile.setText(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_usia'), '30', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('StandAlone/2. Registrasi Pasien/regpasien_buttonCTG'), 0)

