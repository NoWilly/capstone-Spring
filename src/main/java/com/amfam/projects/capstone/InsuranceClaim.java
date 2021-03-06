package com.amfam.projects.capstone;

    /*
        InsuranceClaim structure includes:
            - id (Integer)
            - claimNumber (String)
            - isPaid (Boolean)
            - amount (Double)
    */
public class InsuranceClaim {
    // Private vars
    private Integer id;
    private String claimNumber;
    private boolean isPaid;
    private Double amount;

    // Constructor
    public InsuranceClaim(Integer id, String claimNumber, boolean isPaid, Double amount) {
        this.id = id;
        this.claimNumber = claimNumber;
        this.isPaid = isPaid;
        this.amount = amount;
    }

    // getters/setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getClaimNumber() {
        return claimNumber;
    }
    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

