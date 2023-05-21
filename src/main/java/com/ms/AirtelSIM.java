package com.ms;

public class AirtelSIM implements SIM {
	private String number;
	public AirtelSIM(String number) {
		this.number=number;
	}
	public void call() {
		System.out.println("Calling Using AirtelSIM : "+number);
	}
	public void sms() {
		System.out.println("Messaging Using AirtelSIM : "+number);
	}
}
