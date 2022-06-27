package com.api.kakeibo_api.domain;

import com.api.kakeibo_api.form.ExpenseRequest;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "expenses")
@Data
@NoArgsConstructor
public class Expense {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column() private int userId;

  @Column() private int amount;

  @Column() private String memo;

  @Column() private LocalDate date;

  // TODO add categoryId
  @Column() @CreationTimestamp private LocalDateTime createdAt;

  @Column() @UpdateTimestamp private LocalDateTime updatedAt;

  public Expense(ExpenseRequest expenseRequest) {
    userId = expenseRequest.getUserId();
    amount = expenseRequest.getAmount();
    memo = expenseRequest.getMemo();
    date = expenseRequest.getDate();
  }
}
