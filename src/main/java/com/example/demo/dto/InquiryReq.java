package com.example.demo.dto;

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
public class InquiryReq {

    private String vaNumber;
    private String fullName;
    private String amount;
    private Boolean status;

}
