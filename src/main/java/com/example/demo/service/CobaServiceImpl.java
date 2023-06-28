package com.example.demo.service;

import com.example.demo.dto.InquiryReq;
import com.example.demo.dto.Response;
import com.example.demo.exception.VirtualAccountNotfoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author galang
 */
@Service @Slf4j
public class CobaServiceImpl implements CobaService {

    @Override
    public Response inquiry(InquiryReq request) {
        if (!StringUtils.hasText(request.getVaNumber())) {
            throw new VirtualAccountNotfoundException("Virtucal Account Not Found !"); // memasukan message sendiri
        }

        if (!request.getStatus()) {
            log.info("## STATUS FALSE ##");
        }

        log.info("lanjut proses");
        return Response.builder()
                .responseCode("00")
                .responseMessage("sukses")
                .build();
    }
}
