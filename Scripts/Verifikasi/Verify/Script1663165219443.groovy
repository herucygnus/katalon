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

WebUI.setText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_username'), 
    'heru.cygnus@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/input_Assalamualaikum_password'), 
    'ajnBIEOt+0Oc4x6a1ru27A==')

WebUI.click(findTestObject('Object Repository/Page_Login  ALAMI Peer-to-Peer Lending Syariah/a_Masuk Ke Akun Saya'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Lengkapi Profil Sekarang'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Individual - WNI (Mewakili Diri Sendiri)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Individual - WNI (Mewakili Diri Send_a6f99a'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Nama Lengkap Sesuai ID_btn btn-outli_33e7b4'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Sdr'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/label_Laki-laki'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'), 'ngawi')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Kab. Ngawi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Kab. Aceh BaratKab. Aceh Barat DayaK_afb261'), 
    'Kab. Ngawi', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tanggal Lahir_user.dateOfBirth'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_2005'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_keyboard_arrow_up'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_1995'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_right'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_chevron_left'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_19'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Pilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Islam'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_IslamKristenKatolikBudhaHinduKong Hu_0411ee'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Nama Ibu Kandung_user.rdlMotherMaidenName'), 
    'surat')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Menikah'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_LajangMenikahDudaJanda'), 'M', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_S1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_SDSMPSMASederajatAkademiDiplomaS1S2S3'), 
    '05', true)

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/textarea_Alamat_user.address'), 'perum taman buah')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_No. RT_user.rdlAddressRt'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_No. RW_user.rdlAddressRw'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'), 'tangerang')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Kab. Tangerang'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Kab. Aceh BaratKab. Aceh Barat DayaK_afb261_1'), 
    '136', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Pasar Kemis'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_BalarajaCikupaCisaukCisokaCurugGunun_9a9b48'), 
    '5f0f58fd-0c11-4a93-b3d3-1e4b409c6edd', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Sukamantri'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Gelam JayaKuta BaruKutabumi (Kuta Bu_263bb1'), 
    'e09968e7-e7d2-404a-b07a-9a660f1ebc4c', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Pegawai Swasta'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Pegawai NegeriPegawai SwastaPegawai _6f504a'), 
    '02', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'), 'infor')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Informasi dan Komunikasi'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Administrasi Pemerintahan, Pertahana_da06f7'), 
    '55', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Penghasilan bulanan antara 5 sampai 10_254b24'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Penghasilan bulanan kurang dari 3 ju_beccc5'), 
    '8000000', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Gaji'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_GajiHasil bisnisHasil investasiHibah'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Nama Kontak Darurat_user.emergencyPhoneName'), 
    'isna')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Lanjutkan Tahap 2'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_Nomor e-KTP_verification.ktpNumber'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_KTP Berlaku Hingga_verification.rdlId_dda84b'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Rabuclearchevron_leftSEPchevron_right14_13cb66'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/label_e-KTP berlaku seumur hidup'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'), 'kuningan')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Kab. Kuningan'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_Kab. Aceh BaratKab. Aceh Barat DayaK_afb261'), 
    'Kab. Kuningan', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_Nomor NPWP_verification.npwpNumber'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_photo_camera_selfieFilename'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/i_photo_camera'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Ambil Foto'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_Lanjutkan Tahap 3'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/div_Tidak ada yang dipilih'))

WebUI.setText(findTestObject('Object Repository/Page_Alami - Dashboard/input_Tidak ada yang dipilih_form-control'), 'bca')

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/span_BANK CENTRAL ASIA (BCA)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Alami - Dashboard/select_ALTOPAYAMAR INDONESIAANZ INDONESIAAT_0a9357'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/input_Nomor Rekening_bankAccount.ownerAccount'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/label_Saya memahami dan setuju dengan poten_f3ef8f'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Saya Mengerti'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Saya Mengerti'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/label_Saya memahami dan setuju dengan komit_52e39d'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_OK'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_Saya Mengerti'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/a_Daftar'))

WebUI.click(findTestObject('Object Repository/Page_Alami - Dashboard/button_OK'))

