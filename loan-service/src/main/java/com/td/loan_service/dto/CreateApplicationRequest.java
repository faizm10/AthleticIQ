package com.td.loan_service.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreateApplicationRequest(
        @NotBlank String applicantId,
        @NotNull @Positive BigDecimal amount,
        @NotNull @Positive Integer termMonths
) {}
