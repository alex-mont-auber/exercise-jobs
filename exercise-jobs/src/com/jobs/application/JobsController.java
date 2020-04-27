package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;
import org.w3c.dom.ls.LSOutput;

import javax.xml.namespace.QName;
import java.util.List;

public class JobsController {

		// Repository modified

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

		// Modified Manager

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		// TODO Auto-generated method stub
		Employee manager = new Employee(name, address,phone,salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
	}

		// modified payAllEmployeers

	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		PaymentFactory.createPaymentRateBoss();
		PaymentFactory.createPaymentRateEmployee();
		PaymentFactory.createPaymentRateManager();
	}

		// modified all employees


	public String getAllEmployees() {
		// TODO Auto-generated method stub
		//return null;
		return repository.getAllMembers().toString();
	}

		// modified volunteer:

	public void createVolunteer(String name, String address, String phone, String description) throws Exception {
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);
	}
}
