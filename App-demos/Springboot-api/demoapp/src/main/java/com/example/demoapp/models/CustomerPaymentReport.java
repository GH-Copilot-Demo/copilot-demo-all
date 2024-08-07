package com.example.demoapp.models;

// Define payment report class for a customer transaction id, transaction date, amount, merchant name
public class CustomerPaymentReport {
    private String transactionId;
    private String transactionDate;
    private String amount;
    private String merchantName;

    public CustomerPaymentReport(String transactionId, String transactionDate, String amount, String merchantName) {
        this.transactionId = transactionId;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.merchantName = merchantName;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public String getAmount() {
        return amount;
    }

    public String getMerchantName() {
        return merchantName;
    }
}