package com.api.kakeibo_api.controller;

import com.api.kakeibo_api.form.ExpenseRequest;
import com.api.kakeibo_api.responseDto.ExpenseResponseDto;
import com.api.kakeibo_api.service.ExpensesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor // Usually needs a constructor without this annotation
public class ExpensesController {
  private final ExpensesService expensesService;

  @PostMapping("/expenses")
  @ResponseStatus(HttpStatus.CREATED)
  public ExpenseResponseDto postExpenses(@Validated @RequestBody ExpenseRequest expenseRequest) {
    return expensesService.saveExpense(expenseRequest);
  }
}
