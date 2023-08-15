package com.example.test.dto;

import lombok.Data;

@Data
public class Response {

    private boolean success;

    private String message;

    private Object object;

    public Response(String message, boolean success, Object object) {
        this.message = message;
        this.success = success;
        this.object = object;
    }

    public Response(boolean success, Object object) {
        this.success = success;
        this.object = object;
    }

    public Response(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
