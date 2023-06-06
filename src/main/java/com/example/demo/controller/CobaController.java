package com.example.demo.controller;

import com.example.demo.dto.InquiryReq;
import com.example.demo.service.CobaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author galang
 */

@RestController
@AllArgsConstructor
public class CobaController {

    private final CobaService cobaService;

    @PostMapping("/inquiry")
    public ResponseEntity<?> doInquiry(@RequestBody InquiryReq inquiryReq) {
        return new ResponseEntity<>(cobaService.inquiry(inquiryReq), HttpStatus.OK);
    }
}
