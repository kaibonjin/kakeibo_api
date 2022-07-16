package com.api.kakeibo_api.entity;

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
public class ExpenseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "user_id") private int userId;

  @Column(name = "amount") private int amount;

  @Column(name = "memo") private String memo;

  @Column(name ="date") private LocalDate date;

  // TODO add categoryId
  @Column(name = "created_at") @CreationTimestamp private LocalDateTime createdAt;

  @Column(name = "updated_at") @UpdateTimestamp private LocalDateTime updatedAt;

  public ExpenseEntity(ExpenseRequest expenseRequest) {
    userId = expenseRequest.getUserId();
    amount = expenseRequest.getAmount();
    memo = expenseRequest.getMemo();
    date = expenseRequest.getDate();
  }
}
