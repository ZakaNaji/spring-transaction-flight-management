package com.znaji.springtransactionflightmanagement;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {

    private static Map<String, Double> paymentMap = new HashMap<>();

    static {
        paymentMap.put("acc1", 10000.0);
        paymentMap.put("acc2", 20000.0);
        paymentMap.put("acc3", 30000.0);
        paymentMap.put("acc4", 40000.0);
        paymentMap.put("acc5", 50000.0);
    }

    public static boolean validateCreditLimit(String accNo, double totalFare) {
        if (paymentMap.get(accNo) >= totalFare) {
            return true;
        }
        throw new RuntimeException("Credit card limit exceeded");
    }
}
