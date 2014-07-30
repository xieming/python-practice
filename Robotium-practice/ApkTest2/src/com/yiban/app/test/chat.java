package com.yiban.app.test;



import com.yiban.app.base.Base;

public class chat extends Base {

	
	public chat() throws ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void testChat() throws Exception {
		
		login("13917966870", "123456");

				
				// Click on 联系人
				solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
				// Click on LinearLayout 6875的昵称
				solo.clickOnView(solo.getView("contactitem_layout"));
				// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
				assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
				// Click on 进 入 聊 天
				solo.clickOnView(solo.getView("btOperate"));
				// Wait for activity: 'com.yiban.app.activity.ChatActivity'
				assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
				// Click on Empty Text View
			
				solo.clickOnView(solo.getView("page_chat_message_et"));
				// Enter the text: '发文字'
				solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
				solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "\\");
				solo.clickOnView(solo.getView("page_chat_message_send_btn"));
				solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "\\\\/@#$%&^&*&(**))*?>>");
				solo.clickOnView(solo.getView("page_chat_message_send_btn"));
				solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "＃￥＃％……＆×＆……×￥……＠！？《》");
				solo.clickOnView(solo.getView("page_chat_message_send_btn"));
				for(int i=0;i<=10;i++) {
				solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), i+"  发文字");
				// Click on Empty Text View
				solo.clickOnView(solo.getView("page_chat_message_send_btn"));
				}
				// Click on Empty Text View
				solo.clickOnView(solo.getView("page_chat_message_function_btn"));
				// Click on 照片
				solo.clickInList(1, 0);
				// Wait for activity: 'com.yiban.app.activity.Photo_mainActivity'
				assertTrue("Photo_mainActivity is not found!", solo.waitForActivity("Photo_mainActivity"));
				// Click on 相机照片 (76) 10
				solo.clickInList(1, 0);
				// Wait for activity: 'com.yiban.app.activity.Photo_AlbumActivity'
				assertTrue("Photo_AlbumActivity is not found!", solo.waitForActivity("Photo_AlbumActivity"));
				// Click on Empty Text View
				solo.clickOnView(solo.getView("toggle_button", 4));
				// Click on Empty Text View
				solo.clickOnView(solo.getView("page_chat_message_et"));
				// Click on Empty Text View
				solo.clickOnView(solo.getView("page_chat_message_function_btn"));
				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
//				// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
//				assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
//				// Wait for activity: 'com.yiban.app.activity.UserHomePageSettingActivity'
//				assertTrue("UserHomePageSettingActivity is not found!", solo.waitForActivity("UserHomePageSettingActivity"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
//				// Click on 易班
//				solo.clickOnView(solo.getView("page_home_yiban_tab_btn"));
//				// Click on RelativeLayout  14:09 6875的昵称  图片 
//				solo.clickInList(2, 0);
//				// Wait for activity: 'com.yiban.app.activity.ChatActivity'
//				assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
//				// Set default small timeout to 11181 milliseconds
//				Timeout.setSmallTimeout(11181);
//				// Click on Empty Text View
//				solo.clickOnView(solo.getView("page_chat_message_et"));
//				// Click on Empty Text View
//				solo.clickOnView(solo.getView("page_chat_message_send_btn"));
//				// Click on Empty Text View
//				solo.clickOnView(solo.getView("page_chat_message_function_btn"));
//				// Click on Empty Text View
//				solo.clickOnView(solo.getView("page_chat_message_et"));
//				// Click on LinearLayout  07-28 14:09:49 LinearLayout RelativeLayout RelativeLayout
//				solo.clickInList(5, 0);
//				// Click on ImageView
//				solo.clickOnView(solo.getView("chat_right_list_avatar_iv", 1));
//				// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
//				assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
//				// Click on ImageView
//				solo.clickOnView(solo.getView("chat_left_list_avatar_iv", 1));
//				// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
//				assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		
	}
}