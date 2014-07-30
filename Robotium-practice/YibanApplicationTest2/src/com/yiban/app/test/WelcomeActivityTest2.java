package com.yiban.app.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class WelcomeActivityTest2 extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.yiban.app.activity.WelcomeActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public WelcomeActivityTest2() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
		// Wait for activity: 'com.yiban.app.activity.WelcomeActivity'
		solo.waitForActivity("WelcomeActivity", 2000);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ���Է� * ����
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
		// Wait for activity: 'com.yiban.app.activity.HomeActivity'
		assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ����
		solo.clickOnView(solo.getView("menu_main_item"));
		// Wait for activity: 'com.yiban.app.activity.ProfileManagerActivity'
		assertTrue("ProfileManagerActivity is not found!", solo.waitForActivity("ProfileManagerActivity"));
		// Click on �ҵ���ҳ
		solo.clickOnView(solo.getView("r_my_index"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Assert that: '�Ჩ��' is shown
		assertTrue("'�Ჩ��' is not shown!", solo.waitForView(solo.getView("gallaryview_item_name")));
		// Set default small timeout to 11548 milliseconds
		Timeout.setSmallTimeout(11548);
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image"));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Sleep for 7254 milliseconds
		solo.sleep(7254);
		// Click on W
		solo.clickOnWebElement(By.textContent("W"));
		// Click on W
		solo.clickOnWebElement(By.textContent("W"));
		// Click on W
		solo.clickOnWebElement(By.textContent("W"));
		// Click on W
		solo.clickOnWebElement(By.textContent("W"));
		// Sleep for 3406 milliseconds
		solo.sleep(3406);
		// Click on W
		solo.clickOnWebElement(By.textContent("W"));
		// Sleep for 15508 milliseconds
		solo.sleep(15508);
		// Click on ����
		solo.clickOnWebElement(By.textContent("����"));
		// Sleep for 4499 milliseconds
		solo.sleep(4499);
		// Clear text in blog_item_viewMore
		solo.clearTextInWebElement(By.className("blog_item_viewMore"));
		// Enter text in blog_item_viewMore
		solo.enterTextInWebElement(By.className("blog_item_viewMore"), "C�鿴ȫ��");
		// Sleep for 2455 milliseconds
		solo.sleep(2455);
		// Click on D
		solo.clickOnWebElement(By.textContent("D"));
		// Clear text in I
		solo.clearTextInWebElement(By.tagName("I"));
		// Enter text in I
		solo.enterTextInWebElement(By.tagName("I"), "D");
		// Sleep for 4638 milliseconds
		solo.sleep(4638);
		// Click on ��������!
		solo.clickOnWebElement(By.textContent("��������!"));
		// Sleep for 2138 milliseconds
		solo.sleep(2138);
		// Click on ����
		solo.clickOnWebElement(By.textContent("����"));
		// Sleep for 3028 milliseconds
		solo.sleep(3028);
		// Clear text in blogListDestroy
		solo.clearTextInWebElement(By.className("blogListDestroy"));
		// Enter text in blogListDestroy
		solo.enterTextInWebElement(By.className("blogListDestroy"), "����");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ��������
		solo.clickOnView(solo.getView("r_myself_info"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoActivity'
		assertTrue("UserInfoActivity is not found!", solo.waitForActivity("UserInfoActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("ivHomePageBackGround"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Wait for dialog to close
		solo.waitForDialogToClose(5000);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ������Ӧ��
		solo.clickOnView(solo.getView("r_myself_light_app"));
		// Wait for activity: 'com.yiban.app.activity.PublicGroupThinAppActivity'
		assertTrue("PublicGroupThinAppActivity is not found!", solo.waitForActivity("PublicGroupThinAppActivity"));
		// Click on ��   ��   ��   Ӧ   ��
		solo.clickOnView(solo.getView("btn_add_app"));
		// Wait for activity: 'com.yiban.app.activity.AddThinAppActivity'
		assertTrue("AddThinAppActivity is not found!", solo.waitForActivity("AddThinAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ������Ӧ��
		solo.clickOnView(solo.getView("r_myself_light_app"));
		// Wait for activity: 'com.yiban.app.activity.PublicGroupThinAppActivity'
		assertTrue("PublicGroupThinAppActivity is not found!", solo.waitForActivity("PublicGroupThinAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ����
		solo.clickOnView(solo.getView("r_mysetting"));
		// Wait for activity: 'com.yiban.app.activity.SettingMainActivity'
		assertTrue("SettingMainActivity is not found!", solo.waitForActivity("SettingMainActivity"));
		// Click on �����װ� RelativeLayout
		solo.clickOnView(solo.getView("setting_main_about_yiban_layout"));
		// Wait for activity: 'com.yiban.app.activity.SettingAboutYibanActivity'
		assertTrue("SettingAboutYibanActivity is not found!", solo.waitForActivity("SettingAboutYibanActivity"));
		// Click on ������
		solo.clickOnView(solo.getView("r_clearcache"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on �������
		solo.clickOnView(solo.getView("positiveButton"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on �˳��˺�
		solo.clickOnView(solo.getView("setting_main_quit"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on �˳��ʺ�
		solo.clickOnView(solo.getView("positiveButton"));
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
	}
}
