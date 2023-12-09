package com.attraya.controller;

import com.attraya.dto.FlightBookingAcknowledgement;
import com.attraya.dto.FlightBookingRequest;
import com.attraya.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightBookingController {

    @Autowired
    private FlightBookingService bookingService;

    @PostMapping("bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return bookingService.bookFlightTicket(request);
    }
}
