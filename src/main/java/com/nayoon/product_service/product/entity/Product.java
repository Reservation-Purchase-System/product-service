package com.nayoon.product_service.product.entity;

import com.nayoon.product_service.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "product")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Product extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "product_id", updatable = false)
  private Long id;

  @Column(name = "user_id", nullable = false) // 상품 등록한 사용자 ID
  private Long userId;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "content", nullable = false)
  private String content;

  @Column(name = "price", nullable = false)
  private Long price;

  @Column(name = "deleted_at")
  private LocalDateTime deletedAt;

  @Builder
  public Product(Long userId, String name, String content, Long price, LocalDateTime deletedAt) {
    this.userId = userId;
    this.name = name;
    this.content = content;
    this.price = price;
    this.deletedAt = deletedAt;
  }

  public void update(String name, String content, Long price) {
    this.name = name;
    this.content = content;
    this.price = price;
  }

}