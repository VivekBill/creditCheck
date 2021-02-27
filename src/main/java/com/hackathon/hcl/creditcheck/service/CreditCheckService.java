package com.hackathon.hcl.creditcheck.service;

import com.hackathon.hcl.creditcheck.model.Creditcheck;

public interface CreditcheckService {
    Creditcheck getCreditcheck(CreditCheckRequest request);
    Creditcheck getCreditcheck();
}
