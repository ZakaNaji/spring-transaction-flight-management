package com.znaji.springtransactionflightmanagement.service;

import com.znaji.springtransactionflightmanagement.PaymentUtils;
import com.znaji.springtransactionflightmanagement.dao.PassengerInfoRepo;
import com.znaji.springtransactionflightmanagement.dao.PaymentInfoRepo;
import com.znaji.springtransactionflightmanagement.dto.FlightBookingAcknowledgement;
import com.znaji.springtransactionflightmanagement.dto.FlightBookingRequest;
import com.znaji.springtransactionflightmanagement.entity.PassengerInfo;
import com.znaji.springtransactionflightmanagement.entity.PaymentInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class FlightBookingService {

    private final PaymentInfoRepo paymentInfoRepo;
    private final PassengerInfoRepo passengerInfoRepo;

    public FlightBookingAcknowledgement bookFlightTicket(final FlightBookingRequest flightBookingRequest) {
        PassengerInfo passengerInfo = flightBookingRequest.getPassengerInfo();
        passengerInfo = passengerInfoRepo.save(passengerInfo);
        PaymentInfo paymentInfo = flightBookingRequest.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNumber(), passengerInfo.getFare());
        paymentInfo.setPassengerInfo(passengerInfo);
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepo.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
