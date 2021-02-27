package com.hackathon.hcl.creditcheck.model;

import java.io.serializable;

public class CreditCheckRequest implements serializable{

    private int messageId;
    private int transactionId;
    private int endToEndId;
    private String debtorAccount;
    private String paymentCurrency;
    private String paymentAccount;
    private java.util.Date valueDate;


    public String getMessageId(){
        return messageId;
    }

    public void setMessageId(String messageId){
        this.messageId = messageId;
    }

    public String getTransactionId(){
        return transactionId;
    }

    public void setTransactionId(String transactionId){
        this.transactionId = transactionId;
    }

    public String getEndToEndId(){
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId){
        this.endToEndId = endToEndId;
    }

    public String getDebtorAccount(){
        return debtorAccount;
    }

    public void setDebtorAccount(String debtorAccount){
        this.debtorAccount = debtorAccount;
    }

    public String getPaymentCurrency(){
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency){
        this.paymentCurrency = paymentCurrency;
    }

    public String getPaymentAccount(){
        return paymentAccount;
    }

    public void setPaymentAccount(String paymentAccount){
        this.paymentAccount = paymentAccount;
    }

    public String getValueDate(){
        return valueDate;
    }

    public void setValueDate(String valueDate){
        this.valueDate = valueDate;
    }

}