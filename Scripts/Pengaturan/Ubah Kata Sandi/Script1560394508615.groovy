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

Mobile.startApplication('C:\\Users\\Sehati-Adel\\Downloads\\CTG-SA.apk', true)

Mobile.setText(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.EditText0 - User ID Anda'), 'lilies.pbnd', 0)

Mobile.setText(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.EditText1 - Kata Sandi Anda'), 'qwerty12345', 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.ImageView0'), 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.FrameLayout3'), 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.EditText0 - Kata sandi baru'), 0)

Mobile.setText(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.EditText0 - Kata sandi baru (1)'), 'qwerty123456', 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.ImageButton0'), 0)

Mobile.setText(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.EditText1 - Konfirmasi kata sandi baru'), 'qwerty123456', 
    0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.ImageButton1'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.Button0 - Ubah Kata Sandi Saya'), 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.TextView0 - Kembali'), 0)

Mobile.tap(findTestObject('StandAlone/2. Ubah Kata Sandi/android.widget.Button0 - Keluar'), 0)

