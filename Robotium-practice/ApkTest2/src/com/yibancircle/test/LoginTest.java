package com.yibancircle.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")

public class LoginTest extends ActivityInstrumentationTestCase2 {

       //锟斤拷锟斤拷锟斤拷锟�

public Solo solo;

public Activity activity;

private static Class<?> launchActivityClass;

//锟斤拷应re-sign.jar锟斤拷沙锟斤拷锟斤拷锟斤拷锟较拷锟斤拷锟斤拷锟斤拷锟斤拷值

private static String mainActiviy = "com.yiban.app.activity.WelcomeActivity";

private static String packageName = "com.yiban.app";

static {

try {

launchActivityClass = Class.forName(mainActiviy);

} catch (ClassNotFoundException e) {

throw new RuntimeException(e);

}

}

@SuppressWarnings("unchecked")

public LoginTest() {

super(packageName, launchActivityClass);

}

@BeforeMethod
protected void setUp() throws Exception {

super.setUp();

this.activity = this.getActivity();

this.solo = new Solo(getInstrumentation(), getActivity());

}

public void testLogin () {
    //一锟斤拷时锟斤拷锟节等达拷text锟斤拷锟街ｏ拷锟斤拷锟斤拷统锟斤拷锟�
	
		solo.waitForDialogToOpen(5000);
		// Click on 娴嬭瘯鏈�* 鍐呯綉
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
	
		solo.clickOnView(solo.getView("page_login_account_et"));
		// Enter the phone number
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_account_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), "13917504610");
		solo.clickOnView(solo.getView("page_login_input_cancel_btn"));//娓呴櫎鐢佃瘽鍙风爜鎺т欢
		solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), "13917504610");
		// Click on 鐧婚檰
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_pwd_et"));
		// Enter password
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), "123456");
		// Click on 鐧婚檰
		solo.clickOnView(solo.getView("page_login_login_btn"));
		solo.waitForDialogToOpen(5000);
		
		//assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		//solo.waitForDialogToOpen(5000);
		solo.clickOnView(solo.getView("page_home_discover_tab_btn"));
		//solo.waitForDialogToOpen(5000);
	
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		
		solo.clickOnView(solo.getView("popup_text"));
		
		solo.clickOnView(solo.getView("setting_main_quit"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on 退出帐号
		solo.clickOnView(solo.getView("positiveButton"));
}
		
	
	//solo.waitForText("锟斤拷锟皆凤拷 * 锟斤拷锟斤拷", 1, 10000);
	//solo.clickOnText("锟斤拷锟皆凤拷 * 锟斤拷锟斤拷");
	//solo.waitForText("探锟斤拷", 1, 2000);
	

   // solo.waitForText("Log In", 1, 10000);

    //锟斤拷锟絫ext 锟斤拷Log In锟斤拷

   // solo.clickOnText("Log In");

    //一锟斤拷时锟斤拷锟节等达拷text锟斤拷锟街ｏ拷锟斤拷锟斤拷统锟斤拷锟�
 //   solo.waitForText("OK", 1, 2000);

    //锟斤拷锟斤拷text
/*    solo.enterText(0, "13559494170");
    solo.enterText(1, "123456");

    //锟斤拷锟絫ext 锟斤拷OK锟斤拷
    solo.clickOnText("OK");

    //锟饺达拷锟斤拷锟斤拷锟斤拷锟斤拷text锟襟，斤拷锟斤拷锟斤拷证
    solo.waitForText("Incorrect ID number or password.", 1, 10000);
    AssertJUnit.assertTrue(solo.searchText("Incorrect ID number or password.",true));*/



@AfterMethod
public void tearDown() throws Exception {

try {

this.solo.finishOpenedActivities();

} catch (Throwable e) {

e.printStackTrace();

}

this.activity.finish();

super.tearDown();

}
}

