package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author galang
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    
    private String responseCode;

    private String responseMessage;

    private Object data;
}
