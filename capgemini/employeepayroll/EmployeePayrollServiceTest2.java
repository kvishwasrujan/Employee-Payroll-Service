package com.capgemini.employeepayroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import com.capgemini.employeepayroll.EmployeePayrollService.IOService;
class EmployeePayrollServiceTest2 {

	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmp = {
				new EmployeePayrollData(1,"Virat Kohli",100000.0),
				new EmployeePayrollData(2, "Rohit Sharma",200000.0),
				new EmployeePayrollData(3, "Dale Steyn",300000.0)
		};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmp));
		employeePayrollService.writeEmployeeData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		assertEquals(3, entries);
	}}
