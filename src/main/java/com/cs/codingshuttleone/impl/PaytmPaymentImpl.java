package com.cs.codingshuttleone.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import com.cs.codingshuttleone.PaymentService;


@Component
@ConditionalOnProperty(name="payment.type",havingValue="Paytm")
public class PaytmPaymentImpl implements PaymentService{

	@Override
	public void doPayment() {
		System.out.println("Paytm- Payment");
		
	}

}
