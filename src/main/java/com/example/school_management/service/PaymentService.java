package com.example.school_management.service;

import com.example.school_management.dto.PaymentRequestDTO;
import com.example.school_management.dto.PaymentResponseDTO;

public interface PaymentService {

    PaymentResponseDTO makePayment(PaymentRequestDTO request);
}