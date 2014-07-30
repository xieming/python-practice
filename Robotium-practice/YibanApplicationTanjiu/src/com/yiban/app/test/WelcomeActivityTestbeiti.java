package com.yiban.app.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class WelcomeActivityTestbeiti extends ActivityInstrumentationTestCase2 {
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
    public WelcomeActivityTestbeiti() throws ClassNotFoundException {
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
		// Click on 测试服 * 内网
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_pwd_et"));
		// Enter the text: '123456'
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), "123456");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Wait for activity: 'com.yiban.app.activity.HomeActivity'
		assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		// Click on 探究
		solo.clickOnView(solo.getView("page_home_discover_tab_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("release_dynamic_btn"));
		// Wait for activity: 'com.yiban.app.activity.ReleaseDynamicActivity'
		assertTrue("ReleaseDynamicActivity is not found!", solo.waitForActivity("ReleaseDynamicActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("release_msg_et"));
		// Set default small timeout to 51736 milliseconds
		Timeout.setSmallTimeout(51736);
		// Enter the text: '麦当劳过期食品毒害中国人'
		solo.clearEditText((android.widget.EditText) solo.getView("release_msg_et"));
		solo.enterText((android.widget.EditText) solo.getView("release_msg_et"), "麦当劳过期食品毒害中国人");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on praise_layout
		solo.clickOnView(solo.getView("praise_layout"));
		// Click on 同情
		solo.clickOnView(solo.getView("sadface_layout"));
		// Click on 评论
		solo.clickOnView(solo.getView("review_layout"));
		// Enter the text: '很多小孩都吃'
		solo.clearEditText((android.widget.EditText) solo.getView("page_discoverydetail_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_discoverydetail_et"), "很多小孩都吃");
		// Click on 发送
		solo.clickOnView(solo.getView("page_discovery_detail_send_btn"));
		// Click on 联系人
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on LinearLayout 6871
		solo.clickOnView(solo.getView("contactitem_layout"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on 进 入 聊 天
		solo.clickOnView(solo.getView("btOperate"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_keyboard_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '有空出来玩么 '
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "有空出来玩么？");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Enter the text: '周天有空么 '
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "周天有空么？");
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_pwd_et"));
		// Enter the text: '123456'
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), "123456");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Wait for activity: 'com.yiban.app.activity.HomeActivity'
		assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		// Click on 联系人
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on 探究
		solo.clickOnView(solo.getView("page_home_discover_tab_btn"));
		// Click on 联系人
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on 联系人
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on LinearLayout 6871公共号
		solo.clickOnView(solo.getView("contactitem_layout"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on 进 入 聊 天
		solo.clickOnView(solo.getView("btOperate"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_keyboard_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '刚才被踢了 '
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "刚才被踢了。");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
	}
}
