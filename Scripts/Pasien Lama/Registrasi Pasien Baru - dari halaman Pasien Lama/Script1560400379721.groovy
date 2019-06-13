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

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText0 - User ID Anda'), 'lilies.pbnd', 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText1 - Kata Sandi Anda'), 'qwerty123456', 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.ImageButton0'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.Button0 - Masuk'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.ImageButton0 (1)'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.RelativeLayout0'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.ImageButton0 (2)'), 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText0 - Nomor Rekam Medis'), '07', 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText1 - Nama Lengkap Pasien'), 'Adel', 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText2 - Tanggal Lahir'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.view.View4'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.LinearLayout5'), 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.Button0 - Selanjutnya'), 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText0 - Jumlah Gravida'), '2', 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText1 - Jumlah Para'), '1', 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText2 - Jumlah Abortus'), '0', 0)

Mobile.setText(findTestObject('StandAlone/3. Pasien Lama/android.widget.EditText3 - Usia Kehamilan'), '22', 0)

Mobile.tap(findTestObject('StandAlone/3. Pasien Lama/android.widget.Button0 - Periksa CTG Sekarang'), 0)

