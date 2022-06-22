package com.api.kakeibo_api.domain;

import lombok.Data;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "expenses")
@Data
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column() private int amount;

  @Column() private String memo;

  @Column() private Date date;

  // TODO add categoryId
  @Column() private LocalDateTime createdAt;

  @Column() private LocalDateTime updatedAt;
}
