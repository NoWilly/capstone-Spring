package com.amfam.projects.capstone;

import java.util.ArrayList;

    /*
            InsurancePolicy structure includes:
            - id (Integer)
            - policyNumber (String)
            - insuredLastName (String)
            - annualPremium (Double)
            - ArrayList of Claims
    */

public class InsurancePolicy {
    // Private vars
    private Integer id;
    private String policyNumber;
    private String insuredLastName;
    private double annualPremium;
    private ArrayList<InsuranceClaim> claims;

    // Constructor
    public InsurancePolicy(Integer id, String policyNumber, String insuredLastName, Double annualPremium) {
        this.id = id;
        this.policyNumber = policyNumber;
        this.insuredLastName = insuredLastName;
        this.annualPremium = annualPremium;
        this.claims = new ArrayList<>();
    }

    // getters/setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getInsuredLastName() {
        return insuredLastName;
    }
    public void setInsuredLastName(String insuredLastName) {
        this.insuredLastName = insuredLastName;
    }

    public double getAnnualPremium() {
        return annualPremium;
    }
    public void setAnnualPremium(double annualPremium) {
        this.annualPremium = annualPremium;
    }

    public ArrayList<InsuranceClaim> getClaims() {
        return claims;
    }
    public void setClaims(ArrayList<InsuranceClaim> claims) {
        this.claims = claims;
    }

    public Integer getInsuranceClaimCount() {
       return claims.size();
   }
}
