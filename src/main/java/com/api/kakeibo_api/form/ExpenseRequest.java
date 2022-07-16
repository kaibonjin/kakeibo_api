package com.api.kakeibo_api.form;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpenseRequest {
  private int userId;
  private int amount;
  private String memo;
  private LocalDate date;
}
