package com.nayoon.product_service.reservation_product.repository;

import com.nayoon.product_service.reservation_product.entity.ReservationProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationProductRepository extends JpaRepository<ReservationProduct, Long>, ReservationProductQRepository {

}