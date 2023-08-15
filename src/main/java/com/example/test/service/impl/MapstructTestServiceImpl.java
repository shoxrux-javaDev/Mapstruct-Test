package com.example.test.service.impl;

import com.example.test.dto.EmployeeDto;
import com.example.test.dto.Response;
import com.example.test.mapper.EmployeeMapper;
import com.example.test.repository.EmployeeRepository;
import com.example.test.service.MapstructTestService;
import io.vavr.control.Try;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MapstructTestServiceImpl implements MapstructTestService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapper employeeMapper;

    @Override
    public Response addData(EmployeeDto responseDto) {
        return Try.of(() -> new Response(true, List.of(employeeRepository.save(employeeMapper.toEntity(responseDto)))))
                .onFailure(ex -> log.error("employees don't save {}", ex.getMessage()))
                .getOrElse(new Response(false, "employee don't save"));
    }

    @Override
    public Response getEmployeeById(Long id) {
        return Try.of(() -> new Response(true,
                List.of(employeeRepository.findById(id)
                        .map(employeeMapper::toDto)
                        .orElse(new EmployeeDto())
                ))).onFailure(ex -> log.error("don't find employee id {} ",ex.getMessage()))
                .getOrElse(new Response(false, List.of()));}
}
