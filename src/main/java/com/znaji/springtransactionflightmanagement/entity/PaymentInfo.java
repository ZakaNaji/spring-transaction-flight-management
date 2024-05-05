package com.znaji.springtransactionflightmanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "payment_info")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name ="uuid", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String accountNumber;
    private double amount;
    private String cardType;
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private PassengerInfo passengerInfo;
}
