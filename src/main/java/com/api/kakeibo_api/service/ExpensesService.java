package com.api.kakeibo_api.service;

import com.api.kakeibo_api.dao.ExpenseDao;
import com.api.kakeibo_api.entity.ExpenseEntity;
import com.api.kakeibo_api.form.ExpenseRequest;
import com.api.kakeibo_api.responseDto.ExpenseResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExpensesService {
  private final ExpenseDao expenseDao;

  public ExpenseResponseDto saveExpense(ExpenseRequest expenseRequest) {
    ExpenseEntity expense = new ExpenseEntity(expenseRequest);
    log.info("saving Expense into db");
    expenseDao.insertExpense(expense);

    return new ExpenseResponseDto(expense);
  }
}
