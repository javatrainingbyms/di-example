package com.ms;

public class JioSIM implements SIM {
	private String number;
	public JioSIM(String number) {
		this.number=number;
	}
	public void call() {
		System.out.println("Calling Using JioSIM : "+number);
	}
	public void sms() {
		System.out.println("Messaging Using JioSIM : "+number);
	}
}
