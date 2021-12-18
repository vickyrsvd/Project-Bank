package projectbank;

import java.util.Date;

public class AccountHolder {
	
	private String name;
	private Date createdDate;
	private String aadhar;
	private String panNum;
	private int decryptKey;
	
	
	public AccountHolder(String name) 
	{
		this.setName(name);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
	
	
}