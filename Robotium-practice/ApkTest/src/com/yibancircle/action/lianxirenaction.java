package com.yibancircle.action;

import com.robotium.solo.Timeout;
import com.yibancircle.test.BaseTest;

public class lianxirenaction extends BaseTest {
	public lianxirenaction() throws ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void lianxiren (String user, String password){
		Login (user, password);
		// Click on 联系人
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on LinearLayout 6871
		solo.clickOnView(solo.getView("contactitem_layout"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
//		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
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
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		//assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
		
		Logout ();
		
	}
	
}

	


