package com.innowise.coffeemachine.repository.jpa;

import com.innowise.coffeemachine.entity.jpa.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT user_order FROM Order user_order WHERE user_order.user.id = :userId")
    List<Order> findOrdersByUserId(@Param(value = "userId") Long userId);
}
