package com.example.test.service;


import com.example.test.dto.EmployeeDto;
import com.example.test.dto.Response;

public interface MapstructTestService {

    Response addData(EmployeeDto responseDto);

    Response getEmployeeById(Long responseDto);

}
