package com.example.SimpleWebApplication.Common;

public enum Status {

	ACTIVE("active"),
	INACTIVE("inactive");	

	public final String status;
	
	private Status(String status) {
		this.status = status;
	}
	
			
}
