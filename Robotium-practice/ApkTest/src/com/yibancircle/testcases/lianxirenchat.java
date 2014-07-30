package com.yibancircle.testcases;

import org.testng.annotations.Test;

import com.yibancircle.action.lianxirenaction;

public class lianxirenchat  extends lianxirenaction{

	public lianxirenchat() throws ClassNotFoundException {
		super();
	}
@Test	
	public void testfaxiaoxi() throws ClassNotFoundException{
	
	lianxiren("13917504610", "123456");
	
	}
	

}
