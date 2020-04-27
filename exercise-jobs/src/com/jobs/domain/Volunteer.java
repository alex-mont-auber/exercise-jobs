package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		//TODO
		if(description == null) throw new Exception();
	}

	
	@Override
	public void pay() {
		//TODO
	}

	@Override
	public String toString() {
		return "[ Name: " + name + ", Address: " + address + ", Phone: " + phone + " ]";
	}

}
