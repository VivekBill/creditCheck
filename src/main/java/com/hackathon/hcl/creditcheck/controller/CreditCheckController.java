package com.hackathon.hcl.creditcheck.controller;


import com.hackathon.hcl.creditcheck.service.CreditCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
@RequestMapping("/creditcheck")
public class CreditCheckController() implements CreditCheckService{

    @Autowired
    CreditCheckServiceIm creditCheckServiceImpl;

    @override
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public CreditCheckResponse getCredit(@RequestBody CreditCheckRequest request)

    CreditCheckResponse response = creditCheckServiceImpl.getCreditcheck(request);
    return response;

}
