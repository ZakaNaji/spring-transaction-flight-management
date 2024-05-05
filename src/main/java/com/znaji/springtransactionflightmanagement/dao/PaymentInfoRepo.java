package com.znaji.springtransactionflightmanagement.dao;

import com.znaji.springtransactionflightmanagement.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> {
}
