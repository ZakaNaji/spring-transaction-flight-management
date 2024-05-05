package com.znaji.springtransactionflightmanagement.controller;

import com.znaji.springtransactionflightmanagement.dto.FlightBookingAcknowledgement;
import com.znaji.springtransactionflightmanagement.dto.FlightBookingRequest;
import com.znaji.springtransactionflightmanagement.service.FlightBookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flight")
@RequiredArgsConstructor
public class BookFlightController {

    private final FlightBookingService flightBookingService;

    @PostMapping
    public FlightBookingAcknowledgement bookFlight(@RequestBody FlightBookingRequest flightBookingRequest) {
        return flightBookingService.bookFlightTicket(flightBookingRequest);
    }
}
