package com.estudando.course.Repository;

import com.estudando.course.Entities.OrderItem;
import com.estudando.course.Entities.Pk.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
