package com.ecommerce.games.games.repository;

import com.ecommerce.games.games.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepositoty extends JpaRepository<Payment,Long> {
}
