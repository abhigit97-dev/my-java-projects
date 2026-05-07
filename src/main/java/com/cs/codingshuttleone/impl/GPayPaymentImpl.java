package com.cs.codingshuttleone.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.cs.codingshuttleone.PaymentService;


@ConditionalOnProperty(name="payment.type",havingValue="GPay")
@Component
public class GPayPaymentImpl implements PaymentService {

	@Override
	public void doPayment() {
		System.out.println("Payment-GPAY");
		
	}

}
