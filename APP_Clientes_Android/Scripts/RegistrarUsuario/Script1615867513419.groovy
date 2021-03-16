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

Mobile.tap(findTestObject('Registro/android.widget.Button - Registrarme'), 0)

Mobile.delay(5)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText - Ingresa tu nombre'), 'Fernando', 0)

Mobile.takeScreenshot()

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText - Apellido paterno'), 'Martinez', 0)

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText - Apellido paterno (1)'), 'Quezada', 0)

Mobile.scrollToText('Mujer')

//selectSexo = findTestObject('Object Repository/Registro/android.widget.TextView - Hombre')

//selectSexo.findProperty('text').setValue('Mujer')

//selectSexo.findProperty('text').setActive(true)

Mobile.tap(findTestObject('Object Repository/Registro/android.widget.TextView - Hombre',['text']:'Mujer'), 0)

//Mobile.tap(selectSexo, 0)

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText - Ingresa tu nmero'), '8121715239', 0)

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText - Correo electrnico'), 'testing.syp@gmail.com', 
    0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Registro/android.widget.Button - Continuar'), 0)

Mobile.setText(findTestObject('Object Repository/Registro/android.widget.EditText'), 'Passw0rd$', 0)

Mobile.takeScreenshot()

Mobile.tap(findTestObject('Object Repository/Registro/android.widget.Button - Continuar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registro/android.widget.CheckBox - Acepto los trminos y condiciones'), 0)

Mobile.tap(findTestObject('Object Repository/Registro/android.widget.Button - Registrar'), 0)

Mobile.takeScreenshot()

Mobile.closeApplication()

