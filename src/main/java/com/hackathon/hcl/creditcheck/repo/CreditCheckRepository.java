package com.hackathon.hcl.creditcheck.repo;

import com.hackathon.hcl.creditcheck.model.CreditCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditcheckRepository extends JpaRepository<CreditCheck, Integer> {
}
