package com.example.test.controller;

import com.example.test.dto.EmployeeDto;
import com.example.test.dto.Response;
import com.example.test.service.MapstructTestService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor

public class MapstructController  {

    public final MapstructTestService mapstructTestService;

    @GetMapping("add")
    public ResponseEntity<?> postData(@RequestBody EmployeeDto responseDto) {
        Response response = mapstructTestService.addData(responseDto);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        Response response = mapstructTestService.getEmployeeById(id);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user")
    public String user() {
        return "Hello, User!";
    }


    @GetMapping("/admin")
    public String admin() {
        return "Hello, admin!";
    }
}
