package com.example.school_management.controller;

import com.example.school_management.dto.PaymentRequestDTO;
import com.example.school_management.dto.PaymentResponseDTO;
import com.example.school_management.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping
    public PaymentResponseDTO makePayment(@RequestBody PaymentRequestDTO request) {
        return paymentService.makePayment(request);
    }
}