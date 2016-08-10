package com.servlet;

public class LoginDAO {
	public Boolean isValidUser(String userid,String pwd){
		if(userid.equals("niit")&&pwd.equals("12345"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
