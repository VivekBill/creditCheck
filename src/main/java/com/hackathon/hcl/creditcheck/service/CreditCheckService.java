package com.hackathon.hcl.creditcheck.service;

import com.hackathon.hcl.creditcheck.model.CreditcheckRequest;

public interface CreditcheckService {
    Creditcheck getCreditcheck(CreditCheckRequest request);
}
