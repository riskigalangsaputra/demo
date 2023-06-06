package com.example.demo.service;

import com.example.demo.dto.InquiryReq;
import com.example.demo.dto.Response;

/**
 * @author galang
 */
public interface CobaService {

    Response inquiry(InquiryReq inquiryReq);
}
