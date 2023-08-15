package com.example.test.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * DTO for {@link com.example.test.model.Employee}
 */
@Data
public class EmployeeDto implements Serializable {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("salary")
    private float salary;

    @JsonProperty("departmentName")
    private String departmentName;

}