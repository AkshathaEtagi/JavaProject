package com.deloitte.payroll.main;

import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;
import com.deloitte.payroll.Interns;

public class MainClass {
	public static void main(String[] args) {
		Accounts accounts= new Accounts();
		HR hr= new HR();
		Employee emp;
		emp=hr.recruit('P');
		accounts.processSalary(emp);
		
		
	
	
	}
	

}
