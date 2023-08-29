package com.example.test.controller;

import com.example.test.dto.EmployeeDto;
import com.example.test.model.Employee;
import com.example.test.service.EmployeeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
@Tag(name = "Management")
public class EmployeeController {

    private final EmployeeServiceImpl employeeService;

    @Operation(description = "get employee for manager",
    summary = "This is a summary for management get endpoint",
    responses = {
            @ApiResponse(
                    description = "Success",
                    responseCode = "200"
            ),
            @ApiResponse(
                    description = "Invalid Token",
                    responseCode = "403"
            )
    })
    @GetMapping("employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody EmployeeDto employeeDto) {
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDto));
    }
}
