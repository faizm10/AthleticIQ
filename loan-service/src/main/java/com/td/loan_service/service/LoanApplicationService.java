package com.td.loan_service.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.td.loan_service.model.LoanApplication;

@Service
public class LoanApplicationService {

    // In-memory storage (temporary, until database)
    private final Map<UUID, LoanApplication> store = new HashMap<>();

    public UUID create(String applicantId, BigDecimal amount, Integer termMonths) {
        LoanApplication app = new LoanApplication(applicantId, amount, termMonths);
        store.put(app.getId(), app);
        return app.getId();
    }

    public Optional<LoanApplication> findById(UUID id) {
        return Optional.ofNullable(store.get(id));
    }
}
