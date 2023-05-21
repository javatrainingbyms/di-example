package com.ms;

public class IdeaSIM implements SIM {
	private String number;
	public IdeaSIM(String number) {
		this.number=number;
	}
	public void call() {
		System.out.println("Calling Using IdeaSIM : "+number);
	}
	public void sms() {
		System.out.println("Messaging Using IdeaSIM : "+number);
	}
}
