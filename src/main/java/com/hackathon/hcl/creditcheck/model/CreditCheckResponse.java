package com.hackathon.hcl.creditcheck.model;

import java.io.serializable;

public class CreditCheckResponse implements serializable{

private String success;

public String getSuccess(){
    return success;
}

public void setSuccess(String success){
    this.success = success;
}

}