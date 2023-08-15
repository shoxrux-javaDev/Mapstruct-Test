package com.example.test.service;

import com.example.test.dto.EmployeeDto;
import com.example.test.model.Employee;
import com.example.test.service.impl.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public Employee saveEmployee(EmployeeDto employeeDto) {
        return null;
    }

}
