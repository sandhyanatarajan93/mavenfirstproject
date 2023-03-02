package com.vuram.automation.Businessflows;

	
import org.testng.annotations.Test;
import com.vuram.automation.utility.VATT;

public class RunSampleScript extends VATT{

	@Test
	public void Demomethod() throws Exception
	{
		flow.OpenURL("https://appiancoe.vuram.com/suite/sites/d2207kuso-supplier-onboarding");
		flow.LoginwithUserNameandPassword("sandhyan", "Test@1234");
		//flow.Logout();
		
	}
}
