package com.yibancircle.action;

import com.robotium.solo.Timeout;
import com.yibancircle.test.BaseTest;

public class chataction extends BaseTest {
	public chataction() throws ClassNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void testtanjiu (String user, String password){
		Login (user, password);
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
		
		Logout ();
		
	}
	
}

	


