package com.lbrce.uservalidation;

import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String inUID,String inPSW)
	{
		ResourceBundle rb=ResourceBundle.getBundle("com");
		String UID=rb.getString("uname");
		String PSW=rb.getString("pws");
		if(inUID.equals(UID)&&inPSW.equals(PSW))
			return true;
		else
			return false;
	}
}