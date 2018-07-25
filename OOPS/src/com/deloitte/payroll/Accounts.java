package com.deloitte.payroll;

public class Accounts {
	
	public void processSalary(Employee employee) {
		if (employee!=null) {
			
			if (employee instanceof ConfirmedEmployee) {
				ConfirmedEmployee confirmedemployee=(ConfirmedEmployee)employee;
				confirmedemployee.transport();
			}
			employee.netSalary();
		
	}
}
}

	
