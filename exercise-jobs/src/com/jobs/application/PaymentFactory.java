package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {


		// Payments boss modified! + 50%

	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth + (salaryPerMonth * 0.5);
			}
		};
	}

		// Payments employee modified! -15%

	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth - (salaryPerMonth * 0.15);//todo
			}
		};
	}

		// test payments Manager + 10%:

	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth + (salaryPerMonth * 0.1);
			}
		};
	}
}
