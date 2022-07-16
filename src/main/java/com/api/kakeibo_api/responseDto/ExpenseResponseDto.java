package com.api.kakeibo_api.responseDto;

import com.api.kakeibo_api.entity.ExpenseEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseResponseDto {
  private int amount;
  private String memo;
  private int userId;
  private LocalDate date;

  public ExpenseResponseDto(ExpenseEntity expenseEntity) {
    amount = expenseEntity.getAmount();
    memo = expenseEntity.getMemo();
    userId = expenseEntity.getUserId();
    date = expenseEntity.getDate();
  }
}
