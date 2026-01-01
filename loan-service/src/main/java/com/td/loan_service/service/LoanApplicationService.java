package com.td.loan_service.service;

import com.td.loan_service.model.LoanApplication;
import com.td.loan_service.repository.InMemoryLoanApplicationRepository;
import java.math.BigDecimal;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class LoanApplicationService {

    private final InMemoryLoanApplicationRepository repo;

    public LoanApplicationService(InMemoryLoanApplicationRepository repo) {
        this.repo = repo;
    }

    public UUID create(String applicantId, BigDecimal amount, Integer termMonths) {
        LoanApplication app = new LoanApplication(applicantId, amount, termMonths);
        repo.save(app);
        return app.getId();
    }

    // We'll use this in the next issue (fetch by id)
    public LoanApplication getById(UUID id) {
        return repo.findById(id).orElseThrow(() -> new RuntimeException("NOT_FOUND"));
    }
}
