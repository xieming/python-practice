package com.yiban.app.base;

import com.robotium.solo.*;
import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;


@SuppressLint("NewApi")
@SuppressWarnings("rawtypes")
public class Base extends ActivityInstrumentationTestCase2 {
//  	private Solo solo;
  	protected  Solo solo;
  	
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
    public Base() throws ClassNotFoundException {
  		
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
   	
   	public void login(String phone, String password){
   		
   			if (solo.waitForActivity("WelcomeActivity", 2000))
   					chooseServer();
   			
   			
   			if (solo.waitForActivity("NewLoginActivity",2000))
   			{
  		
   				solo.clickOnView(solo.getView("page_login_account_et"));
   				// Enter the phone number
   				solo.clearEditText((android.widget.EditText) solo.getView("page_login_account_et"));
   				solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), phone);
   				solo.clickOnView(solo.getView("page_login_input_cancel_btn"));//清除电话号码控件
   				solo.enterText((android.widget.EditText) solo.getView("page_login_account_et"), phone);
   				// Click on 登陆
   				solo.clickOnView(solo.getView("page_login_login_btn"));
   				// Click on Empty Text View
   				solo.clickOnView(solo.getView("page_login_pwd_et"));
   				// Enter password
   				solo.clearEditText((android.widget.EditText) solo.getView("page_login_pwd_et"));
   				solo.enterText((android.widget.EditText) solo.getView("page_login_pwd_et"), password);
   				// Click on 登陆
   				solo.clickOnView(solo.getView("page_login_login_btn"));
   				
   				assertTrue("HomeActivity is not found!", solo.waitForActivity("HomeActivity"));
   			}
   		
   	}
   	
	public void chooseServer(){
		
		solo.waitForDialogToOpen(5000);
		// Click on 测试服 * 内网
		solo.clickOnView(solo.getView(android.R.id.text1, 1));
	}
   	//我
   	public void gotoUserInfoActivity()
   	{
   		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));  //?
   		solo.clickOnView(solo.getView("menu_main_item"));
		// Wait for activity: 'com.yiban.app.activity.ProfileManagerActivity'
		assertTrue("ProfileManagerActivity is not found!", solo.waitForActivity("ProfileManagerActivity"));

		
   	}
   	//个人资料
   	public void gotoMyInfo(){
   		solo.clickOnView(solo.getView("r_myself_info"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoActivity'
		assertTrue("UserInfoActivity is not found!", solo.waitForActivity("UserInfoActivity"));
   	}
   	
	
	public void nickname(String nickname)
   	{
   		
   		
   		/******************修改昵称******************************************************/
		//solo.scrollToTop();
		// Click on 昵称 陈贤公共号二的昵称
		
		solo.clickOnView(solo.getView("rlNickName"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
		// Click on 陈贤公共号二的昵称
		solo.clickOnView(solo.getView("etContent"));
		Timeout.setSmallTimeout(14285);
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
	
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), nickname);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
//		
//			assertTrue("修改成功提示 is not found!", solo.waitForText("修改成功"));
//		
//			assertTrue("空昵称提示 is not found!", solo.waitForText("昵称不能为空！"));
//		
//			assertTrue("最多只能输入80个字符 is not found!", solo.waitForText("最多只能输入40个字符"));
		

		solo.sleep(2000);
		solo.goBackToActivity("UserInfoActivity");
		/****************************************************************************************/


   	}
   	
   	public void sign(String sign){
   		/*********************签名********************************************/
		// Click on 签名 RelativeLayout
		solo.clickOnView(solo.getView("rlSign"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
	
		solo.clickOnView(solo.getView("etContent"));

		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), sign);
		// Click on ImageView
	
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
	//	assertTrue("修改成功提示 is not found!", solo.waitForText("修改成功"));
		solo.sleep(2000);
		solo.goBackToActivity("UserInfoActivity");
		/******************************************************************/
   	}
   	
   	public void brief(String brief)
   	{
   		solo.clickOnView(solo.getView("rlBrief"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
	
		solo.clickOnView(solo.getView("etContent"));
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), brief);
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		
		solo.sleep(2000);
		solo.goBackToActivity("UserInfoActivity");
   	}
   	
   	public void gotoMyGroup(){

   		solo.clickOnView(solo.getView("r_my_creategroup"));
		// Wait for activity: 'com.yiban.app.activity.MyCreateGroupActivity'
		assertTrue("MyCreateGroupActivity is not found!", solo.waitForActivity("MyCreateGroupActivity"));
   	}
   	
   	public void selectgroup(int id){
   		solo.clickInList(id, 0);
		// Wait for activity: 'com.yiban.app.activity.GroupSettingActivity'
		assertTrue("GroupSettingActivity is not found!", solo.waitForActivity("GroupSettingActivity"));
   	}
   	public void groupname(String groupname){
   		
		// Click on 
		
		
		solo.clickOnView(solo.getView("group_setting_name_layout"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
		
	//	solo.clickOnView(solo.getView("etContent"));
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), groupname);
	
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		solo.sleep(1000);
	//	solo.goBackToActivity("MyCreateGroupActivity");
		solo.goBackToActivity("GroupSettingActivity");
		solo.sleep(1000);
   	}
   	
   	public void goupbrief(String groupbrief){
   		
		solo.clickOnView(solo.getView("group_setting_introduction_layout"));
	
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
		
	//	solo.clickOnView(solo.getView("etContent"));
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), groupbrief);
	
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		solo.sleep(1000);
	//	solo.goBackToActivity("MyCreateGroupActivity");
		solo.goBackToActivity("GroupSettingActivity");
		solo.sleep(1000);
   	}
   	
   	
   	public void constellation(){
		/*********************星座********************************************/
		// Click on 星座 无
		solo.clickOnView(solo.getView("rlConstellation"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ImageView
	//	solo.clickOnView(solo.getView("increment"));
		// Enter the text: '1978'
		solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input"));
		solo.enterText((android.widget.EditText) solo.getView("numberpicker_input"), "1988");
		// Click on ImageView
		// Enter the text: '03'
		solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input", 1));
		solo.enterText((android.widget.EditText) solo.getView("numberpicker_input", 1), "03");
		// Click on 设定
		solo.clickOnView(solo.getView(android.R.id.button1));
		solo.sleep(1000);
		assertTrue("星座错误！",solo.waitForText("双鱼座"));
		
		
		// Click on 星座 双鱼座
		solo.clickOnView(solo.getView("rlConstellation"));
		// Click on ImageView
	//	solo.clickOnView(solo.getView("decrement", 1));
		// Enter the text: '12'
		solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input", 1));
		solo.enterText((android.widget.EditText) solo.getView("numberpicker_input", 1), "12");
		// Click on 设定
		solo.clickOnView(solo.getView(android.R.id.button1));
		solo.sleep(1000);
		assertTrue("星座错误！",solo.waitForText("射手座"));
		
		// Click on 星座 射手座
		solo.clickOnView(solo.getView("rlConstellation"));
		// Click on ImageView
//		solo.clickOnView(solo.getView("increment", 1));
		// Enter the text: '01'
		solo.clearEditText((android.widget.EditText) solo.getView("numberpicker_input", 1));
		solo.enterText((android.widget.EditText) solo.getView("numberpicker_input", 1), "01");
		// Click on 设定
		solo.clickOnView(solo.getView(android.R.id.button1));
		assertTrue("星座错误！",solo.waitForText("摩羯座"));
		
   		
   	}
   	
	public void sex(){
		
	// Click on 性别 男
	solo.clickOnView(solo.getView("rlSex"));
	// Wait for dialog
	solo.waitForDialogToOpen(5000);
	// Click on llFemale
	solo.clickOnView(solo.getView("llFemale"));
	// Click on 性别 女
	solo.clickOnView(solo.getView("rlSex"));
	// Click on llMale
	solo.clickOnView(solo.getView("llMale"));
	
	}
	
	
	public void brief(){
		
		// Click on 简介 满足你在
		solo.clickOnView(solo.getView("rlBrief"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
		// Click on 满足你在
		solo.clickOnView(solo.getView("etContent"));
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on 简介 RelativeLayout
		solo.clickOnView(solo.getView("rlBrief"));
		// Wait for activity: 'com.yiban.app.activity.UserInfoModifyTextActivity'
		assertTrue("UserInfoModifyTextActivity is not found!", solo.waitForActivity("UserInfoModifyTextActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("etContent"));
		// Enter the text: '激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢'
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), "激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢多久大酒店九多久觉得雄赳赳下决心小换届选举的能见到计算");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on 激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢
		solo.clickOnView(solo.getView("etContent"));
		// Enter the text: '激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢'
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), "激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢多久大酒店九多久觉得雄赳赳下决心小换届选举的能见到计");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		// Click on 激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢
		solo.clickOnView(solo.getView("etContent"));
		// Enter the text: '激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢'
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), "激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢多久大酒店九多久觉得雄赳赳下决心小换届选举的能见到十");
		// Click on 激动得就觉得基督教 觉得白白的投票几句的多久2 的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢
		solo.clickOnView(solo.getView("etContent"));
		// Enter the text: '激动得就觉得基督教 觉得白白的投票几句的多久十的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢多'
		solo.clearEditText((android.widget.EditText) solo.getView("etContent"));
		solo.enterText((android.widget.EditText) solo.getView("etContent"), "激动得就觉得基督教 觉得白白的投票几句的多久十的多久多久救星不断地九等你你的心见到你的几句大酒店九大酒店九大酒店 的得到大酒店几句大酒店难道你等你呢多久大酒店九多久觉得雄赳赳下决心小换届选举的能见到十");
		// Click on ImageView
		solo.clickOnView(solo.getView("widget_custom_titlebar_right_gamma_btn"));
		
	}
	




}
