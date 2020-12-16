package br.com.vanius.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.vanius.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return new Payment("mum-ra", 200.0, 10);
	}

}
