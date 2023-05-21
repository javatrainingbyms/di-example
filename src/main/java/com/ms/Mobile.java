package com.ms;

public class Mobile {

	//private JioSIM sim=new JioSIM("70000001122");//tight coupling
	
	private SIM sim;	//we are just taking a reference (which can hold an Object of JioSIM)
	
	public void setSim(SIM sim) {
		this.sim = sim;
	}
	public void makeCall() {
		sim.call();
	}
	public void sendSMS() {
		sim.sms();
	}
	
	
	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		JioSIM sim1=new JioSIM("7000011223");
		AirtelSIM sim2=new AirtelSIM("9893022334");
		IdeaSIM sim3=new IdeaSIM("9826033445");

		//mobile.setSim(sim1);
		//mobile.setSim(sim2);
		mobile.setSim(sim3);

		mobile.makeCall();
		mobile.sendSMS();

	}

}
