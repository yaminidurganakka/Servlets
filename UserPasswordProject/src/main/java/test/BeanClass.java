package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BeanClass  implements Serializable
{
	private String userName;
	private String passWord;
	
public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

public BeanClass() {
		//super();
		// TODO Auto-generated constructor stub
	}


}
