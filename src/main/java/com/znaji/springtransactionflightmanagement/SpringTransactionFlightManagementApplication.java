package com.znaji.springtransactionflightmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringTransactionFlightManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTransactionFlightManagementApplication.class, args);
    }

}
