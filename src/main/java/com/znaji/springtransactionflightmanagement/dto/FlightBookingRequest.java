package com.znaji.springtransactionflightmanagement.dto;

import com.znaji.springtransactionflightmanagement.entity.PassengerInfo;
import com.znaji.springtransactionflightmanagement.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
