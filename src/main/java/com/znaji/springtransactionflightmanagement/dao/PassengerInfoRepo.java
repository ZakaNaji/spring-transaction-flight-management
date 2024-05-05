package com.znaji.springtransactionflightmanagement.dao;

import com.znaji.springtransactionflightmanagement.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {
}
