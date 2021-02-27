package com.hackathon.hcl.creditcheck.service;

import com.hackathon.hcl.creditcheck.entity.Sanctions;
import org.springframework.stereotype.Service;
import com.hackathon.hcl.creditcheck.CreditCheckRequest;


@Service
public class CreditcheckImpl implements CreditcheckService{
    @Override
    public Creditcheck getCreditcheck(CreditCheckRequest request) {
        CreditCheckRequest creditRequest = new CreditCheckRequest();
        creditRequest.setDebtorAccount(request.getDebtorAccount);

        


        return null;
    }
}
