package com.example.demo.service;

import com.example.demo.dto.InquiryReq;
import com.example.demo.dto.Response;
import com.example.demo.exception.VirtualAccountNotfoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author galang
 */
@Service
public class CobaServiceImpl implements CobaService {

    @Override
    public Response inquiry(InquiryReq request) {
        if (!StringUtils.hasText(request.getVaNumber())) {
            throw new VirtualAccountNotfoundException("Virtucal Account Not Found !"); // memasukan message sendiri
//            throw new VirtualAccountNotfoundException(); // tanpa memasukan message sendiri
        }
        return Response.builder()
                .responseCode("00")
                .responseMessage("sukses")
                .build();
    }
}
