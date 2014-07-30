package com.yiban.app.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class WelcomeActivityTest extends ActivityInstrumentationTestCase2 {
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
    public WelcomeActivityTest() throws ClassNotFoundException {
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
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Wait for activity: 'com.yiban.app.activity.WelcomeActivity'
		assertTrue("WelcomeActivity is not found!", solo.waitForActivity("WelcomeActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ���Է� * ����
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
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ����
		solo.clickInList(1, 0);
		// Wait for activity: 'com.yiban.app.activity.SettingMainActivity'
		assertTrue("SettingMainActivity is not found!", solo.waitForActivity("SettingMainActivity"));
		// Click on �˳��˺�
		solo.clickOnView(solo.getView("setting_main_quit"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on �˳��ʺ�
		solo.clickOnView(solo.getView("positiveButton"));
		// Wait for activity: 'com.yiban.app.activity.NewLoginActivity'
		assertTrue("NewLoginActivity is not found!", solo.waitForActivity("NewLoginActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_pwd_et"));
		// Set default small timeout to 10725 milliseconds
		Timeout.setSmallTimeout(10725);
		// Enter the text: '123456'
		solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), "123456");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_login_login_btn"));
		// Wait for activity: 'com.yiban.app.activity.HomeActivity'
		assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
		// Click on ��ϵ��
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on ��ϵ��
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on ����Ϣ 
		solo.clickOnView(solo.getView("l_newfriends"));
		// Wait for activity: 'com.yiban.app.activity.FriendApplyListActivity'
		assertTrue("FriendApplyListActivity is not found!", solo.waitForActivity("FriendApplyListActivity"));
		// Click on ����monica 07-29
		solo.clickOnView(solo.getView("page_viplist_content_s"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on �� �� �� ��
		solo.clickOnView(solo.getView("btOperate"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Set default small timeout to 13483 milliseconds
		Timeout.setSmallTimeout(13483);
		// Enter the text: '����� '
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "����ˡ�");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on Ⱥ 3
		solo.clickOnView(solo.getView("l_new_group_msg"));
		// Click on ������ 07-17
		solo.clickOnView(solo.getView("page_viplist_content_s", 8));
		// Wait for activity: 'com.yiban.app.activity.PublicGroupHomePageActivity'
		assertTrue("PublicGroupHomePageActivity is not found!", solo.waitForActivity("PublicGroupHomePageActivity"));
		// Click on ��������
		solo.clickOnView(solo.getView("group_home_page_enter_chatting_btn"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Set default small timeout to 13845 milliseconds
		Timeout.setSmallTimeout(13845);
		// Enter the text: '�����'
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "�����");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image"));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image"));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Set default small timeout to 16671 milliseconds
		Timeout.setSmallTimeout(16671);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ����Ϣ 
		solo.clickOnView(solo.getView("l_newfriends"));
		// Wait for activity: 'com.yiban.app.activity.FriendApplyListActivity'
		assertTrue("FriendApplyListActivity is not found!", solo.waitForActivity("FriendApplyListActivity"));
		// Click on Ⱥ 3
		solo.clickOnView(solo.getView("l_new_group_msg"));
		// Click on �����ĵڶ���Ⱥ 07-22
		solo.clickOnView(solo.getView("page_viplist_content_s", 7));
		// Wait for activity: 'com.yiban.app.activity.PublicGroupHomePageActivity'
		assertTrue("PublicGroupHomePageActivity is not found!", solo.waitForActivity("PublicGroupHomePageActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ������ 07-17
		solo.clickOnView(solo.getView("page_viplist_content_s", 8));
		// Wait for activity: 'com.yiban.app.activity.PublicGroupHomePageActivity'
		assertTrue("PublicGroupHomePageActivity is not found!", solo.waitForActivity("PublicGroupHomePageActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image", 1));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Sleep for 22233 milliseconds
		solo.sleep(22233);
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Click on ��8��
		solo.clickOnWebElement(By.textContent("��8��"));
		// Sleep for 19970 milliseconds
		solo.sleep(19970);
		// Click on ȡ��
		solo.clickOnWebElement(By.textContent("ȡ��"));
		// Sleep for 15689 milliseconds
		solo.sleep(15689);
		// Click on ����
		solo.clickOnWebElement(By.textContent("����"));
		// Sleep for 12802 milliseconds
		solo.sleep(12802);
		// Click on content
		solo.clickOnWebElement(By.id("content"));
		// Sleep for 1899 milliseconds
		solo.sleep(1899);
		// Click on content
		solo.clickOnWebElement(By.id("content"));
		// Sleep for 1828 milliseconds
		solo.sleep(1828);
		// Click on content
		solo.clickOnWebElement(By.id("content"));
		// Sleep for 2353 milliseconds
		solo.sleep(2353);
		// Click on title
		solo.clickOnWebElement(By.id("title"));
		// Sleep for 2943 milliseconds
		solo.sleep(2943);
		// Click on content
		solo.clickOnWebElement(By.id("content"));
		// Sleep for 6947 milliseconds
		solo.sleep(6947);
		// Click on ����
		solo.clickOnWebElement(By.textContent("����"));
		// Sleep for 11530 milliseconds
		solo.sleep(11530);
		// Click on ,
		solo.clickOnWebElement(By.textContent(","));
		// Sleep for 23257 milliseconds
		solo.sleep(23257);
		// Click on title
		solo.clickOnWebElement(By.id("title"));
		// Sleep for 14587 milliseconds
		solo.sleep(14587);
		// Click on content
		solo.clickOnWebElement(By.id("content"));
		// Sleep for 2638 milliseconds
		solo.sleep(2638);
		// Click on ����
		solo.clickOnWebElement(By.textContent("����"));
		// Set default small timeout to 19541 milliseconds
		Timeout.setSmallTimeout(19541);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image", 2));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Sleep for 4523 milliseconds
		solo.sleep(4523);
		// Click on 2
		solo.clickOnWebElement(By.id("2"));
		// Click on 2
		solo.clickOnWebElement(By.id("2"));
		// Sleep for 1639 milliseconds
		solo.sleep(1639);
		// Clear text in 1
		solo.clearTextInWebElement(By.id("1"));
		// Enter text in 1
		solo.enterTextInWebElement(By.id("1"), "������");
		// Sleep for 1221 milliseconds
		solo.sleep(1221);
		// Clear text in btn_publish
		solo.clearTextInWebElement(By.id("btn_publish"));
		// Enter text in btn_publish
		solo.enterTextInWebElement(By.id("btn_publish"), "����ͶƱ");
		// Click on btn_publish
		solo.clickOnWebElement(By.id("btn_publish"));
		// Sleep for 3416 milliseconds
		solo.sleep(3416);
		// Sleep for 35677 milliseconds
		solo.sleep(35677);
		// Clear text in submit
		solo.clearTextInWebElement(By.className("submit"));
		// Enter text in submit
		solo.enterTextInWebElement(By.className("submit"), "��??��");
		// Sleep for 8856 milliseconds
		solo.sleep(8856);
		// Click on 31
		solo.clickOnWebElement(By.textContent("31"));
		// Sleep for 1826 milliseconds
		solo.sleep(1826);
		// Sleep for 1614 milliseconds
		solo.sleep(1614);
		// Click on ��??��
		solo.clickOnWebElement(By.textContent("��??��"));
		// Sleep for 1731 milliseconds
		solo.sleep(1731);
		// Clear text in UI_pop_confirm_ok
		solo.clearTextInWebElement(By.className("UI_pop_confirm_ok"));
		// Enter text in UI_pop_confirm_ok
		solo.enterTextInWebElement(By.className("UI_pop_confirm_ok"), "ȷ��");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ������
		solo.clickOnView(solo.getView("l_public_account"));
		// Wait for activity: 'com.yiban.app.activity.PublicListActivity'
		assertTrue("PublicListActivity is not found!", solo.waitForActivity("PublicListActivity"));
		// Scroll to ����
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 0);
		// Click on ����
		solo.clickOnView(solo.getView("page_viplist_content_v", 5));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on �� �� �� ��
		solo.clickOnView(solo.getView("btOperate"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '����'
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "����");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Assert that: 'ImageView' is shown
		assertTrue("'ImageView' is not shown!", solo.waitForView(solo.getView(android.widget.ImageView.class, 1)));
		// Click on ImageView
		solo.clickOnView(solo.getView("gallaryview_item_image"));
		// Wait for activity: 'com.yiban.app.activity.LightAppActivity'
		assertTrue("LightAppActivity is not found!", solo.waitForActivity("LightAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Scroll to ImageView
		android.widget.ListView listView1 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView1, 0);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ������
		solo.clickOnView(solo.getView("l_org_account"));
		// Wait for activity: 'com.yiban.app.activity.PublicListActivity'
		assertTrue("PublicListActivity is not found!", solo.waitForActivity("PublicListActivity"));
		// Click on �װ�
		solo.clickOnView(solo.getView("page_viplist_content_v"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on �� �� �� ��
		solo.clickOnView(solo.getView("btOperate"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '����'
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "����");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Scroll to ������
		android.widget.ListView listView2 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView2, 1);
		// Click on ������
		solo.clickOnView(solo.getView("l_groupchat"));
		// Wait for activity: 'com.yiban.app.activity.TalkGroupListActivity'
		assertTrue("TalkGroupListActivity is not found!", solo.waitForActivity("TalkGroupListActivity"));
		// Click on LinearLayout monica1�����㿴���ǳ�, ����monica,����8���ǳ�,Monica1990,sindy����,δ�����ǳ�,δ�����ǳ�
		solo.clickInList(3, 0);
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '��ʦ��'
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "��ʦ��");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Scroll to LinearLayout ����4
		android.widget.ListView listView3 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView3, 2);
		// Click on LinearLayout ����4
		solo.clickOnView(solo.getView("contactitem_layout", 2));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageActivity'
		assertTrue("UserHomePageActivity is not found!", solo.waitForActivity("UserHomePageActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Wait for activity: 'com.yiban.app.activity.UserHomePageSettingActivity'
		assertTrue("UserHomePageSettingActivity is not found!", solo.waitForActivity("UserHomePageSettingActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Scroll to �װ�
		android.widget.ListView listView4 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView4, 8);
		// Click on �װ�
		solo.clickOnView(solo.getView("page_home_yiban_tab_btn"));
		// Click on ��ϵ��
		solo.clickOnView(solo.getView("page_home_contacts_tab_btn"));
		// Click on ̽��
		solo.clickOnView(solo.getView("page_home_discover_tab_btn"));
		// Scroll to ImageView
		android.widget.ListView listView5 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView5, 2);
		// Click on ImageView
		solo.clickOnView(solo.getView("release_dynamic_btn"));
		// Wait for activity: 'com.yiban.app.activity.ReleaseDynamicActivity'
		assertTrue("ReleaseDynamicActivity is not found!", solo.waitForActivity("ReleaseDynamicActivity"));
		// Enter the text: '�Է���Ŷ'
		solo.clearEditText((android.widget.EditText) solo.getView("release_msg_et"));
		solo.enterText((android.widget.EditText) solo.getView("release_msg_et"), "�Է���Ŷ");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Scroll to ͬ��
		android.widget.ListView listView6 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView6, 3);
		// Click on ͬ��
		solo.clickOnView(solo.getView("sadface_layout"));
		// Click on praise_layout
		solo.clickOnView(solo.getView("praise_layout"));
		// Click on review_layout
		solo.clickOnView(solo.getView("review_layout"));
		// Enter the text: '��'
		solo.clearEditText((android.widget.EditText) solo.getView("page_discoverydetail_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_discoverydetail_et"), "��");
		// Click on ����
		solo.clickOnView(solo.getView("page_discovery_detail_send_btn"));
		// Scroll to ͬ��
		android.widget.ListView listView7 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView7, 6);
		// Click on ͬ��
		solo.clickOnView(solo.getView("sadface_layout"));
		// Scroll to ��
		android.widget.ListView listView8 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView8, 9);
		// Click on praise_layout
		solo.clickOnView(solo.getView("praise_layout"));
		// Click on ͬ��
		solo.clickOnView(solo.getView("sadface_layout"));
		// Click on review_layout
		solo.clickOnView(solo.getView("review_layout"));
		// Click on 07-29 �Ϻ��� ���� &TspZKXcfcO1VSv8B- LinearLayout LinearLayout LinearLayout Line
		solo.clickOnText(java.util.regex.Pattern.quote("07-29"));
		// Wait for activity: 'com.yiban.app.activity.DiscoverDetailActivity'
		assertTrue("DiscoverDetailActivity is not found!", solo.waitForActivity("DiscoverDetailActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("edit_btn"));
		// Click on ɾ��
		solo.clickOnView(solo.getView("ll_delete"));
		// Scroll to ImageView
		android.widget.ListView listView9 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 1);
		solo.scrollListToLine(listView9, 11);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_beta_btn"));
		// Click on ��Ӻ���
		solo.clickInList(1, 0);
		// Wait for activity: 'com.yiban.app.activity.AddFriendActivity'
		assertTrue("AddFriendActivity is not found!", solo.waitForActivity("AddFriendActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("edit_searchfriends"));
		// Enter the text: '��'
		solo.clearEditText((android.widget.EditText) solo.getView("edit_searchfriends"));
		solo.enterText((android.widget.EditText) solo.getView("edit_searchfriends"), "��");
		// Click on ����
		solo.clickOnView(solo.getView("txt_search_click"));
		// Wait for activity: 'com.yiban.app.activity.FindUserResultActivity'
		assertTrue("FindUserResultActivity is not found!", solo.waitForActivity("FindUserResultActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_beta_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_alpha_btn"));
		// Wait for activity: 'com.yiban.app.activity.SearchActivity'
		assertTrue("SearchActivity is not found!", solo.waitForActivity("SearchActivity"));
		// Enter the text: '��'
		solo.clearEditText((android.widget.EditText) solo.getView("page_search_content_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_search_content_et"), "��");
		// Click on page_search_content_et
		solo.clickOnView(solo.getView("page_search_content_et"));
		// Click on LinearLayout
		solo.clickOnView(solo.getView("page_below_search_result_layout"));
		// Enter the text: '��ʦ��'
		solo.clearEditText((android.widget.EditText) solo.getView("page_search_content_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_search_content_et"), "��ʦ��");
		// Click on LinearLayout
		solo.clickOnView(solo.getView("page_below_search_result_layout"));
		// Click on ��ʦ��
		solo.clickOnView(solo.getView("page_search_content_et"));
		// Click on LinearLayout
		solo.clickOnView(solo.getView("page_below_search_result_layout"));
		// Click on LinearLayout
		solo.clickOnView(solo.getView("page_below_search_result_layout"));
		// Press next button
		solo.pressSoftKeyboardNextButton();
		// Click on ��ʦ��
		solo.clickOnView(solo.getView("page_search_content_et"));
		// Click on ImageView
		solo.clickOnView(solo.getView("page_search_back_ib"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_beta_btn"));
		// Click on ����Ⱥ��
		solo.clickInList(2, 0);
		// Wait for activity: 'com.yiban.app.activity.CreateTalkGroupChatActivity'
		assertTrue("CreateTalkGroupChatActivity is not found!", solo.waitForActivity("CreateTalkGroupChatActivity"));
		// Click on LinearLayout 6871 RelativeLayout
		solo.clickOnView(solo.getView("contactitem_layout"));
		// Click on LinearLayout @@6874cxkkxk RelativeLayout
		solo.clickOnView(solo.getView("contactitem_layout", 1));
		// Click on LinearLayout ����5�� RelativeLayout
		solo.clickOnView(solo.getView("contactitem_layout", 2));
		// Click on ���(3)
		solo.clickOnView(solo.getView("ok_button"));
		// Wait for activity: 'com.yiban.app.activity.ChatActivity'
		assertTrue("ChatActivity is not found!", solo.waitForActivity("ChatActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_et"));
		// Enter the text: '����'
		solo.clearEditText((android.widget.EditText) solo.getView("page_chat_message_et"));
		solo.enterText((android.widget.EditText) solo.getView("page_chat_message_et"), "����");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("page_chat_message_send_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_back_btn"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_beta_btn"));
		// Click on ɨһɨ
		solo.clickInList(3, 0);
		// Wait for activity: 'com.yiban.zxing.activity.CaptureActivity'
		assertTrue("CaptureActivity is not found!", solo.waitForActivity("CaptureActivity"));
	}
}
