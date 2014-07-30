package com.yibancircle.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")

public class BaseTest extends ActivityInstrumentationTestCase2 {

public Solo solo;

public Activity activity;

private static Class<?> launchActivityClass;

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

public BaseTest() {

super(packageName, launchActivityClass);

}

@BeforeMethod
protected void setUp() throws Exception {

super.setUp();

this.activity = this.getActivity();

this.solo = new Solo(getInstrumentation(), getActivity());

}

public void Login (String user, String pwd) {
		
		solo.waitForDialogToOpen(5000);
		// Click on 测试服，内网
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
		solo.waitForDialogToOpen(5000);
		System.out.print("wo cao");
		
		if (solo.waitForActivity("NewLoginActivity",2000))
		{
		solo.clickOnView(solo.getView("page_login_account_et"));
		// Enter the phone number
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_account_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), user);
		solo.clickOnView(solo.getView("page_login_input_cancel_btn"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), user);
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_pwd_et"));
		// Enter password
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), pwd);
		// Click on 登陆
		solo.clickOnView(solo.getView("page_login_login_btn"));
		assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		solo.waitForDialogToOpen(5000);
		
/*		//assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		//solo.waitForDialogToOpen(5000);
		solo.clickOnView(solo.getView("page_home_discover_tab_btn"));
		//solo.waitForDialogToOpen(5000);
*/}
}
		
		
public void Logout () {		
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		
		solo.clickOnView(solo.getView("popup_text"));
		
		solo.clickOnView(solo.getView("setting_main_quit"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on 退出帐号
		solo.clickOnView(solo.getView("positiveButton"));
}

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

