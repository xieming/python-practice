package com.yibancircle.testcases;

import org.testng.annotations.Test;

import com.yibancircle.action.chataction;

public class singlarchat  extends chataction{

	public singlarchat() throws ClassNotFoundException {
		super();
	}
@Test	
	public void testfaxiaoxi() throws ClassNotFoundException{
	
	testtanjiu("13917504610", "123456");
	
	}
	

}
