package com.example.test.mapper;

import com.example.test.dto.EmployeeDto;
import com.example.test.model.Employee;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",config = IgnoreUnmappedMapperConfig.class)
public interface EmployeeMapper {

    Employee toEntity(EmployeeDto employeeDto);

    EmployeeDto toDto(Employee employee);
}
