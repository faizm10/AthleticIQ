package com.td.loan_service.controller;

import com.td.loan_service.dto.CreateApplicationRequest;
import com.td.loan_service.dto.CreateApplicationResponse;
import com.td.loan_service.service.LoanApplicationService;
import jakarta.validation.Valid;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/applications")
public class LoanApplicationController {

    private final LoanApplicationService service;

    public LoanApplicationController(LoanApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CreateApplicationResponse> create(@Valid @RequestBody CreateApplicationRequest req) {
        UUID id = service.create(req.applicantId(), req.amount(), req.termMonths());
        return ResponseEntity.status(HttpStatus.CREATED).body(new CreateApplicationResponse(id));
    }
}
