package com.api.kakeibo_api.DTO;

import com.api.kakeibo_api.form.ExpenseRequest;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseDto {
  private int amount;
  private String memo;
  private int userId;
  private LocalDate date;

  public ExpenseDto(ExpenseRequest expenseRequest) {
    amount = expenseRequest.getAmount();
    memo = expenseRequest.getMemo();
    userId = expenseRequest.getUserId();
    date = expenseRequest.getDate();
  }
}
