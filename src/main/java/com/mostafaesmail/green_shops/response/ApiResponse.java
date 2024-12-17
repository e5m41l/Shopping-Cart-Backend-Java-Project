package com.mostafaesmail.green_shops.response;

import lombok.Data;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Data
public class ApiResponse {
    private String message;
    private Object data;
}
