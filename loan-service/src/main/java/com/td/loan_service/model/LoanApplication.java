package com.td.loan_service.model;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class LoanApplication {

    // each fields are private as they are only accessible within the class
    private UUID id; // unique identifier for each loan application

    private String applicantId;
    private BigDecimal amount;
    private Integer termMonths;

    private LoanStatus status; // status of the loan application from the enum we created earlier in LoanStatus.java

    private Instant createdAt; // timestamp when the application was created
    //private Instant updatedAt; // timestamp when the application was last updated

    // constructors
    // create a loan applicaton with necessary fields
    public LoanApplication(String applicantId, BigDecimal amount, Integer termMonths) {
        this.id = UUID.randomUUID(); // generate a unique ID
        this.applicantId = applicantId;
        this.amount = amount;
        this.termMonths = termMonths;
        this.status = LoanStatus.SUBMITTED; // default status when created
        this.createdAt = Instant.now();
        //this.updatedAt = Instant.now(); // set updatedAt to the same value as createdAt
    }
}
