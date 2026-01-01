package com.td.loan_service.repository;

import com.td.loan_service.model.LoanApplication;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryLoanApplicationRepository {

    private final Map<UUID, LoanApplication> store = new ConcurrentHashMap<>();

    public LoanApplication save(LoanApplication app) {
        store.put(app.getId(), app);
        return app;
    }

    public Optional<LoanApplication> findById(UUID id) {
        return Optional.ofNullable(store.get(id));
    }
}
