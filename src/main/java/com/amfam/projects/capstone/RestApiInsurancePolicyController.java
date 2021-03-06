package com.amfam.projects.capstone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
public class RestApiInsurancePolicyController {
    @GetMapping
    public Iterable<InsurancePolicy> getInsuranPolicies() {
        return Database.policies;
    }

    @GetMapping("/{id}")
    public Optional<InsurancePolicy> getInsurancePolicyById(@PathVariable Integer id){
        for (InsurancePolicy policy: Database.policies) {
            if(policy.getId().equals(id)) {
                return Optional.of(policy);
            }
        }
        return Optional.empty();
    }

    @GetMapping("/claim/{id}")
    public Optional<Map<String, Object>> getInsuranceClaimById(@PathVariable Integer id) {
        for (InsurancePolicy policy: Database.policies) {
            for (InsuranceClaim claim: policy.getClaims()) {
                if(claim.getId().equals(id)){
                    return Optional.of(mapClaim(claim));
                }
            }
        }
        return Optional.empty();
    }

    private Map<String, Object> mapClaim(InsuranceClaim insuranceClaim) {
        Map<String, Object> insuranceMap = new HashMap<>();
        insuranceMap.put("id", insuranceClaim.getId());
        insuranceMap.put("claimNumber", insuranceClaim.getClaimNumber());
        insuranceMap.put("isPaid", insuranceClaim.getIsPaid());
        insuranceMap.put("amount", insuranceClaim.getAmount());
        return insuranceMap;
    }
}