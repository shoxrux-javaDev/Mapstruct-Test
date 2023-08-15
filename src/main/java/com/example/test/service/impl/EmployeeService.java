package com.example.test.service.impl;

import com.example.test.dto.EmployeeDto;
import com.example.test.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(EmployeeDto employeeDto);

}
