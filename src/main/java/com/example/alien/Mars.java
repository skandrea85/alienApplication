package com.example.alien;

public class Mars implements Planet {

	@Override
	public String getGreetings() {
		
		return "Welcome to mars";
	}

	@Override
	public String getName() {
		return "Mars";
	}

}
