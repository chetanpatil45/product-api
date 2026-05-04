package com.product_api.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String msg;
    private int statusCode;
    private LocalDateTime timestamp;
}
