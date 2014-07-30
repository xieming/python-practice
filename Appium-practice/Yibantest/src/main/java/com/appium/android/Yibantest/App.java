
package com.appium.android.Yibantest;

import static org.testng.AssertJUnit.assertNotNull;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import inputhelp.Utf7ImeHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.TakesScreenshot;





import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;


public class App {
    private AppiumDriver driver;

    @BeforeMethod
	public void setUp() throws Exception {
        // set up appium
        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "\\apps\\Yiban");//
        File app = new File(appDir, "Yiban_Circle.apk");//
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "4.4");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.yiban.app");//
        capabilities.setCapability("appActivity", "com.yiban.app.activity.WelcomeActivity");//
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    
  
	public void swipe(int startx, int starty, int endx, int endy, int duration){
        TouchAction touchAction = new TouchAction((MobileDriver) this);
        touchAction.press(startx, starty).waitAction(duration).moveTo(endx, endy).release();
        touchAction.perform();
    }
    

/*	public void testScreenshot() throws IOException {
		final String desfilepath = "/Users/Lenovo/Desktop/aa/aaa.png";
		// make screenshot and get is as base64
		final WebDriver augmentedDriver = new Augmenter().augment(driver);
		((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BASE64);
		// make screenshot and save it to the local filesystem
		final File srcfile = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, FileUtils.getFile(desfilepath), true);
		} catch (final Exception e) {
			System.out.println(e.toString() + "\n");
		}
	}*/
	
	public void testScreenshot() {
		// make screenshot and get is as base64
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String screenshot = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.BASE64);

		assertNotNull(screenshot);
		// make screenshot and save it to the local filesystem
		File file = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.FILE);
        assertNotNull(file);
    }
    
    @AfterMethod
	public void tearDown() throws Exception {
        driver.quit();
    }
    @Test
    public void addContact(){
    //    WebElement el = driver.findElement(By.name("Add Contact"));
//    	WebElement el = driver.findElementByAccessibilityId("1");
//    	WebElement el = driver.findElementById("1");
    	
 //   	WebElement el = driver.findElement(By.("1"));
//    	WebElement el = driver.findElement(By.id("1"));
//    	WebElement el = driver.findElement(By.xpath("//CheckedTextView[1]"));
//    	WebElement el = driver.findElement(By.tagName("CheckedTextView"));
//    	driver.context("");
//    	WebElement el = driver.findElement(By.xpath("//FrameLayout[0]/LinearLayout[0]/LinearLayout[1]/ListView[0]/LinearLayout[0]/CheckedTextView[1]"));
    	List<WebElement> lis = driver.findElementsByClassName("android.widget.CheckedTextView");//获取ImageView的所有元素
    	WebElement targetEle = lis.get(1);//获取列表中第2个元素
    	System.out.println(targetEle);
    	targetEle.click();
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.findElement(By.id("com.yiban.app:id/page_login_account_et")).sendKeys("13917504610");
        driver.findElement(By.id("com.yiban.app:id/page_login_login_btn")).click();
        WebElement pwd =driver.findElement(By.id("com.yiban.app:id/page_login_pwd_et"));
        pwd.clear();
        pwd.sendKeys("123456");
//        driver.findElement(By.id("com.yiban.app:id/page_login_pwd_et")).sendKeys("123456");
        driver.findElement(By.id("com.yiban.app:id/page_login_login_btn")).click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
        driver.findElement(By.id("com.yiban.app:id/instruct_close_btn")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        driver.findElement(By.id("com.yiban.app:id/page_home_contacts_tab_btn")).click();
        
        driver.swipe(75, 370, 75, 700, 800);
        driver.findElement(By.id("com.yiban.app:id/img_groupchat")).click();
        driver.findElement(By.id("com.yiban.app:id/widget_custom_titlebar_back_btn")).click();
        driver.findElement(By.id("com.yiban.app:id/page_home_discover_tab_btn")).click();
        driver.swipe(75, 370, 75, 700, 800);
        
        driver.findElement(By.id("com.yiban.app:id/release_dynamic_btn")).click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        WebElement dongtai =driver.findElement(By.id("com.yiban.app:id/release_msg_et"));
        dongtai.clear();
        dongtai.sendKeys(Utf7ImeHelper.e("今天真热啊！"));
        driver.findElement(By.id("com.yiban.app:id/widget_custom_titlebar_right_gamma_btn")).click();
        
        driver.findElement(By.id("com.yiban.app:id/widget_custom_titlebar_right_beta_btn")).click();
        List <WebElement> charts = driver.findElementsByClassName("android.widget.TextView");
        WebElement chart = charts.get(1);
        chart.click();
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        List<WebElement> chos = driver.findElementsByClassName("android.widget.ImageView");
//        System.out.print(chos);
//		System.out.print("\n");
//		int lenth = chos.size();
//		System.out.print(lenth);
		int i = 0;
		for (WebElement cho : chos) {
			// cho.get(1);
//			System.out.print(cho);
			i = i + 1;
			if (i%2 != 0) {
				cho.click();
			}

		}
        
        driver.findElement(By.id("com.yiban.app:id/ok_button")).click();
        WebElement groupchart=driver.findElement(By.id("com.yiban.app:id/page_chat_message_et"));
        groupchart.clear();
        groupchart.sendKeys("It is very hot today!");
        driver.findElement(By.id("com.yiban.app:id/page_chat_message_send_btn")).click();
        driver.findElement(By.id("com.yiban.app:id/widget_custom_titlebar_back_btn")).click();
        driver.findElement(By.id("com.yiban.app:id/page_home_contacts_tab_btn")).click();
        driver.findElement(By.id("com.yiban.app:id/txt_select_publicgroup")).click();
       
        driver.swipe(75, 500, 75, 0, 800);
        testScreenshot();
        List<WebElement> contracts = driver.findElementsByClassName("android.widget.TextView");
        WebElement contract = contracts.get(3);
        contract.click();
/*        System.out.print(contracts);
		int lenth1 = chos.size();
		System.out.print("the leath is %d \n" +lenth1);
		int j = 0;
		for (WebElement con : contracts) {
			// cho.get(1);
			System.out.print(con);
			j=j+1;
		}
		System.out.print(j);*/

        
//        driver.findElement(By.xpath("//linearLayout[5]/linearLayout[0]/ImageView[0]/TextView[1]")).click();
//        WebElement ch = driver.findElement(By.xpath("//ListView[1]/LinearLayout[5]/LinearLayout[0]/ImageView[0]"));
//        System.out.print(ch);
       
        driver.findElement(By.id("com.yiban.app:id/group_home_page_enter_chatting_btn")).click();
        //driver.findElement(By.id("com.yiban.app:id/page_chat_message_keyboard_btn")).click();
        driver.findElement(By.id("com.yiban.app:id/page_chat_message_et")).clear();
        driver.findElement(By.id("com.yiban.app:id/page_chat_message_et")).sendKeys("It is very hot today!");
        driver.findElement(By.id("com.yiban.app:id/page_chat_message_send_btn")).click();
        
        
/*        List<WebElement> textFieldsList = driver.findElementsByClassName("android.widget.EditText");
        textFieldsList.get(0).sendKeys("xiaoming");
        textFieldsList.get(1).sendKeys("13900122301");
        textFieldsList.get(2).sendKeys("xiaoming@163.com");
        driver.swipe(100, 500, 100, 100, 2);
        driver.findElementByName("Save").click();*/
    }
    
   // @Test(enabled = false)
/*	public void testScreenshot() {
		// make screenshot and get is as base64
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		String screenshot = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.BASE64);

		assertNotNull(screenshot);
		// make screenshot and save it to the local filesystem
		File file = ((TakesScreenshot) augmentedDriver)
				.getScreenshotAs(OutputType.FILE);
        assertNotNull(file);
    }*/
    


}